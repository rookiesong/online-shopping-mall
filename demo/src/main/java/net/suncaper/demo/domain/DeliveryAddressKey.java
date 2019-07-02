package net.suncaper.demo.domain;

public class DeliveryAddressKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryaddress.address
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryaddress.user_phone
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
     */
    private Long userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryaddress.name
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
     */
    public DeliveryAddressKey(String address, Long userPhone, String name) {
        this.address = address;
        this.userPhone = userPhone;
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
     */
    public DeliveryAddressKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryaddress.address
     *
     * @return the value of deliveryaddress.address
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryaddress.address
     *
     * @param address the value for deliveryaddress.address
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryaddress.user_phone
     *
     * @return the value of deliveryaddress.user_phone
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
     */
    public Long getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryaddress.user_phone
     *
     * @param userPhone the value for deliveryaddress.user_phone
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
     */
    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryaddress.name
     *
     * @return the value of deliveryaddress.name
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryaddress.name
     *
     * @param name the value for deliveryaddress.name
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
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
        DeliveryAddressKey other = (DeliveryAddressKey) that;
        return (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 10:23:59 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}