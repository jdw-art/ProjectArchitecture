package com.macro.mall.malltiny04.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/5 16:28
 * @Version: 1.0
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {
    private List<String> urls = new ArrayList<>();
}
