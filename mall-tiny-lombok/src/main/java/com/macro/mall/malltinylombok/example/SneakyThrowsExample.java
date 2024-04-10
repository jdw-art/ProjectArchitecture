package com.macro.mall.malltinylombok.example;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 14:54
 * @Version: 1.0
 */
public class SneakyThrowsExample {

    //自动抛出异常，无需处理
    @SneakyThrows(UnsupportedEncodingException.class)
    public static byte[] str2byte(String str){
        return str.getBytes("UTF-8");
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str2byte(str).length);
    }
}
