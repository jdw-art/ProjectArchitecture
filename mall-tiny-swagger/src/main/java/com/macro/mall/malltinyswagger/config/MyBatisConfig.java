package com.macro.mall.malltinyswagger.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 17:52
 * @Version: 1.0
 */
@Configuration
@MapperScan("com.macro.mall.malltinyswagger.mbg.mapper")
public class MyBatisConfig {
}
