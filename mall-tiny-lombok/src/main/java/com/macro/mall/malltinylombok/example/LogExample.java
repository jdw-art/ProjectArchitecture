package com.macro.mall.malltinylombok.example;

import lombok.extern.java.Log;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 15:03
 * @Version: 1.0
 */
@Log
public class LogExample {

    public static void main(String[] args) {
        log.info("level info");
        log.warning("level warning");
        log.severe("level severe");
    }
}
