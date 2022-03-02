package com.kkb.mapper;

import com.kkb.pojo.BillType;
import com.kkb.pojo.BillTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillTypeMapper {
    long countByExample(BillTypeExample example);

    int deleteByExample(BillTypeExample example);

    int deleteByPrimaryKey(Long id_);

    int insert(BillType record);

    int insertSelective(BillType record);

    List<BillType> selectByExample(BillTypeExample example);

    BillType selectByPrimaryKey(Long id_);

    int updateByExampleSelective(@Param("record") BillType record, @Param("example") BillTypeExample example);

    int updateByExample(@Param("record") BillType record, @Param("example") BillTypeExample example);

    int updateByPrimaryKeySelective(BillType record);

    int updateByPrimaryKey(BillType record);
}