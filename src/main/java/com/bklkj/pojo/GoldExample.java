package com.bklkj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoldExample() {
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

        public Criteria andGoldidIsNull() {
            addCriterion("GoldId is null");
            return (Criteria) this;
        }

        public Criteria andGoldidIsNotNull() {
            addCriterion("GoldId is not null");
            return (Criteria) this;
        }

        public Criteria andGoldidEqualTo(Integer value) {
            addCriterion("GoldId =", value, "goldid");
            return (Criteria) this;
        }

        public Criteria andGoldidNotEqualTo(Integer value) {
            addCriterion("GoldId <>", value, "goldid");
            return (Criteria) this;
        }

        public Criteria andGoldidGreaterThan(Integer value) {
            addCriterion("GoldId >", value, "goldid");
            return (Criteria) this;
        }

        public Criteria andGoldidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoldId >=", value, "goldid");
            return (Criteria) this;
        }

        public Criteria andGoldidLessThan(Integer value) {
            addCriterion("GoldId <", value, "goldid");
            return (Criteria) this;
        }

        public Criteria andGoldidLessThanOrEqualTo(Integer value) {
            addCriterion("GoldId <=", value, "goldid");
            return (Criteria) this;
        }

        public Criteria andGoldidIn(List<Integer> values) {
            addCriterion("GoldId in", values, "goldid");
            return (Criteria) this;
        }

        public Criteria andGoldidNotIn(List<Integer> values) {
            addCriterion("GoldId not in", values, "goldid");
            return (Criteria) this;
        }

        public Criteria andGoldidBetween(Integer value1, Integer value2) {
            addCriterion("GoldId between", value1, value2, "goldid");
            return (Criteria) this;
        }

        public Criteria andGoldidNotBetween(Integer value1, Integer value2) {
            addCriterion("GoldId not between", value1, value2, "goldid");
            return (Criteria) this;
        }

        public Criteria andGoldnumIsNull() {
            addCriterion("GoldNum is null");
            return (Criteria) this;
        }

        public Criteria andGoldnumIsNotNull() {
            addCriterion("GoldNum is not null");
            return (Criteria) this;
        }

        public Criteria andGoldnumEqualTo(Integer value) {
            addCriterion("GoldNum =", value, "goldnum");
            return (Criteria) this;
        }

        public Criteria andGoldnumNotEqualTo(Integer value) {
            addCriterion("GoldNum <>", value, "goldnum");
            return (Criteria) this;
        }

        public Criteria andGoldnumGreaterThan(Integer value) {
            addCriterion("GoldNum >", value, "goldnum");
            return (Criteria) this;
        }

        public Criteria andGoldnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoldNum >=", value, "goldnum");
            return (Criteria) this;
        }

        public Criteria andGoldnumLessThan(Integer value) {
            addCriterion("GoldNum <", value, "goldnum");
            return (Criteria) this;
        }

        public Criteria andGoldnumLessThanOrEqualTo(Integer value) {
            addCriterion("GoldNum <=", value, "goldnum");
            return (Criteria) this;
        }

        public Criteria andGoldnumIn(List<Integer> values) {
            addCriterion("GoldNum in", values, "goldnum");
            return (Criteria) this;
        }

        public Criteria andGoldnumNotIn(List<Integer> values) {
            addCriterion("GoldNum not in", values, "goldnum");
            return (Criteria) this;
        }

        public Criteria andGoldnumBetween(Integer value1, Integer value2) {
            addCriterion("GoldNum between", value1, value2, "goldnum");
            return (Criteria) this;
        }

        public Criteria andGoldnumNotBetween(Integer value1, Integer value2) {
            addCriterion("GoldNum not between", value1, value2, "goldnum");
            return (Criteria) this;
        }

        public Criteria andGoletimeIsNull() {
            addCriterion("GoleTime is null");
            return (Criteria) this;
        }

        public Criteria andGoletimeIsNotNull() {
            addCriterion("GoleTime is not null");
            return (Criteria) this;
        }

        public Criteria andGoletimeEqualTo(Date value) {
            addCriterion("GoleTime =", value, "goletime");
            return (Criteria) this;
        }

        public Criteria andGoletimeNotEqualTo(Date value) {
            addCriterion("GoleTime <>", value, "goletime");
            return (Criteria) this;
        }

        public Criteria andGoletimeGreaterThan(Date value) {
            addCriterion("GoleTime >", value, "goletime");
            return (Criteria) this;
        }

        public Criteria andGoletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GoleTime >=", value, "goletime");
            return (Criteria) this;
        }

        public Criteria andGoletimeLessThan(Date value) {
            addCriterion("GoleTime <", value, "goletime");
            return (Criteria) this;
        }

        public Criteria andGoletimeLessThanOrEqualTo(Date value) {
            addCriterion("GoleTime <=", value, "goletime");
            return (Criteria) this;
        }

        public Criteria andGoletimeIn(List<Date> values) {
            addCriterion("GoleTime in", values, "goletime");
            return (Criteria) this;
        }

        public Criteria andGoletimeNotIn(List<Date> values) {
            addCriterion("GoleTime not in", values, "goletime");
            return (Criteria) this;
        }

        public Criteria andGoletimeBetween(Date value1, Date value2) {
            addCriterion("GoleTime between", value1, value2, "goletime");
            return (Criteria) this;
        }

        public Criteria andGoletimeNotBetween(Date value1, Date value2) {
            addCriterion("GoleTime not between", value1, value2, "goletime");
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