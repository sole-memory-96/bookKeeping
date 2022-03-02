package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Bill;
import com.kkb.pojo.BillType;
import com.kkb.service.BillTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("billType")
public class BillTypeController {

    @Resource
    public BillTypeService service;

    @RequestMapping("list")
    public PageInfo<BillType> list(Bill bill, Model model){
        List<BillType> list = service.list();
        return new PageInfo<>(list);
    }


}
