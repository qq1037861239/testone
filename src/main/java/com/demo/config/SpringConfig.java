package com.demo.config;

import com.demo.pojo.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author 10378
 * @title: SpringConfig
 * @projectName testone
 * @description: TODO
 * @date 2019/6/102:14
 */
@Component
@Configuration
@ComponentScan("com.demo")
public class SpringConfig {

    @Bean("book")
    public Book createBook() {
        Book book = new Book();
        book.setAuthor("mimia");
        book.setBookName("C Program Language");
        book.setPublisher("zhong yang ren min chu ban she");
        return book;
    }
}
