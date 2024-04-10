package com.macro.mall.malltinylombok.example;

import lombok.Getter;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 15:01
 * @Version: 1.0
 */
public class GetterLazyExample {

    @Getter(lazy = true)
    private final double[] cached = expensive();

    private double[] expensive() {
        double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);
        }
        return result;
    }

    public static void main(String[] args) {
        //使用Double Check Lock 样板代码对属性进行懒加载
        GetterLazyExample example = new GetterLazyExample();
        System.out.println(example.getCached().length);
    }
}
