package com.kkb.controller;

import com.kkb.pojo.BillType;
import com.kkb.service.BillService;
import com.kkb.vo.ResultVO;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("bill")
public class BillController {

    @Resource
    public BillService service;


    @InitBinder
    protected void initDateFormatBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResultVO query(){


        return new ResultVO();
    }

}
