package com.my.app.entity;

import java.util.Date;

public class FrontAccountInfo {
    private Integer id;

    private String id_card_no;

    private Integer auth_status;

    private Long phone_no;

    private Integer account_status;

    private Integer active_status;

    private String third_cust_id;

    private String token;

    private String creator;

    private String updator;

    private Date created_time;

    private Date updated_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getId_card_no() {
        return id_card_no;
    }

    public void setId_card_no(String id_card_no) {
        this.id_card_no = id_card_no == null ? null : id_card_no.trim();
    }

    public Integer getAuth_status() {
        return auth_status;
    }

    public void setAuth_status(Integer auth_status) {
        this.auth_status = auth_status;
    }

    public Long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(Long phone_no) {
        this.phone_no = phone_no;
    }

    public Integer getAccount_status() {
        return account_status;
    }

    public void setAccount_status(Integer account_status) {
        this.account_status = account_status;
    }

    public Integer getActive_status() {
        return active_status;
    }

    public void setActive_status(Integer active_status) {
        this.active_status = active_status;
    }

    public String getThird_cust_id() {
        return third_cust_id;
    }

    public void setThird_cust_id(String third_cust_id) {
        this.third_cust_id = third_cust_id == null ? null : third_cust_id.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public Date getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(Date updated_time) {
        this.updated_time = updated_time;
    }
}