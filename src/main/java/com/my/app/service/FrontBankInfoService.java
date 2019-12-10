package com.my.app.service;

import com.my.app.common.ResultMessageObject;
import com.my.app.vo.request.RequestVo;

public interface FrontBankInfoService {

	ResultMessageObject getList(RequestVo request);
}
