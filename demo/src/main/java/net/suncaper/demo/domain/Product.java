package net.suncaper.demo.domain;

public class Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_id
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    private String productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_name
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.type
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.producer
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    private String producer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.producing_area
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    private String producingArea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.stock
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    private Long stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.sales_volume
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    private Integer salesVolume;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    private Integer price;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public Product(String productId, String productName, String type, String producer, String producingArea, Long stock, Integer salesVolume, Integer price) {
        this.productId = productId;
        this.productName = productName;
        this.type = type;
        this.producer = producer;
        this.producingArea = producingArea;
        this.stock = stock;
        this.salesVolume = salesVolume;
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public Product() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_id
     *
     * @return the value of product.product_id
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_id
     *
     * @param productId the value for product.product_id
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_name
     *
     * @return the value of product.product_name
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_name
     *
     * @param productName the value for product.product_name
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.type
     *
     * @return the value of product.type
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.type
     *
     * @param type the value for product.type
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.producer
     *
     * @return the value of product.producer
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public String getProducer() {
        return producer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.producer
     *
     * @param producer the value for product.producer
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.producing_area
     *
     * @return the value of product.producing_area
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public String getProducingArea() {
        return producingArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.producing_area
     *
     * @param producingArea the value for product.producing_area
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void setProducingArea(String producingArea) {
        this.producingArea = producingArea == null ? null : producingArea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.stock
     *
     * @return the value of product.stock
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public Long getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.stock
     *
     * @param stock the value for product.stock
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void setStock(Long stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.sales_volume
     *
     * @return the value of product.sales_volume
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public Integer getSalesVolume() {
        return salesVolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.sales_volume
     *
     * @param salesVolume the value for product.sales_volume
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
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
        Product other = (Product) that;
        return (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getProducer() == null ? other.getProducer() == null : this.getProducer().equals(other.getProducer()))
            && (this.getProducingArea() == null ? other.getProducingArea() == null : this.getProducingArea().equals(other.getProducingArea()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getSalesVolume() == null ? other.getSalesVolume() == null : this.getSalesVolume().equals(other.getSalesVolume()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getProducer() == null) ? 0 : getProducer().hashCode());
        result = prime * result + ((getProducingArea() == null) ? 0 : getProducingArea().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getSalesVolume() == null) ? 0 : getSalesVolume().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }
}