package com.haiyang.springmybatis.service.impl;


import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haiyang.springmybatis.dao.UserDao;
import com.haiyang.springmybatis.entity.UserEntity;
import com.haiyang.springmybatis.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {
        public List<UserEntity> userList(){
            LambdaQueryChainWrapper<UserEntity> wrapper = lambdaQuery()
                    .eq(UserEntity::getUserName, "huhaiyang")
                    .eq(UserEntity::getIsDel,0);
            List<UserEntity> list = wrapper.list();
            return list;
        }

}