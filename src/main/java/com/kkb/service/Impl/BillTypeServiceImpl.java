package com.kkb.service.Impl;

import com.kkb.mapper.BillTypeMapper;
import com.kkb.pojo.BillType;
import com.kkb.pojo.BillTypeExample;
import com.kkb.service.BillTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BillTypeServiceImpl implements BillTypeService {

    @Resource
    public BillTypeMapper mapper;

    @Override
    public List<BillType> list() {
        return mapper.selectByExample(new BillTypeExample());
    }
}
