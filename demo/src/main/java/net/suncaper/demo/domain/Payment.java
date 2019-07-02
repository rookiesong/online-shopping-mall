package net.suncaper.demo.domain;

public class Payment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.paying_method
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    private String payingMethod;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    public Payment(String payingMethod) {
        this.payingMethod = payingMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    public Payment() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.paying_method
     *
     * @return the value of payment.paying_method
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    public String getPayingMethod() {
        return payingMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.paying_method
     *
     * @param payingMethod the value for payment.paying_method
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    public void setPayingMethod(String payingMethod) {
        this.payingMethod = payingMethod == null ? null : payingMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
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
        Payment other = (Payment) that;
        return (this.getPayingMethod() == null ? other.getPayingMethod() == null : this.getPayingMethod().equals(other.getPayingMethod()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayingMethod() == null) ? 0 : getPayingMethod().hashCode());
        return result;
    }
}