package com.haiyang.springmybatis.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.haiyang.springmybatis.common.config.validator.group.InsertValidate;
import com.haiyang.springmybatis.common.config.validator.group.RemoveValidate;
import com.haiyang.springmybatis.common.config.validator.group.UpdateValidate;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-04 22:57:12
 */
@Data
@TableName("user")
@JsonIgnoreProperties(value = {"sex"})
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 主键ID
	 */
	@TableId(type = IdType.AUTO)
	@NotNull(message = "请指定id号",groups = {RemoveValidate.class,UpdateValidate.class})
	private Integer id;
	/**
	 * 用户名
	 */
	@NotBlank(message = "userName不能为空",groups = {InsertValidate.class})
	private String userName;
	/**
	 * 密码
	 */
	@NotBlank(message = "password不能为空",groups = {InsertValidate.class, UpdateValidate.class})
	@Size(min = 6,max = 12,message = "password 长度应该在6~12之间",groups = {InsertValidate.class, UpdateValidate.class})
	private String password;
	/**
	 * 性别 1：男 ，2：女，3：保密
	 */
//	@Pattern(regexp = "^[1|2|3]+$",message = "sex 参数不匹配")
	@Range(min = 1,max = 3,message = "gender参数不匹配",groups = {InsertValidate.class})
	@TableField(value = "sex")
	private Integer gender;
	/**
	 * 账户余额
	 */
	private BigDecimal account;
	/**
	 * 创建时间
	 */
	@TableField(fill = FieldFill.INSERT)
	private Date createTime;
	/**
	 * 创建人
	 */
	private Integer createBy;
	/**
	 * 更新时间
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;
	/**
	 * 更新人
	 */
	private Integer updateBy;
	/**
	 * 是否删除
	 */
	@TableField(fill = FieldFill.INSERT)
	private Integer isDel;


	@TableField(exist = false)
	@JsonIgnore
	private Date startTime;

}
