package com.my.app.dao.ext;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.my.app.dao.FrontAccountInfoMapper;

@Mapper
public interface FrontAccountInfoExtMapper extends FrontAccountInfoMapper {

	List<Map<String,Object>> findAccountAndBankInfo(String idCard);
}
