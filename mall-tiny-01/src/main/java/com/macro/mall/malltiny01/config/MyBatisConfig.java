package com.macro.mall.malltiny01.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 16:37
 * @Version: 1.0
 */
@Configuration
@MapperScan({"com.macro.mall.malltiny01.mbg.mapper","com.macro.mall.malltiny01.dao"})
public class MyBatisConfig {
}
