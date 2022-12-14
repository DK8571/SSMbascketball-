package com.baoshi.programmer.controller.admin;


import com.baoshi.programmer.entity.admin.Venues;
import com.baoshi.programmer.page.admin.Page;
import com.baoshi.programmer.service.admin.StadiumService;
import com.baoshi.programmer.service.admin.VenuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin/venues")
@ResponseBody
public class VenuesController {

    @Autowired
    private StadiumService stadiumService;
    @Autowired
    private VenuesService venuesService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView list(ModelAndView mv){
        Map<String,Object> queryMap=new HashMap<String,Object>();
        mv.addObject("stadiumList", stadiumService.findList(queryMap));
        mv.setViewName("venues/list");
        return mv;
    }
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public Map<String,Object> getList(Page page,
                                      @RequestParam(value = "venuesname",required = false) String venuesname,
                                      @RequestParam(value = "stadiumId",required = false) Integer stadiumId){
        Map<String,Object> queryMap=new HashMap<String,Object>();
        queryMap.put("stadiumId",stadiumId);
        queryMap.put("venuesname",venuesname);
        queryMap.put("offset",page.getOffset());
        queryMap.put("pageSize",page.getRows());
        Map<String,Object> resultMap=new HashMap<String,Object>();
        resultMap.put("rows",venuesService.findList(queryMap));
        resultMap.put("total",venuesService.getTotal(queryMap));
        return resultMap;
    }

    @RequestMapping(value="/add",method=RequestMethod.POST)
    public Map<String, String> add(Venues venues){
        Map<String, String> ret = new HashMap<String, String>();
        if(venues == null){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????????????????");
            return ret;
        }
        if(StringUtils.isEmpty(venues.getVenuesname())){
            ret.put("type", "error");
            ret.put("msg", "????????????????????????");
            return ret;
        }
        if(venues.getStadiumid() == null){
            ret.put("type", "error");
            ret.put("msg", "????????????????????????");
            return ret;
        }
        if(venues.getPrice() == null){
            ret.put("type", "error");
            ret.put("msg", "???????????????");
            return ret;
        }
        if(venues.getAllprice() == null){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????");
            return ret;
        }
        if(venues.getMax() == 0){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????");
            return ret;
        }
        if(venuesService.add(venues) <= 0){
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
    public Map<String, String> edit(Venues venues){
        System.out.println("into");
        Map<String, String> ret = new HashMap<String, String>();
        if(venues == null){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????????????????");
            return ret;
        }
        if(StringUtils.isEmpty(venues.getVenuesname())){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????");
            return ret;
        }
        if(venues.getStadiumid() == null){
            ret.put("type", "error");
            ret.put("msg", "????????????????????????");
            return ret;
        }
        if(venues.getPrice() == null){
            ret.put("type", "error");
            ret.put("msg", "???????????????");
            return ret;
        }
        if(venues.getAllprice() == null){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????");
            return ret;
        }
        if(venues.getMax() == null){
            ret.put("type", "error");
            ret.put("msg", "?????????????????????");
            return ret;
        }
        if(venuesService.edit(venues) <= 0){
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
        if(venuesService.findequipment(ids)> 0 ){
            ret.put("type", "error");
            ret.put("msg", "??????????????????????????????");
            return ret;
        }
        if(venuesService.delete(ids) <= 0){
            ret.put("type", "error");
            ret.put("msg", "??????????????????????????????????????????");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "?????????????????????");
        return ret;
    }
}
