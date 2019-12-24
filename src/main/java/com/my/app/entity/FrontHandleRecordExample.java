package com.my.app.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontHandleRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontHandleRecordExample() {
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

        public Criteria andOrder_noIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrder_noIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_noEqualTo(String value) {
            addCriterion("order_no =", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noNotEqualTo(String value) {
            addCriterion("order_no <>", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noGreaterThan(String value) {
            addCriterion("order_no >", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noLessThan(String value) {
            addCriterion("order_no <", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noLike(String value) {
            addCriterion("order_no like", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noNotLike(String value) {
            addCriterion("order_no not like", value, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noIn(List<String> values) {
            addCriterion("order_no in", values, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noNotIn(List<String> values) {
            addCriterion("order_no not in", values, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "order_no");
            return (Criteria) this;
        }

        public Criteria andOrder_noNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "order_no");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyIsNull() {
            addCriterion("trade_money is null");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyIsNotNull() {
            addCriterion("trade_money is not null");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyEqualTo(String value) {
            addCriterion("trade_money =", value, "trade_money");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyNotEqualTo(String value) {
            addCriterion("trade_money <>", value, "trade_money");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyGreaterThan(String value) {
            addCriterion("trade_money >", value, "trade_money");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyGreaterThanOrEqualTo(String value) {
            addCriterion("trade_money >=", value, "trade_money");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyLessThan(String value) {
            addCriterion("trade_money <", value, "trade_money");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyLessThanOrEqualTo(String value) {
            addCriterion("trade_money <=", value, "trade_money");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyLike(String value) {
            addCriterion("trade_money like", value, "trade_money");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyNotLike(String value) {
            addCriterion("trade_money not like", value, "trade_money");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyIn(List<String> values) {
            addCriterion("trade_money in", values, "trade_money");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyNotIn(List<String> values) {
            addCriterion("trade_money not in", values, "trade_money");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyBetween(String value1, String value2) {
            addCriterion("trade_money between", value1, value2, "trade_money");
            return (Criteria) this;
        }

        public Criteria andTrade_moneyNotBetween(String value1, String value2) {
            addCriterion("trade_money not between", value1, value2, "trade_money");
            return (Criteria) this;
        }

        public Criteria andFee_moneyIsNull() {
            addCriterion("fee_money is null");
            return (Criteria) this;
        }

        public Criteria andFee_moneyIsNotNull() {
            addCriterion("fee_money is not null");
            return (Criteria) this;
        }

        public Criteria andFee_moneyEqualTo(String value) {
            addCriterion("fee_money =", value, "fee_money");
            return (Criteria) this;
        }

        public Criteria andFee_moneyNotEqualTo(String value) {
            addCriterion("fee_money <>", value, "fee_money");
            return (Criteria) this;
        }

        public Criteria andFee_moneyGreaterThan(String value) {
            addCriterion("fee_money >", value, "fee_money");
            return (Criteria) this;
        }

        public Criteria andFee_moneyGreaterThanOrEqualTo(String value) {
            addCriterion("fee_money >=", value, "fee_money");
            return (Criteria) this;
        }

        public Criteria andFee_moneyLessThan(String value) {
            addCriterion("fee_money <", value, "fee_money");
            return (Criteria) this;
        }

        public Criteria andFee_moneyLessThanOrEqualTo(String value) {
            addCriterion("fee_money <=", value, "fee_money");
            return (Criteria) this;
        }

        public Criteria andFee_moneyLike(String value) {
            addCriterion("fee_money like", value, "fee_money");
            return (Criteria) this;
        }

        public Criteria andFee_moneyNotLike(String value) {
            addCriterion("fee_money not like", value, "fee_money");
            return (Criteria) this;
        }

        public Criteria andFee_moneyIn(List<String> values) {
            addCriterion("fee_money in", values, "fee_money");
            return (Criteria) this;
        }

        public Criteria andFee_moneyNotIn(List<String> values) {
            addCriterion("fee_money not in", values, "fee_money");
            return (Criteria) this;
        }

        public Criteria andFee_moneyBetween(String value1, String value2) {
            addCriterion("fee_money between", value1, value2, "fee_money");
            return (Criteria) this;
        }

        public Criteria andFee_moneyNotBetween(String value1, String value2) {
            addCriterion("fee_money not between", value1, value2, "fee_money");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeIsNull() {
            addCriterion("platform_type is null");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeIsNotNull() {
            addCriterion("platform_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeEqualTo(String value) {
            addCriterion("platform_type =", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeNotEqualTo(String value) {
            addCriterion("platform_type <>", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeGreaterThan(String value) {
            addCriterion("platform_type >", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeGreaterThanOrEqualTo(String value) {
            addCriterion("platform_type >=", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeLessThan(String value) {
            addCriterion("platform_type <", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeLessThanOrEqualTo(String value) {
            addCriterion("platform_type <=", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeLike(String value) {
            addCriterion("platform_type like", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeNotLike(String value) {
            addCriterion("platform_type not like", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeIn(List<String> values) {
            addCriterion("platform_type in", values, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeNotIn(List<String> values) {
            addCriterion("platform_type not in", values, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeBetween(String value1, String value2) {
            addCriterion("platform_type between", value1, value2, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeNotBetween(String value1, String value2) {
            addCriterion("platform_type not between", value1, value2, "platform_type");
            return (Criteria) this;
        }

        public Criteria andApp_typeIsNull() {
            addCriterion("app_type is null");
            return (Criteria) this;
        }

        public Criteria andApp_typeIsNotNull() {
            addCriterion("app_type is not null");
            return (Criteria) this;
        }

        public Criteria andApp_typeEqualTo(String value) {
            addCriterion("app_type =", value, "app_type");
            return (Criteria) this;
        }

        public Criteria andApp_typeNotEqualTo(String value) {
            addCriterion("app_type <>", value, "app_type");
            return (Criteria) this;
        }

        public Criteria andApp_typeGreaterThan(String value) {
            addCriterion("app_type >", value, "app_type");
            return (Criteria) this;
        }

        public Criteria andApp_typeGreaterThanOrEqualTo(String value) {
            addCriterion("app_type >=", value, "app_type");
            return (Criteria) this;
        }

        public Criteria andApp_typeLessThan(String value) {
            addCriterion("app_type <", value, "app_type");
            return (Criteria) this;
        }

        public Criteria andApp_typeLessThanOrEqualTo(String value) {
            addCriterion("app_type <=", value, "app_type");
            return (Criteria) this;
        }

        public Criteria andApp_typeLike(String value) {
            addCriterion("app_type like", value, "app_type");
            return (Criteria) this;
        }

        public Criteria andApp_typeNotLike(String value) {
            addCriterion("app_type not like", value, "app_type");
            return (Criteria) this;
        }

        public Criteria andApp_typeIn(List<String> values) {
            addCriterion("app_type in", values, "app_type");
            return (Criteria) this;
        }

        public Criteria andApp_typeNotIn(List<String> values) {
            addCriterion("app_type not in", values, "app_type");
            return (Criteria) this;
        }

        public Criteria andApp_typeBetween(String value1, String value2) {
            addCriterion("app_type between", value1, value2, "app_type");
            return (Criteria) this;
        }

        public Criteria andApp_typeNotBetween(String value1, String value2) {
            addCriterion("app_type not between", value1, value2, "app_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProduct_typeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_typeEqualTo(String value) {
            addCriterion("product_type =", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeGreaterThan(String value) {
            addCriterion("product_type >", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeLessThan(String value) {
            addCriterion("product_type <", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeLike(String value) {
            addCriterion("product_type like", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeNotLike(String value) {
            addCriterion("product_type not like", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeIn(List<String> values) {
            addCriterion("product_type in", values, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "product_type");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andId_cardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andId_cardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andId_cardEqualTo(String value) {
            addCriterion("id_card =", value, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardGreaterThan(String value) {
            addCriterion("id_card >", value, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardLessThan(String value) {
            addCriterion("id_card <", value, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardLike(String value) {
            addCriterion("id_card like", value, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardNotLike(String value) {
            addCriterion("id_card not like", value, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardIn(List<String> values) {
            addCriterion("id_card in", values, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "id_card");
            return (Criteria) this;
        }

        public Criteria andCustacct_idIsNull() {
            addCriterion("custacct_id is null");
            return (Criteria) this;
        }

        public Criteria andCustacct_idIsNotNull() {
            addCriterion("custacct_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustacct_idEqualTo(String value) {
            addCriterion("custacct_id =", value, "custacct_id");
            return (Criteria) this;
        }

        public Criteria andCustacct_idNotEqualTo(String value) {
            addCriterion("custacct_id <>", value, "custacct_id");
            return (Criteria) this;
        }

        public Criteria andCustacct_idGreaterThan(String value) {
            addCriterion("custacct_id >", value, "custacct_id");
            return (Criteria) this;
        }

        public Criteria andCustacct_idGreaterThanOrEqualTo(String value) {
            addCriterion("custacct_id >=", value, "custacct_id");
            return (Criteria) this;
        }

        public Criteria andCustacct_idLessThan(String value) {
            addCriterion("custacct_id <", value, "custacct_id");
            return (Criteria) this;
        }

        public Criteria andCustacct_idLessThanOrEqualTo(String value) {
            addCriterion("custacct_id <=", value, "custacct_id");
            return (Criteria) this;
        }

        public Criteria andCustacct_idLike(String value) {
            addCriterion("custacct_id like", value, "custacct_id");
            return (Criteria) this;
        }

        public Criteria andCustacct_idNotLike(String value) {
            addCriterion("custacct_id not like", value, "custacct_id");
            return (Criteria) this;
        }

        public Criteria andCustacct_idIn(List<String> values) {
            addCriterion("custacct_id in", values, "custacct_id");
            return (Criteria) this;
        }

        public Criteria andCustacct_idNotIn(List<String> values) {
            addCriterion("custacct_id not in", values, "custacct_id");
            return (Criteria) this;
        }

        public Criteria andCustacct_idBetween(String value1, String value2) {
            addCriterion("custacct_id between", value1, value2, "custacct_id");
            return (Criteria) this;
        }

        public Criteria andCustacct_idNotBetween(String value1, String value2) {
            addCriterion("custacct_id not between", value1, value2, "custacct_id");
            return (Criteria) this;
        }

        public Criteria andBank_noIsNull() {
            addCriterion("bank_no is null");
            return (Criteria) this;
        }

        public Criteria andBank_noIsNotNull() {
            addCriterion("bank_no is not null");
            return (Criteria) this;
        }

        public Criteria andBank_noEqualTo(String value) {
            addCriterion("bank_no =", value, "bank_no");
            return (Criteria) this;
        }

        public Criteria andBank_noNotEqualTo(String value) {
            addCriterion("bank_no <>", value, "bank_no");
            return (Criteria) this;
        }

        public Criteria andBank_noGreaterThan(String value) {
            addCriterion("bank_no >", value, "bank_no");
            return (Criteria) this;
        }

        public Criteria andBank_noGreaterThanOrEqualTo(String value) {
            addCriterion("bank_no >=", value, "bank_no");
            return (Criteria) this;
        }

        public Criteria andBank_noLessThan(String value) {
            addCriterion("bank_no <", value, "bank_no");
            return (Criteria) this;
        }

        public Criteria andBank_noLessThanOrEqualTo(String value) {
            addCriterion("bank_no <=", value, "bank_no");
            return (Criteria) this;
        }

        public Criteria andBank_noLike(String value) {
            addCriterion("bank_no like", value, "bank_no");
            return (Criteria) this;
        }

        public Criteria andBank_noNotLike(String value) {
            addCriterion("bank_no not like", value, "bank_no");
            return (Criteria) this;
        }

        public Criteria andBank_noIn(List<String> values) {
            addCriterion("bank_no in", values, "bank_no");
            return (Criteria) this;
        }

        public Criteria andBank_noNotIn(List<String> values) {
            addCriterion("bank_no not in", values, "bank_no");
            return (Criteria) this;
        }

        public Criteria andBank_noBetween(String value1, String value2) {
            addCriterion("bank_no between", value1, value2, "bank_no");
            return (Criteria) this;
        }

        public Criteria andBank_noNotBetween(String value1, String value2) {
            addCriterion("bank_no not between", value1, value2, "bank_no");
            return (Criteria) this;
        }

        public Criteria andBank_codeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBank_codeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBank_codeEqualTo(String value) {
            addCriterion("bank_code =", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeLessThan(String value) {
            addCriterion("bank_code <", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeLike(String value) {
            addCriterion("bank_code like", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeNotLike(String value) {
            addCriterion("bank_code not like", value, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeIn(List<String> values) {
            addCriterion("bank_code in", values, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_codeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bank_code");
            return (Criteria) this;
        }

        public Criteria andBank_phoneIsNull() {
            addCriterion("bank_phone is null");
            return (Criteria) this;
        }

        public Criteria andBank_phoneIsNotNull() {
            addCriterion("bank_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBank_phoneEqualTo(String value) {
            addCriterion("bank_phone =", value, "bank_phone");
            return (Criteria) this;
        }

        public Criteria andBank_phoneNotEqualTo(String value) {
            addCriterion("bank_phone <>", value, "bank_phone");
            return (Criteria) this;
        }

        public Criteria andBank_phoneGreaterThan(String value) {
            addCriterion("bank_phone >", value, "bank_phone");
            return (Criteria) this;
        }

        public Criteria andBank_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("bank_phone >=", value, "bank_phone");
            return (Criteria) this;
        }

        public Criteria andBank_phoneLessThan(String value) {
            addCriterion("bank_phone <", value, "bank_phone");
            return (Criteria) this;
        }

        public Criteria andBank_phoneLessThanOrEqualTo(String value) {
            addCriterion("bank_phone <=", value, "bank_phone");
            return (Criteria) this;
        }

        public Criteria andBank_phoneLike(String value) {
            addCriterion("bank_phone like", value, "bank_phone");
            return (Criteria) this;
        }

        public Criteria andBank_phoneNotLike(String value) {
            addCriterion("bank_phone not like", value, "bank_phone");
            return (Criteria) this;
        }

        public Criteria andBank_phoneIn(List<String> values) {
            addCriterion("bank_phone in", values, "bank_phone");
            return (Criteria) this;
        }

        public Criteria andBank_phoneNotIn(List<String> values) {
            addCriterion("bank_phone not in", values, "bank_phone");
            return (Criteria) this;
        }

        public Criteria andBank_phoneBetween(String value1, String value2) {
            addCriterion("bank_phone between", value1, value2, "bank_phone");
            return (Criteria) this;
        }

        public Criteria andBank_phoneNotBetween(String value1, String value2) {
            addCriterion("bank_phone not between", value1, value2, "bank_phone");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idIsNull() {
            addCriterion("trade_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idIsNotNull() {
            addCriterion("trade_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idEqualTo(String value) {
            addCriterion("trade_flow_id =", value, "trade_flow_id");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idNotEqualTo(String value) {
            addCriterion("trade_flow_id <>", value, "trade_flow_id");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idGreaterThan(String value) {
            addCriterion("trade_flow_id >", value, "trade_flow_id");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idGreaterThanOrEqualTo(String value) {
            addCriterion("trade_flow_id >=", value, "trade_flow_id");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idLessThan(String value) {
            addCriterion("trade_flow_id <", value, "trade_flow_id");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idLessThanOrEqualTo(String value) {
            addCriterion("trade_flow_id <=", value, "trade_flow_id");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idLike(String value) {
            addCriterion("trade_flow_id like", value, "trade_flow_id");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idNotLike(String value) {
            addCriterion("trade_flow_id not like", value, "trade_flow_id");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idIn(List<String> values) {
            addCriterion("trade_flow_id in", values, "trade_flow_id");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idNotIn(List<String> values) {
            addCriterion("trade_flow_id not in", values, "trade_flow_id");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idBetween(String value1, String value2) {
            addCriterion("trade_flow_id between", value1, value2, "trade_flow_id");
            return (Criteria) this;
        }

        public Criteria andTrade_flow_idNotBetween(String value1, String value2) {
            addCriterion("trade_flow_id not between", value1, value2, "trade_flow_id");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idIsNull() {
            addCriterion("app_repayment_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idIsNotNull() {
            addCriterion("app_repayment_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idEqualTo(String value) {
            addCriterion("app_repayment_flow_id =", value, "app_repayment_flow_id");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idNotEqualTo(String value) {
            addCriterion("app_repayment_flow_id <>", value, "app_repayment_flow_id");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idGreaterThan(String value) {
            addCriterion("app_repayment_flow_id >", value, "app_repayment_flow_id");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idGreaterThanOrEqualTo(String value) {
            addCriterion("app_repayment_flow_id >=", value, "app_repayment_flow_id");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idLessThan(String value) {
            addCriterion("app_repayment_flow_id <", value, "app_repayment_flow_id");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idLessThanOrEqualTo(String value) {
            addCriterion("app_repayment_flow_id <=", value, "app_repayment_flow_id");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idLike(String value) {
            addCriterion("app_repayment_flow_id like", value, "app_repayment_flow_id");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idNotLike(String value) {
            addCriterion("app_repayment_flow_id not like", value, "app_repayment_flow_id");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idIn(List<String> values) {
            addCriterion("app_repayment_flow_id in", values, "app_repayment_flow_id");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idNotIn(List<String> values) {
            addCriterion("app_repayment_flow_id not in", values, "app_repayment_flow_id");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idBetween(String value1, String value2) {
            addCriterion("app_repayment_flow_id between", value1, value2, "app_repayment_flow_id");
            return (Criteria) this;
        }

        public Criteria andApp_repayment_flow_idNotBetween(String value1, String value2) {
            addCriterion("app_repayment_flow_id not between", value1, value2, "app_repayment_flow_id");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idIsNull() {
            addCriterion("bank_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idIsNotNull() {
            addCriterion("bank_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idEqualTo(String value) {
            addCriterion("bank_flow_id =", value, "bank_flow_id");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idNotEqualTo(String value) {
            addCriterion("bank_flow_id <>", value, "bank_flow_id");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idGreaterThan(String value) {
            addCriterion("bank_flow_id >", value, "bank_flow_id");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idGreaterThanOrEqualTo(String value) {
            addCriterion("bank_flow_id >=", value, "bank_flow_id");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idLessThan(String value) {
            addCriterion("bank_flow_id <", value, "bank_flow_id");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idLessThanOrEqualTo(String value) {
            addCriterion("bank_flow_id <=", value, "bank_flow_id");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idLike(String value) {
            addCriterion("bank_flow_id like", value, "bank_flow_id");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idNotLike(String value) {
            addCriterion("bank_flow_id not like", value, "bank_flow_id");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idIn(List<String> values) {
            addCriterion("bank_flow_id in", values, "bank_flow_id");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idNotIn(List<String> values) {
            addCriterion("bank_flow_id not in", values, "bank_flow_id");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idBetween(String value1, String value2) {
            addCriterion("bank_flow_id between", value1, value2, "bank_flow_id");
            return (Criteria) this;
        }

        public Criteria andBank_flow_idNotBetween(String value1, String value2) {
            addCriterion("bank_flow_id not between", value1, value2, "bank_flow_id");
            return (Criteria) this;
        }

        public Criteria andRecord_statusIsNull() {
            addCriterion("record_status is null");
            return (Criteria) this;
        }

        public Criteria andRecord_statusIsNotNull() {
            addCriterion("record_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecord_statusEqualTo(String value) {
            addCriterion("record_status =", value, "record_status");
            return (Criteria) this;
        }

        public Criteria andRecord_statusNotEqualTo(String value) {
            addCriterion("record_status <>", value, "record_status");
            return (Criteria) this;
        }

        public Criteria andRecord_statusGreaterThan(String value) {
            addCriterion("record_status >", value, "record_status");
            return (Criteria) this;
        }

        public Criteria andRecord_statusGreaterThanOrEqualTo(String value) {
            addCriterion("record_status >=", value, "record_status");
            return (Criteria) this;
        }

        public Criteria andRecord_statusLessThan(String value) {
            addCriterion("record_status <", value, "record_status");
            return (Criteria) this;
        }

        public Criteria andRecord_statusLessThanOrEqualTo(String value) {
            addCriterion("record_status <=", value, "record_status");
            return (Criteria) this;
        }

        public Criteria andRecord_statusLike(String value) {
            addCriterion("record_status like", value, "record_status");
            return (Criteria) this;
        }

        public Criteria andRecord_statusNotLike(String value) {
            addCriterion("record_status not like", value, "record_status");
            return (Criteria) this;
        }

        public Criteria andRecord_statusIn(List<String> values) {
            addCriterion("record_status in", values, "record_status");
            return (Criteria) this;
        }

        public Criteria andRecord_statusNotIn(List<String> values) {
            addCriterion("record_status not in", values, "record_status");
            return (Criteria) this;
        }

        public Criteria andRecord_statusBetween(String value1, String value2) {
            addCriterion("record_status between", value1, value2, "record_status");
            return (Criteria) this;
        }

        public Criteria andRecord_statusNotBetween(String value1, String value2) {
            addCriterion("record_status not between", value1, value2, "record_status");
            return (Criteria) this;
        }

        public Criteria andStatus_descIsNull() {
            addCriterion("status_desc is null");
            return (Criteria) this;
        }

        public Criteria andStatus_descIsNotNull() {
            addCriterion("status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStatus_descEqualTo(String value) {
            addCriterion("status_desc =", value, "status_desc");
            return (Criteria) this;
        }

        public Criteria andStatus_descNotEqualTo(String value) {
            addCriterion("status_desc <>", value, "status_desc");
            return (Criteria) this;
        }

        public Criteria andStatus_descGreaterThan(String value) {
            addCriterion("status_desc >", value, "status_desc");
            return (Criteria) this;
        }

        public Criteria andStatus_descGreaterThanOrEqualTo(String value) {
            addCriterion("status_desc >=", value, "status_desc");
            return (Criteria) this;
        }

        public Criteria andStatus_descLessThan(String value) {
            addCriterion("status_desc <", value, "status_desc");
            return (Criteria) this;
        }

        public Criteria andStatus_descLessThanOrEqualTo(String value) {
            addCriterion("status_desc <=", value, "status_desc");
            return (Criteria) this;
        }

        public Criteria andStatus_descLike(String value) {
            addCriterion("status_desc like", value, "status_desc");
            return (Criteria) this;
        }

        public Criteria andStatus_descNotLike(String value) {
            addCriterion("status_desc not like", value, "status_desc");
            return (Criteria) this;
        }

        public Criteria andStatus_descIn(List<String> values) {
            addCriterion("status_desc in", values, "status_desc");
            return (Criteria) this;
        }

        public Criteria andStatus_descNotIn(List<String> values) {
            addCriterion("status_desc not in", values, "status_desc");
            return (Criteria) this;
        }

        public Criteria andStatus_descBetween(String value1, String value2) {
            addCriterion("status_desc between", value1, value2, "status_desc");
            return (Criteria) this;
        }

        public Criteria andStatus_descNotBetween(String value1, String value2) {
            addCriterion("status_desc not between", value1, value2, "status_desc");
            return (Criteria) this;
        }

        public Criteria andHandle_typeIsNull() {
            addCriterion("handle_type is null");
            return (Criteria) this;
        }

        public Criteria andHandle_typeIsNotNull() {
            addCriterion("handle_type is not null");
            return (Criteria) this;
        }

        public Criteria andHandle_typeEqualTo(String value) {
            addCriterion("handle_type =", value, "handle_type");
            return (Criteria) this;
        }

        public Criteria andHandle_typeNotEqualTo(String value) {
            addCriterion("handle_type <>", value, "handle_type");
            return (Criteria) this;
        }

        public Criteria andHandle_typeGreaterThan(String value) {
            addCriterion("handle_type >", value, "handle_type");
            return (Criteria) this;
        }

        public Criteria andHandle_typeGreaterThanOrEqualTo(String value) {
            addCriterion("handle_type >=", value, "handle_type");
            return (Criteria) this;
        }

        public Criteria andHandle_typeLessThan(String value) {
            addCriterion("handle_type <", value, "handle_type");
            return (Criteria) this;
        }

        public Criteria andHandle_typeLessThanOrEqualTo(String value) {
            addCriterion("handle_type <=", value, "handle_type");
            return (Criteria) this;
        }

        public Criteria andHandle_typeLike(String value) {
            addCriterion("handle_type like", value, "handle_type");
            return (Criteria) this;
        }

        public Criteria andHandle_typeNotLike(String value) {
            addCriterion("handle_type not like", value, "handle_type");
            return (Criteria) this;
        }

        public Criteria andHandle_typeIn(List<String> values) {
            addCriterion("handle_type in", values, "handle_type");
            return (Criteria) this;
        }

        public Criteria andHandle_typeNotIn(List<String> values) {
            addCriterion("handle_type not in", values, "handle_type");
            return (Criteria) this;
        }

        public Criteria andHandle_typeBetween(String value1, String value2) {
            addCriterion("handle_type between", value1, value2, "handle_type");
            return (Criteria) this;
        }

        public Criteria andHandle_typeNotBetween(String value1, String value2) {
            addCriterion("handle_type not between", value1, value2, "handle_type");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andReturn_urlIsNull() {
            addCriterion("return_url is null");
            return (Criteria) this;
        }

        public Criteria andReturn_urlIsNotNull() {
            addCriterion("return_url is not null");
            return (Criteria) this;
        }

        public Criteria andReturn_urlEqualTo(String value) {
            addCriterion("return_url =", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlNotEqualTo(String value) {
            addCriterion("return_url <>", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlGreaterThan(String value) {
            addCriterion("return_url >", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlGreaterThanOrEqualTo(String value) {
            addCriterion("return_url >=", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlLessThan(String value) {
            addCriterion("return_url <", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlLessThanOrEqualTo(String value) {
            addCriterion("return_url <=", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlLike(String value) {
            addCriterion("return_url like", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlNotLike(String value) {
            addCriterion("return_url not like", value, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlIn(List<String> values) {
            addCriterion("return_url in", values, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlNotIn(List<String> values) {
            addCriterion("return_url not in", values, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlBetween(String value1, String value2) {
            addCriterion("return_url between", value1, value2, "return_url");
            return (Criteria) this;
        }

        public Criteria andReturn_urlNotBetween(String value1, String value2) {
            addCriterion("return_url not between", value1, value2, "return_url");
            return (Criteria) this;
        }

        public Criteria andUnique_identityIsNull() {
            addCriterion("unique_identity is null");
            return (Criteria) this;
        }

        public Criteria andUnique_identityIsNotNull() {
            addCriterion("unique_identity is not null");
            return (Criteria) this;
        }

        public Criteria andUnique_identityEqualTo(String value) {
            addCriterion("unique_identity =", value, "unique_identity");
            return (Criteria) this;
        }

        public Criteria andUnique_identityNotEqualTo(String value) {
            addCriterion("unique_identity <>", value, "unique_identity");
            return (Criteria) this;
        }

        public Criteria andUnique_identityGreaterThan(String value) {
            addCriterion("unique_identity >", value, "unique_identity");
            return (Criteria) this;
        }

        public Criteria andUnique_identityGreaterThanOrEqualTo(String value) {
            addCriterion("unique_identity >=", value, "unique_identity");
            return (Criteria) this;
        }

        public Criteria andUnique_identityLessThan(String value) {
            addCriterion("unique_identity <", value, "unique_identity");
            return (Criteria) this;
        }

        public Criteria andUnique_identityLessThanOrEqualTo(String value) {
            addCriterion("unique_identity <=", value, "unique_identity");
            return (Criteria) this;
        }

        public Criteria andUnique_identityLike(String value) {
            addCriterion("unique_identity like", value, "unique_identity");
            return (Criteria) this;
        }

        public Criteria andUnique_identityNotLike(String value) {
            addCriterion("unique_identity not like", value, "unique_identity");
            return (Criteria) this;
        }

        public Criteria andUnique_identityIn(List<String> values) {
            addCriterion("unique_identity in", values, "unique_identity");
            return (Criteria) this;
        }

        public Criteria andUnique_identityNotIn(List<String> values) {
            addCriterion("unique_identity not in", values, "unique_identity");
            return (Criteria) this;
        }

        public Criteria andUnique_identityBetween(String value1, String value2) {
            addCriterion("unique_identity between", value1, value2, "unique_identity");
            return (Criteria) this;
        }

        public Criteria andUnique_identityNotBetween(String value1, String value2) {
            addCriterion("unique_identity not between", value1, value2, "unique_identity");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeIsNull() {
            addCriterion("pay_success_time is null");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeIsNotNull() {
            addCriterion("pay_success_time is not null");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeEqualTo(Date value) {
            addCriterion("pay_success_time =", value, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeNotEqualTo(Date value) {
            addCriterion("pay_success_time <>", value, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeGreaterThan(Date value) {
            addCriterion("pay_success_time >", value, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_success_time >=", value, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeLessThan(Date value) {
            addCriterion("pay_success_time <", value, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeLessThanOrEqualTo(Date value) {
            addCriterion("pay_success_time <=", value, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeIn(List<Date> values) {
            addCriterion("pay_success_time in", values, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeNotIn(List<Date> values) {
            addCriterion("pay_success_time not in", values, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeBetween(Date value1, Date value2) {
            addCriterion("pay_success_time between", value1, value2, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andPay_success_timeNotBetween(Date value1, Date value2) {
            addCriterion("pay_success_time not between", value1, value2, "pay_success_time");
            return (Criteria) this;
        }

        public Criteria andStatus_change_timeIsNull() {
            addCriterion("status_change_time is null");
            return (Criteria) this;
        }

        public Criteria andStatus_change_timeIsNotNull() {
            addCriterion("status_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andStatus_change_timeEqualTo(Date value) {
            addCriterion("status_change_time =", value, "status_change_time");
            return (Criteria) this;
        }

        public Criteria andStatus_change_timeNotEqualTo(Date value) {
            addCriterion("status_change_time <>", value, "status_change_time");
            return (Criteria) this;
        }

        public Criteria andStatus_change_timeGreaterThan(Date value) {
            addCriterion("status_change_time >", value, "status_change_time");
            return (Criteria) this;
        }

        public Criteria andStatus_change_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("status_change_time >=", value, "status_change_time");
            return (Criteria) this;
        }

        public Criteria andStatus_change_timeLessThan(Date value) {
            addCriterion("status_change_time <", value, "status_change_time");
            return (Criteria) this;
        }

        public Criteria andStatus_change_timeLessThanOrEqualTo(Date value) {
            addCriterion("status_change_time <=", value, "status_change_time");
            return (Criteria) this;
        }

        public Criteria andStatus_change_timeIn(List<Date> values) {
            addCriterion("status_change_time in", values, "status_change_time");
            return (Criteria) this;
        }

        public Criteria andStatus_change_timeNotIn(List<Date> values) {
            addCriterion("status_change_time not in", values, "status_change_time");
            return (Criteria) this;
        }

        public Criteria andStatus_change_timeBetween(Date value1, Date value2) {
            addCriterion("status_change_time between", value1, value2, "status_change_time");
            return (Criteria) this;
        }

        public Criteria andStatus_change_timeNotBetween(Date value1, Date value2) {
            addCriterion("status_change_time not between", value1, value2, "status_change_time");
            return (Criteria) this;
        }

        public Criteria andCreated_atIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreated_atIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreated_atEqualTo(Date value) {
            addCriterion("created_at =", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atGreaterThan(Date value) {
            addCriterion("created_at >", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atLessThan(Date value) {
            addCriterion("created_at <", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atIn(List<Date> values) {
            addCriterion("created_at in", values, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "created_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdated_atIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdated_atEqualTo(Date value) {
            addCriterion("updated_at =", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atLessThan(Date value) {
            addCriterion("updated_at <", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atIn(List<Date> values) {
            addCriterion("updated_at in", values, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updated_at");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeIsNull() {
            addCriterion("withdraw_type is null");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeIsNotNull() {
            addCriterion("withdraw_type is not null");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeEqualTo(String value) {
            addCriterion("withdraw_type =", value, "withdraw_type");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeNotEqualTo(String value) {
            addCriterion("withdraw_type <>", value, "withdraw_type");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeGreaterThan(String value) {
            addCriterion("withdraw_type >", value, "withdraw_type");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_type >=", value, "withdraw_type");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeLessThan(String value) {
            addCriterion("withdraw_type <", value, "withdraw_type");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeLessThanOrEqualTo(String value) {
            addCriterion("withdraw_type <=", value, "withdraw_type");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeLike(String value) {
            addCriterion("withdraw_type like", value, "withdraw_type");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeNotLike(String value) {
            addCriterion("withdraw_type not like", value, "withdraw_type");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeIn(List<String> values) {
            addCriterion("withdraw_type in", values, "withdraw_type");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeNotIn(List<String> values) {
            addCriterion("withdraw_type not in", values, "withdraw_type");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeBetween(String value1, String value2) {
            addCriterion("withdraw_type between", value1, value2, "withdraw_type");
            return (Criteria) this;
        }

        public Criteria andWithdraw_typeNotBetween(String value1, String value2) {
            addCriterion("withdraw_type not between", value1, value2, "withdraw_type");
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