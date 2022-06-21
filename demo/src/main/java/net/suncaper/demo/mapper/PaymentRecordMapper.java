package net.suncaper.demo.mapper;

import java.util.List;
import net.suncaper.demo.domain.PaymentRecord;
import net.suncaper.demo.domain.PaymentRecordExample;
import net.suncaper.demo.domain.PaymentRecordKey;
import org.apache.ibatis.annotations.Param;

public interface PaymentRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    long countByExample(PaymentRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    int deleteByExample(PaymentRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    int deleteByPrimaryKey(PaymentRecordKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    int insert(PaymentRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    int insertSelective(PaymentRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    List<PaymentRecord> selectByExample(PaymentRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    PaymentRecord selectByPrimaryKey(PaymentRecordKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") PaymentRecord record, @Param("example") PaymentRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    int updateByExample(@Param("record") PaymentRecord record, @Param("example") PaymentRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    int updateByPrimaryKeySelective(PaymentRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentrecord
     *
     * @mbg.generated Fri Jul 05 09:58:59 CST 2019
     */
    int updateByPrimaryKey(PaymentRecord record);
}