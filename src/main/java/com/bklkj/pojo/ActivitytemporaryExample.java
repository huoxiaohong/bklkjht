package com.bklkj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivitytemporaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivitytemporaryExample() {
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

        public Criteria andRownumIsNull() {
            addCriterion("rownum is null");
            return (Criteria) this;
        }

        public Criteria andRownumIsNotNull() {
            addCriterion("rownum is not null");
            return (Criteria) this;
        }

        public Criteria andRownumEqualTo(Integer value) {
            addCriterion("rownum =", value, "rownum");
            return (Criteria) this;
        }

        public Criteria andRownumNotEqualTo(Integer value) {
            addCriterion("rownum <>", value, "rownum");
            return (Criteria) this;
        }

        public Criteria andRownumGreaterThan(Integer value) {
            addCriterion("rownum >", value, "rownum");
            return (Criteria) this;
        }

        public Criteria andRownumGreaterThanOrEqualTo(Integer value) {
            addCriterion("rownum >=", value, "rownum");
            return (Criteria) this;
        }

        public Criteria andRownumLessThan(Integer value) {
            addCriterion("rownum <", value, "rownum");
            return (Criteria) this;
        }

        public Criteria andRownumLessThanOrEqualTo(Integer value) {
            addCriterion("rownum <=", value, "rownum");
            return (Criteria) this;
        }

        public Criteria andRownumIn(List<Integer> values) {
            addCriterion("rownum in", values, "rownum");
            return (Criteria) this;
        }

        public Criteria andRownumNotIn(List<Integer> values) {
            addCriterion("rownum not in", values, "rownum");
            return (Criteria) this;
        }

        public Criteria andRownumBetween(Integer value1, Integer value2) {
            addCriterion("rownum between", value1, value2, "rownum");
            return (Criteria) this;
        }

        public Criteria andRownumNotBetween(Integer value1, Integer value2) {
            addCriterion("rownum not between", value1, value2, "rownum");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNull() {
            addCriterion("businessname is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNotNull() {
            addCriterion("businessname is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameEqualTo(String value) {
            addCriterion("businessname =", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotEqualTo(String value) {
            addCriterion("businessname <>", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThan(String value) {
            addCriterion("businessname >", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThanOrEqualTo(String value) {
            addCriterion("businessname >=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThan(String value) {
            addCriterion("businessname <", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThanOrEqualTo(String value) {
            addCriterion("businessname <=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLike(String value) {
            addCriterion("businessname like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotLike(String value) {
            addCriterion("businessname not like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIn(List<String> values) {
            addCriterion("businessname in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotIn(List<String> values) {
            addCriterion("businessname not in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameBetween(String value1, String value2) {
            addCriterion("businessname between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotBetween(String value1, String value2) {
            addCriterion("businessname not between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyIsNull() {
            addCriterion("businessactivitymoney is null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyIsNotNull() {
            addCriterion("businessactivitymoney is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyEqualTo(Double value) {
            addCriterion("businessactivitymoney =", value, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyNotEqualTo(Double value) {
            addCriterion("businessactivitymoney <>", value, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyGreaterThan(Double value) {
            addCriterion("businessactivitymoney >", value, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("businessactivitymoney >=", value, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyLessThan(Double value) {
            addCriterion("businessactivitymoney <", value, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyLessThanOrEqualTo(Double value) {
            addCriterion("businessactivitymoney <=", value, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyIn(List<Double> values) {
            addCriterion("businessactivitymoney in", values, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyNotIn(List<Double> values) {
            addCriterion("businessactivitymoney not in", values, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyBetween(Double value1, Double value2) {
            addCriterion("businessactivitymoney between", value1, value2, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyNotBetween(Double value1, Double value2) {
            addCriterion("businessactivitymoney not between", value1, value2, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIsNull() {
            addCriterion("activitytype is null");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIsNotNull() {
            addCriterion("activitytype is not null");
            return (Criteria) this;
        }

        public Criteria andActivitytypeEqualTo(Integer value) {
            addCriterion("activitytype =", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotEqualTo(Integer value) {
            addCriterion("activitytype <>", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeGreaterThan(Integer value) {
            addCriterion("activitytype >", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("activitytype >=", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLessThan(Integer value) {
            addCriterion("activitytype <", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLessThanOrEqualTo(Integer value) {
            addCriterion("activitytype <=", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIn(List<Integer> values) {
            addCriterion("activitytype in", values, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotIn(List<Integer> values) {
            addCriterion("activitytype not in", values, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeBetween(Integer value1, Integer value2) {
            addCriterion("activitytype between", value1, value2, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("activitytype not between", value1, value2, "activitytype");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNull() {
            addCriterion("businessid is null");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNotNull() {
            addCriterion("businessid is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessidEqualTo(Integer value) {
            addCriterion("businessid =", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotEqualTo(Integer value) {
            addCriterion("businessid <>", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThan(Integer value) {
            addCriterion("businessid >", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("businessid >=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThan(Integer value) {
            addCriterion("businessid <", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThanOrEqualTo(Integer value) {
            addCriterion("businessid <=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidIn(List<Integer> values) {
            addCriterion("businessid in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotIn(List<Integer> values) {
            addCriterion("businessid not in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidBetween(Integer value1, Integer value2) {
            addCriterion("businessid between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotBetween(Integer value1, Integer value2) {
            addCriterion("businessid not between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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