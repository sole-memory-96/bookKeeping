package com.kkb.pojo;

import java.util.ArrayList;
import java.util.List;

public class BillTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillTypeExample() {
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

        public Criteria andId_IsNull() {
            addCriterion("id_ is null");
            return (Criteria) this;
        }

        public Criteria andId_IsNotNull() {
            addCriterion("id_ is not null");
            return (Criteria) this;
        }

        public Criteria andId_EqualTo(Long value) {
            addCriterion("id_ =", value, "id_");
            return (Criteria) this;
        }

        public Criteria andId_NotEqualTo(Long value) {
            addCriterion("id_ <>", value, "id_");
            return (Criteria) this;
        }

        public Criteria andId_GreaterThan(Long value) {
            addCriterion("id_ >", value, "id_");
            return (Criteria) this;
        }

        public Criteria andId_GreaterThanOrEqualTo(Long value) {
            addCriterion("id_ >=", value, "id_");
            return (Criteria) this;
        }

        public Criteria andId_LessThan(Long value) {
            addCriterion("id_ <", value, "id_");
            return (Criteria) this;
        }

        public Criteria andId_LessThanOrEqualTo(Long value) {
            addCriterion("id_ <=", value, "id_");
            return (Criteria) this;
        }

        public Criteria andId_In(List<Long> values) {
            addCriterion("id_ in", values, "id_");
            return (Criteria) this;
        }

        public Criteria andId_NotIn(List<Long> values) {
            addCriterion("id_ not in", values, "id_");
            return (Criteria) this;
        }

        public Criteria andId_Between(Long value1, Long value2) {
            addCriterion("id_ between", value1, value2, "id_");
            return (Criteria) this;
        }

        public Criteria andId_NotBetween(Long value1, Long value2) {
            addCriterion("id_ not between", value1, value2, "id_");
            return (Criteria) this;
        }

        public Criteria andName_IsNull() {
            addCriterion("name_ is null");
            return (Criteria) this;
        }

        public Criteria andName_IsNotNull() {
            addCriterion("name_ is not null");
            return (Criteria) this;
        }

        public Criteria andName_EqualTo(String value) {
            addCriterion("name_ =", value, "name_");
            return (Criteria) this;
        }

        public Criteria andName_NotEqualTo(String value) {
            addCriterion("name_ <>", value, "name_");
            return (Criteria) this;
        }

        public Criteria andName_GreaterThan(String value) {
            addCriterion("name_ >", value, "name_");
            return (Criteria) this;
        }

        public Criteria andName_GreaterThanOrEqualTo(String value) {
            addCriterion("name_ >=", value, "name_");
            return (Criteria) this;
        }

        public Criteria andName_LessThan(String value) {
            addCriterion("name_ <", value, "name_");
            return (Criteria) this;
        }

        public Criteria andName_LessThanOrEqualTo(String value) {
            addCriterion("name_ <=", value, "name_");
            return (Criteria) this;
        }

        public Criteria andName_Like(String value) {
            addCriterion("name_ like", value, "name_");
            return (Criteria) this;
        }

        public Criteria andName_NotLike(String value) {
            addCriterion("name_ not like", value, "name_");
            return (Criteria) this;
        }

        public Criteria andName_In(List<String> values) {
            addCriterion("name_ in", values, "name_");
            return (Criteria) this;
        }

        public Criteria andName_NotIn(List<String> values) {
            addCriterion("name_ not in", values, "name_");
            return (Criteria) this;
        }

        public Criteria andName_Between(String value1, String value2) {
            addCriterion("name_ between", value1, value2, "name_");
            return (Criteria) this;
        }

        public Criteria andName_NotBetween(String value1, String value2) {
            addCriterion("name_ not between", value1, value2, "name_");
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