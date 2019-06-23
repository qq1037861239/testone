package com.demo.test;

import com.sun.istack.internal.NotNull;

/**
 * @author 10378
 * @title: TestOne
 * @projectName testone
 * @description: TODO
 * @date 2019/6/2322:12
 */
public class TestOne {

    private static void say(@NotNull Comone to, String name, String words) {
        System.out.println(to.saySomething(name, words));
    }

    public static void main(String[] args) {
        say((name, words) -> {
            return name + ": " + words;
        }, "Hoker", "Hahahahahaha, I am the biggest!");
    }
}
