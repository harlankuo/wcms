package com.harlankuo.hyacinth.wcms.model;

import java.util.ArrayList;
import java.util.List;

public class SysMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdIsNull() {
            addCriterion("menu_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdIsNotNull() {
            addCriterion("menu_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdEqualTo(Integer value) {
            addCriterion("menu_parent_id =", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdNotEqualTo(Integer value) {
            addCriterion("menu_parent_id <>", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdGreaterThan(Integer value) {
            addCriterion("menu_parent_id >", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_parent_id >=", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdLessThan(Integer value) {
            addCriterion("menu_parent_id <", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu_parent_id <=", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdIn(List<Integer> values) {
            addCriterion("menu_parent_id in", values, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdNotIn(List<Integer> values) {
            addCriterion("menu_parent_id not in", values, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdBetween(Integer value1, Integer value2) {
            addCriterion("menu_parent_id between", value1, value2, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_parent_id not between", value1, value2, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameIsNull() {
            addCriterion("menu_parent_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameIsNotNull() {
            addCriterion("menu_parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameEqualTo(String value) {
            addCriterion("menu_parent_name =", value, "menuParentName");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameNotEqualTo(String value) {
            addCriterion("menu_parent_name <>", value, "menuParentName");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameGreaterThan(String value) {
            addCriterion("menu_parent_name >", value, "menuParentName");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_parent_name >=", value, "menuParentName");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameLessThan(String value) {
            addCriterion("menu_parent_name <", value, "menuParentName");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameLessThanOrEqualTo(String value) {
            addCriterion("menu_parent_name <=", value, "menuParentName");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameLike(String value) {
            addCriterion("menu_parent_name like", value, "menuParentName");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameNotLike(String value) {
            addCriterion("menu_parent_name not like", value, "menuParentName");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameIn(List<String> values) {
            addCriterion("menu_parent_name in", values, "menuParentName");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameNotIn(List<String> values) {
            addCriterion("menu_parent_name not in", values, "menuParentName");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameBetween(String value1, String value2) {
            addCriterion("menu_parent_name between", value1, value2, "menuParentName");
            return (Criteria) this;
        }

        public Criteria andMenuParentNameNotBetween(String value1, String value2) {
            addCriterion("menu_parent_name not between", value1, value2, "menuParentName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("menu_type is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("menu_type is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(Integer value) {
            addCriterion("menu_type =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(Integer value) {
            addCriterion("menu_type <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(Integer value) {
            addCriterion("menu_type >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_type >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(Integer value) {
            addCriterion("menu_type <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(Integer value) {
            addCriterion("menu_type <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<Integer> values) {
            addCriterion("menu_type in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<Integer> values) {
            addCriterion("menu_type not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(Integer value1, Integer value2) {
            addCriterion("menu_type between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_type not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNull() {
            addCriterion("menu_url is null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNotNull() {
            addCriterion("menu_url is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlEqualTo(String value) {
            addCriterion("menu_url =", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotEqualTo(String value) {
            addCriterion("menu_url <>", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThan(String value) {
            addCriterion("menu_url >", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("menu_url >=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThan(String value) {
            addCriterion("menu_url <", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("menu_url <=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLike(String value) {
            addCriterion("menu_url like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotLike(String value) {
            addCriterion("menu_url not like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIn(List<String> values) {
            addCriterion("menu_url in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotIn(List<String> values) {
            addCriterion("menu_url not in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlBetween(String value1, String value2) {
            addCriterion("menu_url between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotBetween(String value1, String value2) {
            addCriterion("menu_url not between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNull() {
            addCriterion("menu_sort is null");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNotNull() {
            addCriterion("menu_sort is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSortEqualTo(Integer value) {
            addCriterion("menu_sort =", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotEqualTo(Integer value) {
            addCriterion("menu_sort <>", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThan(Integer value) {
            addCriterion("menu_sort >", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_sort >=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThan(Integer value) {
            addCriterion("menu_sort <", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThanOrEqualTo(Integer value) {
            addCriterion("menu_sort <=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortIn(List<Integer> values) {
            addCriterion("menu_sort in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotIn(List<Integer> values) {
            addCriterion("menu_sort not in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortBetween(Integer value1, Integer value2) {
            addCriterion("menu_sort between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_sort not between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuDisplayorderIsNull() {
            addCriterion("menu_displayorder is null");
            return (Criteria) this;
        }

        public Criteria andMenuDisplayorderIsNotNull() {
            addCriterion("menu_displayorder is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDisplayorderEqualTo(Integer value) {
            addCriterion("menu_displayorder =", value, "menuDisplayorder");
            return (Criteria) this;
        }

        public Criteria andMenuDisplayorderNotEqualTo(Integer value) {
            addCriterion("menu_displayorder <>", value, "menuDisplayorder");
            return (Criteria) this;
        }

        public Criteria andMenuDisplayorderGreaterThan(Integer value) {
            addCriterion("menu_displayorder >", value, "menuDisplayorder");
            return (Criteria) this;
        }

        public Criteria andMenuDisplayorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_displayorder >=", value, "menuDisplayorder");
            return (Criteria) this;
        }

        public Criteria andMenuDisplayorderLessThan(Integer value) {
            addCriterion("menu_displayorder <", value, "menuDisplayorder");
            return (Criteria) this;
        }

        public Criteria andMenuDisplayorderLessThanOrEqualTo(Integer value) {
            addCriterion("menu_displayorder <=", value, "menuDisplayorder");
            return (Criteria) this;
        }

        public Criteria andMenuDisplayorderIn(List<Integer> values) {
            addCriterion("menu_displayorder in", values, "menuDisplayorder");
            return (Criteria) this;
        }

        public Criteria andMenuDisplayorderNotIn(List<Integer> values) {
            addCriterion("menu_displayorder not in", values, "menuDisplayorder");
            return (Criteria) this;
        }

        public Criteria andMenuDisplayorderBetween(Integer value1, Integer value2) {
            addCriterion("menu_displayorder between", value1, value2, "menuDisplayorder");
            return (Criteria) this;
        }

        public Criteria andMenuDisplayorderNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_displayorder not between", value1, value2, "menuDisplayorder");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNull() {
            addCriterion("menu_desc is null");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNotNull() {
            addCriterion("menu_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDescEqualTo(String value) {
            addCriterion("menu_desc =", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotEqualTo(String value) {
            addCriterion("menu_desc <>", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThan(String value) {
            addCriterion("menu_desc >", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThanOrEqualTo(String value) {
            addCriterion("menu_desc >=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThan(String value) {
            addCriterion("menu_desc <", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThanOrEqualTo(String value) {
            addCriterion("menu_desc <=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLike(String value) {
            addCriterion("menu_desc like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotLike(String value) {
            addCriterion("menu_desc not like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescIn(List<String> values) {
            addCriterion("menu_desc in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotIn(List<String> values) {
            addCriterion("menu_desc not in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescBetween(String value1, String value2) {
            addCriterion("menu_desc between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotBetween(String value1, String value2) {
            addCriterion("menu_desc not between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuUserIdIsNull() {
            addCriterion("menu_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuUserIdIsNotNull() {
            addCriterion("menu_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUserIdEqualTo(Integer value) {
            addCriterion("menu_user_id =", value, "menuUserId");
            return (Criteria) this;
        }

        public Criteria andMenuUserIdNotEqualTo(Integer value) {
            addCriterion("menu_user_id <>", value, "menuUserId");
            return (Criteria) this;
        }

        public Criteria andMenuUserIdGreaterThan(Integer value) {
            addCriterion("menu_user_id >", value, "menuUserId");
            return (Criteria) this;
        }

        public Criteria andMenuUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_user_id >=", value, "menuUserId");
            return (Criteria) this;
        }

        public Criteria andMenuUserIdLessThan(Integer value) {
            addCriterion("menu_user_id <", value, "menuUserId");
            return (Criteria) this;
        }

        public Criteria andMenuUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu_user_id <=", value, "menuUserId");
            return (Criteria) this;
        }

        public Criteria andMenuUserIdIn(List<Integer> values) {
            addCriterion("menu_user_id in", values, "menuUserId");
            return (Criteria) this;
        }

        public Criteria andMenuUserIdNotIn(List<Integer> values) {
            addCriterion("menu_user_id not in", values, "menuUserId");
            return (Criteria) this;
        }

        public Criteria andMenuUserIdBetween(Integer value1, Integer value2) {
            addCriterion("menu_user_id between", value1, value2, "menuUserId");
            return (Criteria) this;
        }

        public Criteria andMenuUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_user_id not between", value1, value2, "menuUserId");
            return (Criteria) this;
        }

        public Criteria andMenuBaseinfoIdIsNull() {
            addCriterion("menu_baseinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuBaseinfoIdIsNotNull() {
            addCriterion("menu_baseinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuBaseinfoIdEqualTo(Integer value) {
            addCriterion("menu_baseinfo_id =", value, "menuBaseinfoId");
            return (Criteria) this;
        }

        public Criteria andMenuBaseinfoIdNotEqualTo(Integer value) {
            addCriterion("menu_baseinfo_id <>", value, "menuBaseinfoId");
            return (Criteria) this;
        }

        public Criteria andMenuBaseinfoIdGreaterThan(Integer value) {
            addCriterion("menu_baseinfo_id >", value, "menuBaseinfoId");
            return (Criteria) this;
        }

        public Criteria andMenuBaseinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_baseinfo_id >=", value, "menuBaseinfoId");
            return (Criteria) this;
        }

        public Criteria andMenuBaseinfoIdLessThan(Integer value) {
            addCriterion("menu_baseinfo_id <", value, "menuBaseinfoId");
            return (Criteria) this;
        }

        public Criteria andMenuBaseinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu_baseinfo_id <=", value, "menuBaseinfoId");
            return (Criteria) this;
        }

        public Criteria andMenuBaseinfoIdIn(List<Integer> values) {
            addCriterion("menu_baseinfo_id in", values, "menuBaseinfoId");
            return (Criteria) this;
        }

        public Criteria andMenuBaseinfoIdNotIn(List<Integer> values) {
            addCriterion("menu_baseinfo_id not in", values, "menuBaseinfoId");
            return (Criteria) this;
        }

        public Criteria andMenuBaseinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("menu_baseinfo_id between", value1, value2, "menuBaseinfoId");
            return (Criteria) this;
        }

        public Criteria andMenuBaseinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_baseinfo_id not between", value1, value2, "menuBaseinfoId");
            return (Criteria) this;
        }

        public Criteria andMenuIsdeleteIsNull() {
            addCriterion("menu_isdelete is null");
            return (Criteria) this;
        }

        public Criteria andMenuIsdeleteIsNotNull() {
            addCriterion("menu_isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIsdeleteEqualTo(Integer value) {
            addCriterion("menu_isdelete =", value, "menuIsdelete");
            return (Criteria) this;
        }

        public Criteria andMenuIsdeleteNotEqualTo(Integer value) {
            addCriterion("menu_isdelete <>", value, "menuIsdelete");
            return (Criteria) this;
        }

        public Criteria andMenuIsdeleteGreaterThan(Integer value) {
            addCriterion("menu_isdelete >", value, "menuIsdelete");
            return (Criteria) this;
        }

        public Criteria andMenuIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_isdelete >=", value, "menuIsdelete");
            return (Criteria) this;
        }

        public Criteria andMenuIsdeleteLessThan(Integer value) {
            addCriterion("menu_isdelete <", value, "menuIsdelete");
            return (Criteria) this;
        }

        public Criteria andMenuIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("menu_isdelete <=", value, "menuIsdelete");
            return (Criteria) this;
        }

        public Criteria andMenuIsdeleteIn(List<Integer> values) {
            addCriterion("menu_isdelete in", values, "menuIsdelete");
            return (Criteria) this;
        }

        public Criteria andMenuIsdeleteNotIn(List<Integer> values) {
            addCriterion("menu_isdelete not in", values, "menuIsdelete");
            return (Criteria) this;
        }

        public Criteria andMenuIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("menu_isdelete between", value1, value2, "menuIsdelete");
            return (Criteria) this;
        }

        public Criteria andMenuIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_isdelete not between", value1, value2, "menuIsdelete");
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