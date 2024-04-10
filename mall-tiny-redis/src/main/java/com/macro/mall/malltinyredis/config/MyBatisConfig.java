package com.macro.mall.malltinyredis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/5 14:27
 * @Version: 1.0
 */
@Configuration
@MapperScan("com.macro.mall.malltinyredis.mbg.mapper")
public class MyBatisConfig {
}
