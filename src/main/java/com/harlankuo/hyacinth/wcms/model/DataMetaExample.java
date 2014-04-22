package com.harlankuo.hyacinth.wcms.model;

import java.util.ArrayList;
import java.util.List;

public class DataMetaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataMetaExample() {
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

        public Criteria andMetaIdIsNull() {
            addCriterion("meta_id is null");
            return (Criteria) this;
        }

        public Criteria andMetaIdIsNotNull() {
            addCriterion("meta_id is not null");
            return (Criteria) this;
        }

        public Criteria andMetaIdEqualTo(Integer value) {
            addCriterion("meta_id =", value, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdNotEqualTo(Integer value) {
            addCriterion("meta_id <>", value, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdGreaterThan(Integer value) {
            addCriterion("meta_id >", value, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meta_id >=", value, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdLessThan(Integer value) {
            addCriterion("meta_id <", value, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdLessThanOrEqualTo(Integer value) {
            addCriterion("meta_id <=", value, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdIn(List<Integer> values) {
            addCriterion("meta_id in", values, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdNotIn(List<Integer> values) {
            addCriterion("meta_id not in", values, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdBetween(Integer value1, Integer value2) {
            addCriterion("meta_id between", value1, value2, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meta_id not between", value1, value2, "metaId");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIsNull() {
            addCriterion("meta_keywords is null");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIsNotNull() {
            addCriterion("meta_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsEqualTo(String value) {
            addCriterion("meta_keywords =", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotEqualTo(String value) {
            addCriterion("meta_keywords <>", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsGreaterThan(String value) {
            addCriterion("meta_keywords >", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("meta_keywords >=", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLessThan(String value) {
            addCriterion("meta_keywords <", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLessThanOrEqualTo(String value) {
            addCriterion("meta_keywords <=", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLike(String value) {
            addCriterion("meta_keywords like", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotLike(String value) {
            addCriterion("meta_keywords not like", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIn(List<String> values) {
            addCriterion("meta_keywords in", values, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotIn(List<String> values) {
            addCriterion("meta_keywords not in", values, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsBetween(String value1, String value2) {
            addCriterion("meta_keywords between", value1, value2, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotBetween(String value1, String value2) {
            addCriterion("meta_keywords not between", value1, value2, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIsNull() {
            addCriterion("meta_description is null");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIsNotNull() {
            addCriterion("meta_description is not null");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionEqualTo(String value) {
            addCriterion("meta_description =", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotEqualTo(String value) {
            addCriterion("meta_description <>", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionGreaterThan(String value) {
            addCriterion("meta_description >", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("meta_description >=", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLessThan(String value) {
            addCriterion("meta_description <", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLessThanOrEqualTo(String value) {
            addCriterion("meta_description <=", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLike(String value) {
            addCriterion("meta_description like", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotLike(String value) {
            addCriterion("meta_description not like", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIn(List<String> values) {
            addCriterion("meta_description in", values, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotIn(List<String> values) {
            addCriterion("meta_description not in", values, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionBetween(String value1, String value2) {
            addCriterion("meta_description between", value1, value2, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotBetween(String value1, String value2) {
            addCriterion("meta_description not between", value1, value2, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorIsNull() {
            addCriterion("meta_author is null");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorIsNotNull() {
            addCriterion("meta_author is not null");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorEqualTo(String value) {
            addCriterion("meta_author =", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorNotEqualTo(String value) {
            addCriterion("meta_author <>", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorGreaterThan(String value) {
            addCriterion("meta_author >", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("meta_author >=", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorLessThan(String value) {
            addCriterion("meta_author <", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorLessThanOrEqualTo(String value) {
            addCriterion("meta_author <=", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorLike(String value) {
            addCriterion("meta_author like", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorNotLike(String value) {
            addCriterion("meta_author not like", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorIn(List<String> values) {
            addCriterion("meta_author in", values, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorNotIn(List<String> values) {
            addCriterion("meta_author not in", values, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorBetween(String value1, String value2) {
            addCriterion("meta_author between", value1, value2, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorNotBetween(String value1, String value2) {
            addCriterion("meta_author not between", value1, value2, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightIsNull() {
            addCriterion("meta_copyright is null");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightIsNotNull() {
            addCriterion("meta_copyright is not null");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightEqualTo(String value) {
            addCriterion("meta_copyright =", value, "metaCopyright");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightNotEqualTo(String value) {
            addCriterion("meta_copyright <>", value, "metaCopyright");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightGreaterThan(String value) {
            addCriterion("meta_copyright >", value, "metaCopyright");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("meta_copyright >=", value, "metaCopyright");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightLessThan(String value) {
            addCriterion("meta_copyright <", value, "metaCopyright");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightLessThanOrEqualTo(String value) {
            addCriterion("meta_copyright <=", value, "metaCopyright");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightLike(String value) {
            addCriterion("meta_copyright like", value, "metaCopyright");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightNotLike(String value) {
            addCriterion("meta_copyright not like", value, "metaCopyright");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightIn(List<String> values) {
            addCriterion("meta_copyright in", values, "metaCopyright");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightNotIn(List<String> values) {
            addCriterion("meta_copyright not in", values, "metaCopyright");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightBetween(String value1, String value2) {
            addCriterion("meta_copyright between", value1, value2, "metaCopyright");
            return (Criteria) this;
        }

        public Criteria andMetaCopyrightNotBetween(String value1, String value2) {
            addCriterion("meta_copyright not between", value1, value2, "metaCopyright");
            return (Criteria) this;
        }

        public Criteria andMetaContentIdIsNull() {
            addCriterion("meta_content_id is null");
            return (Criteria) this;
        }

        public Criteria andMetaContentIdIsNotNull() {
            addCriterion("meta_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andMetaContentIdEqualTo(Integer value) {
            addCriterion("meta_content_id =", value, "metaContentId");
            return (Criteria) this;
        }

        public Criteria andMetaContentIdNotEqualTo(Integer value) {
            addCriterion("meta_content_id <>", value, "metaContentId");
            return (Criteria) this;
        }

        public Criteria andMetaContentIdGreaterThan(Integer value) {
            addCriterion("meta_content_id >", value, "metaContentId");
            return (Criteria) this;
        }

        public Criteria andMetaContentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meta_content_id >=", value, "metaContentId");
            return (Criteria) this;
        }

        public Criteria andMetaContentIdLessThan(Integer value) {
            addCriterion("meta_content_id <", value, "metaContentId");
            return (Criteria) this;
        }

        public Criteria andMetaContentIdLessThanOrEqualTo(Integer value) {
            addCriterion("meta_content_id <=", value, "metaContentId");
            return (Criteria) this;
        }

        public Criteria andMetaContentIdIn(List<Integer> values) {
            addCriterion("meta_content_id in", values, "metaContentId");
            return (Criteria) this;
        }

        public Criteria andMetaContentIdNotIn(List<Integer> values) {
            addCriterion("meta_content_id not in", values, "metaContentId");
            return (Criteria) this;
        }

        public Criteria andMetaContentIdBetween(Integer value1, Integer value2) {
            addCriterion("meta_content_id between", value1, value2, "metaContentId");
            return (Criteria) this;
        }

        public Criteria andMetaContentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meta_content_id not between", value1, value2, "metaContentId");
            return (Criteria) this;
        }

        public Criteria andMetaIsdeleteIsNull() {
            addCriterion("meta_isdelete is null");
            return (Criteria) this;
        }

        public Criteria andMetaIsdeleteIsNotNull() {
            addCriterion("meta_isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andMetaIsdeleteEqualTo(Integer value) {
            addCriterion("meta_isdelete =", value, "metaIsdelete");
            return (Criteria) this;
        }

        public Criteria andMetaIsdeleteNotEqualTo(Integer value) {
            addCriterion("meta_isdelete <>", value, "metaIsdelete");
            return (Criteria) this;
        }

        public Criteria andMetaIsdeleteGreaterThan(Integer value) {
            addCriterion("meta_isdelete >", value, "metaIsdelete");
            return (Criteria) this;
        }

        public Criteria andMetaIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("meta_isdelete >=", value, "metaIsdelete");
            return (Criteria) this;
        }

        public Criteria andMetaIsdeleteLessThan(Integer value) {
            addCriterion("meta_isdelete <", value, "metaIsdelete");
            return (Criteria) this;
        }

        public Criteria andMetaIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("meta_isdelete <=", value, "metaIsdelete");
            return (Criteria) this;
        }

        public Criteria andMetaIsdeleteIn(List<Integer> values) {
            addCriterion("meta_isdelete in", values, "metaIsdelete");
            return (Criteria) this;
        }

        public Criteria andMetaIsdeleteNotIn(List<Integer> values) {
            addCriterion("meta_isdelete not in", values, "metaIsdelete");
            return (Criteria) this;
        }

        public Criteria andMetaIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("meta_isdelete between", value1, value2, "metaIsdelete");
            return (Criteria) this;
        }

        public Criteria andMetaIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("meta_isdelete not between", value1, value2, "metaIsdelete");
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