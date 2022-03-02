package com.kkb.mapper;

import com.kkb.pojo.Bill;
import com.kkb.pojo.BillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillMapper {
    long countByExample(BillExample example);

    int deleteByExample(BillExample example);

    int deleteByPrimaryKey(Long id_);

    int insert(Bill record);

    int insertSelective(Bill record);

    List<Bill> selectByExample(BillExample example);

    Bill selectByPrimaryKey(Long id_);

    int updateByExampleSelective(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByExample(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}