package com.demo.pojo;

import com.demo.config.SpringConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 10378
 * @title: Main
 * @projectName testone
 * @description: TODO
 * @date 2019/6/421:05
 */
public class Main {



    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ac.getBean("book"));
    }
}
