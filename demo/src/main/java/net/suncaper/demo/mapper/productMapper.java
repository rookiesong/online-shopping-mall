package net.suncaper.demo.mapper;

import java.util.List;
import net.suncaper.demo.domain.product;
import net.suncaper.demo.domain.productExample;
import org.apache.ibatis.annotations.Param;

public interface productMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    long countByExample(productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int deleteByExample(productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int deleteByPrimaryKey(String productId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int insert(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int insertSelective(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    List<product> selectByExample(productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    product selectByPrimaryKey(String productId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") product record, @Param("example") productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int updateByExample(@Param("record") product record, @Param("example") productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int updateByPrimaryKeySelective(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int updateByPrimaryKey(product record);
}