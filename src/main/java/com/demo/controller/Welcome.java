package com.demo.controller;

import com.demo.pojo.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 10378
 * @title: Welcome
 * @projectName testone
 * @description: TODO
 * @date 2019/6/420:30
 */
@RestController
public class Welcome {

    public Welcome() {
        System.out.println("Welcome类创建了...");
    }

    public void init() {
        System.out.println("Welcome类初始化...");
    }

    public void destory() {
        System.out.println("Welcome类销毁了...");
    }

    @RequestMapping("bb")
    public String mina(Book book) {
        System.out.println(book);
        return "good";
    }

}