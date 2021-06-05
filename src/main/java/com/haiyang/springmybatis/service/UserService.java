package com.haiyang.springmybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.haiyang.springmybatis.entity.UserEntity;

import java.util.List;

/**
 * 用户表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-04 22:57:12
 */
public interface UserService extends IService<UserEntity> {

      List<UserEntity> userList();

}

