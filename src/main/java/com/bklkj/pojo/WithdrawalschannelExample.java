package com.bklkj.pojo;

import java.util.ArrayList;
import java.util.List;

public class WithdrawalschannelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WithdrawalschannelExample() {
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

        public Criteria andWithdrawalschannelnameIsNull() {
            addCriterion("WithdrawalsChannelName is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameIsNotNull() {
            addCriterion("WithdrawalsChannelName is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameEqualTo(String value) {
            addCriterion("WithdrawalsChannelName =", value, "withdrawalschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameNotEqualTo(String value) {
            addCriterion("WithdrawalsChannelName <>", value, "withdrawalschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameGreaterThan(String value) {
            addCriterion("WithdrawalsChannelName >", value, "withdrawalschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameGreaterThanOrEqualTo(String value) {
            addCriterion("WithdrawalsChannelName >=", value, "withdrawalschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameLessThan(String value) {
            addCriterion("WithdrawalsChannelName <", value, "withdrawalschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameLessThanOrEqualTo(String value) {
            addCriterion("WithdrawalsChannelName <=", value, "withdrawalschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameLike(String value) {
            addCriterion("WithdrawalsChannelName like", value, "withdrawalschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameNotLike(String value) {
            addCriterion("WithdrawalsChannelName not like", value, "withdrawalschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameIn(List<String> values) {
            addCriterion("WithdrawalsChannelName in", values, "withdrawalschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameNotIn(List<String> values) {
            addCriterion("WithdrawalsChannelName not in", values, "withdrawalschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameBetween(String value1, String value2) {
            addCriterion("WithdrawalsChannelName between", value1, value2, "withdrawalschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelnameNotBetween(String value1, String value2) {
            addCriterion("WithdrawalsChannelName not between", value1, value2, "withdrawalschannelname");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureIsNull() {
            addCriterion("WithdrawalsChannelPicture is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureIsNotNull() {
            addCriterion("WithdrawalsChannelPicture is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureEqualTo(String value) {
            addCriterion("WithdrawalsChannelPicture =", value, "withdrawalschannelpicture");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureNotEqualTo(String value) {
            addCriterion("WithdrawalsChannelPicture <>", value, "withdrawalschannelpicture");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureGreaterThan(String value) {
            addCriterion("WithdrawalsChannelPicture >", value, "withdrawalschannelpicture");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureGreaterThanOrEqualTo(String value) {
            addCriterion("WithdrawalsChannelPicture >=", value, "withdrawalschannelpicture");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureLessThan(String value) {
            addCriterion("WithdrawalsChannelPicture <", value, "withdrawalschannelpicture");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureLessThanOrEqualTo(String value) {
            addCriterion("WithdrawalsChannelPicture <=", value, "withdrawalschannelpicture");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureLike(String value) {
            addCriterion("WithdrawalsChannelPicture like", value, "withdrawalschannelpicture");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureNotLike(String value) {
            addCriterion("WithdrawalsChannelPicture not like", value, "withdrawalschannelpicture");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureIn(List<String> values) {
            addCriterion("WithdrawalsChannelPicture in", values, "withdrawalschannelpicture");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureNotIn(List<String> values) {
            addCriterion("WithdrawalsChannelPicture not in", values, "withdrawalschannelpicture");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureBetween(String value1, String value2) {
            addCriterion("WithdrawalsChannelPicture between", value1, value2, "withdrawalschannelpicture");
            return (Criteria) this;
        }

        public Criteria andWithdrawalschannelpictureNotBetween(String value1, String value2) {
            addCriterion("WithdrawalsChannelPicture not between", value1, value2, "withdrawalschannelpicture");
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