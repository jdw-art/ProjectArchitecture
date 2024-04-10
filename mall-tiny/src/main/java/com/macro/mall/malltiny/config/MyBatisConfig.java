package com.macro.mall.malltiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/8 16:55
 * @Version: 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.macro.mall.malltiny.mbg.mapper", "com.macro.mall.malltiny.dao"})
public class MyBatisConfig {
}
