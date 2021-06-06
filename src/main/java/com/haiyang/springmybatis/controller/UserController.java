package com.haiyang.springmybatis.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiyang.springmybatis.common.config.repeat.request.RepeatSubmit;
import com.haiyang.springmybatis.common.config.validator.group.InsertValidate;
import com.haiyang.springmybatis.common.config.validator.group.UpdateValidate;
import com.haiyang.springmybatis.common.response.BaseResponse;
import com.haiyang.springmybatis.common.response.PageResponse;
import com.haiyang.springmybatis.common.response.SmartResponse;
import com.haiyang.springmybatis.common.utils.SmartValidator;
import com.haiyang.springmybatis.entity.UserEntity;
import com.haiyang.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * 用户表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-04 22:57:12
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SmartValidator smartValidator;

    /**
     * 列表
     */
    @RequestMapping("list")
    public PageResponse<UserEntity> list(@RequestParam Map<String, Object> params){
        PageHelper.startPage(2,10);
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(UserEntity::getIsDel, 0);
        List<UserEntity> list = userService.list(wrapper);
        PageInfo<UserEntity> userEntityPageInfo = new PageInfo<>(list);
        return PageResponse.pageResponse("6666", userEntityPageInfo);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public BaseResponse info(@PathVariable("id") Integer id){
		UserEntity user = userService.getById(id);
        List<UserEntity> userEntities = userService.userList();
        System.out.println(userEntities);
        return SmartResponse.result(user);

    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @RepeatSubmit(value = true)
    public BaseResponse save(@Validated(InsertValidate.class) @RequestBody UserEntity user){
        boolean save = userService.save(user);
        return SmartResponse.result(save);
    }


    /**
     * 删除
     */
    @PostMapping("/delete")
    public BaseResponse delete(@RequestBody Integer[] ids){
        boolean b = userService.removeByIds(Arrays.asList(ids));
        return SmartResponse.result(b);
    }

    @PostMapping("/update")
    public BaseResponse update(@Validated(UpdateValidate.class)@RequestBody UserEntity user){
        boolean b = userService.updateById(user);
        return SmartResponse.result(b);
    }

}
