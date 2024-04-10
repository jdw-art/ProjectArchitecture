package com.macro.mall.malltinylombok.example;

import lombok.NonNull;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 14:39
 * @Version: 1.0
 */
public class NonNullExample {

    private String name;

    public NonNullExample(@NonNull String name) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
        } else {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        new NonNullExample("test");
        new NonNullExample((String)null);
    }

}
