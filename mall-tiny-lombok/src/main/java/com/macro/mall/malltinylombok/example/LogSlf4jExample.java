package com.macro.mall.malltinylombok.example;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 15:04
 * @Version: 1.0
 */
@Slf4j
public class LogSlf4jExample {

    public static void main(String[] args) {
        log.info("level:{}","info");
        log.warn("level:{}","warn");
        log.error("level:{}", "error");
    }
}
