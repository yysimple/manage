package com.jxkj.manage.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Long value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Long value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Long value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Long value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Long value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Long> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Long> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Long value1, Long value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Long value1, Long value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andDescripeIsNull() {
            addCriterion("descripe is null");
            return (Criteria) this;
        }

        public Criteria andDescripeIsNotNull() {
            addCriterion("descripe is not null");
            return (Criteria) this;
        }

        public Criteria andDescripeEqualTo(String value) {
            addCriterion("descripe =", value, "descripe");
            return (Criteria) this;
        }

        public Criteria andDescripeNotEqualTo(String value) {
            addCriterion("descripe <>", value, "descripe");
            return (Criteria) this;
        }

        public Criteria andDescripeGreaterThan(String value) {
            addCriterion("descripe >", value, "descripe");
            return (Criteria) this;
        }

        public Criteria andDescripeGreaterThanOrEqualTo(String value) {
            addCriterion("descripe >=", value, "descripe");
            return (Criteria) this;
        }

        public Criteria andDescripeLessThan(String value) {
            addCriterion("descripe <", value, "descripe");
            return (Criteria) this;
        }

        public Criteria andDescripeLessThanOrEqualTo(String value) {
            addCriterion("descripe <=", value, "descripe");
            return (Criteria) this;
        }

        public Criteria andDescripeLike(String value) {
            addCriterion("descripe like", value, "descripe");
            return (Criteria) this;
        }

        public Criteria andDescripeNotLike(String value) {
            addCriterion("descripe not like", value, "descripe");
            return (Criteria) this;
        }

        public Criteria andDescripeIn(List<String> values) {
            addCriterion("descripe in", values, "descripe");
            return (Criteria) this;
        }

        public Criteria andDescripeNotIn(List<String> values) {
            addCriterion("descripe not in", values, "descripe");
            return (Criteria) this;
        }

        public Criteria andDescripeBetween(String value1, String value2) {
            addCriterion("descripe between", value1, value2, "descripe");
            return (Criteria) this;
        }

        public Criteria andDescripeNotBetween(String value1, String value2) {
            addCriterion("descripe not between", value1, value2, "descripe");
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