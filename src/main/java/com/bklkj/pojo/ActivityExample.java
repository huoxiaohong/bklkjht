package com.bklkj.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andBusinessactivityIsNull() {
            addCriterion("BusinessActivity is null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityIsNotNull() {
            addCriterion("BusinessActivity is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityEqualTo(String value) {
            addCriterion("BusinessActivity =", value, "businessactivity");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityNotEqualTo(String value) {
            addCriterion("BusinessActivity <>", value, "businessactivity");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityGreaterThan(String value) {
            addCriterion("BusinessActivity >", value, "businessactivity");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessActivity >=", value, "businessactivity");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityLessThan(String value) {
            addCriterion("BusinessActivity <", value, "businessactivity");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityLessThanOrEqualTo(String value) {
            addCriterion("BusinessActivity <=", value, "businessactivity");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityLike(String value) {
            addCriterion("BusinessActivity like", value, "businessactivity");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityNotLike(String value) {
            addCriterion("BusinessActivity not like", value, "businessactivity");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityIn(List<String> values) {
            addCriterion("BusinessActivity in", values, "businessactivity");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityNotIn(List<String> values) {
            addCriterion("BusinessActivity not in", values, "businessactivity");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityBetween(String value1, String value2) {
            addCriterion("BusinessActivity between", value1, value2, "businessactivity");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityNotBetween(String value1, String value2) {
            addCriterion("BusinessActivity not between", value1, value2, "businessactivity");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameIsNull() {
            addCriterion("BusinessActivityName is null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameIsNotNull() {
            addCriterion("BusinessActivityName is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameEqualTo(String value) {
            addCriterion("BusinessActivityName =", value, "businessactivityname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameNotEqualTo(String value) {
            addCriterion("BusinessActivityName <>", value, "businessactivityname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameGreaterThan(String value) {
            addCriterion("BusinessActivityName >", value, "businessactivityname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessActivityName >=", value, "businessactivityname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameLessThan(String value) {
            addCriterion("BusinessActivityName <", value, "businessactivityname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameLessThanOrEqualTo(String value) {
            addCriterion("BusinessActivityName <=", value, "businessactivityname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameLike(String value) {
            addCriterion("BusinessActivityName like", value, "businessactivityname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameNotLike(String value) {
            addCriterion("BusinessActivityName not like", value, "businessactivityname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameIn(List<String> values) {
            addCriterion("BusinessActivityName in", values, "businessactivityname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameNotIn(List<String> values) {
            addCriterion("BusinessActivityName not in", values, "businessactivityname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameBetween(String value1, String value2) {
            addCriterion("BusinessActivityName between", value1, value2, "businessactivityname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynameNotBetween(String value1, String value2) {
            addCriterion("BusinessActivityName not between", value1, value2, "businessactivityname");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeIsNull() {
            addCriterion("BusinessActivityBeginTime is null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeIsNotNull() {
            addCriterion("BusinessActivityBeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeEqualTo(String value) {
            addCriterion("BusinessActivityBeginTime =", value, "businessactivitybegintime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeNotEqualTo(String value) {
            addCriterion("BusinessActivityBeginTime <>", value, "businessactivitybegintime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeGreaterThan(String value) {
            addCriterion("BusinessActivityBeginTime >", value, "businessactivitybegintime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessActivityBeginTime >=", value, "businessactivitybegintime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeLessThan(String value) {
            addCriterion("BusinessActivityBeginTime <", value, "businessactivitybegintime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeLessThanOrEqualTo(String value) {
            addCriterion("BusinessActivityBeginTime <=", value, "businessactivitybegintime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeLike(String value) {
            addCriterion("BusinessActivityBeginTime like", value, "businessactivitybegintime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeNotLike(String value) {
            addCriterion("BusinessActivityBeginTime not like", value, "businessactivitybegintime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeIn(List<String> values) {
            addCriterion("BusinessActivityBeginTime in", values, "businessactivitybegintime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeNotIn(List<String> values) {
            addCriterion("BusinessActivityBeginTime not in", values, "businessactivitybegintime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeBetween(String value1, String value2) {
            addCriterion("BusinessActivityBeginTime between", value1, value2, "businessactivitybegintime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitybegintimeNotBetween(String value1, String value2) {
            addCriterion("BusinessActivityBeginTime not between", value1, value2, "businessactivitybegintime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeIsNull() {
            addCriterion("BusinessActivityStopTime is null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeIsNotNull() {
            addCriterion("BusinessActivityStopTime is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeEqualTo(String value) {
            addCriterion("BusinessActivityStopTime =", value, "businessactivitystoptime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeNotEqualTo(String value) {
            addCriterion("BusinessActivityStopTime <>", value, "businessactivitystoptime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeGreaterThan(String value) {
            addCriterion("BusinessActivityStopTime >", value, "businessactivitystoptime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessActivityStopTime >=", value, "businessactivitystoptime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeLessThan(String value) {
            addCriterion("BusinessActivityStopTime <", value, "businessactivitystoptime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeLessThanOrEqualTo(String value) {
            addCriterion("BusinessActivityStopTime <=", value, "businessactivitystoptime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeLike(String value) {
            addCriterion("BusinessActivityStopTime like", value, "businessactivitystoptime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeNotLike(String value) {
            addCriterion("BusinessActivityStopTime not like", value, "businessactivitystoptime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeIn(List<String> values) {
            addCriterion("BusinessActivityStopTime in", values, "businessactivitystoptime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeNotIn(List<String> values) {
            addCriterion("BusinessActivityStopTime not in", values, "businessactivitystoptime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeBetween(String value1, String value2) {
            addCriterion("BusinessActivityStopTime between", value1, value2, "businessactivitystoptime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitystoptimeNotBetween(String value1, String value2) {
            addCriterion("BusinessActivityStopTime not between", value1, value2, "businessactivitystoptime");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynumIsNull() {
            addCriterion("BusinessActivityNum is null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynumIsNotNull() {
            addCriterion("BusinessActivityNum is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynumEqualTo(Integer value) {
            addCriterion("BusinessActivityNum =", value, "businessactivitynum");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynumNotEqualTo(Integer value) {
            addCriterion("BusinessActivityNum <>", value, "businessactivitynum");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynumGreaterThan(Integer value) {
            addCriterion("BusinessActivityNum >", value, "businessactivitynum");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("BusinessActivityNum >=", value, "businessactivitynum");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynumLessThan(Integer value) {
            addCriterion("BusinessActivityNum <", value, "businessactivitynum");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynumLessThanOrEqualTo(Integer value) {
            addCriterion("BusinessActivityNum <=", value, "businessactivitynum");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynumIn(List<Integer> values) {
            addCriterion("BusinessActivityNum in", values, "businessactivitynum");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynumNotIn(List<Integer> values) {
            addCriterion("BusinessActivityNum not in", values, "businessactivitynum");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynumBetween(Integer value1, Integer value2) {
            addCriterion("BusinessActivityNum between", value1, value2, "businessactivitynum");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitynumNotBetween(Integer value1, Integer value2) {
            addCriterion("BusinessActivityNum not between", value1, value2, "businessactivitynum");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyIsNull() {
            addCriterion("BusinessActivityMoney is null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyIsNotNull() {
            addCriterion("BusinessActivityMoney is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyEqualTo(Double value) {
            addCriterion("BusinessActivityMoney =", value, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyNotEqualTo(Double value) {
            addCriterion("BusinessActivityMoney <>", value, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyGreaterThan(Double value) {
            addCriterion("BusinessActivityMoney >", value, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("BusinessActivityMoney >=", value, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyLessThan(Double value) {
            addCriterion("BusinessActivityMoney <", value, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyLessThanOrEqualTo(Double value) {
            addCriterion("BusinessActivityMoney <=", value, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyIn(List<Double> values) {
            addCriterion("BusinessActivityMoney in", values, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyNotIn(List<Double> values) {
            addCriterion("BusinessActivityMoney not in", values, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyBetween(Double value1, Double value2) {
            addCriterion("BusinessActivityMoney between", value1, value2, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivitymoneyNotBetween(Double value1, Double value2) {
            addCriterion("BusinessActivityMoney not between", value1, value2, "businessactivitymoney");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityintegralIsNull() {
            addCriterion("BusinessActivityIntegral is null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityintegralIsNotNull() {
            addCriterion("BusinessActivityIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityintegralEqualTo(Integer value) {
            addCriterion("BusinessActivityIntegral =", value, "businessactivityintegral");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityintegralNotEqualTo(Integer value) {
            addCriterion("BusinessActivityIntegral <>", value, "businessactivityintegral");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityintegralGreaterThan(Integer value) {
            addCriterion("BusinessActivityIntegral >", value, "businessactivityintegral");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("BusinessActivityIntegral >=", value, "businessactivityintegral");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityintegralLessThan(Integer value) {
            addCriterion("BusinessActivityIntegral <", value, "businessactivityintegral");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityintegralLessThanOrEqualTo(Integer value) {
            addCriterion("BusinessActivityIntegral <=", value, "businessactivityintegral");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityintegralIn(List<Integer> values) {
            addCriterion("BusinessActivityIntegral in", values, "businessactivityintegral");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityintegralNotIn(List<Integer> values) {
            addCriterion("BusinessActivityIntegral not in", values, "businessactivityintegral");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityintegralBetween(Integer value1, Integer value2) {
            addCriterion("BusinessActivityIntegral between", value1, value2, "businessactivityintegral");
            return (Criteria) this;
        }

        public Criteria andBusinessactivityintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("BusinessActivityIntegral not between", value1, value2, "businessactivityintegral");
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

        public Criteria andJoinnumIsNull() {
            addCriterion("joinnum is null");
            return (Criteria) this;
        }

        public Criteria andJoinnumIsNotNull() {
            addCriterion("joinnum is not null");
            return (Criteria) this;
        }

        public Criteria andJoinnumEqualTo(Integer value) {
            addCriterion("joinnum =", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumNotEqualTo(Integer value) {
            addCriterion("joinnum <>", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumGreaterThan(Integer value) {
            addCriterion("joinnum >", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinnum >=", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumLessThan(Integer value) {
            addCriterion("joinnum <", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumLessThanOrEqualTo(Integer value) {
            addCriterion("joinnum <=", value, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumIn(List<Integer> values) {
            addCriterion("joinnum in", values, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumNotIn(List<Integer> values) {
            addCriterion("joinnum not in", values, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumBetween(Integer value1, Integer value2) {
            addCriterion("joinnum between", value1, value2, "joinnum");
            return (Criteria) this;
        }

        public Criteria andJoinnumNotBetween(Integer value1, Integer value2) {
            addCriterion("joinnum not between", value1, value2, "joinnum");
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