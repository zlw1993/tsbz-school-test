package com.imooc.schoolproject.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class StudentSocialActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentSocialActivityExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEduIdIsNull() {
            addCriterion("edu_id is null");
            return (Criteria) this;
        }

        public Criteria andEduIdIsNotNull() {
            addCriterion("edu_id is not null");
            return (Criteria) this;
        }

        public Criteria andEduIdEqualTo(String value) {
            addCriterion("edu_id =", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdNotEqualTo(String value) {
            addCriterion("edu_id <>", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdGreaterThan(String value) {
            addCriterion("edu_id >", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdGreaterThanOrEqualTo(String value) {
            addCriterion("edu_id >=", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdLessThan(String value) {
            addCriterion("edu_id <", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdLessThanOrEqualTo(String value) {
            addCriterion("edu_id <=", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdLike(String value) {
            addCriterion("edu_id like", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdNotLike(String value) {
            addCriterion("edu_id not like", value, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdIn(List<String> values) {
            addCriterion("edu_id in", values, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdNotIn(List<String> values) {
            addCriterion("edu_id not in", values, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdBetween(String value1, String value2) {
            addCriterion("edu_id between", value1, value2, "eduId");
            return (Criteria) this;
        }

        public Criteria andEduIdNotBetween(String value1, String value2) {
            addCriterion("edu_id not between", value1, value2, "eduId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearIsNull() {
            addCriterion("school_year is null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearIsNotNull() {
            addCriterion("school_year is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearEqualTo(String value) {
            addCriterion("school_year =", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotEqualTo(String value) {
            addCriterion("school_year <>", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearGreaterThan(String value) {
            addCriterion("school_year >", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearGreaterThanOrEqualTo(String value) {
            addCriterion("school_year >=", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearLessThan(String value) {
            addCriterion("school_year <", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearLessThanOrEqualTo(String value) {
            addCriterion("school_year <=", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearLike(String value) {
            addCriterion("school_year like", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotLike(String value) {
            addCriterion("school_year not like", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearIn(List<String> values) {
            addCriterion("school_year in", values, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotIn(List<String> values) {
            addCriterion("school_year not in", values, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearBetween(String value1, String value2) {
            addCriterion("school_year between", value1, value2, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotBetween(String value1, String value2) {
            addCriterion("school_year not between", value1, value2, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonIsNull() {
            addCriterion("school_season is null");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonIsNotNull() {
            addCriterion("school_season is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonEqualTo(String value) {
            addCriterion("school_season =", value, "schoolSeason");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonNotEqualTo(String value) {
            addCriterion("school_season <>", value, "schoolSeason");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonGreaterThan(String value) {
            addCriterion("school_season >", value, "schoolSeason");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("school_season >=", value, "schoolSeason");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonLessThan(String value) {
            addCriterion("school_season <", value, "schoolSeason");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonLessThanOrEqualTo(String value) {
            addCriterion("school_season <=", value, "schoolSeason");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonLike(String value) {
            addCriterion("school_season like", value, "schoolSeason");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonNotLike(String value) {
            addCriterion("school_season not like", value, "schoolSeason");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonIn(List<String> values) {
            addCriterion("school_season in", values, "schoolSeason");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonNotIn(List<String> values) {
            addCriterion("school_season not in", values, "schoolSeason");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonBetween(String value1, String value2) {
            addCriterion("school_season between", value1, value2, "schoolSeason");
            return (Criteria) this;
        }

        public Criteria andSchoolSeasonNotBetween(String value1, String value2) {
            addCriterion("school_season not between", value1, value2, "schoolSeason");
            return (Criteria) this;
        }

        public Criteria andKIdIsNull() {
            addCriterion("k_id is null");
            return (Criteria) this;
        }

        public Criteria andKIdIsNotNull() {
            addCriterion("k_id is not null");
            return (Criteria) this;
        }

        public Criteria andKIdEqualTo(Integer value) {
            addCriterion("k_id =", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotEqualTo(Integer value) {
            addCriterion("k_id <>", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdGreaterThan(Integer value) {
            addCriterion("k_id >", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("k_id >=", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdLessThan(Integer value) {
            addCriterion("k_id <", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdLessThanOrEqualTo(Integer value) {
            addCriterion("k_id <=", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdIn(List<Integer> values) {
            addCriterion("k_id in", values, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotIn(List<Integer> values) {
            addCriterion("k_id not in", values, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdBetween(Integer value1, Integer value2) {
            addCriterion("k_id between", value1, value2, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotBetween(Integer value1, Integer value2) {
            addCriterion("k_id not between", value1, value2, "kId");
            return (Criteria) this;
        }

        public Criteria andOdIdIsNull() {
            addCriterion("od_id is null");
            return (Criteria) this;
        }

        public Criteria andOdIdIsNotNull() {
            addCriterion("od_id is not null");
            return (Criteria) this;
        }

        public Criteria andOdIdEqualTo(String value) {
            addCriterion("od_id =", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotEqualTo(String value) {
            addCriterion("od_id <>", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdGreaterThan(String value) {
            addCriterion("od_id >", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdGreaterThanOrEqualTo(String value) {
            addCriterion("od_id >=", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdLessThan(String value) {
            addCriterion("od_id <", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdLessThanOrEqualTo(String value) {
            addCriterion("od_id <=", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdLike(String value) {
            addCriterion("od_id like", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotLike(String value) {
            addCriterion("od_id not like", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdIn(List<String> values) {
            addCriterion("od_id in", values, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotIn(List<String> values) {
            addCriterion("od_id not in", values, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdBetween(String value1, String value2) {
            addCriterion("od_id between", value1, value2, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotBetween(String value1, String value2) {
            addCriterion("od_id not between", value1, value2, "odId");
            return (Criteria) this;
        }

        public Criteria andHdlxIsNull() {
            addCriterion("hdlx is null");
            return (Criteria) this;
        }

        public Criteria andHdlxIsNotNull() {
            addCriterion("hdlx is not null");
            return (Criteria) this;
        }

        public Criteria andHdlxEqualTo(Integer value) {
            addCriterion("hdlx =", value, "hdlx");
            return (Criteria) this;
        }

        public Criteria andHdlxNotEqualTo(Integer value) {
            addCriterion("hdlx <>", value, "hdlx");
            return (Criteria) this;
        }

        public Criteria andHdlxGreaterThan(Integer value) {
            addCriterion("hdlx >", value, "hdlx");
            return (Criteria) this;
        }

        public Criteria andHdlxGreaterThanOrEqualTo(Integer value) {
            addCriterion("hdlx >=", value, "hdlx");
            return (Criteria) this;
        }

        public Criteria andHdlxLessThan(Integer value) {
            addCriterion("hdlx <", value, "hdlx");
            return (Criteria) this;
        }

        public Criteria andHdlxLessThanOrEqualTo(Integer value) {
            addCriterion("hdlx <=", value, "hdlx");
            return (Criteria) this;
        }

        public Criteria andHdlxIn(List<Integer> values) {
            addCriterion("hdlx in", values, "hdlx");
            return (Criteria) this;
        }

        public Criteria andHdlxNotIn(List<Integer> values) {
            addCriterion("hdlx not in", values, "hdlx");
            return (Criteria) this;
        }

        public Criteria andHdlxBetween(Integer value1, Integer value2) {
            addCriterion("hdlx between", value1, value2, "hdlx");
            return (Criteria) this;
        }

        public Criteria andHdlxNotBetween(Integer value1, Integer value2) {
            addCriterion("hdlx not between", value1, value2, "hdlx");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNull() {
            addCriterion("course_type is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNotNull() {
            addCriterion("course_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeEqualTo(Integer value) {
            addCriterion("course_type =", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotEqualTo(Integer value) {
            addCriterion("course_type <>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThan(Integer value) {
            addCriterion("course_type >", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_type >=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThan(Integer value) {
            addCriterion("course_type <", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("course_type <=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIn(List<Integer> values) {
            addCriterion("course_type in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotIn(List<Integer> values) {
            addCriterion("course_type not in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeBetween(Integer value1, Integer value2) {
            addCriterion("course_type between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("course_type not between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIsNull() {
            addCriterion("course_introduction is null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIsNotNull() {
            addCriterion("course_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionEqualTo(String value) {
            addCriterion("course_introduction =", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotEqualTo(String value) {
            addCriterion("course_introduction <>", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionGreaterThan(String value) {
            addCriterion("course_introduction >", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("course_introduction >=", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLessThan(String value) {
            addCriterion("course_introduction <", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLessThanOrEqualTo(String value) {
            addCriterion("course_introduction <=", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLike(String value) {
            addCriterion("course_introduction like", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotLike(String value) {
            addCriterion("course_introduction not like", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIn(List<String> values) {
            addCriterion("course_introduction in", values, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotIn(List<String> values) {
            addCriterion("course_introduction not in", values, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionBetween(String value1, String value2) {
            addCriterion("course_introduction between", value1, value2, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotBetween(String value1, String value2) {
            addCriterion("course_introduction not between", value1, value2, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Integer value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Integer value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Integer value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Integer value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Integer value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Integer> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Integer> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Integer value1, Integer value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Integer value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Integer value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Integer value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Integer value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Integer> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Integer> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCxsjIsNull() {
            addCriterion("cxsj is null");
            return (Criteria) this;
        }

        public Criteria andCxsjIsNotNull() {
            addCriterion("cxsj is not null");
            return (Criteria) this;
        }

        public Criteria andCxsjEqualTo(String value) {
            addCriterion("cxsj =", value, "cxsj");
            return (Criteria) this;
        }

        public Criteria andCxsjNotEqualTo(String value) {
            addCriterion("cxsj <>", value, "cxsj");
            return (Criteria) this;
        }

        public Criteria andCxsjGreaterThan(String value) {
            addCriterion("cxsj >", value, "cxsj");
            return (Criteria) this;
        }

        public Criteria andCxsjGreaterThanOrEqualTo(String value) {
            addCriterion("cxsj >=", value, "cxsj");
            return (Criteria) this;
        }

        public Criteria andCxsjLessThan(String value) {
            addCriterion("cxsj <", value, "cxsj");
            return (Criteria) this;
        }

        public Criteria andCxsjLessThanOrEqualTo(String value) {
            addCriterion("cxsj <=", value, "cxsj");
            return (Criteria) this;
        }

        public Criteria andCxsjLike(String value) {
            addCriterion("cxsj like", value, "cxsj");
            return (Criteria) this;
        }

        public Criteria andCxsjNotLike(String value) {
            addCriterion("cxsj not like", value, "cxsj");
            return (Criteria) this;
        }

        public Criteria andCxsjIn(List<String> values) {
            addCriterion("cxsj in", values, "cxsj");
            return (Criteria) this;
        }

        public Criteria andCxsjNotIn(List<String> values) {
            addCriterion("cxsj not in", values, "cxsj");
            return (Criteria) this;
        }

        public Criteria andCxsjBetween(String value1, String value2) {
            addCriterion("cxsj between", value1, value2, "cxsj");
            return (Criteria) this;
        }

        public Criteria andCxsjNotBetween(String value1, String value2) {
            addCriterion("cxsj not between", value1, value2, "cxsj");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAttenceIsNull() {
            addCriterion("attence is null");
            return (Criteria) this;
        }

        public Criteria andAttenceIsNotNull() {
            addCriterion("attence is not null");
            return (Criteria) this;
        }

        public Criteria andAttenceEqualTo(String value) {
            addCriterion("attence =", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceNotEqualTo(String value) {
            addCriterion("attence <>", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceGreaterThan(String value) {
            addCriterion("attence >", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceGreaterThanOrEqualTo(String value) {
            addCriterion("attence >=", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceLessThan(String value) {
            addCriterion("attence <", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceLessThanOrEqualTo(String value) {
            addCriterion("attence <=", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceLike(String value) {
            addCriterion("attence like", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceNotLike(String value) {
            addCriterion("attence not like", value, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceIn(List<String> values) {
            addCriterion("attence in", values, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceNotIn(List<String> values) {
            addCriterion("attence not in", values, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceBetween(String value1, String value2) {
            addCriterion("attence between", value1, value2, "attence");
            return (Criteria) this;
        }

        public Criteria andAttenceNotBetween(String value1, String value2) {
            addCriterion("attence not between", value1, value2, "attence");
            return (Criteria) this;
        }

        public Criteria andInstitutionIsNull() {
            addCriterion("institution is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionIsNotNull() {
            addCriterion("institution is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionEqualTo(String value) {
            addCriterion("institution =", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionNotEqualTo(String value) {
            addCriterion("institution <>", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionGreaterThan(String value) {
            addCriterion("institution >", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("institution >=", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionLessThan(String value) {
            addCriterion("institution <", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionLessThanOrEqualTo(String value) {
            addCriterion("institution <=", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionLike(String value) {
            addCriterion("institution like", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionNotLike(String value) {
            addCriterion("institution not like", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionIn(List<String> values) {
            addCriterion("institution in", values, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionNotIn(List<String> values) {
            addCriterion("institution not in", values, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionBetween(String value1, String value2) {
            addCriterion("institution between", value1, value2, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionNotBetween(String value1, String value2) {
            addCriterion("institution not between", value1, value2, "institution");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("teacher_id like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("teacher_id not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andIsTaskIsNull() {
            addCriterion("is_task is null");
            return (Criteria) this;
        }

        public Criteria andIsTaskIsNotNull() {
            addCriterion("is_task is not null");
            return (Criteria) this;
        }

        public Criteria andIsTaskEqualTo(Integer value) {
            addCriterion("is_task =", value, "isTask");
            return (Criteria) this;
        }

        public Criteria andIsTaskNotEqualTo(Integer value) {
            addCriterion("is_task <>", value, "isTask");
            return (Criteria) this;
        }

        public Criteria andIsTaskGreaterThan(Integer value) {
            addCriterion("is_task >", value, "isTask");
            return (Criteria) this;
        }

        public Criteria andIsTaskGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_task >=", value, "isTask");
            return (Criteria) this;
        }

        public Criteria andIsTaskLessThan(Integer value) {
            addCriterion("is_task <", value, "isTask");
            return (Criteria) this;
        }

        public Criteria andIsTaskLessThanOrEqualTo(Integer value) {
            addCriterion("is_task <=", value, "isTask");
            return (Criteria) this;
        }

        public Criteria andIsTaskIn(List<Integer> values) {
            addCriterion("is_task in", values, "isTask");
            return (Criteria) this;
        }

        public Criteria andIsTaskNotIn(List<Integer> values) {
            addCriterion("is_task not in", values, "isTask");
            return (Criteria) this;
        }

        public Criteria andIsTaskBetween(Integer value1, Integer value2) {
            addCriterion("is_task between", value1, value2, "isTask");
            return (Criteria) this;
        }

        public Criteria andIsTaskNotBetween(Integer value1, Integer value2) {
            addCriterion("is_task not between", value1, value2, "isTask");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateIsNull() {
            addCriterion("is_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateIsNotNull() {
            addCriterion("is_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateEqualTo(Integer value) {
            addCriterion("is_evaluate =", value, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateNotEqualTo(Integer value) {
            addCriterion("is_evaluate <>", value, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateGreaterThan(Integer value) {
            addCriterion("is_evaluate >", value, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_evaluate >=", value, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateLessThan(Integer value) {
            addCriterion("is_evaluate <", value, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateLessThanOrEqualTo(Integer value) {
            addCriterion("is_evaluate <=", value, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateIn(List<Integer> values) {
            addCriterion("is_evaluate in", values, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateNotIn(List<Integer> values) {
            addCriterion("is_evaluate not in", values, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateBetween(Integer value1, Integer value2) {
            addCriterion("is_evaluate between", value1, value2, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateNotBetween(Integer value1, Integer value2) {
            addCriterion("is_evaluate not between", value1, value2, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andHavestIsNull() {
            addCriterion("havest is null");
            return (Criteria) this;
        }

        public Criteria andHavestIsNotNull() {
            addCriterion("havest is not null");
            return (Criteria) this;
        }

        public Criteria andHavestEqualTo(String value) {
            addCriterion("havest =", value, "havest");
            return (Criteria) this;
        }

        public Criteria andHavestNotEqualTo(String value) {
            addCriterion("havest <>", value, "havest");
            return (Criteria) this;
        }

        public Criteria andHavestGreaterThan(String value) {
            addCriterion("havest >", value, "havest");
            return (Criteria) this;
        }

        public Criteria andHavestGreaterThanOrEqualTo(String value) {
            addCriterion("havest >=", value, "havest");
            return (Criteria) this;
        }

        public Criteria andHavestLessThan(String value) {
            addCriterion("havest <", value, "havest");
            return (Criteria) this;
        }

        public Criteria andHavestLessThanOrEqualTo(String value) {
            addCriterion("havest <=", value, "havest");
            return (Criteria) this;
        }

        public Criteria andHavestLike(String value) {
            addCriterion("havest like", value, "havest");
            return (Criteria) this;
        }

        public Criteria andHavestNotLike(String value) {
            addCriterion("havest not like", value, "havest");
            return (Criteria) this;
        }

        public Criteria andHavestIn(List<String> values) {
            addCriterion("havest in", values, "havest");
            return (Criteria) this;
        }

        public Criteria andHavestNotIn(List<String> values) {
            addCriterion("havest not in", values, "havest");
            return (Criteria) this;
        }

        public Criteria andHavestBetween(String value1, String value2) {
            addCriterion("havest between", value1, value2, "havest");
            return (Criteria) this;
        }

        public Criteria andHavestNotBetween(String value1, String value2) {
            addCriterion("havest not between", value1, value2, "havest");
            return (Criteria) this;
        }

        public Criteria andSftthdIsNull() {
            addCriterion("Sftthd is null");
            return (Criteria) this;
        }

        public Criteria andSftthdIsNotNull() {
            addCriterion("Sftthd is not null");
            return (Criteria) this;
        }

        public Criteria andSftthdEqualTo(String value) {
            addCriterion("Sftthd =", value, "sftthd");
            return (Criteria) this;
        }

        public Criteria andSftthdNotEqualTo(String value) {
            addCriterion("Sftthd <>", value, "sftthd");
            return (Criteria) this;
        }

        public Criteria andSftthdGreaterThan(String value) {
            addCriterion("Sftthd >", value, "sftthd");
            return (Criteria) this;
        }

        public Criteria andSftthdGreaterThanOrEqualTo(String value) {
            addCriterion("Sftthd >=", value, "sftthd");
            return (Criteria) this;
        }

        public Criteria andSftthdLessThan(String value) {
            addCriterion("Sftthd <", value, "sftthd");
            return (Criteria) this;
        }

        public Criteria andSftthdLessThanOrEqualTo(String value) {
            addCriterion("Sftthd <=", value, "sftthd");
            return (Criteria) this;
        }

        public Criteria andSftthdLike(String value) {
            addCriterion("Sftthd like", value, "sftthd");
            return (Criteria) this;
        }

        public Criteria andSftthdNotLike(String value) {
            addCriterion("Sftthd not like", value, "sftthd");
            return (Criteria) this;
        }

        public Criteria andSftthdIn(List<String> values) {
            addCriterion("Sftthd in", values, "sftthd");
            return (Criteria) this;
        }

        public Criteria andSftthdNotIn(List<String> values) {
            addCriterion("Sftthd not in", values, "sftthd");
            return (Criteria) this;
        }

        public Criteria andSftthdBetween(String value1, String value2) {
            addCriterion("Sftthd between", value1, value2, "sftthd");
            return (Criteria) this;
        }

        public Criteria andSftthdNotBetween(String value1, String value2) {
            addCriterion("Sftthd not between", value1, value2, "sftthd");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("class_id like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("class_id not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andSyncStateIsNull() {
            addCriterion("sync_state is null");
            return (Criteria) this;
        }

        public Criteria andSyncStateIsNotNull() {
            addCriterion("sync_state is not null");
            return (Criteria) this;
        }

        public Criteria andSyncStateEqualTo(String value) {
            addCriterion("sync_state =", value, "syncState");
            return (Criteria) this;
        }

        public Criteria andSyncStateNotEqualTo(String value) {
            addCriterion("sync_state <>", value, "syncState");
            return (Criteria) this;
        }

        public Criteria andSyncStateGreaterThan(String value) {
            addCriterion("sync_state >", value, "syncState");
            return (Criteria) this;
        }

        public Criteria andSyncStateGreaterThanOrEqualTo(String value) {
            addCriterion("sync_state >=", value, "syncState");
            return (Criteria) this;
        }

        public Criteria andSyncStateLessThan(String value) {
            addCriterion("sync_state <", value, "syncState");
            return (Criteria) this;
        }

        public Criteria andSyncStateLessThanOrEqualTo(String value) {
            addCriterion("sync_state <=", value, "syncState");
            return (Criteria) this;
        }

        public Criteria andSyncStateLike(String value) {
            addCriterion("sync_state like", value, "syncState");
            return (Criteria) this;
        }

        public Criteria andSyncStateNotLike(String value) {
            addCriterion("sync_state not like", value, "syncState");
            return (Criteria) this;
        }

        public Criteria andSyncStateIn(List<String> values) {
            addCriterion("sync_state in", values, "syncState");
            return (Criteria) this;
        }

        public Criteria andSyncStateNotIn(List<String> values) {
            addCriterion("sync_state not in", values, "syncState");
            return (Criteria) this;
        }

        public Criteria andSyncStateBetween(String value1, String value2) {
            addCriterion("sync_state between", value1, value2, "syncState");
            return (Criteria) this;
        }

        public Criteria andSyncStateNotBetween(String value1, String value2) {
            addCriterion("sync_state not between", value1, value2, "syncState");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSfbxhdIsNull() {
            addCriterion("sfbxhd is null");
            return (Criteria) this;
        }

        public Criteria andSfbxhdIsNotNull() {
            addCriterion("sfbxhd is not null");
            return (Criteria) this;
        }

        public Criteria andSfbxhdEqualTo(String value) {
            addCriterion("sfbxhd =", value, "sfbxhd");
            return (Criteria) this;
        }

        public Criteria andSfbxhdNotEqualTo(String value) {
            addCriterion("sfbxhd <>", value, "sfbxhd");
            return (Criteria) this;
        }

        public Criteria andSfbxhdGreaterThan(String value) {
            addCriterion("sfbxhd >", value, "sfbxhd");
            return (Criteria) this;
        }

        public Criteria andSfbxhdGreaterThanOrEqualTo(String value) {
            addCriterion("sfbxhd >=", value, "sfbxhd");
            return (Criteria) this;
        }

        public Criteria andSfbxhdLessThan(String value) {
            addCriterion("sfbxhd <", value, "sfbxhd");
            return (Criteria) this;
        }

        public Criteria andSfbxhdLessThanOrEqualTo(String value) {
            addCriterion("sfbxhd <=", value, "sfbxhd");
            return (Criteria) this;
        }

        public Criteria andSfbxhdLike(String value) {
            addCriterion("sfbxhd like", value, "sfbxhd");
            return (Criteria) this;
        }

        public Criteria andSfbxhdNotLike(String value) {
            addCriterion("sfbxhd not like", value, "sfbxhd");
            return (Criteria) this;
        }

        public Criteria andSfbxhdIn(List<String> values) {
            addCriterion("sfbxhd in", values, "sfbxhd");
            return (Criteria) this;
        }

        public Criteria andSfbxhdNotIn(List<String> values) {
            addCriterion("sfbxhd not in", values, "sfbxhd");
            return (Criteria) this;
        }

        public Criteria andSfbxhdBetween(String value1, String value2) {
            addCriterion("sfbxhd between", value1, value2, "sfbxhd");
            return (Criteria) this;
        }

        public Criteria andSfbxhdNotBetween(String value1, String value2) {
            addCriterion("sfbxhd not between", value1, value2, "sfbxhd");
            return (Criteria) this;
        }

        public Criteria andAddressLngIsNull() {
            addCriterion("address_lng is null");
            return (Criteria) this;
        }

        public Criteria andAddressLngIsNotNull() {
            addCriterion("address_lng is not null");
            return (Criteria) this;
        }

        public Criteria andAddressLngEqualTo(Double value) {
            addCriterion("address_lng =", value, "addressLng");
            return (Criteria) this;
        }

        public Criteria andAddressLngNotEqualTo(Double value) {
            addCriterion("address_lng <>", value, "addressLng");
            return (Criteria) this;
        }

        public Criteria andAddressLngGreaterThan(Double value) {
            addCriterion("address_lng >", value, "addressLng");
            return (Criteria) this;
        }

        public Criteria andAddressLngGreaterThanOrEqualTo(Double value) {
            addCriterion("address_lng >=", value, "addressLng");
            return (Criteria) this;
        }

        public Criteria andAddressLngLessThan(Double value) {
            addCriterion("address_lng <", value, "addressLng");
            return (Criteria) this;
        }

        public Criteria andAddressLngLessThanOrEqualTo(Double value) {
            addCriterion("address_lng <=", value, "addressLng");
            return (Criteria) this;
        }

        public Criteria andAddressLngIn(List<Double> values) {
            addCriterion("address_lng in", values, "addressLng");
            return (Criteria) this;
        }

        public Criteria andAddressLngNotIn(List<Double> values) {
            addCriterion("address_lng not in", values, "addressLng");
            return (Criteria) this;
        }

        public Criteria andAddressLngBetween(Double value1, Double value2) {
            addCriterion("address_lng between", value1, value2, "addressLng");
            return (Criteria) this;
        }

        public Criteria andAddressLngNotBetween(Double value1, Double value2) {
            addCriterion("address_lng not between", value1, value2, "addressLng");
            return (Criteria) this;
        }

        public Criteria andAddressLatIsNull() {
            addCriterion("address_lat is null");
            return (Criteria) this;
        }

        public Criteria andAddressLatIsNotNull() {
            addCriterion("address_lat is not null");
            return (Criteria) this;
        }

        public Criteria andAddressLatEqualTo(Double value) {
            addCriterion("address_lat =", value, "addressLat");
            return (Criteria) this;
        }

        public Criteria andAddressLatNotEqualTo(Double value) {
            addCriterion("address_lat <>", value, "addressLat");
            return (Criteria) this;
        }

        public Criteria andAddressLatGreaterThan(Double value) {
            addCriterion("address_lat >", value, "addressLat");
            return (Criteria) this;
        }

        public Criteria andAddressLatGreaterThanOrEqualTo(Double value) {
            addCriterion("address_lat >=", value, "addressLat");
            return (Criteria) this;
        }

        public Criteria andAddressLatLessThan(Double value) {
            addCriterion("address_lat <", value, "addressLat");
            return (Criteria) this;
        }

        public Criteria andAddressLatLessThanOrEqualTo(Double value) {
            addCriterion("address_lat <=", value, "addressLat");
            return (Criteria) this;
        }

        public Criteria andAddressLatIn(List<Double> values) {
            addCriterion("address_lat in", values, "addressLat");
            return (Criteria) this;
        }

        public Criteria andAddressLatNotIn(List<Double> values) {
            addCriterion("address_lat not in", values, "addressLat");
            return (Criteria) this;
        }

        public Criteria andAddressLatBetween(Double value1, Double value2) {
            addCriterion("address_lat between", value1, value2, "addressLat");
            return (Criteria) this;
        }

        public Criteria andAddressLatNotBetween(Double value1, Double value2) {
            addCriterion("address_lat not between", value1, value2, "addressLat");
            return (Criteria) this;
        }

        public Criteria andSubschoolIsNull() {
            addCriterion("subschool is null");
            return (Criteria) this;
        }

        public Criteria andSubschoolIsNotNull() {
            addCriterion("subschool is not null");
            return (Criteria) this;
        }

        public Criteria andSubschoolEqualTo(String value) {
            addCriterion("subschool =", value, "subschool");
            return (Criteria) this;
        }

        public Criteria andSubschoolNotEqualTo(String value) {
            addCriterion("subschool <>", value, "subschool");
            return (Criteria) this;
        }

        public Criteria andSubschoolGreaterThan(String value) {
            addCriterion("subschool >", value, "subschool");
            return (Criteria) this;
        }

        public Criteria andSubschoolGreaterThanOrEqualTo(String value) {
            addCriterion("subschool >=", value, "subschool");
            return (Criteria) this;
        }

        public Criteria andSubschoolLessThan(String value) {
            addCriterion("subschool <", value, "subschool");
            return (Criteria) this;
        }

        public Criteria andSubschoolLessThanOrEqualTo(String value) {
            addCriterion("subschool <=", value, "subschool");
            return (Criteria) this;
        }

        public Criteria andSubschoolLike(String value) {
            addCriterion("subschool like", value, "subschool");
            return (Criteria) this;
        }

        public Criteria andSubschoolNotLike(String value) {
            addCriterion("subschool not like", value, "subschool");
            return (Criteria) this;
        }

        public Criteria andSubschoolIn(List<String> values) {
            addCriterion("subschool in", values, "subschool");
            return (Criteria) this;
        }

        public Criteria andSubschoolNotIn(List<String> values) {
            addCriterion("subschool not in", values, "subschool");
            return (Criteria) this;
        }

        public Criteria andSubschoolBetween(String value1, String value2) {
            addCriterion("subschool between", value1, value2, "subschool");
            return (Criteria) this;
        }

        public Criteria andSubschoolNotBetween(String value1, String value2) {
            addCriterion("subschool not between", value1, value2, "subschool");
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