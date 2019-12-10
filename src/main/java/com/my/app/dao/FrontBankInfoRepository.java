package com.my.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.my.app.entity.FrontBankInfo;

public interface FrontBankInfoRepository extends CrudRepository<FrontBankInfo, Long>, JpaRepository<FrontBankInfo, Long> {

}
