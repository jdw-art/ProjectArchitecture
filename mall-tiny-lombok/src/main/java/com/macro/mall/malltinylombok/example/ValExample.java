package com.macro.mall.malltinylombok.example;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 13:16
 * @Version: 1.0
 */
public class ValExample {

    public static void example() {
        //val代替ArrayList<String>和String类型
        val example = new ArrayList<String>();
        example.add("Hello World!");
        val foo = example.get(0);
        System.out.println(foo.toLowerCase());
    }

    public static void example2() {
        //val代替Map.Entry<Integer,String>类型
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        example();
        example2();
    }

}
