package cn.trusteye.f2.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class F2sesnkeySetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public F2sesnkeySetExample() {
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

        public Criteria andSesnkeyIsNull() {
            addCriterion("SESNKEY is null");
            return (Criteria) this;
        }

        public Criteria andSesnkeyIsNotNull() {
            addCriterion("SESNKEY is not null");
            return (Criteria) this;
        }

        public Criteria andSesnkeyEqualTo(String value) {
            addCriterion("SESNKEY =", value, "sesnkey");
            return (Criteria) this;
        }

        public Criteria andSesnkeyNotEqualTo(String value) {
            addCriterion("SESNKEY <>", value, "sesnkey");
            return (Criteria) this;
        }

        public Criteria andSesnkeyGreaterThan(String value) {
            addCriterion("SESNKEY >", value, "sesnkey");
            return (Criteria) this;
        }

        public Criteria andSesnkeyGreaterThanOrEqualTo(String value) {
            addCriterion("SESNKEY >=", value, "sesnkey");
            return (Criteria) this;
        }

        public Criteria andSesnkeyLessThan(String value) {
            addCriterion("SESNKEY <", value, "sesnkey");
            return (Criteria) this;
        }

        public Criteria andSesnkeyLessThanOrEqualTo(String value) {
            addCriterion("SESNKEY <=", value, "sesnkey");
            return (Criteria) this;
        }

        public Criteria andSesnkeyLike(String value) {
            addCriterion("SESNKEY like", value, "sesnkey");
            return (Criteria) this;
        }

        public Criteria andSesnkeyNotLike(String value) {
            addCriterion("SESNKEY not like", value, "sesnkey");
            return (Criteria) this;
        }

        public Criteria andSesnkeyIn(List<String> values) {
            addCriterion("SESNKEY in", values, "sesnkey");
            return (Criteria) this;
        }

        public Criteria andSesnkeyNotIn(List<String> values) {
            addCriterion("SESNKEY not in", values, "sesnkey");
            return (Criteria) this;
        }

        public Criteria andSesnkeyBetween(String value1, String value2) {
            addCriterion("SESNKEY between", value1, value2, "sesnkey");
            return (Criteria) this;
        }

        public Criteria andSesnkeyNotBetween(String value1, String value2) {
            addCriterion("SESNKEY not between", value1, value2, "sesnkey");
            return (Criteria) this;
        }

        public Criteria andAllnumIsNull() {
            addCriterion("ALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andAllnumIsNotNull() {
            addCriterion("ALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAllnumEqualTo(BigDecimal value) {
            addCriterion("ALLNUM =", value, "allnum");
            return (Criteria) this;
        }

        public Criteria andAllnumNotEqualTo(BigDecimal value) {
            addCriterion("ALLNUM <>", value, "allnum");
            return (Criteria) this;
        }

        public Criteria andAllnumGreaterThan(BigDecimal value) {
            addCriterion("ALLNUM >", value, "allnum");
            return (Criteria) this;
        }

        public Criteria andAllnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALLNUM >=", value, "allnum");
            return (Criteria) this;
        }

        public Criteria andAllnumLessThan(BigDecimal value) {
            addCriterion("ALLNUM <", value, "allnum");
            return (Criteria) this;
        }

        public Criteria andAllnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALLNUM <=", value, "allnum");
            return (Criteria) this;
        }

        public Criteria andAllnumIn(List<BigDecimal> values) {
            addCriterion("ALLNUM in", values, "allnum");
            return (Criteria) this;
        }

        public Criteria andAllnumNotIn(List<BigDecimal> values) {
            addCriterion("ALLNUM not in", values, "allnum");
            return (Criteria) this;
        }

        public Criteria andAllnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALLNUM between", value1, value2, "allnum");
            return (Criteria) this;
        }

        public Criteria andAllnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALLNUM not between", value1, value2, "allnum");
            return (Criteria) this;
        }

        public Criteria andNewnumIsNull() {
            addCriterion("NEWNUM is null");
            return (Criteria) this;
        }

        public Criteria andNewnumIsNotNull() {
            addCriterion("NEWNUM is not null");
            return (Criteria) this;
        }

        public Criteria andNewnumEqualTo(BigDecimal value) {
            addCriterion("NEWNUM =", value, "newnum");
            return (Criteria) this;
        }

        public Criteria andNewnumNotEqualTo(BigDecimal value) {
            addCriterion("NEWNUM <>", value, "newnum");
            return (Criteria) this;
        }

        public Criteria andNewnumGreaterThan(BigDecimal value) {
            addCriterion("NEWNUM >", value, "newnum");
            return (Criteria) this;
        }

        public Criteria andNewnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEWNUM >=", value, "newnum");
            return (Criteria) this;
        }

        public Criteria andNewnumLessThan(BigDecimal value) {
            addCriterion("NEWNUM <", value, "newnum");
            return (Criteria) this;
        }

        public Criteria andNewnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEWNUM <=", value, "newnum");
            return (Criteria) this;
        }

        public Criteria andNewnumIn(List<BigDecimal> values) {
            addCriterion("NEWNUM in", values, "newnum");
            return (Criteria) this;
        }

        public Criteria andNewnumNotIn(List<BigDecimal> values) {
            addCriterion("NEWNUM not in", values, "newnum");
            return (Criteria) this;
        }

        public Criteria andNewnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEWNUM between", value1, value2, "newnum");
            return (Criteria) this;
        }

        public Criteria andNewnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEWNUM not between", value1, value2, "newnum");
            return (Criteria) this;
        }

        public Criteria andPostAllnumIsNull() {
            addCriterion("POST_ALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andPostAllnumIsNotNull() {
            addCriterion("POST_ALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPostAllnumEqualTo(BigDecimal value) {
            addCriterion("POST_ALLNUM =", value, "postAllnum");
            return (Criteria) this;
        }

        public Criteria andPostAllnumNotEqualTo(BigDecimal value) {
            addCriterion("POST_ALLNUM <>", value, "postAllnum");
            return (Criteria) this;
        }

        public Criteria andPostAllnumGreaterThan(BigDecimal value) {
            addCriterion("POST_ALLNUM >", value, "postAllnum");
            return (Criteria) this;
        }

        public Criteria andPostAllnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POST_ALLNUM >=", value, "postAllnum");
            return (Criteria) this;
        }

        public Criteria andPostAllnumLessThan(BigDecimal value) {
            addCriterion("POST_ALLNUM <", value, "postAllnum");
            return (Criteria) this;
        }

        public Criteria andPostAllnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POST_ALLNUM <=", value, "postAllnum");
            return (Criteria) this;
        }

        public Criteria andPostAllnumIn(List<BigDecimal> values) {
            addCriterion("POST_ALLNUM in", values, "postAllnum");
            return (Criteria) this;
        }

        public Criteria andPostAllnumNotIn(List<BigDecimal> values) {
            addCriterion("POST_ALLNUM not in", values, "postAllnum");
            return (Criteria) this;
        }

        public Criteria andPostAllnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POST_ALLNUM between", value1, value2, "postAllnum");
            return (Criteria) this;
        }

        public Criteria andPostAllnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POST_ALLNUM not between", value1, value2, "postAllnum");
            return (Criteria) this;
        }

        public Criteria andPostNewnumIsNull() {
            addCriterion("POST_NEWNUM is null");
            return (Criteria) this;
        }

        public Criteria andPostNewnumIsNotNull() {
            addCriterion("POST_NEWNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPostNewnumEqualTo(BigDecimal value) {
            addCriterion("POST_NEWNUM =", value, "postNewnum");
            return (Criteria) this;
        }

        public Criteria andPostNewnumNotEqualTo(BigDecimal value) {
            addCriterion("POST_NEWNUM <>", value, "postNewnum");
            return (Criteria) this;
        }

        public Criteria andPostNewnumGreaterThan(BigDecimal value) {
            addCriterion("POST_NEWNUM >", value, "postNewnum");
            return (Criteria) this;
        }

        public Criteria andPostNewnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POST_NEWNUM >=", value, "postNewnum");
            return (Criteria) this;
        }

        public Criteria andPostNewnumLessThan(BigDecimal value) {
            addCriterion("POST_NEWNUM <", value, "postNewnum");
            return (Criteria) this;
        }

        public Criteria andPostNewnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POST_NEWNUM <=", value, "postNewnum");
            return (Criteria) this;
        }

        public Criteria andPostNewnumIn(List<BigDecimal> values) {
            addCriterion("POST_NEWNUM in", values, "postNewnum");
            return (Criteria) this;
        }

        public Criteria andPostNewnumNotIn(List<BigDecimal> values) {
            addCriterion("POST_NEWNUM not in", values, "postNewnum");
            return (Criteria) this;
        }

        public Criteria andPostNewnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POST_NEWNUM between", value1, value2, "postNewnum");
            return (Criteria) this;
        }

        public Criteria andPostNewnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POST_NEWNUM not between", value1, value2, "postNewnum");
            return (Criteria) this;
        }

        public Criteria andGetAllnumIsNull() {
            addCriterion("GET_ALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andGetAllnumIsNotNull() {
            addCriterion("GET_ALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andGetAllnumEqualTo(BigDecimal value) {
            addCriterion("GET_ALLNUM =", value, "getAllnum");
            return (Criteria) this;
        }

        public Criteria andGetAllnumNotEqualTo(BigDecimal value) {
            addCriterion("GET_ALLNUM <>", value, "getAllnum");
            return (Criteria) this;
        }

        public Criteria andGetAllnumGreaterThan(BigDecimal value) {
            addCriterion("GET_ALLNUM >", value, "getAllnum");
            return (Criteria) this;
        }

        public Criteria andGetAllnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GET_ALLNUM >=", value, "getAllnum");
            return (Criteria) this;
        }

        public Criteria andGetAllnumLessThan(BigDecimal value) {
            addCriterion("GET_ALLNUM <", value, "getAllnum");
            return (Criteria) this;
        }

        public Criteria andGetAllnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GET_ALLNUM <=", value, "getAllnum");
            return (Criteria) this;
        }

        public Criteria andGetAllnumIn(List<BigDecimal> values) {
            addCriterion("GET_ALLNUM in", values, "getAllnum");
            return (Criteria) this;
        }

        public Criteria andGetAllnumNotIn(List<BigDecimal> values) {
            addCriterion("GET_ALLNUM not in", values, "getAllnum");
            return (Criteria) this;
        }

        public Criteria andGetAllnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GET_ALLNUM between", value1, value2, "getAllnum");
            return (Criteria) this;
        }

        public Criteria andGetAllnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GET_ALLNUM not between", value1, value2, "getAllnum");
            return (Criteria) this;
        }

        public Criteria andGetNewnumIsNull() {
            addCriterion("GET_NEWNUM is null");
            return (Criteria) this;
        }

        public Criteria andGetNewnumIsNotNull() {
            addCriterion("GET_NEWNUM is not null");
            return (Criteria) this;
        }

        public Criteria andGetNewnumEqualTo(BigDecimal value) {
            addCriterion("GET_NEWNUM =", value, "getNewnum");
            return (Criteria) this;
        }

        public Criteria andGetNewnumNotEqualTo(BigDecimal value) {
            addCriterion("GET_NEWNUM <>", value, "getNewnum");
            return (Criteria) this;
        }

        public Criteria andGetNewnumGreaterThan(BigDecimal value) {
            addCriterion("GET_NEWNUM >", value, "getNewnum");
            return (Criteria) this;
        }

        public Criteria andGetNewnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GET_NEWNUM >=", value, "getNewnum");
            return (Criteria) this;
        }

        public Criteria andGetNewnumLessThan(BigDecimal value) {
            addCriterion("GET_NEWNUM <", value, "getNewnum");
            return (Criteria) this;
        }

        public Criteria andGetNewnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GET_NEWNUM <=", value, "getNewnum");
            return (Criteria) this;
        }

        public Criteria andGetNewnumIn(List<BigDecimal> values) {
            addCriterion("GET_NEWNUM in", values, "getNewnum");
            return (Criteria) this;
        }

        public Criteria andGetNewnumNotIn(List<BigDecimal> values) {
            addCriterion("GET_NEWNUM not in", values, "getNewnum");
            return (Criteria) this;
        }

        public Criteria andGetNewnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GET_NEWNUM between", value1, value2, "getNewnum");
            return (Criteria) this;
        }

        public Criteria andGetNewnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GET_NEWNUM not between", value1, value2, "getNewnum");
            return (Criteria) this;
        }

        public Criteria andResponseAllnumIsNull() {
            addCriterion("RESPONSE_ALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andResponseAllnumIsNotNull() {
            addCriterion("RESPONSE_ALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andResponseAllnumEqualTo(BigDecimal value) {
            addCriterion("RESPONSE_ALLNUM =", value, "responseAllnum");
            return (Criteria) this;
        }

        public Criteria andResponseAllnumNotEqualTo(BigDecimal value) {
            addCriterion("RESPONSE_ALLNUM <>", value, "responseAllnum");
            return (Criteria) this;
        }

        public Criteria andResponseAllnumGreaterThan(BigDecimal value) {
            addCriterion("RESPONSE_ALLNUM >", value, "responseAllnum");
            return (Criteria) this;
        }

        public Criteria andResponseAllnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RESPONSE_ALLNUM >=", value, "responseAllnum");
            return (Criteria) this;
        }

        public Criteria andResponseAllnumLessThan(BigDecimal value) {
            addCriterion("RESPONSE_ALLNUM <", value, "responseAllnum");
            return (Criteria) this;
        }

        public Criteria andResponseAllnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RESPONSE_ALLNUM <=", value, "responseAllnum");
            return (Criteria) this;
        }

        public Criteria andResponseAllnumIn(List<BigDecimal> values) {
            addCriterion("RESPONSE_ALLNUM in", values, "responseAllnum");
            return (Criteria) this;
        }

        public Criteria andResponseAllnumNotIn(List<BigDecimal> values) {
            addCriterion("RESPONSE_ALLNUM not in", values, "responseAllnum");
            return (Criteria) this;
        }

        public Criteria andResponseAllnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESPONSE_ALLNUM between", value1, value2, "responseAllnum");
            return (Criteria) this;
        }

        public Criteria andResponseAllnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESPONSE_ALLNUM not between", value1, value2, "responseAllnum");
            return (Criteria) this;
        }

        public Criteria andResponseNewnumIsNull() {
            addCriterion("RESPONSE_NEWNUM is null");
            return (Criteria) this;
        }

        public Criteria andResponseNewnumIsNotNull() {
            addCriterion("RESPONSE_NEWNUM is not null");
            return (Criteria) this;
        }

        public Criteria andResponseNewnumEqualTo(BigDecimal value) {
            addCriterion("RESPONSE_NEWNUM =", value, "responseNewnum");
            return (Criteria) this;
        }

        public Criteria andResponseNewnumNotEqualTo(BigDecimal value) {
            addCriterion("RESPONSE_NEWNUM <>", value, "responseNewnum");
            return (Criteria) this;
        }

        public Criteria andResponseNewnumGreaterThan(BigDecimal value) {
            addCriterion("RESPONSE_NEWNUM >", value, "responseNewnum");
            return (Criteria) this;
        }

        public Criteria andResponseNewnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RESPONSE_NEWNUM >=", value, "responseNewnum");
            return (Criteria) this;
        }

        public Criteria andResponseNewnumLessThan(BigDecimal value) {
            addCriterion("RESPONSE_NEWNUM <", value, "responseNewnum");
            return (Criteria) this;
        }

        public Criteria andResponseNewnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RESPONSE_NEWNUM <=", value, "responseNewnum");
            return (Criteria) this;
        }

        public Criteria andResponseNewnumIn(List<BigDecimal> values) {
            addCriterion("RESPONSE_NEWNUM in", values, "responseNewnum");
            return (Criteria) this;
        }

        public Criteria andResponseNewnumNotIn(List<BigDecimal> values) {
            addCriterion("RESPONSE_NEWNUM not in", values, "responseNewnum");
            return (Criteria) this;
        }

        public Criteria andResponseNewnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESPONSE_NEWNUM between", value1, value2, "responseNewnum");
            return (Criteria) this;
        }

        public Criteria andResponseNewnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESPONSE_NEWNUM not between", value1, value2, "responseNewnum");
            return (Criteria) this;
        }

        public Criteria andOtherAllnumIsNull() {
            addCriterion("OTHER_ALLNUM is null");
            return (Criteria) this;
        }

        public Criteria andOtherAllnumIsNotNull() {
            addCriterion("OTHER_ALLNUM is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAllnumEqualTo(BigDecimal value) {
            addCriterion("OTHER_ALLNUM =", value, "otherAllnum");
            return (Criteria) this;
        }

        public Criteria andOtherAllnumNotEqualTo(BigDecimal value) {
            addCriterion("OTHER_ALLNUM <>", value, "otherAllnum");
            return (Criteria) this;
        }

        public Criteria andOtherAllnumGreaterThan(BigDecimal value) {
            addCriterion("OTHER_ALLNUM >", value, "otherAllnum");
            return (Criteria) this;
        }

        public Criteria andOtherAllnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_ALLNUM >=", value, "otherAllnum");
            return (Criteria) this;
        }

        public Criteria andOtherAllnumLessThan(BigDecimal value) {
            addCriterion("OTHER_ALLNUM <", value, "otherAllnum");
            return (Criteria) this;
        }

        public Criteria andOtherAllnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_ALLNUM <=", value, "otherAllnum");
            return (Criteria) this;
        }

        public Criteria andOtherAllnumIn(List<BigDecimal> values) {
            addCriterion("OTHER_ALLNUM in", values, "otherAllnum");
            return (Criteria) this;
        }

        public Criteria andOtherAllnumNotIn(List<BigDecimal> values) {
            addCriterion("OTHER_ALLNUM not in", values, "otherAllnum");
            return (Criteria) this;
        }

        public Criteria andOtherAllnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_ALLNUM between", value1, value2, "otherAllnum");
            return (Criteria) this;
        }

        public Criteria andOtherAllnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_ALLNUM not between", value1, value2, "otherAllnum");
            return (Criteria) this;
        }

        public Criteria andOtherNewnumIsNull() {
            addCriterion("OTHER_NEWNUM is null");
            return (Criteria) this;
        }

        public Criteria andOtherNewnumIsNotNull() {
            addCriterion("OTHER_NEWNUM is not null");
            return (Criteria) this;
        }

        public Criteria andOtherNewnumEqualTo(BigDecimal value) {
            addCriterion("OTHER_NEWNUM =", value, "otherNewnum");
            return (Criteria) this;
        }

        public Criteria andOtherNewnumNotEqualTo(BigDecimal value) {
            addCriterion("OTHER_NEWNUM <>", value, "otherNewnum");
            return (Criteria) this;
        }

        public Criteria andOtherNewnumGreaterThan(BigDecimal value) {
            addCriterion("OTHER_NEWNUM >", value, "otherNewnum");
            return (Criteria) this;
        }

        public Criteria andOtherNewnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_NEWNUM >=", value, "otherNewnum");
            return (Criteria) this;
        }

        public Criteria andOtherNewnumLessThan(BigDecimal value) {
            addCriterion("OTHER_NEWNUM <", value, "otherNewnum");
            return (Criteria) this;
        }

        public Criteria andOtherNewnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_NEWNUM <=", value, "otherNewnum");
            return (Criteria) this;
        }

        public Criteria andOtherNewnumIn(List<BigDecimal> values) {
            addCriterion("OTHER_NEWNUM in", values, "otherNewnum");
            return (Criteria) this;
        }

        public Criteria andOtherNewnumNotIn(List<BigDecimal> values) {
            addCriterion("OTHER_NEWNUM not in", values, "otherNewnum");
            return (Criteria) this;
        }

        public Criteria andOtherNewnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_NEWNUM between", value1, value2, "otherNewnum");
            return (Criteria) this;
        }

        public Criteria andOtherNewnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_NEWNUM not between", value1, value2, "otherNewnum");
            return (Criteria) this;
        }

        public Criteria andRealnicmacIsNull() {
            addCriterion("REALNICMAC is null");
            return (Criteria) this;
        }

        public Criteria andRealnicmacIsNotNull() {
            addCriterion("REALNICMAC is not null");
            return (Criteria) this;
        }

        public Criteria andRealnicmacEqualTo(String value) {
            addCriterion("REALNICMAC =", value, "realnicmac");
            return (Criteria) this;
        }

        public Criteria andRealnicmacNotEqualTo(String value) {
            addCriterion("REALNICMAC <>", value, "realnicmac");
            return (Criteria) this;
        }

        public Criteria andRealnicmacGreaterThan(String value) {
            addCriterion("REALNICMAC >", value, "realnicmac");
            return (Criteria) this;
        }

        public Criteria andRealnicmacGreaterThanOrEqualTo(String value) {
            addCriterion("REALNICMAC >=", value, "realnicmac");
            return (Criteria) this;
        }

        public Criteria andRealnicmacLessThan(String value) {
            addCriterion("REALNICMAC <", value, "realnicmac");
            return (Criteria) this;
        }

        public Criteria andRealnicmacLessThanOrEqualTo(String value) {
            addCriterion("REALNICMAC <=", value, "realnicmac");
            return (Criteria) this;
        }

        public Criteria andRealnicmacLike(String value) {
            addCriterion("REALNICMAC like", value, "realnicmac");
            return (Criteria) this;
        }

        public Criteria andRealnicmacNotLike(String value) {
            addCriterion("REALNICMAC not like", value, "realnicmac");
            return (Criteria) this;
        }

        public Criteria andRealnicmacIn(List<String> values) {
            addCriterion("REALNICMAC in", values, "realnicmac");
            return (Criteria) this;
        }

        public Criteria andRealnicmacNotIn(List<String> values) {
            addCriterion("REALNICMAC not in", values, "realnicmac");
            return (Criteria) this;
        }

        public Criteria andRealnicmacBetween(String value1, String value2) {
            addCriterion("REALNICMAC between", value1, value2, "realnicmac");
            return (Criteria) this;
        }

        public Criteria andRealnicmacNotBetween(String value1, String value2) {
            addCriterion("REALNICMAC not between", value1, value2, "realnicmac");
            return (Criteria) this;
        }

        public Criteria andNetworkCardIsNull() {
            addCriterion("NETWORK_CARD is null");
            return (Criteria) this;
        }

        public Criteria andNetworkCardIsNotNull() {
            addCriterion("NETWORK_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkCardEqualTo(String value) {
            addCriterion("NETWORK_CARD =", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardNotEqualTo(String value) {
            addCriterion("NETWORK_CARD <>", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardGreaterThan(String value) {
            addCriterion("NETWORK_CARD >", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORK_CARD >=", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardLessThan(String value) {
            addCriterion("NETWORK_CARD <", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardLessThanOrEqualTo(String value) {
            addCriterion("NETWORK_CARD <=", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardLike(String value) {
            addCriterion("NETWORK_CARD like", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardNotLike(String value) {
            addCriterion("NETWORK_CARD not like", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardIn(List<String> values) {
            addCriterion("NETWORK_CARD in", values, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardNotIn(List<String> values) {
            addCriterion("NETWORK_CARD not in", values, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardBetween(String value1, String value2) {
            addCriterion("NETWORK_CARD between", value1, value2, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardNotBetween(String value1, String value2) {
            addCriterion("NETWORK_CARD not between", value1, value2, "networkCard");
            return (Criteria) this;
        }

        public Criteria andPcnameIsNull() {
            addCriterion("PCNAME is null");
            return (Criteria) this;
        }

        public Criteria andPcnameIsNotNull() {
            addCriterion("PCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPcnameEqualTo(String value) {
            addCriterion("PCNAME =", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameNotEqualTo(String value) {
            addCriterion("PCNAME <>", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameGreaterThan(String value) {
            addCriterion("PCNAME >", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameGreaterThanOrEqualTo(String value) {
            addCriterion("PCNAME >=", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameLessThan(String value) {
            addCriterion("PCNAME <", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameLessThanOrEqualTo(String value) {
            addCriterion("PCNAME <=", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameLike(String value) {
            addCriterion("PCNAME like", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameNotLike(String value) {
            addCriterion("PCNAME not like", value, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameIn(List<String> values) {
            addCriterion("PCNAME in", values, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameNotIn(List<String> values) {
            addCriterion("PCNAME not in", values, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameBetween(String value1, String value2) {
            addCriterion("PCNAME between", value1, value2, "pcname");
            return (Criteria) this;
        }

        public Criteria andPcnameNotBetween(String value1, String value2) {
            addCriterion("PCNAME not between", value1, value2, "pcname");
            return (Criteria) this;
        }

        public Criteria andF2versionIsNull() {
            addCriterion("F2VERSION is null");
            return (Criteria) this;
        }

        public Criteria andF2versionIsNotNull() {
            addCriterion("F2VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andF2versionEqualTo(String value) {
            addCriterion("F2VERSION =", value, "f2version");
            return (Criteria) this;
        }

        public Criteria andF2versionNotEqualTo(String value) {
            addCriterion("F2VERSION <>", value, "f2version");
            return (Criteria) this;
        }

        public Criteria andF2versionGreaterThan(String value) {
            addCriterion("F2VERSION >", value, "f2version");
            return (Criteria) this;
        }

        public Criteria andF2versionGreaterThanOrEqualTo(String value) {
            addCriterion("F2VERSION >=", value, "f2version");
            return (Criteria) this;
        }

        public Criteria andF2versionLessThan(String value) {
            addCriterion("F2VERSION <", value, "f2version");
            return (Criteria) this;
        }

        public Criteria andF2versionLessThanOrEqualTo(String value) {
            addCriterion("F2VERSION <=", value, "f2version");
            return (Criteria) this;
        }

        public Criteria andF2versionLike(String value) {
            addCriterion("F2VERSION like", value, "f2version");
            return (Criteria) this;
        }

        public Criteria andF2versionNotLike(String value) {
            addCriterion("F2VERSION not like", value, "f2version");
            return (Criteria) this;
        }

        public Criteria andF2versionIn(List<String> values) {
            addCriterion("F2VERSION in", values, "f2version");
            return (Criteria) this;
        }

        public Criteria andF2versionNotIn(List<String> values) {
            addCriterion("F2VERSION not in", values, "f2version");
            return (Criteria) this;
        }

        public Criteria andF2versionBetween(String value1, String value2) {
            addCriterion("F2VERSION between", value1, value2, "f2version");
            return (Criteria) this;
        }

        public Criteria andF2versionNotBetween(String value1, String value2) {
            addCriterion("F2VERSION not between", value1, value2, "f2version");
            return (Criteria) this;
        }

        public Criteria andAccessmodeIsNull() {
            addCriterion("ACCESSMODE is null");
            return (Criteria) this;
        }

        public Criteria andAccessmodeIsNotNull() {
            addCriterion("ACCESSMODE is not null");
            return (Criteria) this;
        }

        public Criteria andAccessmodeEqualTo(String value) {
            addCriterion("ACCESSMODE =", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeNotEqualTo(String value) {
            addCriterion("ACCESSMODE <>", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeGreaterThan(String value) {
            addCriterion("ACCESSMODE >", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESSMODE >=", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeLessThan(String value) {
            addCriterion("ACCESSMODE <", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeLessThanOrEqualTo(String value) {
            addCriterion("ACCESSMODE <=", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeLike(String value) {
            addCriterion("ACCESSMODE like", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeNotLike(String value) {
            addCriterion("ACCESSMODE not like", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeIn(List<String> values) {
            addCriterion("ACCESSMODE in", values, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeNotIn(List<String> values) {
            addCriterion("ACCESSMODE not in", values, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeBetween(String value1, String value2) {
            addCriterion("ACCESSMODE between", value1, value2, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeNotBetween(String value1, String value2) {
            addCriterion("ACCESSMODE not between", value1, value2, "accessmode");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNull() {
            addCriterion("BROWSER is null");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNotNull() {
            addCriterion("BROWSER is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserEqualTo(String value) {
            addCriterion("BROWSER =", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotEqualTo(String value) {
            addCriterion("BROWSER <>", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThan(String value) {
            addCriterion("BROWSER >", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThanOrEqualTo(String value) {
            addCriterion("BROWSER >=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThan(String value) {
            addCriterion("BROWSER <", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThanOrEqualTo(String value) {
            addCriterion("BROWSER <=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLike(String value) {
            addCriterion("BROWSER like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotLike(String value) {
            addCriterion("BROWSER not like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserIn(List<String> values) {
            addCriterion("BROWSER in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotIn(List<String> values) {
            addCriterion("BROWSER not in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserBetween(String value1, String value2) {
            addCriterion("BROWSER between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotBetween(String value1, String value2) {
            addCriterion("BROWSER not between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andSysteminfoIsNull() {
            addCriterion("SYSTEMINFO is null");
            return (Criteria) this;
        }

        public Criteria andSysteminfoIsNotNull() {
            addCriterion("SYSTEMINFO is not null");
            return (Criteria) this;
        }

        public Criteria andSysteminfoEqualTo(String value) {
            addCriterion("SYSTEMINFO =", value, "systeminfo");
            return (Criteria) this;
        }

        public Criteria andSysteminfoNotEqualTo(String value) {
            addCriterion("SYSTEMINFO <>", value, "systeminfo");
            return (Criteria) this;
        }

        public Criteria andSysteminfoGreaterThan(String value) {
            addCriterion("SYSTEMINFO >", value, "systeminfo");
            return (Criteria) this;
        }

        public Criteria andSysteminfoGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEMINFO >=", value, "systeminfo");
            return (Criteria) this;
        }

        public Criteria andSysteminfoLessThan(String value) {
            addCriterion("SYSTEMINFO <", value, "systeminfo");
            return (Criteria) this;
        }

        public Criteria andSysteminfoLessThanOrEqualTo(String value) {
            addCriterion("SYSTEMINFO <=", value, "systeminfo");
            return (Criteria) this;
        }

        public Criteria andSysteminfoLike(String value) {
            addCriterion("SYSTEMINFO like", value, "systeminfo");
            return (Criteria) this;
        }

        public Criteria andSysteminfoNotLike(String value) {
            addCriterion("SYSTEMINFO not like", value, "systeminfo");
            return (Criteria) this;
        }

        public Criteria andSysteminfoIn(List<String> values) {
            addCriterion("SYSTEMINFO in", values, "systeminfo");
            return (Criteria) this;
        }

        public Criteria andSysteminfoNotIn(List<String> values) {
            addCriterion("SYSTEMINFO not in", values, "systeminfo");
            return (Criteria) this;
        }

        public Criteria andSysteminfoBetween(String value1, String value2) {
            addCriterion("SYSTEMINFO between", value1, value2, "systeminfo");
            return (Criteria) this;
        }

        public Criteria andSysteminfoNotBetween(String value1, String value2) {
            addCriterion("SYSTEMINFO not between", value1, value2, "systeminfo");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNull() {
            addCriterion("IPADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNotNull() {
            addCriterion("IPADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddressEqualTo(Long value) {
            addCriterion("IPADDRESS =", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotEqualTo(Long value) {
            addCriterion("IPADDRESS <>", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThan(Long value) {
            addCriterion("IPADDRESS >", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThanOrEqualTo(Long value) {
            addCriterion("IPADDRESS >=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThan(Long value) {
            addCriterion("IPADDRESS <", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThanOrEqualTo(Long value) {
            addCriterion("IPADDRESS <=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressIn(List<Long> values) {
            addCriterion("IPADDRESS in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotIn(List<Long> values) {
            addCriterion("IPADDRESS not in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressBetween(Long value1, Long value2) {
            addCriterion("IPADDRESS between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotBetween(Long value1, Long value2) {
            addCriterion("IPADDRESS not between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Long value) {
            addCriterion("TIMESTAMP =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Long value) {
            addCriterion("TIMESTAMP <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Long value) {
            addCriterion("TIMESTAMP >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMESTAMP >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Long value) {
            addCriterion("TIMESTAMP <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Long value) {
            addCriterion("TIMESTAMP <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Long> values) {
            addCriterion("TIMESTAMP in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Long> values) {
            addCriterion("TIMESTAMP not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Long value1, Long value2) {
            addCriterion("TIMESTAMP between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Long value1, Long value2) {
            addCriterion("TIMESTAMP not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andServerNoIsNull() {
            addCriterion("SERVER_NO is null");
            return (Criteria) this;
        }

        public Criteria andServerNoIsNotNull() {
            addCriterion("SERVER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andServerNoEqualTo(String value) {
            addCriterion("SERVER_NO =", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoNotEqualTo(String value) {
            addCriterion("SERVER_NO <>", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoGreaterThan(String value) {
            addCriterion("SERVER_NO >", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_NO >=", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoLessThan(String value) {
            addCriterion("SERVER_NO <", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoLessThanOrEqualTo(String value) {
            addCriterion("SERVER_NO <=", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoLike(String value) {
            addCriterion("SERVER_NO like", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoNotLike(String value) {
            addCriterion("SERVER_NO not like", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoIn(List<String> values) {
            addCriterion("SERVER_NO in", values, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoNotIn(List<String> values) {
            addCriterion("SERVER_NO not in", values, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoBetween(String value1, String value2) {
            addCriterion("SERVER_NO between", value1, value2, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoNotBetween(String value1, String value2) {
            addCriterion("SERVER_NO not between", value1, value2, "serverNo");
            return (Criteria) this;
        }

        public Criteria andF2ipIsNull() {
            addCriterion("F2IP is null");
            return (Criteria) this;
        }

        public Criteria andF2ipIsNotNull() {
            addCriterion("F2IP is not null");
            return (Criteria) this;
        }

        public Criteria andF2ipEqualTo(Long value) {
            addCriterion("F2IP =", value, "f2ip");
            return (Criteria) this;
        }

        public Criteria andF2ipNotEqualTo(Long value) {
            addCriterion("F2IP <>", value, "f2ip");
            return (Criteria) this;
        }

        public Criteria andF2ipGreaterThan(Long value) {
            addCriterion("F2IP >", value, "f2ip");
            return (Criteria) this;
        }

        public Criteria andF2ipGreaterThanOrEqualTo(Long value) {
            addCriterion("F2IP >=", value, "f2ip");
            return (Criteria) this;
        }

        public Criteria andF2ipLessThan(Long value) {
            addCriterion("F2IP <", value, "f2ip");
            return (Criteria) this;
        }

        public Criteria andF2ipLessThanOrEqualTo(Long value) {
            addCriterion("F2IP <=", value, "f2ip");
            return (Criteria) this;
        }

        public Criteria andF2ipIn(List<Long> values) {
            addCriterion("F2IP in", values, "f2ip");
            return (Criteria) this;
        }

        public Criteria andF2ipNotIn(List<Long> values) {
            addCriterion("F2IP not in", values, "f2ip");
            return (Criteria) this;
        }

        public Criteria andF2ipBetween(Long value1, Long value2) {
            addCriterion("F2IP between", value1, value2, "f2ip");
            return (Criteria) this;
        }

        public Criteria andF2ipNotBetween(Long value1, Long value2) {
            addCriterion("F2IP not between", value1, value2, "f2ip");
            return (Criteria) this;
        }

        public Criteria andCaptureTimeIsNull() {
            addCriterion("CAPTURE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCaptureTimeIsNotNull() {
            addCriterion("CAPTURE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCaptureTimeEqualTo(Date value) {
            addCriterion("CAPTURE_TIME =", value, "captureTime");
            return (Criteria) this;
        }

        public Criteria andCaptureTimeNotEqualTo(Date value) {
            addCriterion("CAPTURE_TIME <>", value, "captureTime");
            return (Criteria) this;
        }

        public Criteria andCaptureTimeGreaterThan(Date value) {
            addCriterion("CAPTURE_TIME >", value, "captureTime");
            return (Criteria) this;
        }

        public Criteria andCaptureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CAPTURE_TIME >=", value, "captureTime");
            return (Criteria) this;
        }

        public Criteria andCaptureTimeLessThan(Date value) {
            addCriterion("CAPTURE_TIME <", value, "captureTime");
            return (Criteria) this;
        }

        public Criteria andCaptureTimeLessThanOrEqualTo(Date value) {
            addCriterion("CAPTURE_TIME <=", value, "captureTime");
            return (Criteria) this;
        }

        public Criteria andCaptureTimeIn(List<Date> values) {
            addCriterion("CAPTURE_TIME in", values, "captureTime");
            return (Criteria) this;
        }

        public Criteria andCaptureTimeNotIn(List<Date> values) {
            addCriterion("CAPTURE_TIME not in", values, "captureTime");
            return (Criteria) this;
        }

        public Criteria andCaptureTimeBetween(Date value1, Date value2) {
            addCriterion("CAPTURE_TIME between", value1, value2, "captureTime");
            return (Criteria) this;
        }

        public Criteria andCaptureTimeNotBetween(Date value1, Date value2) {
            addCriterion("CAPTURE_TIME not between", value1, value2, "captureTime");
            return (Criteria) this;
        }

        public Criteria andRestoreTimeIsNull() {
            addCriterion("RESTORE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRestoreTimeIsNotNull() {
            addCriterion("RESTORE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRestoreTimeEqualTo(Date value) {
            addCriterion("RESTORE_TIME =", value, "restoreTime");
            return (Criteria) this;
        }

        public Criteria andRestoreTimeNotEqualTo(Date value) {
            addCriterion("RESTORE_TIME <>", value, "restoreTime");
            return (Criteria) this;
        }

        public Criteria andRestoreTimeGreaterThan(Date value) {
            addCriterion("RESTORE_TIME >", value, "restoreTime");
            return (Criteria) this;
        }

        public Criteria andRestoreTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RESTORE_TIME >=", value, "restoreTime");
            return (Criteria) this;
        }

        public Criteria andRestoreTimeLessThan(Date value) {
            addCriterion("RESTORE_TIME <", value, "restoreTime");
            return (Criteria) this;
        }

        public Criteria andRestoreTimeLessThanOrEqualTo(Date value) {
            addCriterion("RESTORE_TIME <=", value, "restoreTime");
            return (Criteria) this;
        }

        public Criteria andRestoreTimeIn(List<Date> values) {
            addCriterion("RESTORE_TIME in", values, "restoreTime");
            return (Criteria) this;
        }

        public Criteria andRestoreTimeNotIn(List<Date> values) {
            addCriterion("RESTORE_TIME not in", values, "restoreTime");
            return (Criteria) this;
        }

        public Criteria andRestoreTimeBetween(Date value1, Date value2) {
            addCriterion("RESTORE_TIME between", value1, value2, "restoreTime");
            return (Criteria) this;
        }

        public Criteria andRestoreTimeNotBetween(Date value1, Date value2) {
            addCriterion("RESTORE_TIME not between", value1, value2, "restoreTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDevNoIsNull() {
            addCriterion("DEV_NO is null");
            return (Criteria) this;
        }

        public Criteria andDevNoIsNotNull() {
            addCriterion("DEV_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDevNoEqualTo(String value) {
            addCriterion("DEV_NO =", value, "devNo");
            return (Criteria) this;
        }

        public Criteria andDevNoNotEqualTo(String value) {
            addCriterion("DEV_NO <>", value, "devNo");
            return (Criteria) this;
        }

        public Criteria andDevNoGreaterThan(String value) {
            addCriterion("DEV_NO >", value, "devNo");
            return (Criteria) this;
        }

        public Criteria andDevNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEV_NO >=", value, "devNo");
            return (Criteria) this;
        }

        public Criteria andDevNoLessThan(String value) {
            addCriterion("DEV_NO <", value, "devNo");
            return (Criteria) this;
        }

        public Criteria andDevNoLessThanOrEqualTo(String value) {
            addCriterion("DEV_NO <=", value, "devNo");
            return (Criteria) this;
        }

        public Criteria andDevNoLike(String value) {
            addCriterion("DEV_NO like", value, "devNo");
            return (Criteria) this;
        }

        public Criteria andDevNoNotLike(String value) {
            addCriterion("DEV_NO not like", value, "devNo");
            return (Criteria) this;
        }

        public Criteria andDevNoIn(List<String> values) {
            addCriterion("DEV_NO in", values, "devNo");
            return (Criteria) this;
        }

        public Criteria andDevNoNotIn(List<String> values) {
            addCriterion("DEV_NO not in", values, "devNo");
            return (Criteria) this;
        }

        public Criteria andDevNoBetween(String value1, String value2) {
            addCriterion("DEV_NO between", value1, value2, "devNo");
            return (Criteria) this;
        }

        public Criteria andDevNoNotBetween(String value1, String value2) {
            addCriterion("DEV_NO not between", value1, value2, "devNo");
            return (Criteria) this;
        }

        public Criteria andSlocationIsNull() {
            addCriterion("SLOCATION is null");
            return (Criteria) this;
        }

        public Criteria andSlocationIsNotNull() {
            addCriterion("SLOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andSlocationEqualTo(String value) {
            addCriterion("SLOCATION =", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationNotEqualTo(String value) {
            addCriterion("SLOCATION <>", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationGreaterThan(String value) {
            addCriterion("SLOCATION >", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationGreaterThanOrEqualTo(String value) {
            addCriterion("SLOCATION >=", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationLessThan(String value) {
            addCriterion("SLOCATION <", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationLessThanOrEqualTo(String value) {
            addCriterion("SLOCATION <=", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationLike(String value) {
            addCriterion("SLOCATION like", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationNotLike(String value) {
            addCriterion("SLOCATION not like", value, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationIn(List<String> values) {
            addCriterion("SLOCATION in", values, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationNotIn(List<String> values) {
            addCriterion("SLOCATION not in", values, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationBetween(String value1, String value2) {
            addCriterion("SLOCATION between", value1, value2, "slocation");
            return (Criteria) this;
        }

        public Criteria andSlocationNotBetween(String value1, String value2) {
            addCriterion("SLOCATION not between", value1, value2, "slocation");
            return (Criteria) this;
        }

        public Criteria andLocInfoTimeIsNull() {
            addCriterion("LOC_INFO_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLocInfoTimeIsNotNull() {
            addCriterion("LOC_INFO_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLocInfoTimeEqualTo(Date value) {
            addCriterion("LOC_INFO_TIME =", value, "locInfoTime");
            return (Criteria) this;
        }

        public Criteria andLocInfoTimeNotEqualTo(Date value) {
            addCriterion("LOC_INFO_TIME <>", value, "locInfoTime");
            return (Criteria) this;
        }

        public Criteria andLocInfoTimeGreaterThan(Date value) {
            addCriterion("LOC_INFO_TIME >", value, "locInfoTime");
            return (Criteria) this;
        }

        public Criteria andLocInfoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOC_INFO_TIME >=", value, "locInfoTime");
            return (Criteria) this;
        }

        public Criteria andLocInfoTimeLessThan(Date value) {
            addCriterion("LOC_INFO_TIME <", value, "locInfoTime");
            return (Criteria) this;
        }

        public Criteria andLocInfoTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOC_INFO_TIME <=", value, "locInfoTime");
            return (Criteria) this;
        }

        public Criteria andLocInfoTimeIn(List<Date> values) {
            addCriterion("LOC_INFO_TIME in", values, "locInfoTime");
            return (Criteria) this;
        }

        public Criteria andLocInfoTimeNotIn(List<Date> values) {
            addCriterion("LOC_INFO_TIME not in", values, "locInfoTime");
            return (Criteria) this;
        }

        public Criteria andLocInfoTimeBetween(Date value1, Date value2) {
            addCriterion("LOC_INFO_TIME between", value1, value2, "locInfoTime");
            return (Criteria) this;
        }

        public Criteria andLocInfoTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOC_INFO_TIME not between", value1, value2, "locInfoTime");
            return (Criteria) this;
        }

        public Criteria andAccessWayIsNull() {
            addCriterion("ACCESS_WAY is null");
            return (Criteria) this;
        }

        public Criteria andAccessWayIsNotNull() {
            addCriterion("ACCESS_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andAccessWayEqualTo(Long value) {
            addCriterion("ACCESS_WAY =", value, "accessWay");
            return (Criteria) this;
        }

        public Criteria andAccessWayNotEqualTo(Long value) {
            addCriterion("ACCESS_WAY <>", value, "accessWay");
            return (Criteria) this;
        }

        public Criteria andAccessWayGreaterThan(Long value) {
            addCriterion("ACCESS_WAY >", value, "accessWay");
            return (Criteria) this;
        }

        public Criteria andAccessWayGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCESS_WAY >=", value, "accessWay");
            return (Criteria) this;
        }

        public Criteria andAccessWayLessThan(Long value) {
            addCriterion("ACCESS_WAY <", value, "accessWay");
            return (Criteria) this;
        }

        public Criteria andAccessWayLessThanOrEqualTo(Long value) {
            addCriterion("ACCESS_WAY <=", value, "accessWay");
            return (Criteria) this;
        }

        public Criteria andAccessWayIn(List<Long> values) {
            addCriterion("ACCESS_WAY in", values, "accessWay");
            return (Criteria) this;
        }

        public Criteria andAccessWayNotIn(List<Long> values) {
            addCriterion("ACCESS_WAY not in", values, "accessWay");
            return (Criteria) this;
        }

        public Criteria andAccessWayBetween(Long value1, Long value2) {
            addCriterion("ACCESS_WAY between", value1, value2, "accessWay");
            return (Criteria) this;
        }

        public Criteria andAccessWayNotBetween(Long value1, Long value2) {
            addCriterion("ACCESS_WAY not between", value1, value2, "accessWay");
            return (Criteria) this;
        }

        public Criteria andImsiIsNull() {
            addCriterion("IMSI is null");
            return (Criteria) this;
        }

        public Criteria andImsiIsNotNull() {
            addCriterion("IMSI is not null");
            return (Criteria) this;
        }

        public Criteria andImsiEqualTo(String value) {
            addCriterion("IMSI =", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotEqualTo(String value) {
            addCriterion("IMSI <>", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThan(String value) {
            addCriterion("IMSI >", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThanOrEqualTo(String value) {
            addCriterion("IMSI >=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThan(String value) {
            addCriterion("IMSI <", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThanOrEqualTo(String value) {
            addCriterion("IMSI <=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLike(String value) {
            addCriterion("IMSI like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotLike(String value) {
            addCriterion("IMSI not like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiIn(List<String> values) {
            addCriterion("IMSI in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotIn(List<String> values) {
            addCriterion("IMSI not in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiBetween(String value1, String value2) {
            addCriterion("IMSI between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotBetween(String value1, String value2) {
            addCriterion("IMSI not between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andMsisdnIsNull() {
            addCriterion("MSISDN is null");
            return (Criteria) this;
        }

        public Criteria andMsisdnIsNotNull() {
            addCriterion("MSISDN is not null");
            return (Criteria) this;
        }

        public Criteria andMsisdnEqualTo(String value) {
            addCriterion("MSISDN =", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnNotEqualTo(String value) {
            addCriterion("MSISDN <>", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnGreaterThan(String value) {
            addCriterion("MSISDN >", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnGreaterThanOrEqualTo(String value) {
            addCriterion("MSISDN >=", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnLessThan(String value) {
            addCriterion("MSISDN <", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnLessThanOrEqualTo(String value) {
            addCriterion("MSISDN <=", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnLike(String value) {
            addCriterion("MSISDN like", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnNotLike(String value) {
            addCriterion("MSISDN not like", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnIn(List<String> values) {
            addCriterion("MSISDN in", values, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnNotIn(List<String> values) {
            addCriterion("MSISDN not in", values, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnBetween(String value1, String value2) {
            addCriterion("MSISDN between", value1, value2, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnNotBetween(String value1, String value2) {
            addCriterion("MSISDN not between", value1, value2, "msisdn");
            return (Criteria) this;
        }

        public Criteria andLocInfoContentidIsNull() {
            addCriterion("LOC_INFO_CONTENTID is null");
            return (Criteria) this;
        }

        public Criteria andLocInfoContentidIsNotNull() {
            addCriterion("LOC_INFO_CONTENTID is not null");
            return (Criteria) this;
        }

        public Criteria andLocInfoContentidEqualTo(BigDecimal value) {
            addCriterion("LOC_INFO_CONTENTID =", value, "locInfoContentid");
            return (Criteria) this;
        }

        public Criteria andLocInfoContentidNotEqualTo(BigDecimal value) {
            addCriterion("LOC_INFO_CONTENTID <>", value, "locInfoContentid");
            return (Criteria) this;
        }

        public Criteria andLocInfoContentidGreaterThan(BigDecimal value) {
            addCriterion("LOC_INFO_CONTENTID >", value, "locInfoContentid");
            return (Criteria) this;
        }

        public Criteria andLocInfoContentidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOC_INFO_CONTENTID >=", value, "locInfoContentid");
            return (Criteria) this;
        }

        public Criteria andLocInfoContentidLessThan(BigDecimal value) {
            addCriterion("LOC_INFO_CONTENTID <", value, "locInfoContentid");
            return (Criteria) this;
        }

        public Criteria andLocInfoContentidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOC_INFO_CONTENTID <=", value, "locInfoContentid");
            return (Criteria) this;
        }

        public Criteria andLocInfoContentidIn(List<BigDecimal> values) {
            addCriterion("LOC_INFO_CONTENTID in", values, "locInfoContentid");
            return (Criteria) this;
        }

        public Criteria andLocInfoContentidNotIn(List<BigDecimal> values) {
            addCriterion("LOC_INFO_CONTENTID not in", values, "locInfoContentid");
            return (Criteria) this;
        }

        public Criteria andLocInfoContentidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOC_INFO_CONTENTID between", value1, value2, "locInfoContentid");
            return (Criteria) this;
        }

        public Criteria andLocInfoContentidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOC_INFO_CONTENTID not between", value1, value2, "locInfoContentid");
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