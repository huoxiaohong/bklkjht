package com.bklkj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RedbagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedbagExample() {
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

        public Criteria andRedbagidIsNull() {
            addCriterion("RedBagId is null");
            return (Criteria) this;
        }

        public Criteria andRedbagidIsNotNull() {
            addCriterion("RedBagId is not null");
            return (Criteria) this;
        }

        public Criteria andRedbagidEqualTo(Integer value) {
            addCriterion("RedBagId =", value, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidNotEqualTo(Integer value) {
            addCriterion("RedBagId <>", value, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidGreaterThan(Integer value) {
            addCriterion("RedBagId >", value, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RedBagId >=", value, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidLessThan(Integer value) {
            addCriterion("RedBagId <", value, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidLessThanOrEqualTo(Integer value) {
            addCriterion("RedBagId <=", value, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidIn(List<Integer> values) {
            addCriterion("RedBagId in", values, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidNotIn(List<Integer> values) {
            addCriterion("RedBagId not in", values, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidBetween(Integer value1, Integer value2) {
            addCriterion("RedBagId between", value1, value2, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagidNotBetween(Integer value1, Integer value2) {
            addCriterion("RedBagId not between", value1, value2, "redbagid");
            return (Criteria) this;
        }

        public Criteria andRedbagmoneyIsNull() {
            addCriterion("RedbagMoney is null");
            return (Criteria) this;
        }

        public Criteria andRedbagmoneyIsNotNull() {
            addCriterion("RedbagMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRedbagmoneyEqualTo(Double value) {
            addCriterion("RedbagMoney =", value, "redbagmoney");
            return (Criteria) this;
        }

        public Criteria andRedbagmoneyNotEqualTo(Double value) {
            addCriterion("RedbagMoney <>", value, "redbagmoney");
            return (Criteria) this;
        }

        public Criteria andRedbagmoneyGreaterThan(Double value) {
            addCriterion("RedbagMoney >", value, "redbagmoney");
            return (Criteria) this;
        }

        public Criteria andRedbagmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("RedbagMoney >=", value, "redbagmoney");
            return (Criteria) this;
        }

        public Criteria andRedbagmoneyLessThan(Double value) {
            addCriterion("RedbagMoney <", value, "redbagmoney");
            return (Criteria) this;
        }

        public Criteria andRedbagmoneyLessThanOrEqualTo(Double value) {
            addCriterion("RedbagMoney <=", value, "redbagmoney");
            return (Criteria) this;
        }

        public Criteria andRedbagmoneyIn(List<Double> values) {
            addCriterion("RedbagMoney in", values, "redbagmoney");
            return (Criteria) this;
        }

        public Criteria andRedbagmoneyNotIn(List<Double> values) {
            addCriterion("RedbagMoney not in", values, "redbagmoney");
            return (Criteria) this;
        }

        public Criteria andRedbagmoneyBetween(Double value1, Double value2) {
            addCriterion("RedbagMoney between", value1, value2, "redbagmoney");
            return (Criteria) this;
        }

        public Criteria andRedbagmoneyNotBetween(Double value1, Double value2) {
            addCriterion("RedbagMoney not between", value1, value2, "redbagmoney");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessIsNull() {
            addCriterion("RedBagBusiness is null");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessIsNotNull() {
            addCriterion("RedBagBusiness is not null");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessEqualTo(String value) {
            addCriterion("RedBagBusiness =", value, "redbagbusiness");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessNotEqualTo(String value) {
            addCriterion("RedBagBusiness <>", value, "redbagbusiness");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessGreaterThan(String value) {
            addCriterion("RedBagBusiness >", value, "redbagbusiness");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessGreaterThanOrEqualTo(String value) {
            addCriterion("RedBagBusiness >=", value, "redbagbusiness");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessLessThan(String value) {
            addCriterion("RedBagBusiness <", value, "redbagbusiness");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessLessThanOrEqualTo(String value) {
            addCriterion("RedBagBusiness <=", value, "redbagbusiness");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessLike(String value) {
            addCriterion("RedBagBusiness like", value, "redbagbusiness");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessNotLike(String value) {
            addCriterion("RedBagBusiness not like", value, "redbagbusiness");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessIn(List<String> values) {
            addCriterion("RedBagBusiness in", values, "redbagbusiness");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessNotIn(List<String> values) {
            addCriterion("RedBagBusiness not in", values, "redbagbusiness");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessBetween(String value1, String value2) {
            addCriterion("RedBagBusiness between", value1, value2, "redbagbusiness");
            return (Criteria) this;
        }

        public Criteria andRedbagbusinessNotBetween(String value1, String value2) {
            addCriterion("RedBagBusiness not between", value1, value2, "redbagbusiness");
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

        public Criteria andCouponIsNull() {
            addCriterion("Coupon is null");
            return (Criteria) this;
        }

        public Criteria andCouponIsNotNull() {
            addCriterion("Coupon is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEqualTo(String value) {
            addCriterion("Coupon =", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotEqualTo(String value) {
            addCriterion("Coupon <>", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponGreaterThan(String value) {
            addCriterion("Coupon >", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponGreaterThanOrEqualTo(String value) {
            addCriterion("Coupon >=", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLessThan(String value) {
            addCriterion("Coupon <", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLessThanOrEqualTo(String value) {
            addCriterion("Coupon <=", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLike(String value) {
            addCriterion("Coupon like", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotLike(String value) {
            addCriterion("Coupon not like", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponIn(List<String> values) {
            addCriterion("Coupon in", values, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotIn(List<String> values) {
            addCriterion("Coupon not in", values, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponBetween(String value1, String value2) {
            addCriterion("Coupon between", value1, value2, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotBetween(String value1, String value2) {
            addCriterion("Coupon not between", value1, value2, "coupon");
            return (Criteria) this;
        }

        public Criteria andCoupontimeIsNull() {
            addCriterion("CouponTime is null");
            return (Criteria) this;
        }

        public Criteria andCoupontimeIsNotNull() {
            addCriterion("CouponTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoupontimeEqualTo(Date value) {
            addCriterion("CouponTime =", value, "coupontime");
            return (Criteria) this;
        }

        public Criteria andCoupontimeNotEqualTo(Date value) {
            addCriterion("CouponTime <>", value, "coupontime");
            return (Criteria) this;
        }

        public Criteria andCoupontimeGreaterThan(Date value) {
            addCriterion("CouponTime >", value, "coupontime");
            return (Criteria) this;
        }

        public Criteria andCoupontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CouponTime >=", value, "coupontime");
            return (Criteria) this;
        }

        public Criteria andCoupontimeLessThan(Date value) {
            addCriterion("CouponTime <", value, "coupontime");
            return (Criteria) this;
        }

        public Criteria andCoupontimeLessThanOrEqualTo(Date value) {
            addCriterion("CouponTime <=", value, "coupontime");
            return (Criteria) this;
        }

        public Criteria andCoupontimeIn(List<Date> values) {
            addCriterion("CouponTime in", values, "coupontime");
            return (Criteria) this;
        }

        public Criteria andCoupontimeNotIn(List<Date> values) {
            addCriterion("CouponTime not in", values, "coupontime");
            return (Criteria) this;
        }

        public Criteria andCoupontimeBetween(Date value1, Date value2) {
            addCriterion("CouponTime between", value1, value2, "coupontime");
            return (Criteria) this;
        }

        public Criteria andCoupontimeNotBetween(Date value1, Date value2) {
            addCriterion("CouponTime not between", value1, value2, "coupontime");
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

        public Criteria andIntegraltimeIsNull() {
            addCriterion("IntegralTime is null");
            return (Criteria) this;
        }

        public Criteria andIntegraltimeIsNotNull() {
            addCriterion("IntegralTime is not null");
            return (Criteria) this;
        }

        public Criteria andIntegraltimeEqualTo(Date value) {
            addCriterion("IntegralTime =", value, "integraltime");
            return (Criteria) this;
        }

        public Criteria andIntegraltimeNotEqualTo(Date value) {
            addCriterion("IntegralTime <>", value, "integraltime");
            return (Criteria) this;
        }

        public Criteria andIntegraltimeGreaterThan(Date value) {
            addCriterion("IntegralTime >", value, "integraltime");
            return (Criteria) this;
        }

        public Criteria andIntegraltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("IntegralTime >=", value, "integraltime");
            return (Criteria) this;
        }

        public Criteria andIntegraltimeLessThan(Date value) {
            addCriterion("IntegralTime <", value, "integraltime");
            return (Criteria) this;
        }

        public Criteria andIntegraltimeLessThanOrEqualTo(Date value) {
            addCriterion("IntegralTime <=", value, "integraltime");
            return (Criteria) this;
        }

        public Criteria andIntegraltimeIn(List<Date> values) {
            addCriterion("IntegralTime in", values, "integraltime");
            return (Criteria) this;
        }

        public Criteria andIntegraltimeNotIn(List<Date> values) {
            addCriterion("IntegralTime not in", values, "integraltime");
            return (Criteria) this;
        }

        public Criteria andIntegraltimeBetween(Date value1, Date value2) {
            addCriterion("IntegralTime between", value1, value2, "integraltime");
            return (Criteria) this;
        }

        public Criteria andIntegraltimeNotBetween(Date value1, Date value2) {
            addCriterion("IntegralTime not between", value1, value2, "integraltime");
            return (Criteria) this;
        }

        public Criteria andRedbagnumIsNull() {
            addCriterion("RedbagNum is null");
            return (Criteria) this;
        }

        public Criteria andRedbagnumIsNotNull() {
            addCriterion("RedbagNum is not null");
            return (Criteria) this;
        }

        public Criteria andRedbagnumEqualTo(Integer value) {
            addCriterion("RedbagNum =", value, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumNotEqualTo(Integer value) {
            addCriterion("RedbagNum <>", value, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumGreaterThan(Integer value) {
            addCriterion("RedbagNum >", value, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("RedbagNum >=", value, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumLessThan(Integer value) {
            addCriterion("RedbagNum <", value, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumLessThanOrEqualTo(Integer value) {
            addCriterion("RedbagNum <=", value, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumIn(List<Integer> values) {
            addCriterion("RedbagNum in", values, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumNotIn(List<Integer> values) {
            addCriterion("RedbagNum not in", values, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumBetween(Integer value1, Integer value2) {
            addCriterion("RedbagNum between", value1, value2, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagnumNotBetween(Integer value1, Integer value2) {
            addCriterion("RedbagNum not between", value1, value2, "redbagnum");
            return (Criteria) this;
        }

        public Criteria andRedbagtimeIsNull() {
            addCriterion("RedBagTime is null");
            return (Criteria) this;
        }

        public Criteria andRedbagtimeIsNotNull() {
            addCriterion("RedBagTime is not null");
            return (Criteria) this;
        }

        public Criteria andRedbagtimeEqualTo(Date value) {
            addCriterion("RedBagTime =", value, "redbagtime");
            return (Criteria) this;
        }

        public Criteria andRedbagtimeNotEqualTo(Date value) {
            addCriterion("RedBagTime <>", value, "redbagtime");
            return (Criteria) this;
        }

        public Criteria andRedbagtimeGreaterThan(Date value) {
            addCriterion("RedBagTime >", value, "redbagtime");
            return (Criteria) this;
        }

        public Criteria andRedbagtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RedBagTime >=", value, "redbagtime");
            return (Criteria) this;
        }

        public Criteria andRedbagtimeLessThan(Date value) {
            addCriterion("RedBagTime <", value, "redbagtime");
            return (Criteria) this;
        }

        public Criteria andRedbagtimeLessThanOrEqualTo(Date value) {
            addCriterion("RedBagTime <=", value, "redbagtime");
            return (Criteria) this;
        }

        public Criteria andRedbagtimeIn(List<Date> values) {
            addCriterion("RedBagTime in", values, "redbagtime");
            return (Criteria) this;
        }

        public Criteria andRedbagtimeNotIn(List<Date> values) {
            addCriterion("RedBagTime not in", values, "redbagtime");
            return (Criteria) this;
        }

        public Criteria andRedbagtimeBetween(Date value1, Date value2) {
            addCriterion("RedBagTime between", value1, value2, "redbagtime");
            return (Criteria) this;
        }

        public Criteria andRedbagtimeNotBetween(Date value1, Date value2) {
            addCriterion("RedBagTime not between", value1, value2, "redbagtime");
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

        public Criteria andTotalmoneyIsNull() {
            addCriterion("totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(Integer value) {
            addCriterion("totalmoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(Integer value) {
            addCriterion("totalmoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(Integer value) {
            addCriterion("totalmoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalmoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(Integer value) {
            addCriterion("totalmoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("totalmoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<Integer> values) {
            addCriterion("totalmoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<Integer> values) {
            addCriterion("totalmoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(Integer value1, Integer value2) {
            addCriterion("totalmoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("totalmoney not between", value1, value2, "totalmoney");
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