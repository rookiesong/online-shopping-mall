package net.suncaper.demo.mapper;

import java.util.List;
import net.suncaper.demo.domain.payment;
import net.suncaper.demo.domain.paymentExample;
import org.apache.ibatis.annotations.Param;

public interface paymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    long countByExample(paymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int deleteByExample(paymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int deleteByPrimaryKey(String payingMethod);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int insert(payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int insertSelective(payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    List<payment> selectByExample(paymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") payment record, @Param("example") paymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int updateByExample(@Param("record") payment record, @Param("example") paymentExample example);
}