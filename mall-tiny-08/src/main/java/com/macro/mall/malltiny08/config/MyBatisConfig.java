package com.macro.mall.malltiny08.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/5 16:14
 * @Version: 1.0
 */
@Configuration
@MapperScan({"com.macro.mall.malltiny08.mbg.mapper", "com.macro.mall.malltiny08.dao"})
public class MyBatisConfig {
}
