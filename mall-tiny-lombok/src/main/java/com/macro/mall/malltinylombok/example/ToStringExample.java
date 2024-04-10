package com.macro.mall.malltinylombok.example;

import lombok.ToString;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 14:45
 * @Version: 1.0
 */
@ToString
public class ToStringExample {

    private Long id;
    private String name;
    private Integer age;
    public ToStringExample(Long id,String name,Integer age){
        this.id =id;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ToStringExample example = new ToStringExample(1L,"test",20);
        //自动实现toString方法，输出ToStringExample(name=test, age=20)
        System.out.println(example);
    }

}
