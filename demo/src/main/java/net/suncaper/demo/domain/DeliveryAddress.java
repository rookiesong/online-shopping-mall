package net.suncaper.demo.domain;

public class DeliveryAddress {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryaddress.address
     *
     * @mbg.generated Mon Jul 01 14:33:10 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryaddress.user_mailaddress
     *
     * @mbg.generated Mon Jul 01 14:33:10 CST 2019
     */
    private String userMailaddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Mon Jul 01 14:33:10 CST 2019
     */
    public DeliveryAddress(String address, String userMailaddress) {
        this.address = address;
        this.userMailaddress = userMailaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Mon Jul 01 14:33:10 CST 2019
     */
    public DeliveryAddress() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryaddress.address
     *
     * @return the value of deliveryaddress.address
     *
     * @mbg.generated Mon Jul 01 14:33:10 CST 2019
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
     * @mbg.generated Mon Jul 01 14:33:10 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryaddress.user_mailaddress
     *
     * @return the value of deliveryaddress.user_mailaddress
     *
     * @mbg.generated Mon Jul 01 14:33:10 CST 2019
     */
    public String getUserMailaddress() {
        return userMailaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryaddress.user_mailaddress
     *
     * @param userMailaddress the value for deliveryaddress.user_mailaddress
     *
     * @mbg.generated Mon Jul 01 14:33:10 CST 2019
     */
    public void setUserMailaddress(String userMailaddress) {
        this.userMailaddress = userMailaddress == null ? null : userMailaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Mon Jul 01 14:33:10 CST 2019
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
        DeliveryAddress other = (DeliveryAddress) that;
        return (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getUserMailaddress() == null ? other.getUserMailaddress() == null : this.getUserMailaddress().equals(other.getUserMailaddress()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Mon Jul 01 14:33:10 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getUserMailaddress() == null) ? 0 : getUserMailaddress().hashCode());
        return result;
    }
}