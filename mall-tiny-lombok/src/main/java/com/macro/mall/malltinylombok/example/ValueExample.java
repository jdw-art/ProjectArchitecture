package com.macro.mall.malltinylombok.example;

import lombok.Value;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 14:52
 * @Version: 1.0
 */
@Value
public class ValueExample {

    private Long id;
    private String name;
    private Integer age;

    public static void main(String[] args) {
        //只能使用全参构造器
        ValueExample example = new ValueExample(1L,"test",20);
        // example.setName("andy") //没有生成setter方法，会报错
        // example.name="andy" //字段被设置为final类型，会报错
    }

}
