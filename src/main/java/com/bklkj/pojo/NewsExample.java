package com.bklkj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsidIsNull() {
            addCriterion("NewsId is null");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNotNull() {
            addCriterion("NewsId is not null");
            return (Criteria) this;
        }

        public Criteria andNewsidEqualTo(Integer value) {
            addCriterion("NewsId =", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotEqualTo(Integer value) {
            addCriterion("NewsId <>", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThan(Integer value) {
            addCriterion("NewsId >", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewsId >=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThan(Integer value) {
            addCriterion("NewsId <", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThanOrEqualTo(Integer value) {
            addCriterion("NewsId <=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidIn(List<Integer> values) {
            addCriterion("NewsId in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotIn(List<Integer> values) {
            addCriterion("NewsId not in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidBetween(Integer value1, Integer value2) {
            addCriterion("NewsId between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotBetween(Integer value1, Integer value2) {
            addCriterion("NewsId not between", value1, value2, "newsid");
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

        public Criteria andUsernewsIsNull() {
            addCriterion("UserNews is null");
            return (Criteria) this;
        }

        public Criteria andUsernewsIsNotNull() {
            addCriterion("UserNews is not null");
            return (Criteria) this;
        }

        public Criteria andUsernewsEqualTo(String value) {
            addCriterion("UserNews =", value, "usernews");
            return (Criteria) this;
        }

        public Criteria andUsernewsNotEqualTo(String value) {
            addCriterion("UserNews <>", value, "usernews");
            return (Criteria) this;
        }

        public Criteria andUsernewsGreaterThan(String value) {
            addCriterion("UserNews >", value, "usernews");
            return (Criteria) this;
        }

        public Criteria andUsernewsGreaterThanOrEqualTo(String value) {
            addCriterion("UserNews >=", value, "usernews");
            return (Criteria) this;
        }

        public Criteria andUsernewsLessThan(String value) {
            addCriterion("UserNews <", value, "usernews");
            return (Criteria) this;
        }

        public Criteria andUsernewsLessThanOrEqualTo(String value) {
            addCriterion("UserNews <=", value, "usernews");
            return (Criteria) this;
        }

        public Criteria andUsernewsLike(String value) {
            addCriterion("UserNews like", value, "usernews");
            return (Criteria) this;
        }

        public Criteria andUsernewsNotLike(String value) {
            addCriterion("UserNews not like", value, "usernews");
            return (Criteria) this;
        }

        public Criteria andUsernewsIn(List<String> values) {
            addCriterion("UserNews in", values, "usernews");
            return (Criteria) this;
        }

        public Criteria andUsernewsNotIn(List<String> values) {
            addCriterion("UserNews not in", values, "usernews");
            return (Criteria) this;
        }

        public Criteria andUsernewsBetween(String value1, String value2) {
            addCriterion("UserNews between", value1, value2, "usernews");
            return (Criteria) this;
        }

        public Criteria andUsernewsNotBetween(String value1, String value2) {
            addCriterion("UserNews not between", value1, value2, "usernews");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationIsNull() {
            addCriterion("NewsClassification is null");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationIsNotNull() {
            addCriterion("NewsClassification is not null");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationEqualTo(String value) {
            addCriterion("NewsClassification =", value, "newsclassification");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationNotEqualTo(String value) {
            addCriterion("NewsClassification <>", value, "newsclassification");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationGreaterThan(String value) {
            addCriterion("NewsClassification >", value, "newsclassification");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationGreaterThanOrEqualTo(String value) {
            addCriterion("NewsClassification >=", value, "newsclassification");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationLessThan(String value) {
            addCriterion("NewsClassification <", value, "newsclassification");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationLessThanOrEqualTo(String value) {
            addCriterion("NewsClassification <=", value, "newsclassification");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationLike(String value) {
            addCriterion("NewsClassification like", value, "newsclassification");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationNotLike(String value) {
            addCriterion("NewsClassification not like", value, "newsclassification");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationIn(List<String> values) {
            addCriterion("NewsClassification in", values, "newsclassification");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationNotIn(List<String> values) {
            addCriterion("NewsClassification not in", values, "newsclassification");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationBetween(String value1, String value2) {
            addCriterion("NewsClassification between", value1, value2, "newsclassification");
            return (Criteria) this;
        }

        public Criteria andNewsclassificationNotBetween(String value1, String value2) {
            addCriterion("NewsClassification not between", value1, value2, "newsclassification");
            return (Criteria) this;
        }

        public Criteria andNewstimeIsNull() {
            addCriterion("NewsTime is null");
            return (Criteria) this;
        }

        public Criteria andNewstimeIsNotNull() {
            addCriterion("NewsTime is not null");
            return (Criteria) this;
        }

        public Criteria andNewstimeEqualTo(Date value) {
            addCriterion("NewsTime =", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotEqualTo(Date value) {
            addCriterion("NewsTime <>", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeGreaterThan(Date value) {
            addCriterion("NewsTime >", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NewsTime >=", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLessThan(Date value) {
            addCriterion("NewsTime <", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLessThanOrEqualTo(Date value) {
            addCriterion("NewsTime <=", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeIn(List<Date> values) {
            addCriterion("NewsTime in", values, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotIn(List<Date> values) {
            addCriterion("NewsTime not in", values, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeBetween(Date value1, Date value2) {
            addCriterion("NewsTime between", value1, value2, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotBetween(Date value1, Date value2) {
            addCriterion("NewsTime not between", value1, value2, "newstime");
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