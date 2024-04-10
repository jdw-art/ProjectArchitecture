package com.macro.mall.malltinylombok.example;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 14:44
 * @Version: 1.0
 */
public class GetterSetterExample {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter(AccessLevel.PROTECTED)
    private Integer age;

    public static void main(String[] args) {
        GetterSetterExample example = new GetterSetterExample();
        example.setName("test");
        example.setAge(20);
        System.out.printf("name:%s age:%d",example.getName(),example.getAge());
    }

}
