package com.zime.maven.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BorrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBwIdIsNull() {
            addCriterion("bw_id is null");
            return (Criteria) this;
        }

        public Criteria andBwIdIsNotNull() {
            addCriterion("bw_id is not null");
            return (Criteria) this;
        }

        public Criteria andBwIdEqualTo(Integer value) {
            addCriterion("bw_id =", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdNotEqualTo(Integer value) {
            addCriterion("bw_id <>", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdGreaterThan(Integer value) {
            addCriterion("bw_id >", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bw_id >=", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdLessThan(Integer value) {
            addCriterion("bw_id <", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdLessThanOrEqualTo(Integer value) {
            addCriterion("bw_id <=", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdIn(List<Integer> values) {
            addCriterion("bw_id in", values, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdNotIn(List<Integer> values) {
            addCriterion("bw_id not in", values, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdBetween(Integer value1, Integer value2) {
            addCriterion("bw_id between", value1, value2, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bw_id not between", value1, value2, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIsbnIsNull() {
            addCriterion("bw_isbn is null");
            return (Criteria) this;
        }

        public Criteria andBwIsbnIsNotNull() {
            addCriterion("bw_isbn is not null");
            return (Criteria) this;
        }

        public Criteria andBwIsbnEqualTo(String value) {
            addCriterion("bw_isbn =", value, "bwIsbn");
            return (Criteria) this;
        }

        public Criteria andBwIsbnNotEqualTo(String value) {
            addCriterion("bw_isbn <>", value, "bwIsbn");
            return (Criteria) this;
        }

        public Criteria andBwIsbnGreaterThan(String value) {
            addCriterion("bw_isbn >", value, "bwIsbn");
            return (Criteria) this;
        }

        public Criteria andBwIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("bw_isbn >=", value, "bwIsbn");
            return (Criteria) this;
        }

        public Criteria andBwIsbnLessThan(String value) {
            addCriterion("bw_isbn <", value, "bwIsbn");
            return (Criteria) this;
        }

        public Criteria andBwIsbnLessThanOrEqualTo(String value) {
            addCriterion("bw_isbn <=", value, "bwIsbn");
            return (Criteria) this;
        }

        public Criteria andBwIsbnLike(String value) {
            addCriterion("bw_isbn like", value, "bwIsbn");
            return (Criteria) this;
        }

        public Criteria andBwIsbnNotLike(String value) {
            addCriterion("bw_isbn not like", value, "bwIsbn");
            return (Criteria) this;
        }

        public Criteria andBwIsbnIn(List<String> values) {
            addCriterion("bw_isbn in", values, "bwIsbn");
            return (Criteria) this;
        }

        public Criteria andBwIsbnNotIn(List<String> values) {
            addCriterion("bw_isbn not in", values, "bwIsbn");
            return (Criteria) this;
        }

        public Criteria andBwIsbnBetween(String value1, String value2) {
            addCriterion("bw_isbn between", value1, value2, "bwIsbn");
            return (Criteria) this;
        }

        public Criteria andBwIsbnNotBetween(String value1, String value2) {
            addCriterion("bw_isbn not between", value1, value2, "bwIsbn");
            return (Criteria) this;
        }

        public Criteria andBwUsernameIsNull() {
            addCriterion("bw_username is null");
            return (Criteria) this;
        }

        public Criteria andBwUsernameIsNotNull() {
            addCriterion("bw_username is not null");
            return (Criteria) this;
        }

        public Criteria andBwUsernameEqualTo(String value) {
            addCriterion("bw_username =", value, "bwUsername");
            return (Criteria) this;
        }

        public Criteria andBwUsernameNotEqualTo(String value) {
            addCriterion("bw_username <>", value, "bwUsername");
            return (Criteria) this;
        }

        public Criteria andBwUsernameGreaterThan(String value) {
            addCriterion("bw_username >", value, "bwUsername");
            return (Criteria) this;
        }

        public Criteria andBwUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("bw_username >=", value, "bwUsername");
            return (Criteria) this;
        }

        public Criteria andBwUsernameLessThan(String value) {
            addCriterion("bw_username <", value, "bwUsername");
            return (Criteria) this;
        }

        public Criteria andBwUsernameLessThanOrEqualTo(String value) {
            addCriterion("bw_username <=", value, "bwUsername");
            return (Criteria) this;
        }

        public Criteria andBwUsernameLike(String value) {
            addCriterion("bw_username like", value, "bwUsername");
            return (Criteria) this;
        }

        public Criteria andBwUsernameNotLike(String value) {
            addCriterion("bw_username not like", value, "bwUsername");
            return (Criteria) this;
        }

        public Criteria andBwUsernameIn(List<String> values) {
            addCriterion("bw_username in", values, "bwUsername");
            return (Criteria) this;
        }

        public Criteria andBwUsernameNotIn(List<String> values) {
            addCriterion("bw_username not in", values, "bwUsername");
            return (Criteria) this;
        }

        public Criteria andBwUsernameBetween(String value1, String value2) {
            addCriterion("bw_username between", value1, value2, "bwUsername");
            return (Criteria) this;
        }

        public Criteria andBwUsernameNotBetween(String value1, String value2) {
            addCriterion("bw_username not between", value1, value2, "bwUsername");
            return (Criteria) this;
        }

        public Criteria andBwOuttimeIsNull() {
            addCriterion("bw_outtime is null");
            return (Criteria) this;
        }

        public Criteria andBwOuttimeIsNotNull() {
            addCriterion("bw_outtime is not null");
            return (Criteria) this;
        }

        public Criteria andBwOuttimeEqualTo(Date value) {
            addCriterionForJDBCDate("bw_outtime =", value, "bwOuttime");
            return (Criteria) this;
        }

        public Criteria andBwOuttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("bw_outtime <>", value, "bwOuttime");
            return (Criteria) this;
        }

        public Criteria andBwOuttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("bw_outtime >", value, "bwOuttime");
            return (Criteria) this;
        }

        public Criteria andBwOuttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bw_outtime >=", value, "bwOuttime");
            return (Criteria) this;
        }

        public Criteria andBwOuttimeLessThan(Date value) {
            addCriterionForJDBCDate("bw_outtime <", value, "bwOuttime");
            return (Criteria) this;
        }

        public Criteria andBwOuttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bw_outtime <=", value, "bwOuttime");
            return (Criteria) this;
        }

        public Criteria andBwOuttimeIn(List<Date> values) {
            addCriterionForJDBCDate("bw_outtime in", values, "bwOuttime");
            return (Criteria) this;
        }

        public Criteria andBwOuttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("bw_outtime not in", values, "bwOuttime");
            return (Criteria) this;
        }

        public Criteria andBwOuttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bw_outtime between", value1, value2, "bwOuttime");
            return (Criteria) this;
        }

        public Criteria andBwOuttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bw_outtime not between", value1, value2, "bwOuttime");
            return (Criteria) this;
        }

        public Criteria andBwEndtimeIsNull() {
            addCriterion("bw_endtime is null");
            return (Criteria) this;
        }

        public Criteria andBwEndtimeIsNotNull() {
            addCriterion("bw_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andBwEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("bw_endtime =", value, "bwEndtime");
            return (Criteria) this;
        }

        public Criteria andBwEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("bw_endtime <>", value, "bwEndtime");
            return (Criteria) this;
        }

        public Criteria andBwEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("bw_endtime >", value, "bwEndtime");
            return (Criteria) this;
        }

        public Criteria andBwEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bw_endtime >=", value, "bwEndtime");
            return (Criteria) this;
        }

        public Criteria andBwEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("bw_endtime <", value, "bwEndtime");
            return (Criteria) this;
        }

        public Criteria andBwEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bw_endtime <=", value, "bwEndtime");
            return (Criteria) this;
        }

        public Criteria andBwEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("bw_endtime in", values, "bwEndtime");
            return (Criteria) this;
        }

        public Criteria andBwEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("bw_endtime not in", values, "bwEndtime");
            return (Criteria) this;
        }

        public Criteria andBwEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bw_endtime between", value1, value2, "bwEndtime");
            return (Criteria) this;
        }

        public Criteria andBwEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bw_endtime not between", value1, value2, "bwEndtime");
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