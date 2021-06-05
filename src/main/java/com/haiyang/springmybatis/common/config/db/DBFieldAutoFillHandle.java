package com.haiyang.springmybatis.common.config.db;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 数据库操作字段自动填充
 */
@Component
public class DBFieldAutoFillHandle implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        Date date = new Date();
        this.fillStrategy(metaObject,"createTime",date);
        this.fillStrategy(metaObject,"updateTime",date);
        this.fillStrategy(metaObject,"isDel",0);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.fillStrategy(metaObject,"updateTime",new Date());
    }
}
