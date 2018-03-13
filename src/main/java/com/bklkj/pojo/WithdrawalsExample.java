package com.bklkj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WithdrawalsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WithdrawalsExample() {
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

        public Criteria andWithdrawalschannelidIsNull() {
            addCriterion("WithdrawalsChannelId is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelidIsNotNull() {
            addCriterion("WithdrawalsChannelId is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelidEqualTo(Integer value) {
            addCriterion("WithdrawalsChannelId =", value, "withdrawalschannelid");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelidNotEqualTo(Integer value) {
            addCriterion("WithdrawalsChannelId <>", value, "withdrawalschannelid");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelidGreaterThan(Integer value) {
            addCriterion("WithdrawalsChannelId >", value, "withdrawalschannelid");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WithdrawalsChannelId >=", value, "withdrawalschannelid");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelidLessThan(Integer value) {
            addCriterion("WithdrawalsChannelId <", value, "withdrawalschannelid");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelidLessThanOrEqualTo(Integer value) {
            addCriterion("WithdrawalsChannelId <=", value, "withdrawalschannelid");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelidIn(List<Integer> values) {
            addCriterion("WithdrawalsChannelId in", values, "withdrawalschannelid");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelidNotIn(List<Integer> values) {
            addCriterion("WithdrawalsChannelId not in", values, "withdrawalschannelid");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelidBetween(Integer value1, Integer value2) {
            addCriterion("WithdrawalsChannelId between", value1, value2, "withdrawalschannelid");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelidNotBetween(Integer value1, Integer value2) {
            addCriterion("WithdrawalsChannelId not between", value1, value2, "withdrawalschannelid");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsmoneyIsNull() {
            addCriterion("WithdrawalsMoney is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsmoneyIsNotNull() {
            addCriterion("WithdrawalsMoney is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsmoneyEqualTo(Double value) {
            addCriterion("WithdrawalsMoney =", value, "withdrawalsmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsmoneyNotEqualTo(Double value) {
            addCriterion("WithdrawalsMoney <>", value, "withdrawalsmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsmoneyGreaterThan(Double value) {
            addCriterion("WithdrawalsMoney >", value, "withdrawalsmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("WithdrawalsMoney >=", value, "withdrawalsmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsmoneyLessThan(Double value) {
            addCriterion("WithdrawalsMoney <", value, "withdrawalsmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsmoneyLessThanOrEqualTo(Double value) {
            addCriterion("WithdrawalsMoney <=", value, "withdrawalsmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsmoneyIn(List<Double> values) {
            addCriterion("WithdrawalsMoney in", values, "withdrawalsmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsmoneyNotIn(List<Double> values) {
            addCriterion("WithdrawalsMoney not in", values, "withdrawalsmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsmoneyBetween(Double value1, Double value2) {
            addCriterion("WithdrawalsMoney between", value1, value2, "withdrawalsmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsmoneyNotBetween(Double value1, Double value2) {
            addCriterion("WithdrawalsMoney not between", value1, value2, "withdrawalsmoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalstimeIsNull() {
            addCriterion("WithdrawalsTime is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalstimeIsNotNull() {
            addCriterion("WithdrawalsTime is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalstimeEqualTo(Date value) {
            addCriterion("WithdrawalsTime =", value, "withdrawalstime");
            return (Criteria) this;
        }

        public Criteria andWithdrawalstimeNotEqualTo(Date value) {
            addCriterion("WithdrawalsTime <>", value, "withdrawalstime");
            return (Criteria) this;
        }

        public Criteria andWithdrawalstimeGreaterThan(Date value) {
            addCriterion("WithdrawalsTime >", value, "withdrawalstime");
            return (Criteria) this;
        }

        public Criteria andWithdrawalstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WithdrawalsTime >=", value, "withdrawalstime");
            return (Criteria) this;
        }

        public Criteria andWithdrawalstimeLessThan(Date value) {
            addCriterion("WithdrawalsTime <", value, "withdrawalstime");
            return (Criteria) this;
        }

        public Criteria andWithdrawalstimeLessThanOrEqualTo(Date value) {
            addCriterion("WithdrawalsTime <=", value, "withdrawalstime");
            return (Criteria) this;
        }

        public Criteria andWithdrawalstimeIn(List<Date> values) {
            addCriterion("WithdrawalsTime in", values, "withdrawalstime");
            return (Criteria) this;
        }

        public Criteria andWithdrawalstimeNotIn(List<Date> values) {
            addCriterion("WithdrawalsTime not in", values, "withdrawalstime");
            return (Criteria) this;
        }

        public Criteria andWithdrawalstimeBetween(Date value1, Date value2) {
            addCriterion("WithdrawalsTime between", value1, value2, "withdrawalstime");
            return (Criteria) this;
        }

        public Criteria andWithdrawalstimeNotBetween(Date value1, Date value2) {
            addCriterion("WithdrawalsTime not between", value1, value2, "withdrawalstime");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameIsNull() {
            addCriterion("WithdrawalsSchannelName is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameIsNotNull() {
            addCriterion("WithdrawalsSchannelName is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameEqualTo(String value) {
            addCriterion("WithdrawalsSchannelName =", value, "withdrawalsschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameNotEqualTo(String value) {
            addCriterion("WithdrawalsSchannelName <>", value, "withdrawalsschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameGreaterThan(String value) {
            addCriterion("WithdrawalsSchannelName >", value, "withdrawalsschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameGreaterThanOrEqualTo(String value) {
            addCriterion("WithdrawalsSchannelName >=", value, "withdrawalsschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameLessThan(String value) {
            addCriterion("WithdrawalsSchannelName <", value, "withdrawalsschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameLessThanOrEqualTo(String value) {
            addCriterion("WithdrawalsSchannelName <=", value, "withdrawalsschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameLike(String value) {
            addCriterion("WithdrawalsSchannelName like", value, "withdrawalsschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameNotLike(String value) {
            addCriterion("WithdrawalsSchannelName not like", value, "withdrawalsschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameIn(List<String> values) {
            addCriterion("WithdrawalsSchannelName in", values, "withdrawalsschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameNotIn(List<String> values) {
            addCriterion("WithdrawalsSchannelName not in", values, "withdrawalsschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameBetween(String value1, String value2) {
            addCriterion("WithdrawalsSchannelName between", value1, value2, "withdrawalsschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalsschannelnameNotBetween(String value1, String value2) {
            addCriterion("WithdrawalsSchannelName not between", value1, value2, "withdrawalsschannelname");
            return (Criteria) this;
        }

        public Criteria andWaypictureIsNull() {
            addCriterion("WayPicture is null");
            return (Criteria) this;
        }

        public Criteria andWaypictureIsNotNull() {
            addCriterion("WayPicture is not null");
            return (Criteria) this;
        }

        public Criteria andWaypictureEqualTo(String value) {
            addCriterion("WayPicture =", value, "waypicture");
            return (Criteria) this;
        }

        public Criteria andWaypictureNotEqualTo(String value) {
            addCriterion("WayPicture <>", value, "waypicture");
            return (Criteria) this;
        }

        public Criteria andWaypictureGreaterThan(String value) {
            addCriterion("WayPicture >", value, "waypicture");
            return (Criteria) this;
        }

        public Criteria andWaypictureGreaterThanOrEqualTo(String value) {
            addCriterion("WayPicture >=", value, "waypicture");
            return (Criteria) this;
        }

        public Criteria andWaypictureLessThan(String value) {
            addCriterion("WayPicture <", value, "waypicture");
            return (Criteria) this;
        }

        public Criteria andWaypictureLessThanOrEqualTo(String value) {
            addCriterion("WayPicture <=", value, "waypicture");
            return (Criteria) this;
        }

        public Criteria andWaypictureLike(String value) {
            addCriterion("WayPicture like", value, "waypicture");
            return (Criteria) this;
        }

        public Criteria andWaypictureNotLike(String value) {
            addCriterion("WayPicture not like", value, "waypicture");
            return (Criteria) this;
        }

        public Criteria andWaypictureIn(List<String> values) {
            addCriterion("WayPicture in", values, "waypicture");
            return (Criteria) this;
        }

        public Criteria andWaypictureNotIn(List<String> values) {
            addCriterion("WayPicture not in", values, "waypicture");
            return (Criteria) this;
        }

        public Criteria andWaypictureBetween(String value1, String value2) {
            addCriterion("WayPicture between", value1, value2, "waypicture");
            return (Criteria) this;
        }

        public Criteria andWaypictureNotBetween(String value1, String value2) {
            addCriterion("WayPicture not between", value1, value2, "waypicture");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("OrderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("OrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("OrderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("OrderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("OrderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("OrderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("OrderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("OrderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("OrderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("OrderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("OrderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("OrderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("OrderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("OrderNo not between", value1, value2, "orderno");
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