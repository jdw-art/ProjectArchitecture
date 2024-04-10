package com.macro.mall.malltiny.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.annotations.Setting;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/10 13:32
 * @Version: 1.0
 */
@Getter
@Setting
@Configuration
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {

    private List<String> urls = new ArrayList<>();
}
