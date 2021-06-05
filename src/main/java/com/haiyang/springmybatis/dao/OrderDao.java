package com.haiyang.springmybatis.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haiyang.springmybatis.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 账户流水表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-04 22:57:12
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
