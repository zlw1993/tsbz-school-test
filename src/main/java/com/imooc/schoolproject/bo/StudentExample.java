package com.imooc.schoolproject.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andXjhIsNull() {
            addCriterion("XJH is null");
            return (Criteria) this;
        }

        public Criteria andXjhIsNotNull() {
            addCriterion("XJH is not null");
            return (Criteria) this;
        }

        public Criteria andXjhEqualTo(String value) {
            addCriterion("XJH =", value, "xjh");
            return (Criteria) this;
        }

        public Criteria andXjhNotEqualTo(String value) {
            addCriterion("XJH <>", value, "xjh");
            return (Criteria) this;
        }

        public Criteria andXjhGreaterThan(String value) {
            addCriterion("XJH >", value, "xjh");
            return (Criteria) this;
        }

        public Criteria andXjhGreaterThanOrEqualTo(String value) {
            addCriterion("XJH >=", value, "xjh");
            return (Criteria) this;
        }

        public Criteria andXjhLessThan(String value) {
            addCriterion("XJH <", value, "xjh");
            return (Criteria) this;
        }

        public Criteria andXjhLessThanOrEqualTo(String value) {
            addCriterion("XJH <=", value, "xjh");
            return (Criteria) this;
        }

        public Criteria andXjhLike(String value) {
            addCriterion("XJH like", value, "xjh");
            return (Criteria) this;
        }

        public Criteria andXjhNotLike(String value) {
            addCriterion("XJH not like", value, "xjh");
            return (Criteria) this;
        }

        public Criteria andXjhIn(List<String> values) {
            addCriterion("XJH in", values, "xjh");
            return (Criteria) this;
        }

        public Criteria andXjhNotIn(List<String> values) {
            addCriterion("XJH not in", values, "xjh");
            return (Criteria) this;
        }

        public Criteria andXjhBetween(String value1, String value2) {
            addCriterion("XJH between", value1, value2, "xjh");
            return (Criteria) this;
        }

        public Criteria andXjhNotBetween(String value1, String value2) {
            addCriterion("XJH not between", value1, value2, "xjh");
            return (Criteria) this;
        }

        public Criteria andXxdmIsNull() {
            addCriterion("XXDM is null");
            return (Criteria) this;
        }

        public Criteria andXxdmIsNotNull() {
            addCriterion("XXDM is not null");
            return (Criteria) this;
        }

        public Criteria andXxdmEqualTo(String value) {
            addCriterion("XXDM =", value, "xxdm");
            return (Criteria) this;
        }

        public Criteria andXxdmNotEqualTo(String value) {
            addCriterion("XXDM <>", value, "xxdm");
            return (Criteria) this;
        }

        public Criteria andXxdmGreaterThan(String value) {
            addCriterion("XXDM >", value, "xxdm");
            return (Criteria) this;
        }

        public Criteria andXxdmGreaterThanOrEqualTo(String value) {
            addCriterion("XXDM >=", value, "xxdm");
            return (Criteria) this;
        }

        public Criteria andXxdmLessThan(String value) {
            addCriterion("XXDM <", value, "xxdm");
            return (Criteria) this;
        }

        public Criteria andXxdmLessThanOrEqualTo(String value) {
            addCriterion("XXDM <=", value, "xxdm");
            return (Criteria) this;
        }

        public Criteria andXxdmLike(String value) {
            addCriterion("XXDM like", value, "xxdm");
            return (Criteria) this;
        }

        public Criteria andXxdmNotLike(String value) {
            addCriterion("XXDM not like", value, "xxdm");
            return (Criteria) this;
        }

        public Criteria andXxdmIn(List<String> values) {
            addCriterion("XXDM in", values, "xxdm");
            return (Criteria) this;
        }

        public Criteria andXxdmNotIn(List<String> values) {
            addCriterion("XXDM not in", values, "xxdm");
            return (Criteria) this;
        }

        public Criteria andXxdmBetween(String value1, String value2) {
            addCriterion("XXDM between", value1, value2, "xxdm");
            return (Criteria) this;
        }

        public Criteria andXxdmNotBetween(String value1, String value2) {
            addCriterion("XXDM not between", value1, value2, "xxdm");
            return (Criteria) this;
        }

        public Criteria andNjidIsNull() {
            addCriterion("NJID is null");
            return (Criteria) this;
        }

        public Criteria andNjidIsNotNull() {
            addCriterion("NJID is not null");
            return (Criteria) this;
        }

        public Criteria andNjidEqualTo(String value) {
            addCriterion("NJID =", value, "njid");
            return (Criteria) this;
        }

        public Criteria andNjidNotEqualTo(String value) {
            addCriterion("NJID <>", value, "njid");
            return (Criteria) this;
        }

        public Criteria andNjidGreaterThan(String value) {
            addCriterion("NJID >", value, "njid");
            return (Criteria) this;
        }

        public Criteria andNjidGreaterThanOrEqualTo(String value) {
            addCriterion("NJID >=", value, "njid");
            return (Criteria) this;
        }

        public Criteria andNjidLessThan(String value) {
            addCriterion("NJID <", value, "njid");
            return (Criteria) this;
        }

        public Criteria andNjidLessThanOrEqualTo(String value) {
            addCriterion("NJID <=", value, "njid");
            return (Criteria) this;
        }

        public Criteria andNjidLike(String value) {
            addCriterion("NJID like", value, "njid");
            return (Criteria) this;
        }

        public Criteria andNjidNotLike(String value) {
            addCriterion("NJID not like", value, "njid");
            return (Criteria) this;
        }

        public Criteria andNjidIn(List<String> values) {
            addCriterion("NJID in", values, "njid");
            return (Criteria) this;
        }

        public Criteria andNjidNotIn(List<String> values) {
            addCriterion("NJID not in", values, "njid");
            return (Criteria) this;
        }

        public Criteria andNjidBetween(String value1, String value2) {
            addCriterion("NJID between", value1, value2, "njid");
            return (Criteria) this;
        }

        public Criteria andNjidNotBetween(String value1, String value2) {
            addCriterion("NJID not between", value1, value2, "njid");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("XH like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("XH not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("XM is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("XM is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("XM =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("XM <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("XM >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("XM >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("XM <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("XM <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("XM like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("XM not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("XM in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("XM not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("XM between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("XM not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmpyIsNull() {
            addCriterion("XMPY is null");
            return (Criteria) this;
        }

        public Criteria andXmpyIsNotNull() {
            addCriterion("XMPY is not null");
            return (Criteria) this;
        }

        public Criteria andXmpyEqualTo(String value) {
            addCriterion("XMPY =", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyNotEqualTo(String value) {
            addCriterion("XMPY <>", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyGreaterThan(String value) {
            addCriterion("XMPY >", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyGreaterThanOrEqualTo(String value) {
            addCriterion("XMPY >=", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyLessThan(String value) {
            addCriterion("XMPY <", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyLessThanOrEqualTo(String value) {
            addCriterion("XMPY <=", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyLike(String value) {
            addCriterion("XMPY like", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyNotLike(String value) {
            addCriterion("XMPY not like", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyIn(List<String> values) {
            addCriterion("XMPY in", values, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyNotIn(List<String> values) {
            addCriterion("XMPY not in", values, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyBetween(String value1, String value2) {
            addCriterion("XMPY between", value1, value2, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyNotBetween(String value1, String value2) {
            addCriterion("XMPY not between", value1, value2, "xmpy");
            return (Criteria) this;
        }

        public Criteria andCymIsNull() {
            addCriterion("CYM is null");
            return (Criteria) this;
        }

        public Criteria andCymIsNotNull() {
            addCriterion("CYM is not null");
            return (Criteria) this;
        }

        public Criteria andCymEqualTo(String value) {
            addCriterion("CYM =", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotEqualTo(String value) {
            addCriterion("CYM <>", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymGreaterThan(String value) {
            addCriterion("CYM >", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymGreaterThanOrEqualTo(String value) {
            addCriterion("CYM >=", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLessThan(String value) {
            addCriterion("CYM <", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLessThanOrEqualTo(String value) {
            addCriterion("CYM <=", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLike(String value) {
            addCriterion("CYM like", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotLike(String value) {
            addCriterion("CYM not like", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymIn(List<String> values) {
            addCriterion("CYM in", values, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotIn(List<String> values) {
            addCriterion("CYM not in", values, "cym");
            return (Criteria) this;
        }

        public Criteria andCymBetween(String value1, String value2) {
            addCriterion("CYM between", value1, value2, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotBetween(String value1, String value2) {
            addCriterion("CYM not between", value1, value2, "cym");
            return (Criteria) this;
        }

        public Criteria andXbmIsNull() {
            addCriterion("XBM is null");
            return (Criteria) this;
        }

        public Criteria andXbmIsNotNull() {
            addCriterion("XBM is not null");
            return (Criteria) this;
        }

        public Criteria andXbmEqualTo(String value) {
            addCriterion("XBM =", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmNotEqualTo(String value) {
            addCriterion("XBM <>", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmGreaterThan(String value) {
            addCriterion("XBM >", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmGreaterThanOrEqualTo(String value) {
            addCriterion("XBM >=", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmLessThan(String value) {
            addCriterion("XBM <", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmLessThanOrEqualTo(String value) {
            addCriterion("XBM <=", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmLike(String value) {
            addCriterion("XBM like", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmNotLike(String value) {
            addCriterion("XBM not like", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmIn(List<String> values) {
            addCriterion("XBM in", values, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmNotIn(List<String> values) {
            addCriterion("XBM not in", values, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmBetween(String value1, String value2) {
            addCriterion("XBM between", value1, value2, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmNotBetween(String value1, String value2) {
            addCriterion("XBM not between", value1, value2, "xbm");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("CSRQ is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("CSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(Timestamp value) {
            addCriterion("CSRQ =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(Timestamp value) {
            addCriterion("CSRQ <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(Timestamp value) {
            addCriterion("CSRQ >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CSRQ >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(Timestamp value) {
            addCriterion("CSRQ <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(Timestamp value) {
            addCriterion("CSRQ <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<Timestamp> values) {
            addCriterion("CSRQ in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<Timestamp> values) {
            addCriterion("CSRQ not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CSRQ between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CSRQ not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andMzmIsNull() {
            addCriterion("MZM is null");
            return (Criteria) this;
        }

        public Criteria andMzmIsNotNull() {
            addCriterion("MZM is not null");
            return (Criteria) this;
        }

        public Criteria andMzmEqualTo(String value) {
            addCriterion("MZM =", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmNotEqualTo(String value) {
            addCriterion("MZM <>", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmGreaterThan(String value) {
            addCriterion("MZM >", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmGreaterThanOrEqualTo(String value) {
            addCriterion("MZM >=", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmLessThan(String value) {
            addCriterion("MZM <", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmLessThanOrEqualTo(String value) {
            addCriterion("MZM <=", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmLike(String value) {
            addCriterion("MZM like", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmNotLike(String value) {
            addCriterion("MZM not like", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmIn(List<String> values) {
            addCriterion("MZM in", values, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmNotIn(List<String> values) {
            addCriterion("MZM not in", values, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmBetween(String value1, String value2) {
            addCriterion("MZM between", value1, value2, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmNotBetween(String value1, String value2) {
            addCriterion("MZM not between", value1, value2, "mzm");
            return (Criteria) this;
        }

        public Criteria andGjdqmIsNull() {
            addCriterion("GJDQM is null");
            return (Criteria) this;
        }

        public Criteria andGjdqmIsNotNull() {
            addCriterion("GJDQM is not null");
            return (Criteria) this;
        }

        public Criteria andGjdqmEqualTo(String value) {
            addCriterion("GJDQM =", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmNotEqualTo(String value) {
            addCriterion("GJDQM <>", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmGreaterThan(String value) {
            addCriterion("GJDQM >", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmGreaterThanOrEqualTo(String value) {
            addCriterion("GJDQM >=", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmLessThan(String value) {
            addCriterion("GJDQM <", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmLessThanOrEqualTo(String value) {
            addCriterion("GJDQM <=", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmLike(String value) {
            addCriterion("GJDQM like", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmNotLike(String value) {
            addCriterion("GJDQM not like", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmIn(List<String> values) {
            addCriterion("GJDQM in", values, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmNotIn(List<String> values) {
            addCriterion("GJDQM not in", values, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmBetween(String value1, String value2) {
            addCriterion("GJDQM between", value1, value2, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmNotBetween(String value1, String value2) {
            addCriterion("GJDQM not between", value1, value2, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmIsNull() {
            addCriterion("SFZJLXM is null");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmIsNotNull() {
            addCriterion("SFZJLXM is not null");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmEqualTo(String value) {
            addCriterion("SFZJLXM =", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmNotEqualTo(String value) {
            addCriterion("SFZJLXM <>", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmGreaterThan(String value) {
            addCriterion("SFZJLXM >", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmGreaterThanOrEqualTo(String value) {
            addCriterion("SFZJLXM >=", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmLessThan(String value) {
            addCriterion("SFZJLXM <", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmLessThanOrEqualTo(String value) {
            addCriterion("SFZJLXM <=", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmLike(String value) {
            addCriterion("SFZJLXM like", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmNotLike(String value) {
            addCriterion("SFZJLXM not like", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmIn(List<String> values) {
            addCriterion("SFZJLXM in", values, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmNotIn(List<String> values) {
            addCriterion("SFZJLXM not in", values, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmBetween(String value1, String value2) {
            addCriterion("SFZJLXM between", value1, value2, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmNotBetween(String value1, String value2) {
            addCriterion("SFZJLXM not between", value1, value2, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSflxIsNull() {
            addCriterion("SFLX is null");
            return (Criteria) this;
        }

        public Criteria andSflxIsNotNull() {
            addCriterion("SFLX is not null");
            return (Criteria) this;
        }

        public Criteria andSflxEqualTo(String value) {
            addCriterion("SFLX =", value, "sflx");
            return (Criteria) this;
        }

        public Criteria andSflxNotEqualTo(String value) {
            addCriterion("SFLX <>", value, "sflx");
            return (Criteria) this;
        }

        public Criteria andSflxGreaterThan(String value) {
            addCriterion("SFLX >", value, "sflx");
            return (Criteria) this;
        }

        public Criteria andSflxGreaterThanOrEqualTo(String value) {
            addCriterion("SFLX >=", value, "sflx");
            return (Criteria) this;
        }

        public Criteria andSflxLessThan(String value) {
            addCriterion("SFLX <", value, "sflx");
            return (Criteria) this;
        }

        public Criteria andSflxLessThanOrEqualTo(String value) {
            addCriterion("SFLX <=", value, "sflx");
            return (Criteria) this;
        }

        public Criteria andSflxLike(String value) {
            addCriterion("SFLX like", value, "sflx");
            return (Criteria) this;
        }

        public Criteria andSflxNotLike(String value) {
            addCriterion("SFLX not like", value, "sflx");
            return (Criteria) this;
        }

        public Criteria andSflxIn(List<String> values) {
            addCriterion("SFLX in", values, "sflx");
            return (Criteria) this;
        }

        public Criteria andSflxNotIn(List<String> values) {
            addCriterion("SFLX not in", values, "sflx");
            return (Criteria) this;
        }

        public Criteria andSflxBetween(String value1, String value2) {
            addCriterion("SFLX between", value1, value2, "sflx");
            return (Criteria) this;
        }

        public Criteria andSflxNotBetween(String value1, String value2) {
            addCriterion("SFLX not between", value1, value2, "sflx");
            return (Criteria) this;
        }

        public Criteria andSfzjhIsNull() {
            addCriterion("SFZJH is null");
            return (Criteria) this;
        }

        public Criteria andSfzjhIsNotNull() {
            addCriterion("SFZJH is not null");
            return (Criteria) this;
        }

        public Criteria andSfzjhEqualTo(String value) {
            addCriterion("SFZJH =", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhNotEqualTo(String value) {
            addCriterion("SFZJH <>", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhGreaterThan(String value) {
            addCriterion("SFZJH >", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhGreaterThanOrEqualTo(String value) {
            addCriterion("SFZJH >=", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhLessThan(String value) {
            addCriterion("SFZJH <", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhLessThanOrEqualTo(String value) {
            addCriterion("SFZJH <=", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhLike(String value) {
            addCriterion("SFZJH like", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhNotLike(String value) {
            addCriterion("SFZJH not like", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhIn(List<String> values) {
            addCriterion("SFZJH in", values, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhNotIn(List<String> values) {
            addCriterion("SFZJH not in", values, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhBetween(String value1, String value2) {
            addCriterion("SFZJH between", value1, value2, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhNotBetween(String value1, String value2) {
            addCriterion("SFZJH not between", value1, value2, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andNjIsNull() {
            addCriterion("NJ is null");
            return (Criteria) this;
        }

        public Criteria andNjIsNotNull() {
            addCriterion("NJ is not null");
            return (Criteria) this;
        }

        public Criteria andNjEqualTo(String value) {
            addCriterion("NJ =", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotEqualTo(String value) {
            addCriterion("NJ <>", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjGreaterThan(String value) {
            addCriterion("NJ >", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjGreaterThanOrEqualTo(String value) {
            addCriterion("NJ >=", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLessThan(String value) {
            addCriterion("NJ <", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLessThanOrEqualTo(String value) {
            addCriterion("NJ <=", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLike(String value) {
            addCriterion("NJ like", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotLike(String value) {
            addCriterion("NJ not like", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjIn(List<String> values) {
            addCriterion("NJ in", values, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotIn(List<String> values) {
            addCriterion("NJ not in", values, "nj");
            return (Criteria) this;
        }

        public Criteria andNjBetween(String value1, String value2) {
            addCriterion("NJ between", value1, value2, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotBetween(String value1, String value2) {
            addCriterion("NJ not between", value1, value2, "nj");
            return (Criteria) this;
        }

        public Criteria andBhIsNull() {
            addCriterion("BH is null");
            return (Criteria) this;
        }

        public Criteria andBhIsNotNull() {
            addCriterion("BH is not null");
            return (Criteria) this;
        }

        public Criteria andBhEqualTo(String value) {
            addCriterion("BH =", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotEqualTo(String value) {
            addCriterion("BH <>", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThan(String value) {
            addCriterion("BH >", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThanOrEqualTo(String value) {
            addCriterion("BH >=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThan(String value) {
            addCriterion("BH <", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThanOrEqualTo(String value) {
            addCriterion("BH <=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLike(String value) {
            addCriterion("BH like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotLike(String value) {
            addCriterion("BH not like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhIn(List<String> values) {
            addCriterion("BH in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotIn(List<String> values) {
            addCriterion("BH not in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhBetween(String value1, String value2) {
            addCriterion("BH between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotBetween(String value1, String value2) {
            addCriterion("BH not between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("LXDH is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("LXDH =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("LXDH <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("LXDH >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("LXDH >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("LXDH <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("LXDH <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("LXDH like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("LXDH not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("LXDH in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("LXDH not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("LXDH between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("LXDH not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andTxdzIsNull() {
            addCriterion("TXDZ is null");
            return (Criteria) this;
        }

        public Criteria andTxdzIsNotNull() {
            addCriterion("TXDZ is not null");
            return (Criteria) this;
        }

        public Criteria andTxdzEqualTo(String value) {
            addCriterion("TXDZ =", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotEqualTo(String value) {
            addCriterion("TXDZ <>", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzGreaterThan(String value) {
            addCriterion("TXDZ >", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzGreaterThanOrEqualTo(String value) {
            addCriterion("TXDZ >=", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLessThan(String value) {
            addCriterion("TXDZ <", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLessThanOrEqualTo(String value) {
            addCriterion("TXDZ <=", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLike(String value) {
            addCriterion("TXDZ like", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotLike(String value) {
            addCriterion("TXDZ not like", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzIn(List<String> values) {
            addCriterion("TXDZ in", values, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotIn(List<String> values) {
            addCriterion("TXDZ not in", values, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzBetween(String value1, String value2) {
            addCriterion("TXDZ between", value1, value2, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotBetween(String value1, String value2) {
            addCriterion("TXDZ not between", value1, value2, "txdz");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNull() {
            addCriterion("YZBM is null");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNotNull() {
            addCriterion("YZBM is not null");
            return (Criteria) this;
        }

        public Criteria andYzbmEqualTo(String value) {
            addCriterion("YZBM =", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotEqualTo(String value) {
            addCriterion("YZBM <>", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThan(String value) {
            addCriterion("YZBM >", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThanOrEqualTo(String value) {
            addCriterion("YZBM >=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThan(String value) {
            addCriterion("YZBM <", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThanOrEqualTo(String value) {
            addCriterion("YZBM <=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLike(String value) {
            addCriterion("YZBM like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotLike(String value) {
            addCriterion("YZBM not like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmIn(List<String> values) {
            addCriterion("YZBM in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotIn(List<String> values) {
            addCriterion("YZBM not in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmBetween(String value1, String value2) {
            addCriterion("YZBM between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotBetween(String value1, String value2) {
            addCriterion("YZBM not between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andDzxxIsNull() {
            addCriterion("DZXX is null");
            return (Criteria) this;
        }

        public Criteria andDzxxIsNotNull() {
            addCriterion("DZXX is not null");
            return (Criteria) this;
        }

        public Criteria andDzxxEqualTo(String value) {
            addCriterion("DZXX =", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxNotEqualTo(String value) {
            addCriterion("DZXX <>", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxGreaterThan(String value) {
            addCriterion("DZXX >", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxGreaterThanOrEqualTo(String value) {
            addCriterion("DZXX >=", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxLessThan(String value) {
            addCriterion("DZXX <", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxLessThanOrEqualTo(String value) {
            addCriterion("DZXX <=", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxLike(String value) {
            addCriterion("DZXX like", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxNotLike(String value) {
            addCriterion("DZXX not like", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxIn(List<String> values) {
            addCriterion("DZXX in", values, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxNotIn(List<String> values) {
            addCriterion("DZXX not in", values, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxBetween(String value1, String value2) {
            addCriterion("DZXX between", value1, value2, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxNotBetween(String value1, String value2) {
            addCriterion("DZXX not between", value1, value2, "dzxx");
            return (Criteria) this;
        }

        public Criteria andZxztIsNull() {
            addCriterion("ZXZT is null");
            return (Criteria) this;
        }

        public Criteria andZxztIsNotNull() {
            addCriterion("ZXZT is not null");
            return (Criteria) this;
        }

        public Criteria andZxztEqualTo(String value) {
            addCriterion("ZXZT =", value, "zxzt");
            return (Criteria) this;
        }

        public Criteria andZxztNotEqualTo(String value) {
            addCriterion("ZXZT <>", value, "zxzt");
            return (Criteria) this;
        }

        public Criteria andZxztGreaterThan(String value) {
            addCriterion("ZXZT >", value, "zxzt");
            return (Criteria) this;
        }

        public Criteria andZxztGreaterThanOrEqualTo(String value) {
            addCriterion("ZXZT >=", value, "zxzt");
            return (Criteria) this;
        }

        public Criteria andZxztLessThan(String value) {
            addCriterion("ZXZT <", value, "zxzt");
            return (Criteria) this;
        }

        public Criteria andZxztLessThanOrEqualTo(String value) {
            addCriterion("ZXZT <=", value, "zxzt");
            return (Criteria) this;
        }

        public Criteria andZxztLike(String value) {
            addCriterion("ZXZT like", value, "zxzt");
            return (Criteria) this;
        }

        public Criteria andZxztNotLike(String value) {
            addCriterion("ZXZT not like", value, "zxzt");
            return (Criteria) this;
        }

        public Criteria andZxztIn(List<String> values) {
            addCriterion("ZXZT in", values, "zxzt");
            return (Criteria) this;
        }

        public Criteria andZxztNotIn(List<String> values) {
            addCriterion("ZXZT not in", values, "zxzt");
            return (Criteria) this;
        }

        public Criteria andZxztBetween(String value1, String value2) {
            addCriterion("ZXZT between", value1, value2, "zxzt");
            return (Criteria) this;
        }

        public Criteria andZxztNotBetween(String value1, String value2) {
            addCriterion("ZXZT not between", value1, value2, "zxzt");
            return (Criteria) this;
        }

        public Criteria andCzlxIsNull() {
            addCriterion("CZLX is null");
            return (Criteria) this;
        }

        public Criteria andCzlxIsNotNull() {
            addCriterion("CZLX is not null");
            return (Criteria) this;
        }

        public Criteria andCzlxEqualTo(String value) {
            addCriterion("CZLX =", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotEqualTo(String value) {
            addCriterion("CZLX <>", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxGreaterThan(String value) {
            addCriterion("CZLX >", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxGreaterThanOrEqualTo(String value) {
            addCriterion("CZLX >=", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLessThan(String value) {
            addCriterion("CZLX <", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLessThanOrEqualTo(String value) {
            addCriterion("CZLX <=", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLike(String value) {
            addCriterion("CZLX like", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotLike(String value) {
            addCriterion("CZLX not like", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxIn(List<String> values) {
            addCriterion("CZLX in", values, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotIn(List<String> values) {
            addCriterion("CZLX not in", values, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxBetween(String value1, String value2) {
            addCriterion("CZLX between", value1, value2, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotBetween(String value1, String value2) {
            addCriterion("CZLX not between", value1, value2, "czlx");
            return (Criteria) this;
        }

        public Criteria andJfsjIsNull() {
            addCriterion("JFSJ is null");
            return (Criteria) this;
        }

        public Criteria andJfsjIsNotNull() {
            addCriterion("JFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJfsjEqualTo(Timestamp value) {
            addCriterion("JFSJ =", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjNotEqualTo(Timestamp value) {
            addCriterion("JFSJ <>", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjGreaterThan(Timestamp value) {
            addCriterion("JFSJ >", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("JFSJ >=", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjLessThan(Timestamp value) {
            addCriterion("JFSJ <", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjLessThanOrEqualTo(Timestamp value) {
            addCriterion("JFSJ <=", value, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjIn(List<Timestamp> values) {
            addCriterion("JFSJ in", values, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjNotIn(List<Timestamp> values) {
            addCriterion("JFSJ not in", values, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjBetween(Timestamp value1, Timestamp value2) {
            addCriterion("JFSJ between", value1, value2, "jfsj");
            return (Criteria) this;
        }

        public Criteria andJfsjNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("JFSJ not between", value1, value2, "jfsj");
            return (Criteria) this;
        }

        public Criteria andSigncodeIsNull() {
            addCriterion("SIGNCODE is null");
            return (Criteria) this;
        }

        public Criteria andSigncodeIsNotNull() {
            addCriterion("SIGNCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSigncodeEqualTo(String value) {
            addCriterion("SIGNCODE =", value, "signcode");
            return (Criteria) this;
        }

        public Criteria andSigncodeNotEqualTo(String value) {
            addCriterion("SIGNCODE <>", value, "signcode");
            return (Criteria) this;
        }

        public Criteria andSigncodeGreaterThan(String value) {
            addCriterion("SIGNCODE >", value, "signcode");
            return (Criteria) this;
        }

        public Criteria andSigncodeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNCODE >=", value, "signcode");
            return (Criteria) this;
        }

        public Criteria andSigncodeLessThan(String value) {
            addCriterion("SIGNCODE <", value, "signcode");
            return (Criteria) this;
        }

        public Criteria andSigncodeLessThanOrEqualTo(String value) {
            addCriterion("SIGNCODE <=", value, "signcode");
            return (Criteria) this;
        }

        public Criteria andSigncodeLike(String value) {
            addCriterion("SIGNCODE like", value, "signcode");
            return (Criteria) this;
        }

        public Criteria andSigncodeNotLike(String value) {
            addCriterion("SIGNCODE not like", value, "signcode");
            return (Criteria) this;
        }

        public Criteria andSigncodeIn(List<String> values) {
            addCriterion("SIGNCODE in", values, "signcode");
            return (Criteria) this;
        }

        public Criteria andSigncodeNotIn(List<String> values) {
            addCriterion("SIGNCODE not in", values, "signcode");
            return (Criteria) this;
        }

        public Criteria andSigncodeBetween(String value1, String value2) {
            addCriterion("SIGNCODE between", value1, value2, "signcode");
            return (Criteria) this;
        }

        public Criteria andSigncodeNotBetween(String value1, String value2) {
            addCriterion("SIGNCODE not between", value1, value2, "signcode");
            return (Criteria) this;
        }

        public Criteria andBjidIsNull() {
            addCriterion("BJID is null");
            return (Criteria) this;
        }

        public Criteria andBjidIsNotNull() {
            addCriterion("BJID is not null");
            return (Criteria) this;
        }

        public Criteria andBjidEqualTo(String value) {
            addCriterion("BJID =", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidNotEqualTo(String value) {
            addCriterion("BJID <>", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidGreaterThan(String value) {
            addCriterion("BJID >", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidGreaterThanOrEqualTo(String value) {
            addCriterion("BJID >=", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidLessThan(String value) {
            addCriterion("BJID <", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidLessThanOrEqualTo(String value) {
            addCriterion("BJID <=", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidLike(String value) {
            addCriterion("BJID like", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidNotLike(String value) {
            addCriterion("BJID not like", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidIn(List<String> values) {
            addCriterion("BJID in", values, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidNotIn(List<String> values) {
            addCriterion("BJID not in", values, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidBetween(String value1, String value2) {
            addCriterion("BJID between", value1, value2, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidNotBetween(String value1, String value2) {
            addCriterion("BJID not between", value1, value2, "bjid");
            return (Criteria) this;
        }

        public Criteria andXjszdIsNull() {
            addCriterion("XJSZD is null");
            return (Criteria) this;
        }

        public Criteria andXjszdIsNotNull() {
            addCriterion("XJSZD is not null");
            return (Criteria) this;
        }

        public Criteria andXjszdEqualTo(String value) {
            addCriterion("XJSZD =", value, "xjszd");
            return (Criteria) this;
        }

        public Criteria andXjszdNotEqualTo(String value) {
            addCriterion("XJSZD <>", value, "xjszd");
            return (Criteria) this;
        }

        public Criteria andXjszdGreaterThan(String value) {
            addCriterion("XJSZD >", value, "xjszd");
            return (Criteria) this;
        }

        public Criteria andXjszdGreaterThanOrEqualTo(String value) {
            addCriterion("XJSZD >=", value, "xjszd");
            return (Criteria) this;
        }

        public Criteria andXjszdLessThan(String value) {
            addCriterion("XJSZD <", value, "xjszd");
            return (Criteria) this;
        }

        public Criteria andXjszdLessThanOrEqualTo(String value) {
            addCriterion("XJSZD <=", value, "xjszd");
            return (Criteria) this;
        }

        public Criteria andXjszdLike(String value) {
            addCriterion("XJSZD like", value, "xjszd");
            return (Criteria) this;
        }

        public Criteria andXjszdNotLike(String value) {
            addCriterion("XJSZD not like", value, "xjszd");
            return (Criteria) this;
        }

        public Criteria andXjszdIn(List<String> values) {
            addCriterion("XJSZD in", values, "xjszd");
            return (Criteria) this;
        }

        public Criteria andXjszdNotIn(List<String> values) {
            addCriterion("XJSZD not in", values, "xjszd");
            return (Criteria) this;
        }

        public Criteria andXjszdBetween(String value1, String value2) {
            addCriterion("XJSZD between", value1, value2, "xjszd");
            return (Criteria) this;
        }

        public Criteria andXjszdNotBetween(String value1, String value2) {
            addCriterion("XJSZD not between", value1, value2, "xjszd");
            return (Criteria) this;
        }

        public Criteria andXslyIsNull() {
            addCriterion("XSLY is null");
            return (Criteria) this;
        }

        public Criteria andXslyIsNotNull() {
            addCriterion("XSLY is not null");
            return (Criteria) this;
        }

        public Criteria andXslyEqualTo(String value) {
            addCriterion("XSLY =", value, "xsly");
            return (Criteria) this;
        }

        public Criteria andXslyNotEqualTo(String value) {
            addCriterion("XSLY <>", value, "xsly");
            return (Criteria) this;
        }

        public Criteria andXslyGreaterThan(String value) {
            addCriterion("XSLY >", value, "xsly");
            return (Criteria) this;
        }

        public Criteria andXslyGreaterThanOrEqualTo(String value) {
            addCriterion("XSLY >=", value, "xsly");
            return (Criteria) this;
        }

        public Criteria andXslyLessThan(String value) {
            addCriterion("XSLY <", value, "xsly");
            return (Criteria) this;
        }

        public Criteria andXslyLessThanOrEqualTo(String value) {
            addCriterion("XSLY <=", value, "xsly");
            return (Criteria) this;
        }

        public Criteria andXslyLike(String value) {
            addCriterion("XSLY like", value, "xsly");
            return (Criteria) this;
        }

        public Criteria andXslyNotLike(String value) {
            addCriterion("XSLY not like", value, "xsly");
            return (Criteria) this;
        }

        public Criteria andXslyIn(List<String> values) {
            addCriterion("XSLY in", values, "xsly");
            return (Criteria) this;
        }

        public Criteria andXslyNotIn(List<String> values) {
            addCriterion("XSLY not in", values, "xsly");
            return (Criteria) this;
        }

        public Criteria andXslyBetween(String value1, String value2) {
            addCriterion("XSLY between", value1, value2, "xsly");
            return (Criteria) this;
        }

        public Criteria andXslyNotBetween(String value1, String value2) {
            addCriterion("XSLY not between", value1, value2, "xsly");
            return (Criteria) this;
        }

        public Criteria andCsdbmIsNull() {
            addCriterion("CSDBM is null");
            return (Criteria) this;
        }

        public Criteria andCsdbmIsNotNull() {
            addCriterion("CSDBM is not null");
            return (Criteria) this;
        }

        public Criteria andCsdbmEqualTo(String value) {
            addCriterion("CSDBM =", value, "csdbm");
            return (Criteria) this;
        }

        public Criteria andCsdbmNotEqualTo(String value) {
            addCriterion("CSDBM <>", value, "csdbm");
            return (Criteria) this;
        }

        public Criteria andCsdbmGreaterThan(String value) {
            addCriterion("CSDBM >", value, "csdbm");
            return (Criteria) this;
        }

        public Criteria andCsdbmGreaterThanOrEqualTo(String value) {
            addCriterion("CSDBM >=", value, "csdbm");
            return (Criteria) this;
        }

        public Criteria andCsdbmLessThan(String value) {
            addCriterion("CSDBM <", value, "csdbm");
            return (Criteria) this;
        }

        public Criteria andCsdbmLessThanOrEqualTo(String value) {
            addCriterion("CSDBM <=", value, "csdbm");
            return (Criteria) this;
        }

        public Criteria andCsdbmLike(String value) {
            addCriterion("CSDBM like", value, "csdbm");
            return (Criteria) this;
        }

        public Criteria andCsdbmNotLike(String value) {
            addCriterion("CSDBM not like", value, "csdbm");
            return (Criteria) this;
        }

        public Criteria andCsdbmIn(List<String> values) {
            addCriterion("CSDBM in", values, "csdbm");
            return (Criteria) this;
        }

        public Criteria andCsdbmNotIn(List<String> values) {
            addCriterion("CSDBM not in", values, "csdbm");
            return (Criteria) this;
        }

        public Criteria andCsdbmBetween(String value1, String value2) {
            addCriterion("CSDBM between", value1, value2, "csdbm");
            return (Criteria) this;
        }

        public Criteria andCsdbmNotBetween(String value1, String value2) {
            addCriterion("CSDBM not between", value1, value2, "csdbm");
            return (Criteria) this;
        }

        public Criteria andHkszdIsNull() {
            addCriterion("HKSZD is null");
            return (Criteria) this;
        }

        public Criteria andHkszdIsNotNull() {
            addCriterion("HKSZD is not null");
            return (Criteria) this;
        }

        public Criteria andHkszdEqualTo(String value) {
            addCriterion("HKSZD =", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdNotEqualTo(String value) {
            addCriterion("HKSZD <>", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdGreaterThan(String value) {
            addCriterion("HKSZD >", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdGreaterThanOrEqualTo(String value) {
            addCriterion("HKSZD >=", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdLessThan(String value) {
            addCriterion("HKSZD <", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdLessThanOrEqualTo(String value) {
            addCriterion("HKSZD <=", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdLike(String value) {
            addCriterion("HKSZD like", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdNotLike(String value) {
            addCriterion("HKSZD not like", value, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdIn(List<String> values) {
            addCriterion("HKSZD in", values, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdNotIn(List<String> values) {
            addCriterion("HKSZD not in", values, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdBetween(String value1, String value2) {
            addCriterion("HKSZD between", value1, value2, "hkszd");
            return (Criteria) this;
        }

        public Criteria andHkszdNotBetween(String value1, String value2) {
            addCriterion("HKSZD not between", value1, value2, "hkszd");
            return (Criteria) this;
        }

        public Criteria andJwbsIsNull() {
            addCriterion("JWBS is null");
            return (Criteria) this;
        }

        public Criteria andJwbsIsNotNull() {
            addCriterion("JWBS is not null");
            return (Criteria) this;
        }

        public Criteria andJwbsEqualTo(String value) {
            addCriterion("JWBS =", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsNotEqualTo(String value) {
            addCriterion("JWBS <>", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsGreaterThan(String value) {
            addCriterion("JWBS >", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsGreaterThanOrEqualTo(String value) {
            addCriterion("JWBS >=", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsLessThan(String value) {
            addCriterion("JWBS <", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsLessThanOrEqualTo(String value) {
            addCriterion("JWBS <=", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsLike(String value) {
            addCriterion("JWBS like", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsNotLike(String value) {
            addCriterion("JWBS not like", value, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsIn(List<String> values) {
            addCriterion("JWBS in", values, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsNotIn(List<String> values) {
            addCriterion("JWBS not in", values, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsBetween(String value1, String value2) {
            addCriterion("JWBS between", value1, value2, "jwbs");
            return (Criteria) this;
        }

        public Criteria andJwbsNotBetween(String value1, String value2) {
            addCriterion("JWBS not between", value1, value2, "jwbs");
            return (Criteria) this;
        }

        public Criteria andGjxjhIsNull() {
            addCriterion("GJXJH is null");
            return (Criteria) this;
        }

        public Criteria andGjxjhIsNotNull() {
            addCriterion("GJXJH is not null");
            return (Criteria) this;
        }

        public Criteria andGjxjhEqualTo(String value) {
            addCriterion("GJXJH =", value, "gjxjh");
            return (Criteria) this;
        }

        public Criteria andGjxjhNotEqualTo(String value) {
            addCriterion("GJXJH <>", value, "gjxjh");
            return (Criteria) this;
        }

        public Criteria andGjxjhGreaterThan(String value) {
            addCriterion("GJXJH >", value, "gjxjh");
            return (Criteria) this;
        }

        public Criteria andGjxjhGreaterThanOrEqualTo(String value) {
            addCriterion("GJXJH >=", value, "gjxjh");
            return (Criteria) this;
        }

        public Criteria andGjxjhLessThan(String value) {
            addCriterion("GJXJH <", value, "gjxjh");
            return (Criteria) this;
        }

        public Criteria andGjxjhLessThanOrEqualTo(String value) {
            addCriterion("GJXJH <=", value, "gjxjh");
            return (Criteria) this;
        }

        public Criteria andGjxjhLike(String value) {
            addCriterion("GJXJH like", value, "gjxjh");
            return (Criteria) this;
        }

        public Criteria andGjxjhNotLike(String value) {
            addCriterion("GJXJH not like", value, "gjxjh");
            return (Criteria) this;
        }

        public Criteria andGjxjhIn(List<String> values) {
            addCriterion("GJXJH in", values, "gjxjh");
            return (Criteria) this;
        }

        public Criteria andGjxjhNotIn(List<String> values) {
            addCriterion("GJXJH not in", values, "gjxjh");
            return (Criteria) this;
        }

        public Criteria andGjxjhBetween(String value1, String value2) {
            addCriterion("GJXJH between", value1, value2, "gjxjh");
            return (Criteria) this;
        }

        public Criteria andGjxjhNotBetween(String value1, String value2) {
            addCriterion("GJXJH not between", value1, value2, "gjxjh");
            return (Criteria) this;
        }

        public Criteria andJdfsIsNull() {
            addCriterion("JDFS is null");
            return (Criteria) this;
        }

        public Criteria andJdfsIsNotNull() {
            addCriterion("JDFS is not null");
            return (Criteria) this;
        }

        public Criteria andJdfsEqualTo(String value) {
            addCriterion("JDFS =", value, "jdfs");
            return (Criteria) this;
        }

        public Criteria andJdfsNotEqualTo(String value) {
            addCriterion("JDFS <>", value, "jdfs");
            return (Criteria) this;
        }

        public Criteria andJdfsGreaterThan(String value) {
            addCriterion("JDFS >", value, "jdfs");
            return (Criteria) this;
        }

        public Criteria andJdfsGreaterThanOrEqualTo(String value) {
            addCriterion("JDFS >=", value, "jdfs");
            return (Criteria) this;
        }

        public Criteria andJdfsLessThan(String value) {
            addCriterion("JDFS <", value, "jdfs");
            return (Criteria) this;
        }

        public Criteria andJdfsLessThanOrEqualTo(String value) {
            addCriterion("JDFS <=", value, "jdfs");
            return (Criteria) this;
        }

        public Criteria andJdfsLike(String value) {
            addCriterion("JDFS like", value, "jdfs");
            return (Criteria) this;
        }

        public Criteria andJdfsNotLike(String value) {
            addCriterion("JDFS not like", value, "jdfs");
            return (Criteria) this;
        }

        public Criteria andJdfsIn(List<String> values) {
            addCriterion("JDFS in", values, "jdfs");
            return (Criteria) this;
        }

        public Criteria andJdfsNotIn(List<String> values) {
            addCriterion("JDFS not in", values, "jdfs");
            return (Criteria) this;
        }

        public Criteria andJdfsBetween(String value1, String value2) {
            addCriterion("JDFS between", value1, value2, "jdfs");
            return (Criteria) this;
        }

        public Criteria andJdfsNotBetween(String value1, String value2) {
            addCriterion("JDFS not between", value1, value2, "jdfs");
            return (Criteria) this;
        }

        public Criteria andXdIsNull() {
            addCriterion("XD is null");
            return (Criteria) this;
        }

        public Criteria andXdIsNotNull() {
            addCriterion("XD is not null");
            return (Criteria) this;
        }

        public Criteria andXdEqualTo(String value) {
            addCriterion("XD =", value, "xd");
            return (Criteria) this;
        }

        public Criteria andXdNotEqualTo(String value) {
            addCriterion("XD <>", value, "xd");
            return (Criteria) this;
        }

        public Criteria andXdGreaterThan(String value) {
            addCriterion("XD >", value, "xd");
            return (Criteria) this;
        }

        public Criteria andXdGreaterThanOrEqualTo(String value) {
            addCriterion("XD >=", value, "xd");
            return (Criteria) this;
        }

        public Criteria andXdLessThan(String value) {
            addCriterion("XD <", value, "xd");
            return (Criteria) this;
        }

        public Criteria andXdLessThanOrEqualTo(String value) {
            addCriterion("XD <=", value, "xd");
            return (Criteria) this;
        }

        public Criteria andXdLike(String value) {
            addCriterion("XD like", value, "xd");
            return (Criteria) this;
        }

        public Criteria andXdNotLike(String value) {
            addCriterion("XD not like", value, "xd");
            return (Criteria) this;
        }

        public Criteria andXdIn(List<String> values) {
            addCriterion("XD in", values, "xd");
            return (Criteria) this;
        }

        public Criteria andXdNotIn(List<String> values) {
            addCriterion("XD not in", values, "xd");
            return (Criteria) this;
        }

        public Criteria andXdBetween(String value1, String value2) {
            addCriterion("XD between", value1, value2, "xd");
            return (Criteria) this;
        }

        public Criteria andXdNotBetween(String value1, String value2) {
            addCriterion("XD not between", value1, value2, "xd");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("PHOTO =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("PHOTO <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("PHOTO >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("PHOTO <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("PHOTO <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("PHOTO like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("PHOTO not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("PHOTO in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("PHOTO not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("PHOTO between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("PHOTO not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andSuibanIsNull() {
            addCriterion("SUIBAN is null");
            return (Criteria) this;
        }

        public Criteria andSuibanIsNotNull() {
            addCriterion("SUIBAN is not null");
            return (Criteria) this;
        }

        public Criteria andSuibanEqualTo(String value) {
            addCriterion("SUIBAN =", value, "suiban");
            return (Criteria) this;
        }

        public Criteria andSuibanNotEqualTo(String value) {
            addCriterion("SUIBAN <>", value, "suiban");
            return (Criteria) this;
        }

        public Criteria andSuibanGreaterThan(String value) {
            addCriterion("SUIBAN >", value, "suiban");
            return (Criteria) this;
        }

        public Criteria andSuibanGreaterThanOrEqualTo(String value) {
            addCriterion("SUIBAN >=", value, "suiban");
            return (Criteria) this;
        }

        public Criteria andSuibanLessThan(String value) {
            addCriterion("SUIBAN <", value, "suiban");
            return (Criteria) this;
        }

        public Criteria andSuibanLessThanOrEqualTo(String value) {
            addCriterion("SUIBAN <=", value, "suiban");
            return (Criteria) this;
        }

        public Criteria andSuibanLike(String value) {
            addCriterion("SUIBAN like", value, "suiban");
            return (Criteria) this;
        }

        public Criteria andSuibanNotLike(String value) {
            addCriterion("SUIBAN not like", value, "suiban");
            return (Criteria) this;
        }

        public Criteria andSuibanIn(List<String> values) {
            addCriterion("SUIBAN in", values, "suiban");
            return (Criteria) this;
        }

        public Criteria andSuibanNotIn(List<String> values) {
            addCriterion("SUIBAN not in", values, "suiban");
            return (Criteria) this;
        }

        public Criteria andSuibanBetween(String value1, String value2) {
            addCriterion("SUIBAN between", value1, value2, "suiban");
            return (Criteria) this;
        }

        public Criteria andSuibanNotBetween(String value1, String value2) {
            addCriterion("SUIBAN not between", value1, value2, "suiban");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNull() {
            addCriterion("ZZMM is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNotNull() {
            addCriterion("ZZMM is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmEqualTo(String value) {
            addCriterion("ZZMM =", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotEqualTo(String value) {
            addCriterion("ZZMM <>", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThan(String value) {
            addCriterion("ZZMM >", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("ZZMM >=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThan(String value) {
            addCriterion("ZZMM <", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThanOrEqualTo(String value) {
            addCriterion("ZZMM <=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLike(String value) {
            addCriterion("ZZMM like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotLike(String value) {
            addCriterion("ZZMM not like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmIn(List<String> values) {
            addCriterion("ZZMM in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotIn(List<String> values) {
            addCriterion("ZZMM not in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmBetween(String value1, String value2) {
            addCriterion("ZZMM between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotBetween(String value1, String value2) {
            addCriterion("ZZMM not between", value1, value2, "zzmm");
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