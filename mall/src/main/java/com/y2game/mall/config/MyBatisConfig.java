package com.y2game.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.y2game.mall.mbg.mapper","com.y2game.mall.dao"})
public class MyBatisConfig {
}
