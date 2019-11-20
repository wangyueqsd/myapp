package com.my.app.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontAccountInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontAccountInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andId_card_noIsNull() {
            addCriterion("id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andId_card_noIsNotNull() {
            addCriterion("id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andId_card_noEqualTo(String value) {
            addCriterion("id_card_no =", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noNotEqualTo(String value) {
            addCriterion("id_card_no <>", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noGreaterThan(String value) {
            addCriterion("id_card_no >", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_no >=", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noLessThan(String value) {
            addCriterion("id_card_no <", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noLessThanOrEqualTo(String value) {
            addCriterion("id_card_no <=", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noLike(String value) {
            addCriterion("id_card_no like", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noNotLike(String value) {
            addCriterion("id_card_no not like", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noIn(List<String> values) {
            addCriterion("id_card_no in", values, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noNotIn(List<String> values) {
            addCriterion("id_card_no not in", values, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noBetween(String value1, String value2) {
            addCriterion("id_card_no between", value1, value2, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noNotBetween(String value1, String value2) {
            addCriterion("id_card_no not between", value1, value2, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andAuth_statusIsNull() {
            addCriterion("auth_status is null");
            return (Criteria) this;
        }

        public Criteria andAuth_statusIsNotNull() {
            addCriterion("auth_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuth_statusEqualTo(Integer value) {
            addCriterion("auth_status =", value, "auth_status");
            return (Criteria) this;
        }

        public Criteria andAuth_statusNotEqualTo(Integer value) {
            addCriterion("auth_status <>", value, "auth_status");
            return (Criteria) this;
        }

        public Criteria andAuth_statusGreaterThan(Integer value) {
            addCriterion("auth_status >", value, "auth_status");
            return (Criteria) this;
        }

        public Criteria andAuth_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_status >=", value, "auth_status");
            return (Criteria) this;
        }

        public Criteria andAuth_statusLessThan(Integer value) {
            addCriterion("auth_status <", value, "auth_status");
            return (Criteria) this;
        }

        public Criteria andAuth_statusLessThanOrEqualTo(Integer value) {
            addCriterion("auth_status <=", value, "auth_status");
            return (Criteria) this;
        }

        public Criteria andAuth_statusIn(List<Integer> values) {
            addCriterion("auth_status in", values, "auth_status");
            return (Criteria) this;
        }

        public Criteria andAuth_statusNotIn(List<Integer> values) {
            addCriterion("auth_status not in", values, "auth_status");
            return (Criteria) this;
        }

        public Criteria andAuth_statusBetween(Integer value1, Integer value2) {
            addCriterion("auth_status between", value1, value2, "auth_status");
            return (Criteria) this;
        }

        public Criteria andAuth_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_status not between", value1, value2, "auth_status");
            return (Criteria) this;
        }

        public Criteria andPhone_noIsNull() {
            addCriterion("phone_no is null");
            return (Criteria) this;
        }

        public Criteria andPhone_noIsNotNull() {
            addCriterion("phone_no is not null");
            return (Criteria) this;
        }

        public Criteria andPhone_noEqualTo(Long value) {
            addCriterion("phone_no =", value, "phone_no");
            return (Criteria) this;
        }

        public Criteria andPhone_noNotEqualTo(Long value) {
            addCriterion("phone_no <>", value, "phone_no");
            return (Criteria) this;
        }

        public Criteria andPhone_noGreaterThan(Long value) {
            addCriterion("phone_no >", value, "phone_no");
            return (Criteria) this;
        }

        public Criteria andPhone_noGreaterThanOrEqualTo(Long value) {
            addCriterion("phone_no >=", value, "phone_no");
            return (Criteria) this;
        }

        public Criteria andPhone_noLessThan(Long value) {
            addCriterion("phone_no <", value, "phone_no");
            return (Criteria) this;
        }

        public Criteria andPhone_noLessThanOrEqualTo(Long value) {
            addCriterion("phone_no <=", value, "phone_no");
            return (Criteria) this;
        }

        public Criteria andPhone_noIn(List<Long> values) {
            addCriterion("phone_no in", values, "phone_no");
            return (Criteria) this;
        }

        public Criteria andPhone_noNotIn(List<Long> values) {
            addCriterion("phone_no not in", values, "phone_no");
            return (Criteria) this;
        }

        public Criteria andPhone_noBetween(Long value1, Long value2) {
            addCriterion("phone_no between", value1, value2, "phone_no");
            return (Criteria) this;
        }

        public Criteria andPhone_noNotBetween(Long value1, Long value2) {
            addCriterion("phone_no not between", value1, value2, "phone_no");
            return (Criteria) this;
        }

        public Criteria andAccount_statusIsNull() {
            addCriterion("account_status is null");
            return (Criteria) this;
        }

        public Criteria andAccount_statusIsNotNull() {
            addCriterion("account_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_statusEqualTo(Integer value) {
            addCriterion("account_status =", value, "account_status");
            return (Criteria) this;
        }

        public Criteria andAccount_statusNotEqualTo(Integer value) {
            addCriterion("account_status <>", value, "account_status");
            return (Criteria) this;
        }

        public Criteria andAccount_statusGreaterThan(Integer value) {
            addCriterion("account_status >", value, "account_status");
            return (Criteria) this;
        }

        public Criteria andAccount_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_status >=", value, "account_status");
            return (Criteria) this;
        }

        public Criteria andAccount_statusLessThan(Integer value) {
            addCriterion("account_status <", value, "account_status");
            return (Criteria) this;
        }

        public Criteria andAccount_statusLessThanOrEqualTo(Integer value) {
            addCriterion("account_status <=", value, "account_status");
            return (Criteria) this;
        }

        public Criteria andAccount_statusIn(List<Integer> values) {
            addCriterion("account_status in", values, "account_status");
            return (Criteria) this;
        }

        public Criteria andAccount_statusNotIn(List<Integer> values) {
            addCriterion("account_status not in", values, "account_status");
            return (Criteria) this;
        }

        public Criteria andAccount_statusBetween(Integer value1, Integer value2) {
            addCriterion("account_status between", value1, value2, "account_status");
            return (Criteria) this;
        }

        public Criteria andAccount_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("account_status not between", value1, value2, "account_status");
            return (Criteria) this;
        }

        public Criteria andActive_statusIsNull() {
            addCriterion("active_status is null");
            return (Criteria) this;
        }

        public Criteria andActive_statusIsNotNull() {
            addCriterion("active_status is not null");
            return (Criteria) this;
        }

        public Criteria andActive_statusEqualTo(Integer value) {
            addCriterion("active_status =", value, "active_status");
            return (Criteria) this;
        }

        public Criteria andActive_statusNotEqualTo(Integer value) {
            addCriterion("active_status <>", value, "active_status");
            return (Criteria) this;
        }

        public Criteria andActive_statusGreaterThan(Integer value) {
            addCriterion("active_status >", value, "active_status");
            return (Criteria) this;
        }

        public Criteria andActive_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_status >=", value, "active_status");
            return (Criteria) this;
        }

        public Criteria andActive_statusLessThan(Integer value) {
            addCriterion("active_status <", value, "active_status");
            return (Criteria) this;
        }

        public Criteria andActive_statusLessThanOrEqualTo(Integer value) {
            addCriterion("active_status <=", value, "active_status");
            return (Criteria) this;
        }

        public Criteria andActive_statusIn(List<Integer> values) {
            addCriterion("active_status in", values, "active_status");
            return (Criteria) this;
        }

        public Criteria andActive_statusNotIn(List<Integer> values) {
            addCriterion("active_status not in", values, "active_status");
            return (Criteria) this;
        }

        public Criteria andActive_statusBetween(Integer value1, Integer value2) {
            addCriterion("active_status between", value1, value2, "active_status");
            return (Criteria) this;
        }

        public Criteria andActive_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("active_status not between", value1, value2, "active_status");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idIsNull() {
            addCriterion("third_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idIsNotNull() {
            addCriterion("third_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idEqualTo(String value) {
            addCriterion("third_cust_id =", value, "third_cust_id");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idNotEqualTo(String value) {
            addCriterion("third_cust_id <>", value, "third_cust_id");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idGreaterThan(String value) {
            addCriterion("third_cust_id >", value, "third_cust_id");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idGreaterThanOrEqualTo(String value) {
            addCriterion("third_cust_id >=", value, "third_cust_id");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idLessThan(String value) {
            addCriterion("third_cust_id <", value, "third_cust_id");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idLessThanOrEqualTo(String value) {
            addCriterion("third_cust_id <=", value, "third_cust_id");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idLike(String value) {
            addCriterion("third_cust_id like", value, "third_cust_id");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idNotLike(String value) {
            addCriterion("third_cust_id not like", value, "third_cust_id");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idIn(List<String> values) {
            addCriterion("third_cust_id in", values, "third_cust_id");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idNotIn(List<String> values) {
            addCriterion("third_cust_id not in", values, "third_cust_id");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idBetween(String value1, String value2) {
            addCriterion("third_cust_id between", value1, value2, "third_cust_id");
            return (Criteria) this;
        }

        public Criteria andThird_cust_idNotBetween(String value1, String value2) {
            addCriterion("third_cust_id not between", value1, value2, "third_cust_id");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNull() {
            addCriterion("updator is null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNotNull() {
            addCriterion("updator is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatorEqualTo(String value) {
            addCriterion("updator =", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotEqualTo(String value) {
            addCriterion("updator <>", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThan(String value) {
            addCriterion("updator >", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThanOrEqualTo(String value) {
            addCriterion("updator >=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThan(String value) {
            addCriterion("updator <", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThanOrEqualTo(String value) {
            addCriterion("updator <=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLike(String value) {
            addCriterion("updator like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotLike(String value) {
            addCriterion("updator not like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorIn(List<String> values) {
            addCriterion("updator in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotIn(List<String> values) {
            addCriterion("updator not in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorBetween(String value1, String value2) {
            addCriterion("updator between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotBetween(String value1, String value2) {
            addCriterion("updator not between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andCreated_timeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreated_timeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreated_timeEqualTo(Date value) {
            addCriterion("created_time =", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeGreaterThan(Date value) {
            addCriterion("created_time >", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeLessThan(Date value) {
            addCriterion("created_time <", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeIn(List<Date> values) {
            addCriterion("created_time in", values, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "created_time");
            return (Criteria) this;
        }

        public Criteria andUpdated_timeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdated_timeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdated_timeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updated_time");
            return (Criteria) this;
        }

        public Criteria andUpdated_timeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updated_time");
            return (Criteria) this;
        }

        public Criteria andUpdated_timeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updated_time");
            return (Criteria) this;
        }

        public Criteria andUpdated_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updated_time");
            return (Criteria) this;
        }

        public Criteria andUpdated_timeLessThan(Date value) {
            addCriterion("updated_time <", value, "updated_time");
            return (Criteria) this;
        }

        public Criteria andUpdated_timeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updated_time");
            return (Criteria) this;
        }

        public Criteria andUpdated_timeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updated_time");
            return (Criteria) this;
        }

        public Criteria andUpdated_timeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updated_time");
            return (Criteria) this;
        }

        public Criteria andUpdated_timeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updated_time");
            return (Criteria) this;
        }

        public Criteria andUpdated_timeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updated_time");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}