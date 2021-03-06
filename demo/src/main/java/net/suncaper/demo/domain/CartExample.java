package net.suncaper.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class CartExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public CartExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
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

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(String value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(String value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(String value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(String value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(String value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(String value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLike(String value) {
            addCriterion("cart_id like", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotLike(String value) {
            addCriterion("cart_id not like", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<String> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<String> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(String value1, String value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(String value1, String value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andNumProductIsNull() {
            addCriterion("num_product is null");
            return (Criteria) this;
        }

        public Criteria andNumProductIsNotNull() {
            addCriterion("num_product is not null");
            return (Criteria) this;
        }

        public Criteria andNumProductEqualTo(Integer value) {
            addCriterion("num_product =", value, "numProduct");
            return (Criteria) this;
        }

        public Criteria andNumProductNotEqualTo(Integer value) {
            addCriterion("num_product <>", value, "numProduct");
            return (Criteria) this;
        }

        public Criteria andNumProductGreaterThan(Integer value) {
            addCriterion("num_product >", value, "numProduct");
            return (Criteria) this;
        }

        public Criteria andNumProductGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_product >=", value, "numProduct");
            return (Criteria) this;
        }

        public Criteria andNumProductLessThan(Integer value) {
            addCriterion("num_product <", value, "numProduct");
            return (Criteria) this;
        }

        public Criteria andNumProductLessThanOrEqualTo(Integer value) {
            addCriterion("num_product <=", value, "numProduct");
            return (Criteria) this;
        }

        public Criteria andNumProductIn(List<Integer> values) {
            addCriterion("num_product in", values, "numProduct");
            return (Criteria) this;
        }

        public Criteria andNumProductNotIn(List<Integer> values) {
            addCriterion("num_product not in", values, "numProduct");
            return (Criteria) this;
        }

        public Criteria andNumProductBetween(Integer value1, Integer value2) {
            addCriterion("num_product between", value1, value2, "numProduct");
            return (Criteria) this;
        }

        public Criteria andNumProductNotBetween(Integer value1, Integer value2) {
            addCriterion("num_product not between", value1, value2, "numProduct");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressIsNull() {
            addCriterion("user_mailaddress is null");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressIsNotNull() {
            addCriterion("user_mailaddress is not null");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressEqualTo(String value) {
            addCriterion("user_mailaddress =", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressNotEqualTo(String value) {
            addCriterion("user_mailaddress <>", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressGreaterThan(String value) {
            addCriterion("user_mailaddress >", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_mailaddress >=", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressLessThan(String value) {
            addCriterion("user_mailaddress <", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressLessThanOrEqualTo(String value) {
            addCriterion("user_mailaddress <=", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressLike(String value) {
            addCriterion("user_mailaddress like", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressNotLike(String value) {
            addCriterion("user_mailaddress not like", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressIn(List<String> values) {
            addCriterion("user_mailaddress in", values, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressNotIn(List<String> values) {
            addCriterion("user_mailaddress not in", values, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressBetween(String value1, String value2) {
            addCriterion("user_mailaddress between", value1, value2, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressNotBetween(String value1, String value2) {
            addCriterion("user_mailaddress not between", value1, value2, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cart
     *
     * @mbg.generated do_not_delete_during_merge Fri Jul 05 09:58:59 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cart
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
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