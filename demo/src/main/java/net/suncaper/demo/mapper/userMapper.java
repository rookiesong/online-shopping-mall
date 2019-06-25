package net.suncaper.demo.mapper;

import java.util.List;
import net.suncaper.demo.domain.user;
import net.suncaper.demo.domain.userExample;
import net.suncaper.demo.domain.userWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface userMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    long countByExample(userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int deleteByExample(userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int insert(userWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int insertSelective(userWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    List<userWithBLOBs> selectByExampleWithBLOBs(userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    List<user> selectByExample(userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    userWithBLOBs selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") userWithBLOBs record, @Param("example") userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") userWithBLOBs record, @Param("example") userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int updateByExample(@Param("record") user record, @Param("example") userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int updateByPrimaryKeySelective(userWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(userWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Jun 24 20:58:56 CST 2019
     */
    int updateByPrimaryKey(user record);
}