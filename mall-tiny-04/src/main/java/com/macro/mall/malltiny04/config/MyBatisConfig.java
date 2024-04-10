package com.macro.mall.malltiny04.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/5 16:14
 * @Version: 1.0
 */
@Configuration
@MapperScan("com.macro.mall.malltiny04.mbg.mapper")
public class MyBatisConfig {
}
