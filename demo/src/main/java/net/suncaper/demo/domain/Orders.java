package net.suncaper.demo.domain;

public class Orders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.orders_id
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    private String ordersId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.paying_method
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    private String payingMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.product_id
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    private String productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_mailaddress
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    private String userMailaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.number
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    private Integer number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.price
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.delivery_address
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    private String deliveryAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.status
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.product_name
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    private String productName;



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public Orders(String ordersId, String payingMethod, String productId, String userMailaddress, Integer number, Integer price, String deliveryAddress, String status, String productName) {
        this.ordersId = ordersId;
        this.payingMethod = payingMethod;
        this.productId = productId;
        this.userMailaddress = userMailaddress;
        this.number = number;
        this.price = price;
        this.deliveryAddress = deliveryAddress;
        this.status = status;
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public Orders() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.orders_id
     *
     * @return the value of orders.orders_id
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public String getOrdersId() {
        return ordersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.orders_id
     *
     * @param ordersId the value for orders.orders_id
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId == null ? null : ordersId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.paying_method
     *
     * @return the value of orders.paying_method
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public String getPayingMethod() {
        return payingMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.paying_method
     *
     * @param payingMethod the value for orders.paying_method
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public void setPayingMethod(String payingMethod) {
        this.payingMethod = payingMethod == null ? null : payingMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.product_id
     *
     * @return the value of orders.product_id
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.product_id
     *
     * @param productId the value for orders.product_id
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_mailaddress
     *
     * @return the value of orders.user_mailaddress
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public String getUserMailaddress() {
        return userMailaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_mailaddress
     *
     * @param userMailaddress the value for orders.user_mailaddress
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public void setUserMailaddress(String userMailaddress) {
        this.userMailaddress = userMailaddress == null ? null : userMailaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.number
     *
     * @return the value of orders.number
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.number
     *
     * @param number the value for orders.number
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.price
     *
     * @return the value of orders.price
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.price
     *
     * @param price the value for orders.price
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.delivery_address
     *
     * @return the value of orders.delivery_address
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.delivery_address
     *
     * @param deliveryAddress the value for orders.delivery_address
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.status
     *
     * @return the value of orders.status
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.status
     *
     * @param status the value for orders.status
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.product_name
     *
     * @return the value of orders.product_name
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.product_name
     *
     * @param productName the value for orders.product_name
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orders other = (Orders) that;
        return (this.getOrdersId() == null ? other.getOrdersId() == null : this.getOrdersId().equals(other.getOrdersId()))
            && (this.getPayingMethod() == null ? other.getPayingMethod() == null : this.getPayingMethod().equals(other.getPayingMethod()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getUserMailaddress() == null ? other.getUserMailaddress() == null : this.getUserMailaddress().equals(other.getUserMailaddress()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getDeliveryAddress() == null ? other.getDeliveryAddress() == null : this.getDeliveryAddress().equals(other.getDeliveryAddress()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jul 01 14:33:09 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrdersId() == null) ? 0 : getOrdersId().hashCode());
        result = prime * result + ((getPayingMethod() == null) ? 0 : getPayingMethod().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getUserMailaddress() == null) ? 0 : getUserMailaddress().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getDeliveryAddress() == null) ? 0 : getDeliveryAddress().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        return result;
    }
}