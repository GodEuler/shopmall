package com.haiyang.springmybatis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-04 22:57:12
 */
@Data
@TableName("coupon")
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Integer id;
	/**
	 * 优惠券金额
	 */
	private BigDecimal couponFigure;
	/**
	 * 优惠券是否生效
	 */
	private Integer couponValid;
	/**
	 * 优惠券有效开始时间
	 */
	private Date validStartTime;
	/**
	 * 优惠券结束时间
	 */
	private Date validEndTime;
	/**
	 * 优惠券是否永久有效
	 */
	private Integer validForever;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建人
	 */
	private Integer createBy;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 更新人
	 */
	private Integer updateBy;
	/**
	 * 是否删除
	 */
	private Integer isDel;

}
