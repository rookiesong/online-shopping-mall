package net.suncaper.demo.mapper;

import java.util.List;
import net.suncaper.demo.domain.Payment;
import net.suncaper.demo.domain.PaymentExample;
import org.apache.ibatis.annotations.Param;

public interface PaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Thu Jun 27 21:58:42 CST 2019
     */
    long countByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Thu Jun 27 21:58:42 CST 2019
     */
    int deleteByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Thu Jun 27 21:58:42 CST 2019
     */
    int deleteByPrimaryKey(String payingMethod);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Thu Jun 27 21:58:42 CST 2019
     */
    int insert(Payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Thu Jun 27 21:58:42 CST 2019
     */
    int insertSelective(Payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Thu Jun 27 21:58:42 CST 2019
     */
    List<Payment> selectByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Thu Jun 27 21:58:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Thu Jun 27 21:58:42 CST 2019
     */
    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);
}