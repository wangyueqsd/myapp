package com.my.app.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the front_bank_info database table.
 * 
 */
@Entity
@Table(name="front_bank_info")
@NamedQuery(name="FrontBankInfo.findAll", query="SELECT f FROM FrontBankInfo f")
public class FrontBankInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="bank_card_no")
	private String bankCardNo;

	@Column(name="bank_code")
	private String bankCode;

	@Column(name="bank_name")
	private String bankName;

	@Column(name="created_time")
	private Timestamp createdTime;

	private String creator;

	@Column(name="id_card_no")
	private String idCardNo;

	private String name;

	@Column(name="phone_no")
	private BigInteger phoneNo;

	@Column(name="record_state")
	private int recordState;

	private String remark;

	@Column(name="request_no")
	private String requestNo;

	@Column(name="updated_time")
	private Timestamp updatedTime;

	private String updator;

	public FrontBankInfo() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(BigInteger phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getRecordState() {
		return this.recordState;
	}

	public void setRecordState(int recordState) {
		this.recordState = recordState;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestNo() {
		return this.requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public Timestamp getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getUpdator() {
		return this.updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
	}

}