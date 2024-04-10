package com.macro.mall.malltinymybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/3 12:59
 * @Version: 1.0
 */
@Configuration
@MapperScan("com.macro.mall.malltinymybatis.dao")
public class MyBatisConfig {
}
