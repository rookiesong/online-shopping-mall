package net.suncaper.demo.mapper;

import java.util.List;
import net.suncaper.demo.domain.DeliveryAddress;
import net.suncaper.demo.domain.DeliveryAddressExample;
import org.apache.ibatis.annotations.Param;

public interface DeliveryAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    long countByExample(DeliveryAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    int deleteByExample(DeliveryAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    int insert(DeliveryAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    int insertSelective(DeliveryAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    List<DeliveryAddress> selectByExample(DeliveryAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    DeliveryAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") DeliveryAddress record, @Param("example") DeliveryAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    int updateByExample(@Param("record") DeliveryAddress record, @Param("example") DeliveryAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    int updateByPrimaryKeySelective(DeliveryAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryaddress
     *
     * @mbg.generated Tue Jul 02 18:51:42 CST 2019
     */
    int updateByPrimaryKey(DeliveryAddress record);
}