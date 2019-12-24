package com.my.app.entity;

import java.util.Date;

public class FrontHandleRecord {
    private Integer id;

    private String order_no;

    private String trade_money;

    private String fee_money;

    private String mobile_phone;

    private String platform_type;

    private String app_type;

    private String product_type;

    private String name;

    private String id_card;

    private String custacct_id;

    private String bank_no;

    private String bank_code;

    private String bank_phone;

    private String trade_flow_id;

    private String app_repayment_flow_id;

    private String bank_flow_id;

    private String record_status;

    private String status_desc;

    private String handle_type;

    private String remark;

    private String return_url;

    private String unique_identity;

    private Date pay_success_time;

    private Date status_change_time;

    private Date created_at;

    private Date updated_at;

    private String withdraw_type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no == null ? null : order_no.trim();
    }

    public String getTrade_money() {
        return trade_money;
    }

    public void setTrade_money(String trade_money) {
        this.trade_money = trade_money == null ? null : trade_money.trim();
    }

    public String getFee_money() {
        return fee_money;
    }

    public void setFee_money(String fee_money) {
        this.fee_money = fee_money == null ? null : fee_money.trim();
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone == null ? null : mobile_phone.trim();
    }

    public String getPlatform_type() {
        return platform_type;
    }

    public void setPlatform_type(String platform_type) {
        this.platform_type = platform_type == null ? null : platform_type.trim();
    }

    public String getApp_type() {
        return app_type;
    }

    public void setApp_type(String app_type) {
        this.app_type = app_type == null ? null : app_type.trim();
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type == null ? null : product_type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card == null ? null : id_card.trim();
    }

    public String getCustacct_id() {
        return custacct_id;
    }

    public void setCustacct_id(String custacct_id) {
        this.custacct_id = custacct_id == null ? null : custacct_id.trim();
    }

    public String getBank_no() {
        return bank_no;
    }

    public void setBank_no(String bank_no) {
        this.bank_no = bank_no == null ? null : bank_no.trim();
    }

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code == null ? null : bank_code.trim();
    }

    public String getBank_phone() {
        return bank_phone;
    }

    public void setBank_phone(String bank_phone) {
        this.bank_phone = bank_phone == null ? null : bank_phone.trim();
    }

    public String getTrade_flow_id() {
        return trade_flow_id;
    }

    public void setTrade_flow_id(String trade_flow_id) {
        this.trade_flow_id = trade_flow_id == null ? null : trade_flow_id.trim();
    }

    public String getApp_repayment_flow_id() {
        return app_repayment_flow_id;
    }

    public void setApp_repayment_flow_id(String app_repayment_flow_id) {
        this.app_repayment_flow_id = app_repayment_flow_id == null ? null : app_repayment_flow_id.trim();
    }

    public String getBank_flow_id() {
        return bank_flow_id;
    }

    public void setBank_flow_id(String bank_flow_id) {
        this.bank_flow_id = bank_flow_id == null ? null : bank_flow_id.trim();
    }

    public String getRecord_status() {
        return record_status;
    }

    public void setRecord_status(String record_status) {
        this.record_status = record_status == null ? null : record_status.trim();
    }

    public String getStatus_desc() {
        return status_desc;
    }

    public void setStatus_desc(String status_desc) {
        this.status_desc = status_desc == null ? null : status_desc.trim();
    }

    public String getHandle_type() {
        return handle_type;
    }

    public void setHandle_type(String handle_type) {
        this.handle_type = handle_type == null ? null : handle_type.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url == null ? null : return_url.trim();
    }

    public String getUnique_identity() {
        return unique_identity;
    }

    public void setUnique_identity(String unique_identity) {
        this.unique_identity = unique_identity == null ? null : unique_identity.trim();
    }

    public Date getPay_success_time() {
        return pay_success_time;
    }

    public void setPay_success_time(Date pay_success_time) {
        this.pay_success_time = pay_success_time;
    }

    public Date getStatus_change_time() {
        return status_change_time;
    }

    public void setStatus_change_time(Date status_change_time) {
        this.status_change_time = status_change_time;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getWithdraw_type() {
        return withdraw_type;
    }

    public void setWithdraw_type(String withdraw_type) {
        this.withdraw_type = withdraw_type == null ? null : withdraw_type.trim();
    }
}