package com.bklkj.pojo;

import java.util.ArrayList;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andBusinessidIsNull() {
            addCriterion("BusinessId is null");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNotNull() {
            addCriterion("BusinessId is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessidEqualTo(Integer value) {
            addCriterion("BusinessId =", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotEqualTo(Integer value) {
            addCriterion("BusinessId <>", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThan(Integer value) {
            addCriterion("BusinessId >", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BusinessId >=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThan(Integer value) {
            addCriterion("BusinessId <", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThanOrEqualTo(Integer value) {
            addCriterion("BusinessId <=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidIn(List<Integer> values) {
            addCriterion("BusinessId in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotIn(List<Integer> values) {
            addCriterion("BusinessId not in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidBetween(Integer value1, Integer value2) {
            addCriterion("BusinessId between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotBetween(Integer value1, Integer value2) {
            addCriterion("BusinessId not between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNull() {
            addCriterion("BusinessName is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNotNull() {
            addCriterion("BusinessName is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameEqualTo(String value) {
            addCriterion("BusinessName =", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotEqualTo(String value) {
            addCriterion("BusinessName <>", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThan(String value) {
            addCriterion("BusinessName >", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessName >=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThan(String value) {
            addCriterion("BusinessName <", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThanOrEqualTo(String value) {
            addCriterion("BusinessName <=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLike(String value) {
            addCriterion("BusinessName like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotLike(String value) {
            addCriterion("BusinessName not like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIn(List<String> values) {
            addCriterion("BusinessName in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotIn(List<String> values) {
            addCriterion("BusinessName not in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameBetween(String value1, String value2) {
            addCriterion("BusinessName between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotBetween(String value1, String value2) {
            addCriterion("BusinessName not between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneIsNull() {
            addCriterion("BusinessPhone is null");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneIsNotNull() {
            addCriterion("BusinessPhone is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneEqualTo(String value) {
            addCriterion("BusinessPhone =", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneNotEqualTo(String value) {
            addCriterion("BusinessPhone <>", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneGreaterThan(String value) {
            addCriterion("BusinessPhone >", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessPhone >=", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneLessThan(String value) {
            addCriterion("BusinessPhone <", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneLessThanOrEqualTo(String value) {
            addCriterion("BusinessPhone <=", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneLike(String value) {
            addCriterion("BusinessPhone like", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneNotLike(String value) {
            addCriterion("BusinessPhone not like", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneIn(List<String> values) {
            addCriterion("BusinessPhone in", values, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneNotIn(List<String> values) {
            addCriterion("BusinessPhone not in", values, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneBetween(String value1, String value2) {
            addCriterion("BusinessPhone between", value1, value2, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneNotBetween(String value1, String value2) {
            addCriterion("BusinessPhone not between", value1, value2, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIsNull() {
            addCriterion("BusinessAddress is null");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIsNotNull() {
            addCriterion("BusinessAddress is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressEqualTo(String value) {
            addCriterion("BusinessAddress =", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotEqualTo(String value) {
            addCriterion("BusinessAddress <>", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressGreaterThan(String value) {
            addCriterion("BusinessAddress >", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessAddress >=", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLessThan(String value) {
            addCriterion("BusinessAddress <", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLessThanOrEqualTo(String value) {
            addCriterion("BusinessAddress <=", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLike(String value) {
            addCriterion("BusinessAddress like", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotLike(String value) {
            addCriterion("BusinessAddress not like", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIn(List<String> values) {
            addCriterion("BusinessAddress in", values, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotIn(List<String> values) {
            addCriterion("BusinessAddress not in", values, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressBetween(String value1, String value2) {
            addCriterion("BusinessAddress between", value1, value2, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotBetween(String value1, String value2) {
            addCriterion("BusinessAddress not between", value1, value2, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("Logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("Logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("Logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("Logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("Logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("Logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("Logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("Logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("Logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("Logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("Logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("Logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("Logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("Logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceIsNull() {
            addCriterion("BusinessIntroduce is null");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceIsNotNull() {
            addCriterion("BusinessIntroduce is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceEqualTo(String value) {
            addCriterion("BusinessIntroduce =", value, "businessintroduce");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceNotEqualTo(String value) {
            addCriterion("BusinessIntroduce <>", value, "businessintroduce");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceGreaterThan(String value) {
            addCriterion("BusinessIntroduce >", value, "businessintroduce");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessIntroduce >=", value, "businessintroduce");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceLessThan(String value) {
            addCriterion("BusinessIntroduce <", value, "businessintroduce");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceLessThanOrEqualTo(String value) {
            addCriterion("BusinessIntroduce <=", value, "businessintroduce");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceLike(String value) {
            addCriterion("BusinessIntroduce like", value, "businessintroduce");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceNotLike(String value) {
            addCriterion("BusinessIntroduce not like", value, "businessintroduce");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceIn(List<String> values) {
            addCriterion("BusinessIntroduce in", values, "businessintroduce");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceNotIn(List<String> values) {
            addCriterion("BusinessIntroduce not in", values, "businessintroduce");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceBetween(String value1, String value2) {
            addCriterion("BusinessIntroduce between", value1, value2, "businessintroduce");
            return (Criteria) this;
        }

        public Criteria andBusinessintroduceNotBetween(String value1, String value2) {
            addCriterion("BusinessIntroduce not between", value1, value2, "businessintroduce");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteIsNull() {
            addCriterion("businessWebsite is null");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteIsNotNull() {
            addCriterion("businessWebsite is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteEqualTo(String value) {
            addCriterion("businessWebsite =", value, "businesswebsite");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteNotEqualTo(String value) {
            addCriterion("businessWebsite <>", value, "businesswebsite");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteGreaterThan(String value) {
            addCriterion("businessWebsite >", value, "businesswebsite");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("businessWebsite >=", value, "businesswebsite");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteLessThan(String value) {
            addCriterion("businessWebsite <", value, "businesswebsite");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteLessThanOrEqualTo(String value) {
            addCriterion("businessWebsite <=", value, "businesswebsite");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteLike(String value) {
            addCriterion("businessWebsite like", value, "businesswebsite");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteNotLike(String value) {
            addCriterion("businessWebsite not like", value, "businesswebsite");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteIn(List<String> values) {
            addCriterion("businessWebsite in", values, "businesswebsite");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteNotIn(List<String> values) {
            addCriterion("businessWebsite not in", values, "businesswebsite");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteBetween(String value1, String value2) {
            addCriterion("businessWebsite between", value1, value2, "businesswebsite");
            return (Criteria) this;
        }

        public Criteria andBusinesswebsiteNotBetween(String value1, String value2) {
            addCriterion("businessWebsite not between", value1, value2, "businesswebsite");
            return (Criteria) this;
        }

        public Criteria andBusinessemailIsNull() {
            addCriterion("businessemail is null");
            return (Criteria) this;
        }

        public Criteria andBusinessemailIsNotNull() {
            addCriterion("businessemail is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessemailEqualTo(String value) {
            addCriterion("businessemail =", value, "businessemail");
            return (Criteria) this;
        }

        public Criteria andBusinessemailNotEqualTo(String value) {
            addCriterion("businessemail <>", value, "businessemail");
            return (Criteria) this;
        }

        public Criteria andBusinessemailGreaterThan(String value) {
            addCriterion("businessemail >", value, "businessemail");
            return (Criteria) this;
        }

        public Criteria andBusinessemailGreaterThanOrEqualTo(String value) {
            addCriterion("businessemail >=", value, "businessemail");
            return (Criteria) this;
        }

        public Criteria andBusinessemailLessThan(String value) {
            addCriterion("businessemail <", value, "businessemail");
            return (Criteria) this;
        }

        public Criteria andBusinessemailLessThanOrEqualTo(String value) {
            addCriterion("businessemail <=", value, "businessemail");
            return (Criteria) this;
        }

        public Criteria andBusinessemailLike(String value) {
            addCriterion("businessemail like", value, "businessemail");
            return (Criteria) this;
        }

        public Criteria andBusinessemailNotLike(String value) {
            addCriterion("businessemail not like", value, "businessemail");
            return (Criteria) this;
        }

        public Criteria andBusinessemailIn(List<String> values) {
            addCriterion("businessemail in", values, "businessemail");
            return (Criteria) this;
        }

        public Criteria andBusinessemailNotIn(List<String> values) {
            addCriterion("businessemail not in", values, "businessemail");
            return (Criteria) this;
        }

        public Criteria andBusinessemailBetween(String value1, String value2) {
            addCriterion("businessemail between", value1, value2, "businessemail");
            return (Criteria) this;
        }

        public Criteria andBusinessemailNotBetween(String value1, String value2) {
            addCriterion("businessemail not between", value1, value2, "businessemail");
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