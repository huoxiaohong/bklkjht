package com.bklkj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CashExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CashExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActivitycashidIsNull() {
            addCriterion("ActivityCashId is null");
            return (Criteria) this;
        }

        public Criteria andActivitycashidIsNotNull() {
            addCriterion("ActivityCashId is not null");
            return (Criteria) this;
        }

        public Criteria andActivitycashidEqualTo(Integer value) {
            addCriterion("ActivityCashId =", value, "activitycashid");
            return (Criteria) this;
        }

        public Criteria andActivitycashidNotEqualTo(Integer value) {
            addCriterion("ActivityCashId <>", value, "activitycashid");
            return (Criteria) this;
        }

        public Criteria andActivitycashidGreaterThan(Integer value) {
            addCriterion("ActivityCashId >", value, "activitycashid");
            return (Criteria) this;
        }

        public Criteria andActivitycashidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActivityCashId >=", value, "activitycashid");
            return (Criteria) this;
        }

        public Criteria andActivitycashidLessThan(Integer value) {
            addCriterion("ActivityCashId <", value, "activitycashid");
            return (Criteria) this;
        }

        public Criteria andActivitycashidLessThanOrEqualTo(Integer value) {
            addCriterion("ActivityCashId <=", value, "activitycashid");
            return (Criteria) this;
        }

        public Criteria andActivitycashidIn(List<Integer> values) {
            addCriterion("ActivityCashId in", values, "activitycashid");
            return (Criteria) this;
        }

        public Criteria andActivitycashidNotIn(List<Integer> values) {
            addCriterion("ActivityCashId not in", values, "activitycashid");
            return (Criteria) this;
        }

        public Criteria andActivitycashidBetween(Integer value1, Integer value2) {
            addCriterion("ActivityCashId between", value1, value2, "activitycashid");
            return (Criteria) this;
        }

        public Criteria andActivitycashidNotBetween(Integer value1, Integer value2) {
            addCriterion("ActivityCashId not between", value1, value2, "activitycashid");
            return (Criteria) this;
        }

        public Criteria andActivitycashmoneyIsNull() {
            addCriterion("ActivityCashMoney is null");
            return (Criteria) this;
        }

        public Criteria andActivitycashmoneyIsNotNull() {
            addCriterion("ActivityCashMoney is not null");
            return (Criteria) this;
        }

        public Criteria andActivitycashmoneyEqualTo(Double value) {
            addCriterion("ActivityCashMoney =", value, "activitycashmoney");
            return (Criteria) this;
        }

        public Criteria andActivitycashmoneyNotEqualTo(Double value) {
            addCriterion("ActivityCashMoney <>", value, "activitycashmoney");
            return (Criteria) this;
        }

        public Criteria andActivitycashmoneyGreaterThan(Double value) {
            addCriterion("ActivityCashMoney >", value, "activitycashmoney");
            return (Criteria) this;
        }

        public Criteria andActivitycashmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ActivityCashMoney >=", value, "activitycashmoney");
            return (Criteria) this;
        }

        public Criteria andActivitycashmoneyLessThan(Double value) {
            addCriterion("ActivityCashMoney <", value, "activitycashmoney");
            return (Criteria) this;
        }

        public Criteria andActivitycashmoneyLessThanOrEqualTo(Double value) {
            addCriterion("ActivityCashMoney <=", value, "activitycashmoney");
            return (Criteria) this;
        }

        public Criteria andActivitycashmoneyIn(List<Double> values) {
            addCriterion("ActivityCashMoney in", values, "activitycashmoney");
            return (Criteria) this;
        }

        public Criteria andActivitycashmoneyNotIn(List<Double> values) {
            addCriterion("ActivityCashMoney not in", values, "activitycashmoney");
            return (Criteria) this;
        }

        public Criteria andActivitycashmoneyBetween(Double value1, Double value2) {
            addCriterion("ActivityCashMoney between", value1, value2, "activitycashmoney");
            return (Criteria) this;
        }

        public Criteria andActivitycashmoneyNotBetween(Double value1, Double value2) {
            addCriterion("ActivityCashMoney not between", value1, value2, "activitycashmoney");
            return (Criteria) this;
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

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCashtimeIsNull() {
            addCriterion("CashTime is null");
            return (Criteria) this;
        }

        public Criteria andCashtimeIsNotNull() {
            addCriterion("CashTime is not null");
            return (Criteria) this;
        }

        public Criteria andCashtimeEqualTo(Date value) {
            addCriterion("CashTime =", value, "cashtime");
            return (Criteria) this;
        }

        public Criteria andCashtimeNotEqualTo(Date value) {
            addCriterion("CashTime <>", value, "cashtime");
            return (Criteria) this;
        }

        public Criteria andCashtimeGreaterThan(Date value) {
            addCriterion("CashTime >", value, "cashtime");
            return (Criteria) this;
        }

        public Criteria andCashtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CashTime >=", value, "cashtime");
            return (Criteria) this;
        }

        public Criteria andCashtimeLessThan(Date value) {
            addCriterion("CashTime <", value, "cashtime");
            return (Criteria) this;
        }

        public Criteria andCashtimeLessThanOrEqualTo(Date value) {
            addCriterion("CashTime <=", value, "cashtime");
            return (Criteria) this;
        }

        public Criteria andCashtimeIn(List<Date> values) {
            addCriterion("CashTime in", values, "cashtime");
            return (Criteria) this;
        }

        public Criteria andCashtimeNotIn(List<Date> values) {
            addCriterion("CashTime not in", values, "cashtime");
            return (Criteria) this;
        }

        public Criteria andCashtimeBetween(Date value1, Date value2) {
            addCriterion("CashTime between", value1, value2, "cashtime");
            return (Criteria) this;
        }

        public Criteria andCashtimeNotBetween(Date value1, Date value2) {
            addCriterion("CashTime not between", value1, value2, "cashtime");
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