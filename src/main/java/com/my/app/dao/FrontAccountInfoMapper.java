package com.my.app.dao;

import com.my.app.entity.FrontAccountInfo;
import com.my.app.entity.FrontAccountInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FrontAccountInfoMapper {
    long countByExample(FrontAccountInfoExample example);

    int deleteByExample(FrontAccountInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FrontAccountInfo record);

    int insertSelective(FrontAccountInfo record);

    List<FrontAccountInfo> selectByExample(FrontAccountInfoExample example);

    FrontAccountInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FrontAccountInfo record, @Param("example") FrontAccountInfoExample example);

    int updateByExample(@Param("record") FrontAccountInfo record, @Param("example") FrontAccountInfoExample example);

    int updateByPrimaryKeySelective(FrontAccountInfo record);

    int updateByPrimaryKey(FrontAccountInfo record);
}