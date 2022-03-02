package com.kkb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillExample() {
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

        public Criteria andTitle_IsNull() {
            addCriterion("title_ is null");
            return (Criteria) this;
        }

        public Criteria andTitle_IsNotNull() {
            addCriterion("title_ is not null");
            return (Criteria) this;
        }

        public Criteria andTitle_EqualTo(String value) {
            addCriterion("title_ =", value, "title_");
            return (Criteria) this;
        }

        public Criteria andTitle_NotEqualTo(String value) {
            addCriterion("title_ <>", value, "title_");
            return (Criteria) this;
        }

        public Criteria andTitle_GreaterThan(String value) {
            addCriterion("title_ >", value, "title_");
            return (Criteria) this;
        }

        public Criteria andTitle_GreaterThanOrEqualTo(String value) {
            addCriterion("title_ >=", value, "title_");
            return (Criteria) this;
        }

        public Criteria andTitle_LessThan(String value) {
            addCriterion("title_ <", value, "title_");
            return (Criteria) this;
        }

        public Criteria andTitle_LessThanOrEqualTo(String value) {
            addCriterion("title_ <=", value, "title_");
            return (Criteria) this;
        }

        public Criteria andTitle_Like(String value) {
            addCriterion("title_ like", value, "title_");
            return (Criteria) this;
        }

        public Criteria andTitle_NotLike(String value) {
            addCriterion("title_ not like", value, "title_");
            return (Criteria) this;
        }

        public Criteria andTitle_In(List<String> values) {
            addCriterion("title_ in", values, "title_");
            return (Criteria) this;
        }

        public Criteria andTitle_NotIn(List<String> values) {
            addCriterion("title_ not in", values, "title_");
            return (Criteria) this;
        }

        public Criteria andTitle_Between(String value1, String value2) {
            addCriterion("title_ between", value1, value2, "title_");
            return (Criteria) this;
        }

        public Criteria andTitle_NotBetween(String value1, String value2) {
            addCriterion("title_ not between", value1, value2, "title_");
            return (Criteria) this;
        }

        public Criteria andBill_time_IsNull() {
            addCriterion("bill_time_ is null");
            return (Criteria) this;
        }

        public Criteria andBill_time_IsNotNull() {
            addCriterion("bill_time_ is not null");
            return (Criteria) this;
        }

        public Criteria andBill_time_EqualTo(Date value) {
            addCriterionForJDBCDate("bill_time_ =", value, "bill_time_");
            return (Criteria) this;
        }

        public Criteria andBill_time_NotEqualTo(Date value) {
            addCriterionForJDBCDate("bill_time_ <>", value, "bill_time_");
            return (Criteria) this;
        }

        public Criteria andBill_time_GreaterThan(Date value) {
            addCriterionForJDBCDate("bill_time_ >", value, "bill_time_");
            return (Criteria) this;
        }

        public Criteria andBill_time_GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bill_time_ >=", value, "bill_time_");
            return (Criteria) this;
        }

        public Criteria andBill_time_LessThan(Date value) {
            addCriterionForJDBCDate("bill_time_ <", value, "bill_time_");
            return (Criteria) this;
        }

        public Criteria andBill_time_LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bill_time_ <=", value, "bill_time_");
            return (Criteria) this;
        }

        public Criteria andBill_time_In(List<Date> values) {
            addCriterionForJDBCDate("bill_time_ in", values, "bill_time_");
            return (Criteria) this;
        }

        public Criteria andBill_time_NotIn(List<Date> values) {
            addCriterionForJDBCDate("bill_time_ not in", values, "bill_time_");
            return (Criteria) this;
        }

        public Criteria andBill_time_Between(Date value1, Date value2) {
            addCriterionForJDBCDate("bill_time_ between", value1, value2, "bill_time_");
            return (Criteria) this;
        }

        public Criteria andBill_time_NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bill_time_ not between", value1, value2, "bill_time_");
            return (Criteria) this;
        }

        public Criteria andType_id_IsNull() {
            addCriterion("type_id_ is null");
            return (Criteria) this;
        }

        public Criteria andType_id_IsNotNull() {
            addCriterion("type_id_ is not null");
            return (Criteria) this;
        }

        public Criteria andType_id_EqualTo(Long value) {
            addCriterion("type_id_ =", value, "type_id_");
            return (Criteria) this;
        }

        public Criteria andType_id_NotEqualTo(Long value) {
            addCriterion("type_id_ <>", value, "type_id_");
            return (Criteria) this;
        }

        public Criteria andType_id_GreaterThan(Long value) {
            addCriterion("type_id_ >", value, "type_id_");
            return (Criteria) this;
        }

        public Criteria andType_id_GreaterThanOrEqualTo(Long value) {
            addCriterion("type_id_ >=", value, "type_id_");
            return (Criteria) this;
        }

        public Criteria andType_id_LessThan(Long value) {
            addCriterion("type_id_ <", value, "type_id_");
            return (Criteria) this;
        }

        public Criteria andType_id_LessThanOrEqualTo(Long value) {
            addCriterion("type_id_ <=", value, "type_id_");
            return (Criteria) this;
        }

        public Criteria andType_id_In(List<Long> values) {
            addCriterion("type_id_ in", values, "type_id_");
            return (Criteria) this;
        }

        public Criteria andType_id_NotIn(List<Long> values) {
            addCriterion("type_id_ not in", values, "type_id_");
            return (Criteria) this;
        }

        public Criteria andType_id_Between(Long value1, Long value2) {
            addCriterion("type_id_ between", value1, value2, "type_id_");
            return (Criteria) this;
        }

        public Criteria andType_id_NotBetween(Long value1, Long value2) {
            addCriterion("type_id_ not between", value1, value2, "type_id_");
            return (Criteria) this;
        }

        public Criteria andPrice_IsNull() {
            addCriterion("price_ is null");
            return (Criteria) this;
        }

        public Criteria andPrice_IsNotNull() {
            addCriterion("price_ is not null");
            return (Criteria) this;
        }

        public Criteria andPrice_EqualTo(Double value) {
            addCriterion("price_ =", value, "price_");
            return (Criteria) this;
        }

        public Criteria andPrice_NotEqualTo(Double value) {
            addCriterion("price_ <>", value, "price_");
            return (Criteria) this;
        }

        public Criteria andPrice_GreaterThan(Double value) {
            addCriterion("price_ >", value, "price_");
            return (Criteria) this;
        }

        public Criteria andPrice_GreaterThanOrEqualTo(Double value) {
            addCriterion("price_ >=", value, "price_");
            return (Criteria) this;
        }

        public Criteria andPrice_LessThan(Double value) {
            addCriterion("price_ <", value, "price_");
            return (Criteria) this;
        }

        public Criteria andPrice_LessThanOrEqualTo(Double value) {
            addCriterion("price_ <=", value, "price_");
            return (Criteria) this;
        }

        public Criteria andPrice_In(List<Double> values) {
            addCriterion("price_ in", values, "price_");
            return (Criteria) this;
        }

        public Criteria andPrice_NotIn(List<Double> values) {
            addCriterion("price_ not in", values, "price_");
            return (Criteria) this;
        }

        public Criteria andPrice_Between(Double value1, Double value2) {
            addCriterion("price_ between", value1, value2, "price_");
            return (Criteria) this;
        }

        public Criteria andPrice_NotBetween(Double value1, Double value2) {
            addCriterion("price_ not between", value1, value2, "price_");
            return (Criteria) this;
        }

        public Criteria andExplain_IsNull() {
            addCriterion("explain_ is null");
            return (Criteria) this;
        }

        public Criteria andExplain_IsNotNull() {
            addCriterion("explain_ is not null");
            return (Criteria) this;
        }

        public Criteria andExplain_EqualTo(String value) {
            addCriterion("explain_ =", value, "explain_");
            return (Criteria) this;
        }

        public Criteria andExplain_NotEqualTo(String value) {
            addCriterion("explain_ <>", value, "explain_");
            return (Criteria) this;
        }

        public Criteria andExplain_GreaterThan(String value) {
            addCriterion("explain_ >", value, "explain_");
            return (Criteria) this;
        }

        public Criteria andExplain_GreaterThanOrEqualTo(String value) {
            addCriterion("explain_ >=", value, "explain_");
            return (Criteria) this;
        }

        public Criteria andExplain_LessThan(String value) {
            addCriterion("explain_ <", value, "explain_");
            return (Criteria) this;
        }

        public Criteria andExplain_LessThanOrEqualTo(String value) {
            addCriterion("explain_ <=", value, "explain_");
            return (Criteria) this;
        }

        public Criteria andExplain_Like(String value) {
            addCriterion("explain_ like", value, "explain_");
            return (Criteria) this;
        }

        public Criteria andExplain_NotLike(String value) {
            addCriterion("explain_ not like", value, "explain_");
            return (Criteria) this;
        }

        public Criteria andExplain_In(List<String> values) {
            addCriterion("explain_ in", values, "explain_");
            return (Criteria) this;
        }

        public Criteria andExplain_NotIn(List<String> values) {
            addCriterion("explain_ not in", values, "explain_");
            return (Criteria) this;
        }

        public Criteria andExplain_Between(String value1, String value2) {
            addCriterion("explain_ between", value1, value2, "explain_");
            return (Criteria) this;
        }

        public Criteria andExplain_NotBetween(String value1, String value2) {
            addCriterion("explain_ not between", value1, value2, "explain_");
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