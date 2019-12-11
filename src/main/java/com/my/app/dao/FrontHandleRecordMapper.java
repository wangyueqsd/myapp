package com.my.app.dao;

import com.my.app.entity.FrontHandleRecord;
import com.my.app.entity.FrontHandleRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface FrontHandleRecordMapper {
    long countByExample(FrontHandleRecordExample example);

    int deleteByExample(FrontHandleRecordExample example);

    @Delete({
        "delete from front_handle_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into front_handle_record (order_no, trade_money, ",
        "fee_money, mobile_phone, ",
        "platform_type, app_type, ",
        "product_type, name, ",
        "id_card, custacct_id, ",
        "bank_no, bank_code, ",
        "bank_phone, trade_flow_id, ",
        "app_repayment_flow_id, bank_flow_id, ",
        "record_status, status_desc, ",
        "handle_type, remark, ",
        "return_url, unique_identity, ",
        "pay_success_time, status_change_time, ",
        "created_at, updated_at, ",
        "withdraw_type)",
        "values (#{order_no,jdbcType=VARCHAR}, #{trade_money,jdbcType=VARCHAR}, ",
        "#{fee_money,jdbcType=VARCHAR}, #{mobile_phone,jdbcType=VARCHAR}, ",
        "#{platform_type,jdbcType=VARCHAR}, #{app_type,jdbcType=VARCHAR}, ",
        "#{product_type,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{id_card,jdbcType=VARCHAR}, #{custacct_id,jdbcType=VARCHAR}, ",
        "#{bank_no,jdbcType=VARCHAR}, #{bank_code,jdbcType=VARCHAR}, ",
        "#{bank_phone,jdbcType=VARCHAR}, #{trade_flow_id,jdbcType=VARCHAR}, ",
        "#{app_repayment_flow_id,jdbcType=VARCHAR}, #{bank_flow_id,jdbcType=VARCHAR}, ",
        "#{record_status,jdbcType=VARCHAR}, #{status_desc,jdbcType=VARCHAR}, ",
        "#{handle_type,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{return_url,jdbcType=VARCHAR}, #{unique_identity,jdbcType=VARCHAR}, ",
        "#{pay_success_time,jdbcType=TIMESTAMP}, #{status_change_time,jdbcType=TIMESTAMP}, ",
        "#{created_at,jdbcType=TIMESTAMP}, #{updated_at,jdbcType=TIMESTAMP}, ",
        "#{withdraw_type,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(FrontHandleRecord record);

    int insertSelective(FrontHandleRecord record);

    List<FrontHandleRecord> selectByExample(FrontHandleRecordExample example);

    @Select({
        "select",
        "id, order_no, trade_money, fee_money, mobile_phone, platform_type, app_type, ",
        "product_type, name, id_card, custacct_id, bank_no, bank_code, bank_phone, trade_flow_id, ",
        "app_repayment_flow_id, bank_flow_id, record_status, status_desc, handle_type, ",
        "remark, return_url, unique_identity, pay_success_time, status_change_time, created_at, ",
        "updated_at, withdraw_type",
        "from front_handle_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.my.app.dao.FrontHandleRecordMapper.BaseResultMap")
    FrontHandleRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FrontHandleRecord record, @Param("example") FrontHandleRecordExample example);

    int updateByExample(@Param("record") FrontHandleRecord record, @Param("example") FrontHandleRecordExample example);

    int updateByPrimaryKeySelective(FrontHandleRecord record);

    @Update({
        "update front_handle_record",
        "set order_no = #{order_no,jdbcType=VARCHAR},",
          "trade_money = #{trade_money,jdbcType=VARCHAR},",
          "fee_money = #{fee_money,jdbcType=VARCHAR},",
          "mobile_phone = #{mobile_phone,jdbcType=VARCHAR},",
          "platform_type = #{platform_type,jdbcType=VARCHAR},",
          "app_type = #{app_type,jdbcType=VARCHAR},",
          "product_type = #{product_type,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "id_card = #{id_card,jdbcType=VARCHAR},",
          "custacct_id = #{custacct_id,jdbcType=VARCHAR},",
          "bank_no = #{bank_no,jdbcType=VARCHAR},",
          "bank_code = #{bank_code,jdbcType=VARCHAR},",
          "bank_phone = #{bank_phone,jdbcType=VARCHAR},",
          "trade_flow_id = #{trade_flow_id,jdbcType=VARCHAR},",
          "app_repayment_flow_id = #{app_repayment_flow_id,jdbcType=VARCHAR},",
          "bank_flow_id = #{bank_flow_id,jdbcType=VARCHAR},",
          "record_status = #{record_status,jdbcType=VARCHAR},",
          "status_desc = #{status_desc,jdbcType=VARCHAR},",
          "handle_type = #{handle_type,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "return_url = #{return_url,jdbcType=VARCHAR},",
          "unique_identity = #{unique_identity,jdbcType=VARCHAR},",
          "pay_success_time = #{pay_success_time,jdbcType=TIMESTAMP},",
          "status_change_time = #{status_change_time,jdbcType=TIMESTAMP},",
          "created_at = #{created_at,jdbcType=TIMESTAMP},",
          "updated_at = #{updated_at,jdbcType=TIMESTAMP},",
          "withdraw_type = #{withdraw_type,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FrontHandleRecord record);
}