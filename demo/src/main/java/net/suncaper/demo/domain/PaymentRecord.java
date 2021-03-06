package net.suncaper.demo.domain;

public class PaymentRecord extends PaymentRecordKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paymentrecord.paying_method
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    private String payingMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paymentrecord.amount
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    private Integer amount;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public PaymentRecord(String recordId, String ordersId, String buildDay, String payingMethod, Integer amount) {
        super(recordId, ordersId, buildDay);
        this.payingMethod = payingMethod;
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public PaymentRecord() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paymentrecord.paying_method
     *
     * @return the value of paymentrecord.paying_method
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public String getPayingMethod() {
        return payingMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paymentrecord.paying_method
     *
     * @param payingMethod the value for paymentrecord.paying_method
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void setPayingMethod(String payingMethod) {
        this.payingMethod = payingMethod == null ? null : payingMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paymentrecord.amount
     *
     * @return the value of paymentrecord.amount
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paymentrecord.amount
     *
     * @param amount the value for paymentrecord.amount
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
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
        PaymentRecord other = (PaymentRecord) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getOrdersId() == null ? other.getOrdersId() == null : this.getOrdersId().equals(other.getOrdersId()))
            && (this.getBuildDay() == null ? other.getBuildDay() == null : this.getBuildDay().equals(other.getBuildDay()))
            && (this.getPayingMethod() == null ? other.getPayingMethod() == null : this.getPayingMethod().equals(other.getPayingMethod()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getOrdersId() == null) ? 0 : getOrdersId().hashCode());
        result = prime * result + ((getBuildDay() == null) ? 0 : getBuildDay().hashCode());
        result = prime * result + ((getPayingMethod() == null) ? 0 : getPayingMethod().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        return result;
    }
}