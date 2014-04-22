package com.harlankuo.hyacinth.wcms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataContentExample() {
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

        public Criteria andContentIdIsNull() {
            addCriterion("content_id is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("content_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(Integer value) {
            addCriterion("content_id =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(Integer value) {
            addCriterion("content_id <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(Integer value) {
            addCriterion("content_id >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_id >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(Integer value) {
            addCriterion("content_id <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(Integer value) {
            addCriterion("content_id <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<Integer> values) {
            addCriterion("content_id in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<Integer> values) {
            addCriterion("content_id not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(Integer value1, Integer value2) {
            addCriterion("content_id between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("content_id not between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentTitleIsNull() {
            addCriterion("content_title is null");
            return (Criteria) this;
        }

        public Criteria andContentTitleIsNotNull() {
            addCriterion("content_title is not null");
            return (Criteria) this;
        }

        public Criteria andContentTitleEqualTo(String value) {
            addCriterion("content_title =", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotEqualTo(String value) {
            addCriterion("content_title <>", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleGreaterThan(String value) {
            addCriterion("content_title >", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleGreaterThanOrEqualTo(String value) {
            addCriterion("content_title >=", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleLessThan(String value) {
            addCriterion("content_title <", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleLessThanOrEqualTo(String value) {
            addCriterion("content_title <=", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleLike(String value) {
            addCriterion("content_title like", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotLike(String value) {
            addCriterion("content_title not like", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleIn(List<String> values) {
            addCriterion("content_title in", values, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotIn(List<String> values) {
            addCriterion("content_title not in", values, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleBetween(String value1, String value2) {
            addCriterion("content_title between", value1, value2, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotBetween(String value1, String value2) {
            addCriterion("content_title not between", value1, value2, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentImageurlIsNull() {
            addCriterion("content_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andContentImageurlIsNotNull() {
            addCriterion("content_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andContentImageurlEqualTo(String value) {
            addCriterion("content_imageurl =", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlNotEqualTo(String value) {
            addCriterion("content_imageurl <>", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlGreaterThan(String value) {
            addCriterion("content_imageurl >", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("content_imageurl >=", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlLessThan(String value) {
            addCriterion("content_imageurl <", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlLessThanOrEqualTo(String value) {
            addCriterion("content_imageurl <=", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlLike(String value) {
            addCriterion("content_imageurl like", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlNotLike(String value) {
            addCriterion("content_imageurl not like", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlIn(List<String> values) {
            addCriterion("content_imageurl in", values, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlNotIn(List<String> values) {
            addCriterion("content_imageurl not in", values, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlBetween(String value1, String value2) {
            addCriterion("content_imageurl between", value1, value2, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlNotBetween(String value1, String value2) {
            addCriterion("content_imageurl not between", value1, value2, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentPublishtimeIsNull() {
            addCriterion("content_publishtime is null");
            return (Criteria) this;
        }

        public Criteria andContentPublishtimeIsNotNull() {
            addCriterion("content_publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andContentPublishtimeEqualTo(Date value) {
            addCriterion("content_publishtime =", value, "contentPublishtime");
            return (Criteria) this;
        }

        public Criteria andContentPublishtimeNotEqualTo(Date value) {
            addCriterion("content_publishtime <>", value, "contentPublishtime");
            return (Criteria) this;
        }

        public Criteria andContentPublishtimeGreaterThan(Date value) {
            addCriterion("content_publishtime >", value, "contentPublishtime");
            return (Criteria) this;
        }

        public Criteria andContentPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("content_publishtime >=", value, "contentPublishtime");
            return (Criteria) this;
        }

        public Criteria andContentPublishtimeLessThan(Date value) {
            addCriterion("content_publishtime <", value, "contentPublishtime");
            return (Criteria) this;
        }

        public Criteria andContentPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("content_publishtime <=", value, "contentPublishtime");
            return (Criteria) this;
        }

        public Criteria andContentPublishtimeIn(List<Date> values) {
            addCriterion("content_publishtime in", values, "contentPublishtime");
            return (Criteria) this;
        }

        public Criteria andContentPublishtimeNotIn(List<Date> values) {
            addCriterion("content_publishtime not in", values, "contentPublishtime");
            return (Criteria) this;
        }

        public Criteria andContentPublishtimeBetween(Date value1, Date value2) {
            addCriterion("content_publishtime between", value1, value2, "contentPublishtime");
            return (Criteria) this;
        }

        public Criteria andContentPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("content_publishtime not between", value1, value2, "contentPublishtime");
            return (Criteria) this;
        }

        public Criteria andContentDescIsNull() {
            addCriterion("content_desc is null");
            return (Criteria) this;
        }

        public Criteria andContentDescIsNotNull() {
            addCriterion("content_desc is not null");
            return (Criteria) this;
        }

        public Criteria andContentDescEqualTo(String value) {
            addCriterion("content_desc =", value, "contentDesc");
            return (Criteria) this;
        }

        public Criteria andContentDescNotEqualTo(String value) {
            addCriterion("content_desc <>", value, "contentDesc");
            return (Criteria) this;
        }

        public Criteria andContentDescGreaterThan(String value) {
            addCriterion("content_desc >", value, "contentDesc");
            return (Criteria) this;
        }

        public Criteria andContentDescGreaterThanOrEqualTo(String value) {
            addCriterion("content_desc >=", value, "contentDesc");
            return (Criteria) this;
        }

        public Criteria andContentDescLessThan(String value) {
            addCriterion("content_desc <", value, "contentDesc");
            return (Criteria) this;
        }

        public Criteria andContentDescLessThanOrEqualTo(String value) {
            addCriterion("content_desc <=", value, "contentDesc");
            return (Criteria) this;
        }

        public Criteria andContentDescLike(String value) {
            addCriterion("content_desc like", value, "contentDesc");
            return (Criteria) this;
        }

        public Criteria andContentDescNotLike(String value) {
            addCriterion("content_desc not like", value, "contentDesc");
            return (Criteria) this;
        }

        public Criteria andContentDescIn(List<String> values) {
            addCriterion("content_desc in", values, "contentDesc");
            return (Criteria) this;
        }

        public Criteria andContentDescNotIn(List<String> values) {
            addCriterion("content_desc not in", values, "contentDesc");
            return (Criteria) this;
        }

        public Criteria andContentDescBetween(String value1, String value2) {
            addCriterion("content_desc between", value1, value2, "contentDesc");
            return (Criteria) this;
        }

        public Criteria andContentDescNotBetween(String value1, String value2) {
            addCriterion("content_desc not between", value1, value2, "contentDesc");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdIsNull() {
            addCriterion("content_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdIsNotNull() {
            addCriterion("content_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdEqualTo(Integer value) {
            addCriterion("content_menu_id =", value, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdNotEqualTo(Integer value) {
            addCriterion("content_menu_id <>", value, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdGreaterThan(Integer value) {
            addCriterion("content_menu_id >", value, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_menu_id >=", value, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdLessThan(Integer value) {
            addCriterion("content_menu_id <", value, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("content_menu_id <=", value, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdIn(List<Integer> values) {
            addCriterion("content_menu_id in", values, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdNotIn(List<Integer> values) {
            addCriterion("content_menu_id not in", values, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("content_menu_id between", value1, value2, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("content_menu_id not between", value1, value2, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentIsdeleteIsNull() {
            addCriterion("content_isdelete is null");
            return (Criteria) this;
        }

        public Criteria andContentIsdeleteIsNotNull() {
            addCriterion("content_isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andContentIsdeleteEqualTo(Integer value) {
            addCriterion("content_isdelete =", value, "contentIsdelete");
            return (Criteria) this;
        }

        public Criteria andContentIsdeleteNotEqualTo(Integer value) {
            addCriterion("content_isdelete <>", value, "contentIsdelete");
            return (Criteria) this;
        }

        public Criteria andContentIsdeleteGreaterThan(Integer value) {
            addCriterion("content_isdelete >", value, "contentIsdelete");
            return (Criteria) this;
        }

        public Criteria andContentIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_isdelete >=", value, "contentIsdelete");
            return (Criteria) this;
        }

        public Criteria andContentIsdeleteLessThan(Integer value) {
            addCriterion("content_isdelete <", value, "contentIsdelete");
            return (Criteria) this;
        }

        public Criteria andContentIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("content_isdelete <=", value, "contentIsdelete");
            return (Criteria) this;
        }

        public Criteria andContentIsdeleteIn(List<Integer> values) {
            addCriterion("content_isdelete in", values, "contentIsdelete");
            return (Criteria) this;
        }

        public Criteria andContentIsdeleteNotIn(List<Integer> values) {
            addCriterion("content_isdelete not in", values, "contentIsdelete");
            return (Criteria) this;
        }

        public Criteria andContentIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("content_isdelete between", value1, value2, "contentIsdelete");
            return (Criteria) this;
        }

        public Criteria andContentIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("content_isdelete not between", value1, value2, "contentIsdelete");
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