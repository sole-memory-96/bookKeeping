package com.kkb.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.BillMapper;
import com.kkb.pojo.Bill;
import com.kkb.pojo.BillExample;
import com.kkb.service.BillService;
import com.kkb.vo.QueryVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Resource
    public BillMapper mapper;

    @Override
    public PageInfo<Bill> query(Integer pageNum, Integer pageSize, QueryVO vo) {

        //多条件
        BillExample example = new BillExample();
        //创建条件的容器
        BillExample.Criteria criteria = example.createCriteria();
        /*if(vo!=null){
            if(vo.getId()!=null &&!"".equals(vo.getId())){
                criteria.andHos_idEqualTo(vo.getId());
            }
            if(vo.getDoctorId()!=null &&!"".equals(vo.getDoctorId()) && vo.getDoctorId()>0){
                criteria.andR_D_idEqualTo(vo.getDoctorId());
            }
            if (vo.getDepartmentId() != null && !"".equals(vo.getDepartmentId()) && vo.getDepartmentId()>0){
                criteria.andD_department(vo.getDepartmentId());
            }
            if(vo.getBeginDate()!=null){
                criteria.andHos_dateGreaterThan(vo.getBeginDate());
            }
            if(vo.getEndDate()!=null){
                criteria.andHos_dateLessThan(vo.getEndDate());
            }
        }*/
        PageHelper.startPage(pageNum, pageSize);
        List<Bill> list = mapper.selectByExample(example);
        return new PageInfo<>(list);
    }
}
