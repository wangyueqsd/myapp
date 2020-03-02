package com.my.app.vo.response;

import com.alibaba.excel.annotation.ExcelProperty;

import lombok.Data;

@Data
public class ExcelVo {

	@ExcelProperty("id值")
	private Long id;
	
	@ExcelProperty("银行代码")
	private String bankCode;
	
	@ExcelProperty("银行名称")
	private String bankName;
	
	@ExcelProperty("最大金额")
	private Double maxLimitMoney;
	
	@ExcelProperty("最小金额")
	private Double minLimitMoney;
}
