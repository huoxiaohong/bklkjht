package com.bklkj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntegralrechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegralrechargeExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("OrderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("OrderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("OrderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("OrderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("OrderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("OrderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("OrderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderId not between", value1, value2, "orderid");
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

        public Criteria andRechargeamountIsNull() {
            addCriterion("RechargeAmount is null");
            return (Criteria) this;
        }

        public Criteria andRechargeamountIsNotNull() {
            addCriterion("RechargeAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeamountEqualTo(Double value) {
            addCriterion("RechargeAmount =", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountNotEqualTo(Double value) {
            addCriterion("RechargeAmount <>", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountGreaterThan(Double value) {
            addCriterion("RechargeAmount >", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountGreaterThanOrEqualTo(Double value) {
            addCriterion("RechargeAmount >=", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountLessThan(Double value) {
            addCriterion("RechargeAmount <", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountLessThanOrEqualTo(Double value) {
            addCriterion("RechargeAmount <=", value, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountIn(List<Double> values) {
            addCriterion("RechargeAmount in", values, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountNotIn(List<Double> values) {
            addCriterion("RechargeAmount not in", values, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountBetween(Double value1, Double value2) {
            addCriterion("RechargeAmount between", value1, value2, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargeamountNotBetween(Double value1, Double value2) {
            addCriterion("RechargeAmount not between", value1, value2, "rechargeamount");
            return (Criteria) this;
        }

        public Criteria andRechargetimeIsNull() {
            addCriterion("RechargeTime is null");
            return (Criteria) this;
        }

        public Criteria andRechargetimeIsNotNull() {
            addCriterion("RechargeTime is not null");
            return (Criteria) this;
        }

        public Criteria andRechargetimeEqualTo(Date value) {
            addCriterion("RechargeTime =", value, "rechargetime");
            return (Criteria) this;
        }

        public Criteria andRechargetimeNotEqualTo(Date value) {
            addCriterion("RechargeTime <>", value, "rechargetime");
            return (Criteria) this;
        }

        public Criteria andRechargetimeGreaterThan(Date value) {
            addCriterion("RechargeTime >", value, "rechargetime");
            return (Criteria) this;
        }

        public Criteria andRechargetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RechargeTime >=", value, "rechargetime");
            return (Criteria) this;
        }

        public Criteria andRechargetimeLessThan(Date value) {
            addCriterion("RechargeTime <", value, "rechargetime");
            return (Criteria) this;
        }

        public Criteria andRechargetimeLessThanOrEqualTo(Date value) {
            addCriterion("RechargeTime <=", value, "rechargetime");
            return (Criteria) this;
        }

        public Criteria andRechargetimeIn(List<Date> values) {
            addCriterion("RechargeTime in", values, "rechargetime");
            return (Criteria) this;
        }

        public Criteria andRechargetimeNotIn(List<Date> values) {
            addCriterion("RechargeTime not in", values, "rechargetime");
            return (Criteria) this;
        }

        public Criteria andRechargetimeBetween(Date value1, Date value2) {
            addCriterion("RechargeTime between", value1, value2, "rechargetime");
            return (Criteria) this;
        }

        public Criteria andRechargetimeNotBetween(Date value1, Date value2) {
            addCriterion("RechargeTime not between", value1, value2, "rechargetime");
            return (Criteria) this;
        }

        public Criteria andRechargechannelidIsNull() {
            addCriterion("RechargeChannelId is null");
            return (Criteria) this;
        }

        public Criteria andRechargechannelidIsNotNull() {
            addCriterion("RechargeChannelId is not null");
            return (Criteria) this;
        }

        public Criteria andRechargechannelidEqualTo(Integer value) {
            addCriterion("RechargeChannelId =", value, "rechargechannelid");
            return (Criteria) this;
        }

        public Criteria andRechargechannelidNotEqualTo(Integer value) {
            addCriterion("RechargeChannelId <>", value, "rechargechannelid");
            return (Criteria) this;
        }

        public Criteria andRechargechannelidGreaterThan(Integer value) {
            addCriterion("RechargeChannelId >", value, "rechargechannelid");
            return (Criteria) this;
        }

        public Criteria andRechargechannelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RechargeChannelId >=", value, "rechargechannelid");
            return (Criteria) this;
        }

        public Criteria andRechargechannelidLessThan(Integer value) {
            addCriterion("RechargeChannelId <", value, "rechargechannelid");
            return (Criteria) this;
        }

        public Criteria andRechargechannelidLessThanOrEqualTo(Integer value) {
            addCriterion("RechargeChannelId <=", value, "rechargechannelid");
            return (Criteria) this;
        }

        public Criteria andRechargechannelidIn(List<Integer> values) {
            addCriterion("RechargeChannelId in", values, "rechargechannelid");
            return (Criteria) this;
        }

        public Criteria andRechargechannelidNotIn(List<Integer> values) {
            addCriterion("RechargeChannelId not in", values, "rechargechannelid");
            return (Criteria) this;
        }

        public Criteria andRechargechannelidBetween(Integer value1, Integer value2) {
            addCriterion("RechargeChannelId between", value1, value2, "rechargechannelid");
            return (Criteria) this;
        }

        public Criteria andRechargechannelidNotBetween(Integer value1, Integer value2) {
            addCriterion("RechargeChannelId not between", value1, value2, "rechargechannelid");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("Integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("Integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("Integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("Integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("Integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("Integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("Integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("Integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("Integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("Integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("Integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("Integral not between", value1, value2, "integral");
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