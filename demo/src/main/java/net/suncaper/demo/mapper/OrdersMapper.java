package net.suncaper.demo.mapper;

import java.util.List;
import net.suncaper.demo.domain.Orders;
import net.suncaper.demo.domain.OrdersExample;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    long countByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    int deleteByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    int deleteByPrimaryKey(String ordersId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    int insert(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    int insertSelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    List<Orders> selectByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    Orders selectByPrimaryKey(String ordersId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sat Jun 29 15:46:45 CST 2019
     */
    int updateByPrimaryKey(Orders record);
}