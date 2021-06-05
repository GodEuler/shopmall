package com.haiyang.springmybatis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 账户流水表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-04 22:57:12
 */
@Data
@TableName("order")
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增主键
	 */
	@TableId
	private Long id;
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 订单金额
	 */
	private BigDecimal orderFigure;
	/**
	 * 订单创建时间
	 */
	private Date orderTime;
	/**
	 * 订单支付时间
	 */
	private Date orderPayTime;
	/**
	 * 订单总金额
	 */
	private BigDecimal orderTotalFigure;
	/**
	 * 订单是否使用优惠券
	 */
	private Integer orderUseCoupon;
	/**
	 * 优惠券ID
	 */
	private Integer couponId;
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
	 * 更新时间
	 */
	private Integer updateBy;
	/**
	 * 是否删除
	 */
	private Integer isDel;

}
