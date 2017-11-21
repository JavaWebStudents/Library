package com.zime.maven.entity;

import java.util.ArrayList;
import java.util.List;

public class ManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMUsernameIsNull() {
            addCriterion("m_username is null");
            return (Criteria) this;
        }

        public Criteria andMUsernameIsNotNull() {
            addCriterion("m_username is not null");
            return (Criteria) this;
        }

        public Criteria andMUsernameEqualTo(String value) {
            addCriterion("m_username =", value, "mUsername");
            return (Criteria) this;
        }

        public Criteria andMUsernameNotEqualTo(String value) {
            addCriterion("m_username <>", value, "mUsername");
            return (Criteria) this;
        }

        public Criteria andMUsernameGreaterThan(String value) {
            addCriterion("m_username >", value, "mUsername");
            return (Criteria) this;
        }

        public Criteria andMUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("m_username >=", value, "mUsername");
            return (Criteria) this;
        }

        public Criteria andMUsernameLessThan(String value) {
            addCriterion("m_username <", value, "mUsername");
            return (Criteria) this;
        }

        public Criteria andMUsernameLessThanOrEqualTo(String value) {
            addCriterion("m_username <=", value, "mUsername");
            return (Criteria) this;
        }

        public Criteria andMUsernameLike(String value) {
            addCriterion("m_username like", value, "mUsername");
            return (Criteria) this;
        }

        public Criteria andMUsernameNotLike(String value) {
            addCriterion("m_username not like", value, "mUsername");
            return (Criteria) this;
        }

        public Criteria andMUsernameIn(List<String> values) {
            addCriterion("m_username in", values, "mUsername");
            return (Criteria) this;
        }

        public Criteria andMUsernameNotIn(List<String> values) {
            addCriterion("m_username not in", values, "mUsername");
            return (Criteria) this;
        }

        public Criteria andMUsernameBetween(String value1, String value2) {
            addCriterion("m_username between", value1, value2, "mUsername");
            return (Criteria) this;
        }

        public Criteria andMUsernameNotBetween(String value1, String value2) {
            addCriterion("m_username not between", value1, value2, "mUsername");
            return (Criteria) this;
        }

        public Criteria andMPasswordIsNull() {
            addCriterion("m_password is null");
            return (Criteria) this;
        }

        public Criteria andMPasswordIsNotNull() {
            addCriterion("m_password is not null");
            return (Criteria) this;
        }

        public Criteria andMPasswordEqualTo(String value) {
            addCriterion("m_password =", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordNotEqualTo(String value) {
            addCriterion("m_password <>", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordGreaterThan(String value) {
            addCriterion("m_password >", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("m_password >=", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordLessThan(String value) {
            addCriterion("m_password <", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordLessThanOrEqualTo(String value) {
            addCriterion("m_password <=", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordLike(String value) {
            addCriterion("m_password like", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordNotLike(String value) {
            addCriterion("m_password not like", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordIn(List<String> values) {
            addCriterion("m_password in", values, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordNotIn(List<String> values) {
            addCriterion("m_password not in", values, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordBetween(String value1, String value2) {
            addCriterion("m_password between", value1, value2, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordNotBetween(String value1, String value2) {
            addCriterion("m_password not between", value1, value2, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMGenderIsNull() {
            addCriterion("m_gender is null");
            return (Criteria) this;
        }

        public Criteria andMGenderIsNotNull() {
            addCriterion("m_gender is not null");
            return (Criteria) this;
        }

        public Criteria andMGenderEqualTo(String value) {
            addCriterion("m_gender =", value, "mGender");
            return (Criteria) this;
        }

        public Criteria andMGenderNotEqualTo(String value) {
            addCriterion("m_gender <>", value, "mGender");
            return (Criteria) this;
        }

        public Criteria andMGenderGreaterThan(String value) {
            addCriterion("m_gender >", value, "mGender");
            return (Criteria) this;
        }

        public Criteria andMGenderGreaterThanOrEqualTo(String value) {
            addCriterion("m_gender >=", value, "mGender");
            return (Criteria) this;
        }

        public Criteria andMGenderLessThan(String value) {
            addCriterion("m_gender <", value, "mGender");
            return (Criteria) this;
        }

        public Criteria andMGenderLessThanOrEqualTo(String value) {
            addCriterion("m_gender <=", value, "mGender");
            return (Criteria) this;
        }

        public Criteria andMGenderLike(String value) {
            addCriterion("m_gender like", value, "mGender");
            return (Criteria) this;
        }

        public Criteria andMGenderNotLike(String value) {
            addCriterion("m_gender not like", value, "mGender");
            return (Criteria) this;
        }

        public Criteria andMGenderIn(List<String> values) {
            addCriterion("m_gender in", values, "mGender");
            return (Criteria) this;
        }

        public Criteria andMGenderNotIn(List<String> values) {
            addCriterion("m_gender not in", values, "mGender");
            return (Criteria) this;
        }

        public Criteria andMGenderBetween(String value1, String value2) {
            addCriterion("m_gender between", value1, value2, "mGender");
            return (Criteria) this;
        }

        public Criteria andMGenderNotBetween(String value1, String value2) {
            addCriterion("m_gender not between", value1, value2, "mGender");
            return (Criteria) this;
        }

        public Criteria andMPhoneIsNull() {
            addCriterion("m_phone is null");
            return (Criteria) this;
        }

        public Criteria andMPhoneIsNotNull() {
            addCriterion("m_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMPhoneEqualTo(String value) {
            addCriterion("m_phone =", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneNotEqualTo(String value) {
            addCriterion("m_phone <>", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneGreaterThan(String value) {
            addCriterion("m_phone >", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("m_phone >=", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneLessThan(String value) {
            addCriterion("m_phone <", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneLessThanOrEqualTo(String value) {
            addCriterion("m_phone <=", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneLike(String value) {
            addCriterion("m_phone like", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneNotLike(String value) {
            addCriterion("m_phone not like", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneIn(List<String> values) {
            addCriterion("m_phone in", values, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneNotIn(List<String> values) {
            addCriterion("m_phone not in", values, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneBetween(String value1, String value2) {
            addCriterion("m_phone between", value1, value2, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneNotBetween(String value1, String value2) {
            addCriterion("m_phone not between", value1, value2, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMLevelIsNull() {
            addCriterion("m_level is null");
            return (Criteria) this;
        }

        public Criteria andMLevelIsNotNull() {
            addCriterion("m_level is not null");
            return (Criteria) this;
        }

        public Criteria andMLevelEqualTo(Integer value) {
            addCriterion("m_level =", value, "mLevel");
            return (Criteria) this;
        }

        public Criteria andMLevelNotEqualTo(Integer value) {
            addCriterion("m_level <>", value, "mLevel");
            return (Criteria) this;
        }

        public Criteria andMLevelGreaterThan(Integer value) {
            addCriterion("m_level >", value, "mLevel");
            return (Criteria) this;
        }

        public Criteria andMLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_level >=", value, "mLevel");
            return (Criteria) this;
        }

        public Criteria andMLevelLessThan(Integer value) {
            addCriterion("m_level <", value, "mLevel");
            return (Criteria) this;
        }

        public Criteria andMLevelLessThanOrEqualTo(Integer value) {
            addCriterion("m_level <=", value, "mLevel");
            return (Criteria) this;
        }

        public Criteria andMLevelIn(List<Integer> values) {
            addCriterion("m_level in", values, "mLevel");
            return (Criteria) this;
        }

        public Criteria andMLevelNotIn(List<Integer> values) {
            addCriterion("m_level not in", values, "mLevel");
            return (Criteria) this;
        }

        public Criteria andMLevelBetween(Integer value1, Integer value2) {
            addCriterion("m_level between", value1, value2, "mLevel");
            return (Criteria) this;
        }

        public Criteria andMLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("m_level not between", value1, value2, "mLevel");
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