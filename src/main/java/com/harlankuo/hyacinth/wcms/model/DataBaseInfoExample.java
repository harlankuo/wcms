package com.harlankuo.hyacinth.wcms.model;

import java.util.ArrayList;
import java.util.List;

public class DataBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataBaseInfoExample() {
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

        public Criteria andBaseinfoIdIsNull() {
            addCriterion("baseinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIdIsNotNull() {
            addCriterion("baseinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIdEqualTo(Integer value) {
            addCriterion("baseinfo_id =", value, "baseinfoId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIdNotEqualTo(Integer value) {
            addCriterion("baseinfo_id <>", value, "baseinfoId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIdGreaterThan(Integer value) {
            addCriterion("baseinfo_id >", value, "baseinfoId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("baseinfo_id >=", value, "baseinfoId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIdLessThan(Integer value) {
            addCriterion("baseinfo_id <", value, "baseinfoId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("baseinfo_id <=", value, "baseinfoId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIdIn(List<Integer> values) {
            addCriterion("baseinfo_id in", values, "baseinfoId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIdNotIn(List<Integer> values) {
            addCriterion("baseinfo_id not in", values, "baseinfoId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("baseinfo_id between", value1, value2, "baseinfoId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("baseinfo_id not between", value1, value2, "baseinfoId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameIsNull() {
            addCriterion("baseinfo_name is null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameIsNotNull() {
            addCriterion("baseinfo_name is not null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameEqualTo(String value) {
            addCriterion("baseinfo_name =", value, "baseinfoName");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameNotEqualTo(String value) {
            addCriterion("baseinfo_name <>", value, "baseinfoName");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameGreaterThan(String value) {
            addCriterion("baseinfo_name >", value, "baseinfoName");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("baseinfo_name >=", value, "baseinfoName");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameLessThan(String value) {
            addCriterion("baseinfo_name <", value, "baseinfoName");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameLessThanOrEqualTo(String value) {
            addCriterion("baseinfo_name <=", value, "baseinfoName");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameLike(String value) {
            addCriterion("baseinfo_name like", value, "baseinfoName");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameNotLike(String value) {
            addCriterion("baseinfo_name not like", value, "baseinfoName");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameIn(List<String> values) {
            addCriterion("baseinfo_name in", values, "baseinfoName");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameNotIn(List<String> values) {
            addCriterion("baseinfo_name not in", values, "baseinfoName");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameBetween(String value1, String value2) {
            addCriterion("baseinfo_name between", value1, value2, "baseinfoName");
            return (Criteria) this;
        }

        public Criteria andBaseinfoNameNotBetween(String value1, String value2) {
            addCriterion("baseinfo_name not between", value1, value2, "baseinfoName");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlIsNull() {
            addCriterion("baseinfo_url is null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlIsNotNull() {
            addCriterion("baseinfo_url is not null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlEqualTo(String value) {
            addCriterion("baseinfo_url =", value, "baseinfoUrl");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlNotEqualTo(String value) {
            addCriterion("baseinfo_url <>", value, "baseinfoUrl");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlGreaterThan(String value) {
            addCriterion("baseinfo_url >", value, "baseinfoUrl");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("baseinfo_url >=", value, "baseinfoUrl");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlLessThan(String value) {
            addCriterion("baseinfo_url <", value, "baseinfoUrl");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlLessThanOrEqualTo(String value) {
            addCriterion("baseinfo_url <=", value, "baseinfoUrl");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlLike(String value) {
            addCriterion("baseinfo_url like", value, "baseinfoUrl");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlNotLike(String value) {
            addCriterion("baseinfo_url not like", value, "baseinfoUrl");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlIn(List<String> values) {
            addCriterion("baseinfo_url in", values, "baseinfoUrl");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlNotIn(List<String> values) {
            addCriterion("baseinfo_url not in", values, "baseinfoUrl");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlBetween(String value1, String value2) {
            addCriterion("baseinfo_url between", value1, value2, "baseinfoUrl");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUrlNotBetween(String value1, String value2) {
            addCriterion("baseinfo_url not between", value1, value2, "baseinfoUrl");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescIsNull() {
            addCriterion("baseinfo_desc is null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescIsNotNull() {
            addCriterion("baseinfo_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescEqualTo(String value) {
            addCriterion("baseinfo_desc =", value, "baseinfoDesc");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescNotEqualTo(String value) {
            addCriterion("baseinfo_desc <>", value, "baseinfoDesc");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescGreaterThan(String value) {
            addCriterion("baseinfo_desc >", value, "baseinfoDesc");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescGreaterThanOrEqualTo(String value) {
            addCriterion("baseinfo_desc >=", value, "baseinfoDesc");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescLessThan(String value) {
            addCriterion("baseinfo_desc <", value, "baseinfoDesc");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescLessThanOrEqualTo(String value) {
            addCriterion("baseinfo_desc <=", value, "baseinfoDesc");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescLike(String value) {
            addCriterion("baseinfo_desc like", value, "baseinfoDesc");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescNotLike(String value) {
            addCriterion("baseinfo_desc not like", value, "baseinfoDesc");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescIn(List<String> values) {
            addCriterion("baseinfo_desc in", values, "baseinfoDesc");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescNotIn(List<String> values) {
            addCriterion("baseinfo_desc not in", values, "baseinfoDesc");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescBetween(String value1, String value2) {
            addCriterion("baseinfo_desc between", value1, value2, "baseinfoDesc");
            return (Criteria) this;
        }

        public Criteria andBaseinfoDescNotBetween(String value1, String value2) {
            addCriterion("baseinfo_desc not between", value1, value2, "baseinfoDesc");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUserIdIsNull() {
            addCriterion("baseinfo_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUserIdIsNotNull() {
            addCriterion("baseinfo_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUserIdEqualTo(Integer value) {
            addCriterion("baseinfo_user_id =", value, "baseinfoUserId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUserIdNotEqualTo(Integer value) {
            addCriterion("baseinfo_user_id <>", value, "baseinfoUserId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUserIdGreaterThan(Integer value) {
            addCriterion("baseinfo_user_id >", value, "baseinfoUserId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("baseinfo_user_id >=", value, "baseinfoUserId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUserIdLessThan(Integer value) {
            addCriterion("baseinfo_user_id <", value, "baseinfoUserId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("baseinfo_user_id <=", value, "baseinfoUserId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUserIdIn(List<Integer> values) {
            addCriterion("baseinfo_user_id in", values, "baseinfoUserId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUserIdNotIn(List<Integer> values) {
            addCriterion("baseinfo_user_id not in", values, "baseinfoUserId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUserIdBetween(Integer value1, Integer value2) {
            addCriterion("baseinfo_user_id between", value1, value2, "baseinfoUserId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("baseinfo_user_id not between", value1, value2, "baseinfoUserId");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsdeleteIsNull() {
            addCriterion("baseinfo_isdelete is null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsdeleteIsNotNull() {
            addCriterion("baseinfo_isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsdeleteEqualTo(Integer value) {
            addCriterion("baseinfo_isdelete =", value, "baseinfoIsdelete");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsdeleteNotEqualTo(Integer value) {
            addCriterion("baseinfo_isdelete <>", value, "baseinfoIsdelete");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsdeleteGreaterThan(Integer value) {
            addCriterion("baseinfo_isdelete >", value, "baseinfoIsdelete");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("baseinfo_isdelete >=", value, "baseinfoIsdelete");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsdeleteLessThan(Integer value) {
            addCriterion("baseinfo_isdelete <", value, "baseinfoIsdelete");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("baseinfo_isdelete <=", value, "baseinfoIsdelete");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsdeleteIn(List<Integer> values) {
            addCriterion("baseinfo_isdelete in", values, "baseinfoIsdelete");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsdeleteNotIn(List<Integer> values) {
            addCriterion("baseinfo_isdelete not in", values, "baseinfoIsdelete");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("baseinfo_isdelete between", value1, value2, "baseinfoIsdelete");
            return (Criteria) this;
        }

        public Criteria andBaseinfoIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("baseinfo_isdelete not between", value1, value2, "baseinfoIsdelete");
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