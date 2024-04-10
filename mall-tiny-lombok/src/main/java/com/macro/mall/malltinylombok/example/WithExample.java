package com.macro.mall.malltinylombok.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.With;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 14:59
 * @Version: 1.0
 */
@ToString
@With
@AllArgsConstructor
public class WithExample {

    private Long id;
    private String name;
    private Integer age;

    public static void main(String[] args) {
        WithExample example1 = new WithExample(1L, "test", 20);
        WithExample example2 = example1.withAge(22);
        //将原对象进行clone并设置age，返回false
        System.out.println(example1.equals(example2));
        System.out.println(example1.toString());
        System.out.println(example2.toString());
    }
}
