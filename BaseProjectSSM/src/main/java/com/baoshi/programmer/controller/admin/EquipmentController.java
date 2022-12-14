package com.baoshi.programmer.controller.admin;


import com.baoshi.programmer.entity.admin.Equipment;
import com.baoshi.programmer.entity.admin.User;
import com.baoshi.programmer.page.admin.Page;
import com.baoshi.programmer.service.admin.EquipmentService;
import com.baoshi.programmer.service.admin.UserService;
import com.baoshi.programmer.service.admin.VenuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin/equipment")
@ResponseBody
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;
    @Autowired
    private UserService userService;
    @Autowired
    private VenuesService venuesService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ModelAndView list(ModelAndView mv,
                             HttpServletRequest request
                             ){
        Map<String,Object> queryMap=new HashMap<String,Object>();
        Long userid = (Long) request.getSession().getAttribute("adminid");
        User user = userService.findbyuserid(userid);
        queryMap.put("roleId" , user.getRoleId());
        queryMap.put("cashierid" , user.getId());
        mv.addObject("venuesList", venuesService.findListbycashierid(queryMap));
        mv.addObject("userList", userService.findListbycashierid(queryMap));
        mv.setViewName("equipment/list");
        return mv;
    }
    @RequestMapping(value = "list",method = RequestMethod.POST)
    public Map<String,Object> getlist(Page page,
                                      HttpServletRequest request,
                                      @RequestParam(value = "equipmentname",required = false) String equipmentname,
                                      @RequestParam(value = "userid",required = false) Integer userid,
                                      @RequestParam(value = "venuesid",required = false) Integer venuesid){
        Map<String,Object> queryMap=new HashMap<String,Object>();
        Long userId = (Long) request.getSession().getAttribute("adminid");
        User user = userService.findbyuserid(userId);
        queryMap.put("roleId" , user.getRoleId());
        queryMap.put("cashierid" , user.getId());
        queryMap.put("equipmentname",equipmentname);
        queryMap.put("userid",userid);
        queryMap.put("venuesid",venuesid);
        request.getSession().setAttribute("venuesid",venuesid);
        queryMap.put("offset",page.getOffset());
        queryMap.put("pageSize",page.getRows());
        Map<String,Object> resultMap=new HashMap<String,Object>();
        resultMap.put("venuesi",venuesid);
        resultMap.put("rows",equipmentService.findList(queryMap));
        resultMap.put("total",equipmentService.getTotal(queryMap));
        return resultMap;
    }

    @RequestMapping(value="/add",method=RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(Equipment venues){
        Map<String, String> ret = new HashMap<String, String>();
        if(venues == null){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????????????????");
            return ret;
        }
        if(StringUtils.isEmpty(venues.getEquipmentname())){
            ret.put("type", "error");
            ret.put("msg", "??????????????????");
            return ret;
        }
        if(venues.getVenuesid() == null){
            ret.put("type", "error");
            ret.put("msg", "????????????????????????");
            return ret;
        }
        if(equipmentService.add(venues) <= 0){
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
    public Map<String, String> edit(Equipment venues){
        Map<String, String> ret = new HashMap<String, String>();
        if(venues == null){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????????????????");
            return ret;
        }
        if(StringUtils.isEmpty(venues.getEquipmentname())){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????");
            return ret;
        }
        if(venues.getEquipmentname() == null){
            ret.put("type", "error");
            ret.put("msg", "????????????????????????");
            return ret;
        }
        if(equipmentService.edit(venues) <= 0){
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
        if(equipmentService.delete(ids) <= 0){
            ret.put("type", "error");
            ret.put("msg", "??????????????????????????????????????????");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "?????????????????????");
        return ret;
    }

    private boolean isExist(String equipmentname,Long id){
        Equipment equipment = equipmentService.findByequipmentname(equipmentname);
        if(equipment == null)return false;
        if(equipment.getId().longValue() == id.longValue())return false;
        return true;
    }
}
