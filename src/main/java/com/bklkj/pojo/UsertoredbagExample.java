package com.bklkj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsertoredbagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsertoredbagExample() {
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

        public Criteria andMoneyIsNull() {
            addCriterion("Money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("Money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("Money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("Money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("Money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("Money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("Money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("Money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("Money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("Money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("Money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIsNull() {
            addCriterion("MaxMoney is null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIsNotNull() {
            addCriterion("MaxMoney is not null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyEqualTo(Double value) {
            addCriterion("MaxMoney =", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotEqualTo(Double value) {
            addCriterion("MaxMoney <>", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyGreaterThan(Double value) {
            addCriterion("MaxMoney >", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("MaxMoney >=", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLessThan(Double value) {
            addCriterion("MaxMoney <", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLessThanOrEqualTo(Double value) {
            addCriterion("MaxMoney <=", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIn(List<Double> values) {
            addCriterion("MaxMoney in", values, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotIn(List<Double> values) {
            addCriterion("MaxMoney not in", values, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyBetween(Double value1, Double value2) {
            addCriterion("MaxMoney between", value1, value2, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotBetween(Double value1, Double value2) {
            addCriterion("MaxMoney not between", value1, value2, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMoneytimeIsNull() {
            addCriterion("MoneyTime is null");
            return (Criteria) this;
        }

        public Criteria andMoneytimeIsNotNull() {
            addCriterion("MoneyTime is not null");
            return (Criteria) this;
        }

        public Criteria andMoneytimeEqualTo(Date value) {
            addCriterion("MoneyTime =", value, "moneytime");
            return (Criteria) this;
        }

        public Criteria andMoneytimeNotEqualTo(Date value) {
            addCriterion("MoneyTime <>", value, "moneytime");
            return (Criteria) this;
        }

        public Criteria andMoneytimeGreaterThan(Date value) {
            addCriterion("MoneyTime >", value, "moneytime");
            return (Criteria) this;
        }

        public Criteria andMoneytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MoneyTime >=", value, "moneytime");
            return (Criteria) this;
        }

        public Criteria andMoneytimeLessThan(Date value) {
            addCriterion("MoneyTime <", value, "moneytime");
            return (Criteria) this;
        }

        public Criteria andMoneytimeLessThanOrEqualTo(Date value) {
            addCriterion("MoneyTime <=", value, "moneytime");
            return (Criteria) this;
        }

        public Criteria andMoneytimeIn(List<Date> values) {
            addCriterion("MoneyTime in", values, "moneytime");
            return (Criteria) this;
        }

        public Criteria andMoneytimeNotIn(List<Date> values) {
            addCriterion("MoneyTime not in", values, "moneytime");
            return (Criteria) this;
        }

        public Criteria andMoneytimeBetween(Date value1, Date value2) {
            addCriterion("MoneyTime between", value1, value2, "moneytime");
            return (Criteria) this;
        }

        public Criteria andMoneytimeNotBetween(Date value1, Date value2) {
            addCriterion("MoneyTime not between", value1, value2, "moneytime");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("TotalMoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("TotalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(Double value) {
            addCriterion("TotalMoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(Double value) {
            addCriterion("TotalMoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(Double value) {
            addCriterion("TotalMoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("TotalMoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(Double value) {
            addCriterion("TotalMoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("TotalMoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<Double> values) {
            addCriterion("TotalMoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<Double> values) {
            addCriterion("TotalMoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("TotalMoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("TotalMoney not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneytimeIsNull() {
            addCriterion("MaxMoneyTime is null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneytimeIsNotNull() {
            addCriterion("MaxMoneyTime is not null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneytimeEqualTo(Date value) {
            addCriterion("MaxMoneyTime =", value, "maxmoneytime");
            return (Criteria) this;
        }

        public Criteria andMaxmoneytimeNotEqualTo(Date value) {
            addCriterion("MaxMoneyTime <>", value, "maxmoneytime");
            return (Criteria) this;
        }

        public Criteria andMaxmoneytimeGreaterThan(Date value) {
            addCriterion("MaxMoneyTime >", value, "maxmoneytime");
            return (Criteria) this;
        }

        public Criteria andMaxmoneytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MaxMoneyTime >=", value, "maxmoneytime");
            return (Criteria) this;
        }

        public Criteria andMaxmoneytimeLessThan(Date value) {
            addCriterion("MaxMoneyTime <", value, "maxmoneytime");
            return (Criteria) this;
        }

        public Criteria andMaxmoneytimeLessThanOrEqualTo(Date value) {
            addCriterion("MaxMoneyTime <=", value, "maxmoneytime");
            return (Criteria) this;
        }

        public Criteria andMaxmoneytimeIn(List<Date> values) {
            addCriterion("MaxMoneyTime in", values, "maxmoneytime");
            return (Criteria) this;
        }

        public Criteria andMaxmoneytimeNotIn(List<Date> values) {
            addCriterion("MaxMoneyTime not in", values, "maxmoneytime");
            return (Criteria) this;
        }

        public Criteria andMaxmoneytimeBetween(Date value1, Date value2) {
            addCriterion("MaxMoneyTime between", value1, value2, "maxmoneytime");
            return (Criteria) this;
        }

        public Criteria andMaxmoneytimeNotBetween(Date value1, Date value2) {
            addCriterion("MaxMoneyTime not between", value1, value2, "maxmoneytime");
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

        public Criteria andJudgeIsNull() {
            addCriterion("judge is null");
            return (Criteria) this;
        }

        public Criteria andJudgeIsNotNull() {
            addCriterion("judge is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeEqualTo(Integer value) {
            addCriterion("judge =", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotEqualTo(Integer value) {
            addCriterion("judge <>", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThan(Integer value) {
            addCriterion("judge >", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("judge >=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThan(Integer value) {
            addCriterion("judge <", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThanOrEqualTo(Integer value) {
            addCriterion("judge <=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeIn(List<Integer> values) {
            addCriterion("judge in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotIn(List<Integer> values) {
            addCriterion("judge not in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeBetween(Integer value1, Integer value2) {
            addCriterion("judge between", value1, value2, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotBetween(Integer value1, Integer value2) {
            addCriterion("judge not between", value1, value2, "judge");
            return (Criteria) this;
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

        public Criteria andTotalrownumIsNull() {
            addCriterion("totalrownum is null");
            return (Criteria) this;
        }

        public Criteria andTotalrownumIsNotNull() {
            addCriterion("totalrownum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalrownumEqualTo(Integer value) {
            addCriterion("totalrownum =", value, "totalrownum");
            return (Criteria) this;
        }

        public Criteria andTotalrownumNotEqualTo(Integer value) {
            addCriterion("totalrownum <>", value, "totalrownum");
            return (Criteria) this;
        }

        public Criteria andTotalrownumGreaterThan(Integer value) {
            addCriterion("totalrownum >", value, "totalrownum");
            return (Criteria) this;
        }

        public Criteria andTotalrownumGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalrownum >=", value, "totalrownum");
            return (Criteria) this;
        }

        public Criteria andTotalrownumLessThan(Integer value) {
            addCriterion("totalrownum <", value, "totalrownum");
            return (Criteria) this;
        }

        public Criteria andTotalrownumLessThanOrEqualTo(Integer value) {
            addCriterion("totalrownum <=", value, "totalrownum");
            return (Criteria) this;
        }

        public Criteria andTotalrownumIn(List<Integer> values) {
            addCriterion("totalrownum in", values, "totalrownum");
            return (Criteria) this;
        }

        public Criteria andTotalrownumNotIn(List<Integer> values) {
            addCriterion("totalrownum not in", values, "totalrownum");
            return (Criteria) this;
        }

        public Criteria andTotalrownumBetween(Integer value1, Integer value2) {
            addCriterion("totalrownum between", value1, value2, "totalrownum");
            return (Criteria) this;
        }

        public Criteria andTotalrownumNotBetween(Integer value1, Integer value2) {
            addCriterion("totalrownum not between", value1, value2, "totalrownum");
            return (Criteria) this;
        }

        public Criteria andUsernicknameIsNull() {
            addCriterion("usernickname is null");
            return (Criteria) this;
        }

        public Criteria andUsernicknameIsNotNull() {
            addCriterion("usernickname is not null");
            return (Criteria) this;
        }

        public Criteria andUsernicknameEqualTo(String value) {
            addCriterion("usernickname =", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotEqualTo(String value) {
            addCriterion("usernickname <>", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameGreaterThan(String value) {
            addCriterion("usernickname >", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameGreaterThanOrEqualTo(String value) {
            addCriterion("usernickname >=", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameLessThan(String value) {
            addCriterion("usernickname <", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameLessThanOrEqualTo(String value) {
            addCriterion("usernickname <=", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameLike(String value) {
            addCriterion("usernickname like", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotLike(String value) {
            addCriterion("usernickname not like", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameIn(List<String> values) {
            addCriterion("usernickname in", values, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotIn(List<String> values) {
            addCriterion("usernickname not in", values, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameBetween(String value1, String value2) {
            addCriterion("usernickname between", value1, value2, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotBetween(String value1, String value2) {
            addCriterion("usernickname not between", value1, value2, "usernickname");
            return (Criteria) this;
        }

        public Criteria andMaxrownumIsNull() {
            addCriterion("maxrownum is null");
            return (Criteria) this;
        }

        public Criteria andMaxrownumIsNotNull() {
            addCriterion("maxrownum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxrownumEqualTo(Integer value) {
            addCriterion("maxrownum =", value, "maxrownum");
            return (Criteria) this;
        }

        public Criteria andMaxrownumNotEqualTo(Integer value) {
            addCriterion("maxrownum <>", value, "maxrownum");
            return (Criteria) this;
        }

        public Criteria andMaxrownumGreaterThan(Integer value) {
            addCriterion("maxrownum >", value, "maxrownum");
            return (Criteria) this;
        }

        public Criteria andMaxrownumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxrownum >=", value, "maxrownum");
            return (Criteria) this;
        }

        public Criteria andMaxrownumLessThan(Integer value) {
            addCriterion("maxrownum <", value, "maxrownum");
            return (Criteria) this;
        }

        public Criteria andMaxrownumLessThanOrEqualTo(Integer value) {
            addCriterion("maxrownum <=", value, "maxrownum");
            return (Criteria) this;
        }

        public Criteria andMaxrownumIn(List<Integer> values) {
            addCriterion("maxrownum in", values, "maxrownum");
            return (Criteria) this;
        }

        public Criteria andMaxrownumNotIn(List<Integer> values) {
            addCriterion("maxrownum not in", values, "maxrownum");
            return (Criteria) this;
        }

        public Criteria andMaxrownumBetween(Integer value1, Integer value2) {
            addCriterion("maxrownum between", value1, value2, "maxrownum");
            return (Criteria) this;
        }

        public Criteria andMaxrownumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxrownum not between", value1, value2, "maxrownum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumIsNull() {
            addCriterion("redbagnum is null");
            return (Criteria) this;
        }

        public Criteria andRedbagnumIsNotNull() {
            addCriterion("redbagnum is not null");
            return (Criteria) this;
        }

        public Criteria andRedbagnumEqualTo(Integer value) {
            addCriterion("redbagnum =", value, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumNotEqualTo(Integer value) {
            addCriterion("redbagnum <>", value, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumGreaterThan(Integer value) {
            addCriterion("redbagnum >", value, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("redbagnum >=", value, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumLessThan(Integer value) {
            addCriterion("redbagnum <", value, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumLessThanOrEqualTo(Integer value) {
            addCriterion("redbagnum <=", value, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumIn(List<Integer> values) {
            addCriterion("redbagnum in", values, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumNotIn(List<Integer> values) {
            addCriterion("redbagnum not in", values, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumBetween(Integer value1, Integer value2) {
            addCriterion("redbagnum between", value1, value2, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumNotBetween(Integer value1, Integer value2) {
            addCriterion("redbagnum not between", value1, value2, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagtypeIsNull() {
            addCriterion("redbagtype is null");
            return (Criteria) this;
        }

        public Criteria andRedbagtypeIsNotNull() {
            addCriterion("redbagtype is not null");
            return (Criteria) this;
        }

        public Criteria andRedbagtypeEqualTo(Integer value) {
            addCriterion("redbagtype =", value, "redbagtype");
            return (Criteria) this;
        }

        public Criteria andRedbagtypeNotEqualTo(Integer value) {
            addCriterion("redbagtype <>", value, "redbagtype");
            return (Criteria) this;
        }

        public Criteria andRedbagtypeGreaterThan(Integer value) {
            addCriterion("redbagtype >", value, "redbagtype");
            return (Criteria) this;
        }

        public Criteria andRedbagtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("redbagtype >=", value, "redbagtype");
            return (Criteria) this;
        }

        public Criteria andRedbagtypeLessThan(Integer value) {
            addCriterion("redbagtype <", value, "redbagtype");
            return (Criteria) this;
        }

        public Criteria andRedbagtypeLessThanOrEqualTo(Integer value) {
            addCriterion("redbagtype <=", value, "redbagtype");
            return (Criteria) this;
        }

        public Criteria andRedbagtypeIn(List<Integer> values) {
            addCriterion("redbagtype in", values, "redbagtype");
            return (Criteria) this;
        }

        public Criteria andRedbagtypeNotIn(List<Integer> values) {
            addCriterion("redbagtype not in", values, "redbagtype");
            return (Criteria) this;
        }

        public Criteria andRedbagtypeBetween(Integer value1, Integer value2) {
            addCriterion("redbagtype between", value1, value2, "redbagtype");
            return (Criteria) this;
        }

        public Criteria andRedbagtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("redbagtype not between", value1, value2, "redbagtype");
            return (Criteria) this;
        }

        public Criteria andRedbagidIsNull() {
            addCriterion("redbagid is null");
            return (Criteria) this;
        }

        public Criteria andRedbagidIsNotNull() {
            addCriterion("redbagid is not null");
            return (Criteria) this;
        }

        public Criteria andRedbagidEqualTo(Integer value) {
            addCriterion("redbagid =", value, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidNotEqualTo(Integer value) {
            addCriterion("redbagid <>", value, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidGreaterThan(Integer value) {
            addCriterion("redbagid >", value, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidGreaterThanOrEqualTo(Integer value) {
            addCriterion("redbagid >=", value, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidLessThan(Integer value) {
            addCriterion("redbagid <", value, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidLessThanOrEqualTo(Integer value) {
            addCriterion("redbagid <=", value, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidIn(List<Integer> values) {
            addCriterion("redbagid in", values, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidNotIn(List<Integer> values) {
            addCriterion("redbagid not in", values, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidBetween(Integer value1, Integer value2) {
            addCriterion("redbagid between", value1, value2, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidNotBetween(Integer value1, Integer value2) {
            addCriterion("redbagid not between", value1, value2, "redbagid");
            return (Criteria) this;
        }

        public Criteria andCountdownbegintimeIsNull() {
            addCriterion("countdownbegintime is null");
            return (Criteria) this;
        }

        public Criteria andCountdownbegintimeIsNotNull() {
            addCriterion("countdownbegintime is not null");
            return (Criteria) this;
        }

        public Criteria andCountdownbegintimeEqualTo(Date value) {
            addCriterion("countdownbegintime =", value, "countdownbegintime");
            return (Criteria) this;
        }

        public Criteria andCountdownbegintimeNotEqualTo(Date value) {
            addCriterion("countdownbegintime <>", value, "countdownbegintime");
            return (Criteria) this;
        }

        public Criteria andCountdownbegintimeGreaterThan(Date value) {
            addCriterion("countdownbegintime >", value, "countdownbegintime");
            return (Criteria) this;
        }

        public Criteria andCountdownbegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("countdownbegintime >=", value, "countdownbegintime");
            return (Criteria) this;
        }

        public Criteria andCountdownbegintimeLessThan(Date value) {
            addCriterion("countdownbegintime <", value, "countdownbegintime");
            return (Criteria) this;
        }

        public Criteria andCountdownbegintimeLessThanOrEqualTo(Date value) {
            addCriterion("countdownbegintime <=", value, "countdownbegintime");
            return (Criteria) this;
        }

        public Criteria andCountdownbegintimeIn(List<Date> values) {
            addCriterion("countdownbegintime in", values, "countdownbegintime");
            return (Criteria) this;
        }

        public Criteria andCountdownbegintimeNotIn(List<Date> values) {
            addCriterion("countdownbegintime not in", values, "countdownbegintime");
            return (Criteria) this;
        }

        public Criteria andCountdownbegintimeBetween(Date value1, Date value2) {
            addCriterion("countdownbegintime between", value1, value2, "countdownbegintime");
            return (Criteria) this;
        }

        public Criteria andCountdownbegintimeNotBetween(Date value1, Date value2) {
            addCriterion("countdownbegintime not between", value1, value2, "countdownbegintime");
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