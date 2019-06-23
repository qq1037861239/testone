package com.demo.pojo;

import com.demo.pojo.isbn.ISBN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 10378
 * @title: Book
 * @projectName testone
 * @description: TODO
 * @date 2019/6/4 20:34
 */
public class Book {

    private String bookName;
    private String publisher;
    private String author;
    private ISBN isbnCode;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ISBN getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(ISBN isbnCode) {
        this.isbnCode = isbnCode;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", publisher='" + publisher + '\'' +
                ", author='" + author + '\'' +
                ", isbnCode=" + isbnCode +
                '}';
    }
}
