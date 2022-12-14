package com.baoshi.programmer.controller.admin;

import com.baoshi.programmer.entity.admin.Instuctor;
import com.baoshi.programmer.page.admin.Page;
import com.baoshi.programmer.service.admin.InstuctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin/instuctor")
@ResponseBody
public class InstuctorController {

    @Autowired
    private InstuctorService instuctorService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView list(ModelAndView model) {
        model.setViewName("instuctor/list");
        return model;
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,
                                       @RequestParam(name = "name",required = false,defaultValue = "") String instuctorname,
                                       @RequestParam(name = "sex",required = false) Integer sex
    ) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("instuctorname", instuctorname);
        queryMap.put("sex",sex);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("rows", instuctorService.findList(queryMap));
        resultMap.put("total", instuctorService.getTotal(queryMap));
        return resultMap;
    }

    @RequestMapping(value="/add",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(Instuctor instuctor){
        Map<String, String> ret = new HashMap<String, String>();
        if(instuctor == null){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????????????????");
            return ret;
        }
        if(StringUtils.isEmpty(instuctor.getName())){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????");
            return ret;
        }

        if(isExist(instuctor.getName(), 0l)){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????????????????????????????");
            return ret;
        }
        if(instuctorService.add(instuctor) <= 0 ){

            ret.put("type", "error");
            ret.put("msg", "??????????????????????????????????????????");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "?????????????????????");
        return ret;
    }

    /**
     * ????????????
     * @return
     */
    @RequestMapping(value="/edit",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, String> edit(Instuctor instuctor){
        Map<String, String> ret = new HashMap<String, String>();
        if(instuctor == null){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????????????????");
            return ret;
        }
        if(StringUtils.isEmpty(instuctor.getName())){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????");
            return ret;
        }
//		if(StringUtils.isEmpty(user.getPassword())){
//			ret.put("type", "error");
//			ret.put("msg", "??????????????????");
//			return ret;
//		}

        if(instuctorService.edit(instuctor) <= 0){
            ret.put("type", "error");
            ret.put("msg", "??????????????????????????????????????????");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "?????????????????????");
        return ret;
    }

    /**
     * ??????????????????
     * @param ids
     * @return
     */
    @RequestMapping(value="/delete",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, String> delete(String ids){
        Map<String, String> ret = new HashMap<String, String>();
        if(StringUtils.isEmpty(ids)){
            ret.put("type", "error");
            ret.put("msg", "???????????????????????????");
            return ret;
        }
        if(ids.contains(",")){
            ids = ids.substring(0,ids.length()-1);
        }

        if(instuctorService.delete(ids) <= 0){
            ret.put("type", "error");
            ret.put("msg", "??????????????????????????????????????????");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "?????????????????????");
        return ret;
    }

    /**
     * ????????????
     * @param photo
     * @param request
     * @return
     */
    @RequestMapping(value="/upload_photo",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, String> uploadPhoto(MultipartFile photo, HttpServletRequest request){
        Map<String, String> ret = new HashMap<String, String>();
        if(photo == null){
            ret.put("type", "error");
            ret.put("msg", "???????????????????????????");
            return ret;
        }
        if(photo.getSize() > 1024*1024*1024){
            ret.put("type", "error");
            ret.put("msg", "????????????????????????10M???");
            return ret;
        }
        //??????????????????
        String suffix = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf(".")+1,photo.getOriginalFilename().length());
        if(!"jpg,jpeg,gif,png".toUpperCase().contains(suffix.toUpperCase())){
            ret.put("type", "error");
            ret.put("msg", "?????????jpg,jpeg,gif,png??????????????????");
            return ret;
        }
        String savePath = request.getSession().getServletContext().getRealPath("/") + "/resources/upload/";
        File savePathFile = new File(savePath);
        if(!savePathFile.exists()){
            //???????????????????????????????????????
            savePathFile.mkdir();
        }
        String filename = new Date().getTime()+"."+suffix;
        try {
            //??????????????????????????????
            photo.transferTo(new File(savePath+filename));
        }catch (Exception e) {
            // TODO Auto-generated catch block
            ret.put("type", "error");
            ret.put("msg", "?????????????????????");
            e.printStackTrace();
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "?????????????????????");
        ret.put("filepath",request.getSession().getServletContext().getContextPath() + "/resources/upload/" + filename );
        return ret;
    }
    /**
     * ??????????????????????????????
     * @param username
     * @param id
     * @return
     */
    private boolean isExist(String username,Long id){
        Instuctor instuctor = instuctorService.findByInstuctorname(username);
        if(instuctor == null)return false;
        if(instuctor.getId().longValue() == id.longValue())return false;
        return true;
    }
}
