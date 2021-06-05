package com.haiyang.springmybatis.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haiyang.springmybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-04 22:57:12
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
