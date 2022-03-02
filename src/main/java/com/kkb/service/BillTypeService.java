package com.kkb.service;

import com.kkb.pojo.BillType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BillTypeService {

    public List<BillType> list();

}
