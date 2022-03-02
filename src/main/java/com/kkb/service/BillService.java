package com.kkb.service;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Bill;
import com.kkb.vo.QueryRegistrationVO;
import com.kkb.vo.QueryVO;

import java.util.List;

public interface BillService {

    public PageInfo<Bill> query(Integer pageNum, Integer pageSize, QueryVO vo);

}
