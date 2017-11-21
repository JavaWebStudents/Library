package com.zime.maven.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiushuiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiushuiExample() {
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

        public Criteria andLIdIsNull() {
            addCriterion("l_id is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("l_id is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(Integer value) {
            addCriterion("l_id =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(Integer value) {
            addCriterion("l_id <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(Integer value) {
            addCriterion("l_id >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_id >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(Integer value) {
            addCriterion("l_id <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(Integer value) {
            addCriterion("l_id <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<Integer> values) {
            addCriterion("l_id in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<Integer> values) {
            addCriterion("l_id not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(Integer value1, Integer value2) {
            addCriterion("l_id between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(Integer value1, Integer value2) {
            addCriterion("l_id not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIsbnIsNull() {
            addCriterion("l_isbn is null");
            return (Criteria) this;
        }

        public Criteria andLIsbnIsNotNull() {
            addCriterion("l_isbn is not null");
            return (Criteria) this;
        }

        public Criteria andLIsbnEqualTo(String value) {
            addCriterion("l_isbn =", value, "lIsbn");
            return (Criteria) this;
        }

        public Criteria andLIsbnNotEqualTo(String value) {
            addCriterion("l_isbn <>", value, "lIsbn");
            return (Criteria) this;
        }

        public Criteria andLIsbnGreaterThan(String value) {
            addCriterion("l_isbn >", value, "lIsbn");
            return (Criteria) this;
        }

        public Criteria andLIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("l_isbn >=", value, "lIsbn");
            return (Criteria) this;
        }

        public Criteria andLIsbnLessThan(String value) {
            addCriterion("l_isbn <", value, "lIsbn");
            return (Criteria) this;
        }

        public Criteria andLIsbnLessThanOrEqualTo(String value) {
            addCriterion("l_isbn <=", value, "lIsbn");
            return (Criteria) this;
        }

        public Criteria andLIsbnLike(String value) {
            addCriterion("l_isbn like", value, "lIsbn");
            return (Criteria) this;
        }

        public Criteria andLIsbnNotLike(String value) {
            addCriterion("l_isbn not like", value, "lIsbn");
            return (Criteria) this;
        }

        public Criteria andLIsbnIn(List<String> values) {
            addCriterion("l_isbn in", values, "lIsbn");
            return (Criteria) this;
        }

        public Criteria andLIsbnNotIn(List<String> values) {
            addCriterion("l_isbn not in", values, "lIsbn");
            return (Criteria) this;
        }

        public Criteria andLIsbnBetween(String value1, String value2) {
            addCriterion("l_isbn between", value1, value2, "lIsbn");
            return (Criteria) this;
        }

        public Criteria andLIsbnNotBetween(String value1, String value2) {
            addCriterion("l_isbn not between", value1, value2, "lIsbn");
            return (Criteria) this;
        }

        public Criteria andLUsernameIsNull() {
            addCriterion("l_username is null");
            return (Criteria) this;
        }

        public Criteria andLUsernameIsNotNull() {
            addCriterion("l_username is not null");
            return (Criteria) this;
        }

        public Criteria andLUsernameEqualTo(String value) {
            addCriterion("l_username =", value, "lUsername");
            return (Criteria) this;
        }

        public Criteria andLUsernameNotEqualTo(String value) {
            addCriterion("l_username <>", value, "lUsername");
            return (Criteria) this;
        }

        public Criteria andLUsernameGreaterThan(String value) {
            addCriterion("l_username >", value, "lUsername");
            return (Criteria) this;
        }

        public Criteria andLUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("l_username >=", value, "lUsername");
            return (Criteria) this;
        }

        public Criteria andLUsernameLessThan(String value) {
            addCriterion("l_username <", value, "lUsername");
            return (Criteria) this;
        }

        public Criteria andLUsernameLessThanOrEqualTo(String value) {
            addCriterion("l_username <=", value, "lUsername");
            return (Criteria) this;
        }

        public Criteria andLUsernameLike(String value) {
            addCriterion("l_username like", value, "lUsername");
            return (Criteria) this;
        }

        public Criteria andLUsernameNotLike(String value) {
            addCriterion("l_username not like", value, "lUsername");
            return (Criteria) this;
        }

        public Criteria andLUsernameIn(List<String> values) {
            addCriterion("l_username in", values, "lUsername");
            return (Criteria) this;
        }

        public Criteria andLUsernameNotIn(List<String> values) {
            addCriterion("l_username not in", values, "lUsername");
            return (Criteria) this;
        }

        public Criteria andLUsernameBetween(String value1, String value2) {
            addCriterion("l_username between", value1, value2, "lUsername");
            return (Criteria) this;
        }

        public Criteria andLUsernameNotBetween(String value1, String value2) {
            addCriterion("l_username not between", value1, value2, "lUsername");
            return (Criteria) this;
        }

        public Criteria andLHandleIsNull() {
            addCriterion("l_handle is null");
            return (Criteria) this;
        }

        public Criteria andLHandleIsNotNull() {
            addCriterion("l_handle is not null");
            return (Criteria) this;
        }

        public Criteria andLHandleEqualTo(String value) {
            addCriterion("l_handle =", value, "lHandle");
            return (Criteria) this;
        }

        public Criteria andLHandleNotEqualTo(String value) {
            addCriterion("l_handle <>", value, "lHandle");
            return (Criteria) this;
        }

        public Criteria andLHandleGreaterThan(String value) {
            addCriterion("l_handle >", value, "lHandle");
            return (Criteria) this;
        }

        public Criteria andLHandleGreaterThanOrEqualTo(String value) {
            addCriterion("l_handle >=", value, "lHandle");
            return (Criteria) this;
        }

        public Criteria andLHandleLessThan(String value) {
            addCriterion("l_handle <", value, "lHandle");
            return (Criteria) this;
        }

        public Criteria andLHandleLessThanOrEqualTo(String value) {
            addCriterion("l_handle <=", value, "lHandle");
            return (Criteria) this;
        }

        public Criteria andLHandleLike(String value) {
            addCriterion("l_handle like", value, "lHandle");
            return (Criteria) this;
        }

        public Criteria andLHandleNotLike(String value) {
            addCriterion("l_handle not like", value, "lHandle");
            return (Criteria) this;
        }

        public Criteria andLHandleIn(List<String> values) {
            addCriterion("l_handle in", values, "lHandle");
            return (Criteria) this;
        }

        public Criteria andLHandleNotIn(List<String> values) {
            addCriterion("l_handle not in", values, "lHandle");
            return (Criteria) this;
        }

        public Criteria andLHandleBetween(String value1, String value2) {
            addCriterion("l_handle between", value1, value2, "lHandle");
            return (Criteria) this;
        }

        public Criteria andLHandleNotBetween(String value1, String value2) {
            addCriterion("l_handle not between", value1, value2, "lHandle");
            return (Criteria) this;
        }

        public Criteria andLDatetimeIsNull() {
            addCriterion("l_datetime is null");
            return (Criteria) this;
        }

        public Criteria andLDatetimeIsNotNull() {
            addCriterion("l_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andLDatetimeEqualTo(Date value) {
            addCriterion("l_datetime =", value, "lDatetime");
            return (Criteria) this;
        }

        public Criteria andLDatetimeNotEqualTo(Date value) {
            addCriterion("l_datetime <>", value, "lDatetime");
            return (Criteria) this;
        }

        public Criteria andLDatetimeGreaterThan(Date value) {
            addCriterion("l_datetime >", value, "lDatetime");
            return (Criteria) this;
        }

        public Criteria andLDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("l_datetime >=", value, "lDatetime");
            return (Criteria) this;
        }

        public Criteria andLDatetimeLessThan(Date value) {
            addCriterion("l_datetime <", value, "lDatetime");
            return (Criteria) this;
        }

        public Criteria andLDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("l_datetime <=", value, "lDatetime");
            return (Criteria) this;
        }

        public Criteria andLDatetimeIn(List<Date> values) {
            addCriterion("l_datetime in", values, "lDatetime");
            return (Criteria) this;
        }

        public Criteria andLDatetimeNotIn(List<Date> values) {
            addCriterion("l_datetime not in", values, "lDatetime");
            return (Criteria) this;
        }

        public Criteria andLDatetimeBetween(Date value1, Date value2) {
            addCriterion("l_datetime between", value1, value2, "lDatetime");
            return (Criteria) this;
        }

        public Criteria andLDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("l_datetime not between", value1, value2, "lDatetime");
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