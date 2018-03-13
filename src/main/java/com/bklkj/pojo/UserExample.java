package com.bklkj.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserphoneIsNull() {
            addCriterion("UserPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("UserPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("UserPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("UserPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("UserPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("UserPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("UserPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("UserPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("UserPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("UserPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("UserPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("UserPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("UserPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("UserPhone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernicknameIsNull() {
            addCriterion("UserNickname is null");
            return (Criteria) this;
        }

        public Criteria andUsernicknameIsNotNull() {
            addCriterion("UserNickname is not null");
            return (Criteria) this;
        }

        public Criteria andUsernicknameEqualTo(String value) {
            addCriterion("UserNickname =", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotEqualTo(String value) {
            addCriterion("UserNickname <>", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameGreaterThan(String value) {
            addCriterion("UserNickname >", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameGreaterThanOrEqualTo(String value) {
            addCriterion("UserNickname >=", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameLessThan(String value) {
            addCriterion("UserNickname <", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameLessThanOrEqualTo(String value) {
            addCriterion("UserNickname <=", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameLike(String value) {
            addCriterion("UserNickname like", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotLike(String value) {
            addCriterion("UserNickname not like", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameIn(List<String> values) {
            addCriterion("UserNickname in", values, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotIn(List<String> values) {
            addCriterion("UserNickname not in", values, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameBetween(String value1, String value2) {
            addCriterion("UserNickname between", value1, value2, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotBetween(String value1, String value2) {
            addCriterion("UserNickname not between", value1, value2, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("UserPassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("UserPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("UserPassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("UserPassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("UserPassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("UserPassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("UserPassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("UserPassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("UserPassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("UserPassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("UserPassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("UserPassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("UserPassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("UserPassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserintegralIsNull() {
            addCriterion("UserIntegral is null");
            return (Criteria) this;
        }

        public Criteria andUserintegralIsNotNull() {
            addCriterion("UserIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andUserintegralEqualTo(Integer value) {
            addCriterion("UserIntegral =", value, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralNotEqualTo(Integer value) {
            addCriterion("UserIntegral <>", value, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralGreaterThan(Integer value) {
            addCriterion("UserIntegral >", value, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserIntegral >=", value, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralLessThan(Integer value) {
            addCriterion("UserIntegral <", value, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralLessThanOrEqualTo(Integer value) {
            addCriterion("UserIntegral <=", value, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralIn(List<Integer> values) {
            addCriterion("UserIntegral in", values, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralNotIn(List<Integer> values) {
            addCriterion("UserIntegral not in", values, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralBetween(Integer value1, Integer value2) {
            addCriterion("UserIntegral between", value1, value2, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("UserIntegral not between", value1, value2, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserbalanceIsNull() {
            addCriterion("UserBalance is null");
            return (Criteria) this;
        }

        public Criteria andUserbalanceIsNotNull() {
            addCriterion("UserBalance is not null");
            return (Criteria) this;
        }

        public Criteria andUserbalanceEqualTo(Double value) {
            addCriterion("UserBalance =", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceNotEqualTo(Double value) {
            addCriterion("UserBalance <>", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceGreaterThan(Double value) {
            addCriterion("UserBalance >", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("UserBalance >=", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceLessThan(Double value) {
            addCriterion("UserBalance <", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceLessThanOrEqualTo(Double value) {
            addCriterion("UserBalance <=", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceIn(List<Double> values) {
            addCriterion("UserBalance in", values, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceNotIn(List<Double> values) {
            addCriterion("UserBalance not in", values, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceBetween(Double value1, Double value2) {
            addCriterion("UserBalance between", value1, value2, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceNotBetween(Double value1, Double value2) {
            addCriterion("UserBalance not between", value1, value2, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUseralipayidIsNull() {
            addCriterion("UserAlipayId is null");
            return (Criteria) this;
        }

        public Criteria andUseralipayidIsNotNull() {
            addCriterion("UserAlipayId is not null");
            return (Criteria) this;
        }

        public Criteria andUseralipayidEqualTo(Integer value) {
            addCriterion("UserAlipayId =", value, "useralipayid");
            return (Criteria) this;
        }

        public Criteria andUseralipayidNotEqualTo(Integer value) {
            addCriterion("UserAlipayId <>", value, "useralipayid");
            return (Criteria) this;
        }

        public Criteria andUseralipayidGreaterThan(Integer value) {
            addCriterion("UserAlipayId >", value, "useralipayid");
            return (Criteria) this;
        }

        public Criteria andUseralipayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserAlipayId >=", value, "useralipayid");
            return (Criteria) this;
        }

        public Criteria andUseralipayidLessThan(Integer value) {
            addCriterion("UserAlipayId <", value, "useralipayid");
            return (Criteria) this;
        }

        public Criteria andUseralipayidLessThanOrEqualTo(Integer value) {
            addCriterion("UserAlipayId <=", value, "useralipayid");
            return (Criteria) this;
        }

        public Criteria andUseralipayidIn(List<Integer> values) {
            addCriterion("UserAlipayId in", values, "useralipayid");
            return (Criteria) this;
        }

        public Criteria andUseralipayidNotIn(List<Integer> values) {
            addCriterion("UserAlipayId not in", values, "useralipayid");
            return (Criteria) this;
        }

        public Criteria andUseralipayidBetween(Integer value1, Integer value2) {
            addCriterion("UserAlipayId between", value1, value2, "useralipayid");
            return (Criteria) this;
        }

        public Criteria andUseralipayidNotBetween(Integer value1, Integer value2) {
            addCriterion("UserAlipayId not between", value1, value2, "useralipayid");
            return (Criteria) this;
        }

        public Criteria andUserpictureIsNull() {
            addCriterion("UserPicture is null");
            return (Criteria) this;
        }

        public Criteria andUserpictureIsNotNull() {
            addCriterion("UserPicture is not null");
            return (Criteria) this;
        }

        public Criteria andUserpictureEqualTo(String value) {
            addCriterion("UserPicture =", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureNotEqualTo(String value) {
            addCriterion("UserPicture <>", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureGreaterThan(String value) {
            addCriterion("UserPicture >", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureGreaterThanOrEqualTo(String value) {
            addCriterion("UserPicture >=", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureLessThan(String value) {
            addCriterion("UserPicture <", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureLessThanOrEqualTo(String value) {
            addCriterion("UserPicture <=", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureLike(String value) {
            addCriterion("UserPicture like", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureNotLike(String value) {
            addCriterion("UserPicture not like", value, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureIn(List<String> values) {
            addCriterion("UserPicture in", values, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureNotIn(List<String> values) {
            addCriterion("UserPicture not in", values, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureBetween(String value1, String value2) {
            addCriterion("UserPicture between", value1, value2, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUserpictureNotBetween(String value1, String value2) {
            addCriterion("UserPicture not between", value1, value2, "userpicture");
            return (Criteria) this;
        }

        public Criteria andUsergoldIsNull() {
            addCriterion("UserGold is null");
            return (Criteria) this;
        }

        public Criteria andUsergoldIsNotNull() {
            addCriterion("UserGold is not null");
            return (Criteria) this;
        }

        public Criteria andUsergoldEqualTo(Integer value) {
            addCriterion("UserGold =", value, "usergold");
            return (Criteria) this;
        }

        public Criteria andUsergoldNotEqualTo(Integer value) {
            addCriterion("UserGold <>", value, "usergold");
            return (Criteria) this;
        }

        public Criteria andUsergoldGreaterThan(Integer value) {
            addCriterion("UserGold >", value, "usergold");
            return (Criteria) this;
        }

        public Criteria andUsergoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserGold >=", value, "usergold");
            return (Criteria) this;
        }

        public Criteria andUsergoldLessThan(Integer value) {
            addCriterion("UserGold <", value, "usergold");
            return (Criteria) this;
        }

        public Criteria andUsergoldLessThanOrEqualTo(Integer value) {
            addCriterion("UserGold <=", value, "usergold");
            return (Criteria) this;
        }

        public Criteria andUsergoldIn(List<Integer> values) {
            addCriterion("UserGold in", values, "usergold");
            return (Criteria) this;
        }

        public Criteria andUsergoldNotIn(List<Integer> values) {
            addCriterion("UserGold not in", values, "usergold");
            return (Criteria) this;
        }

        public Criteria andUsergoldBetween(Integer value1, Integer value2) {
            addCriterion("UserGold between", value1, value2, "usergold");
            return (Criteria) this;
        }

        public Criteria andUsergoldNotBetween(Integer value1, Integer value2) {
            addCriterion("UserGold not between", value1, value2, "usergold");
            return (Criteria) this;
        }

        public Criteria andLoginwayIsNull() {
            addCriterion("LoginWay is null");
            return (Criteria) this;
        }

        public Criteria andLoginwayIsNotNull() {
            addCriterion("LoginWay is not null");
            return (Criteria) this;
        }

        public Criteria andLoginwayEqualTo(Integer value) {
            addCriterion("LoginWay =", value, "loginway");
            return (Criteria) this;
        }

        public Criteria andLoginwayNotEqualTo(Integer value) {
            addCriterion("LoginWay <>", value, "loginway");
            return (Criteria) this;
        }

        public Criteria andLoginwayGreaterThan(Integer value) {
            addCriterion("LoginWay >", value, "loginway");
            return (Criteria) this;
        }

        public Criteria andLoginwayGreaterThanOrEqualTo(Integer value) {
            addCriterion("LoginWay >=", value, "loginway");
            return (Criteria) this;
        }

        public Criteria andLoginwayLessThan(Integer value) {
            addCriterion("LoginWay <", value, "loginway");
            return (Criteria) this;
        }

        public Criteria andLoginwayLessThanOrEqualTo(Integer value) {
            addCriterion("LoginWay <=", value, "loginway");
            return (Criteria) this;
        }

        public Criteria andLoginwayIn(List<Integer> values) {
            addCriterion("LoginWay in", values, "loginway");
            return (Criteria) this;
        }

        public Criteria andLoginwayNotIn(List<Integer> values) {
            addCriterion("LoginWay not in", values, "loginway");
            return (Criteria) this;
        }

        public Criteria andLoginwayBetween(Integer value1, Integer value2) {
            addCriterion("LoginWay between", value1, value2, "loginway");
            return (Criteria) this;
        }

        public Criteria andLoginwayNotBetween(Integer value1, Integer value2) {
            addCriterion("LoginWay not between", value1, value2, "loginway");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andSecurityIsNull() {
            addCriterion("security is null");
            return (Criteria) this;
        }

        public Criteria andSecurityIsNotNull() {
            addCriterion("security is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityEqualTo(String value) {
            addCriterion("security =", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityNotEqualTo(String value) {
            addCriterion("security <>", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityGreaterThan(String value) {
            addCriterion("security >", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityGreaterThanOrEqualTo(String value) {
            addCriterion("security >=", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityLessThan(String value) {
            addCriterion("security <", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityLessThanOrEqualTo(String value) {
            addCriterion("security <=", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityLike(String value) {
            addCriterion("security like", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityNotLike(String value) {
            addCriterion("security not like", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityIn(List<String> values) {
            addCriterion("security in", values, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityNotIn(List<String> values) {
            addCriterion("security not in", values, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityBetween(String value1, String value2) {
            addCriterion("security between", value1, value2, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityNotBetween(String value1, String value2) {
            addCriterion("security not between", value1, value2, "security");
            return (Criteria) this;
        }

        public Criteria andQuestiononeIsNull() {
            addCriterion("questionone is null");
            return (Criteria) this;
        }

        public Criteria andQuestiononeIsNotNull() {
            addCriterion("questionone is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiononeEqualTo(Integer value) {
            addCriterion("questionone =", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeNotEqualTo(Integer value) {
            addCriterion("questionone <>", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeGreaterThan(Integer value) {
            addCriterion("questionone >", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionone >=", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeLessThan(Integer value) {
            addCriterion("questionone <", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeLessThanOrEqualTo(Integer value) {
            addCriterion("questionone <=", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeIn(List<Integer> values) {
            addCriterion("questionone in", values, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeNotIn(List<Integer> values) {
            addCriterion("questionone not in", values, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeBetween(Integer value1, Integer value2) {
            addCriterion("questionone between", value1, value2, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeNotBetween(Integer value1, Integer value2) {
            addCriterion("questionone not between", value1, value2, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoIsNull() {
            addCriterion("questiontwo is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoIsNotNull() {
            addCriterion("questiontwo is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoEqualTo(Integer value) {
            addCriterion("questiontwo =", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoNotEqualTo(Integer value) {
            addCriterion("questiontwo <>", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoGreaterThan(Integer value) {
            addCriterion("questiontwo >", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("questiontwo >=", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoLessThan(Integer value) {
            addCriterion("questiontwo <", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoLessThanOrEqualTo(Integer value) {
            addCriterion("questiontwo <=", value, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoIn(List<Integer> values) {
            addCriterion("questiontwo in", values, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoNotIn(List<Integer> values) {
            addCriterion("questiontwo not in", values, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoBetween(Integer value1, Integer value2) {
            addCriterion("questiontwo between", value1, value2, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestiontwoNotBetween(Integer value1, Integer value2) {
            addCriterion("questiontwo not between", value1, value2, "questiontwo");
            return (Criteria) this;
        }

        public Criteria andQuestionthreeIsNull() {
            addCriterion("questionthree is null");
            return (Criteria) this;
        }

        public Criteria andQuestionthreeIsNotNull() {
            addCriterion("questionthree is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionthreeEqualTo(Integer value) {
            addCriterion("questionthree =", value, "questionthree");
            return (Criteria) this;
        }

        public Criteria andQuestionthreeNotEqualTo(Integer value) {
            addCriterion("questionthree <>", value, "questionthree");
            return (Criteria) this;
        }

        public Criteria andQuestionthreeGreaterThan(Integer value) {
            addCriterion("questionthree >", value, "questionthree");
            return (Criteria) this;
        }

        public Criteria andQuestionthreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionthree >=", value, "questionthree");
            return (Criteria) this;
        }

        public Criteria andQuestionthreeLessThan(Integer value) {
            addCriterion("questionthree <", value, "questionthree");
            return (Criteria) this;
        }

        public Criteria andQuestionthreeLessThanOrEqualTo(Integer value) {
            addCriterion("questionthree <=", value, "questionthree");
            return (Criteria) this;
        }

        public Criteria andQuestionthreeIn(List<Integer> values) {
            addCriterion("questionthree in", values, "questionthree");
            return (Criteria) this;
        }

        public Criteria andQuestionthreeNotIn(List<Integer> values) {
            addCriterion("questionthree not in", values, "questionthree");
            return (Criteria) this;
        }

        public Criteria andQuestionthreeBetween(Integer value1, Integer value2) {
            addCriterion("questionthree between", value1, value2, "questionthree");
            return (Criteria) this;
        }

        public Criteria andQuestionthreeNotBetween(Integer value1, Integer value2) {
            addCriterion("questionthree not between", value1, value2, "questionthree");
            return (Criteria) this;
        }

        public Criteria andAlipayidIsNull() {
            addCriterion("alipayid is null");
            return (Criteria) this;
        }

        public Criteria andAlipayidIsNotNull() {
            addCriterion("alipayid is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayidEqualTo(String value) {
            addCriterion("alipayid =", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidNotEqualTo(String value) {
            addCriterion("alipayid <>", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidGreaterThan(String value) {
            addCriterion("alipayid >", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidGreaterThanOrEqualTo(String value) {
            addCriterion("alipayid >=", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidLessThan(String value) {
            addCriterion("alipayid <", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidLessThanOrEqualTo(String value) {
            addCriterion("alipayid <=", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidLike(String value) {
            addCriterion("alipayid like", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidNotLike(String value) {
            addCriterion("alipayid not like", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidIn(List<String> values) {
            addCriterion("alipayid in", values, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidNotIn(List<String> values) {
            addCriterion("alipayid not in", values, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidBetween(String value1, String value2) {
            addCriterion("alipayid between", value1, value2, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidNotBetween(String value1, String value2) {
            addCriterion("alipayid not between", value1, value2, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipaystateIsNull() {
            addCriterion("alipaystate is null");
            return (Criteria) this;
        }

        public Criteria andAlipaystateIsNotNull() {
            addCriterion("alipaystate is not null");
            return (Criteria) this;
        }

        public Criteria andAlipaystateEqualTo(String value) {
            addCriterion("alipaystate =", value, "alipaystate");
            return (Criteria) this;
        }

        public Criteria andAlipaystateNotEqualTo(String value) {
            addCriterion("alipaystate <>", value, "alipaystate");
            return (Criteria) this;
        }

        public Criteria andAlipaystateGreaterThan(String value) {
            addCriterion("alipaystate >", value, "alipaystate");
            return (Criteria) this;
        }

        public Criteria andAlipaystateGreaterThanOrEqualTo(String value) {
            addCriterion("alipaystate >=", value, "alipaystate");
            return (Criteria) this;
        }

        public Criteria andAlipaystateLessThan(String value) {
            addCriterion("alipaystate <", value, "alipaystate");
            return (Criteria) this;
        }

        public Criteria andAlipaystateLessThanOrEqualTo(String value) {
            addCriterion("alipaystate <=", value, "alipaystate");
            return (Criteria) this;
        }

        public Criteria andAlipaystateLike(String value) {
            addCriterion("alipaystate like", value, "alipaystate");
            return (Criteria) this;
        }

        public Criteria andAlipaystateNotLike(String value) {
            addCriterion("alipaystate not like", value, "alipaystate");
            return (Criteria) this;
        }

        public Criteria andAlipaystateIn(List<String> values) {
            addCriterion("alipaystate in", values, "alipaystate");
            return (Criteria) this;
        }

        public Criteria andAlipaystateNotIn(List<String> values) {
            addCriterion("alipaystate not in", values, "alipaystate");
            return (Criteria) this;
        }

        public Criteria andAlipaystateBetween(String value1, String value2) {
            addCriterion("alipaystate between", value1, value2, "alipaystate");
            return (Criteria) this;
        }

        public Criteria andAlipaystateNotBetween(String value1, String value2) {
            addCriterion("alipaystate not between", value1, value2, "alipaystate");
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