package com.macro.mall.malltinylombok.example;

import lombok.Builder;
import lombok.ToString;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 14:53
 * @Version: 1.0
 */
@Builder
@ToString
public class BuilderExample {

    private Long id;
    private String name;
    private Integer age;

    public static void main(String[] args) {
        BuilderExample example = BuilderExample.builder()
                .id(1L)
                .name("test")
                .age(20)
                .build();
        System.out.println(example);
    }

}
