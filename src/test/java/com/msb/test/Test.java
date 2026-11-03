package com.msb.test;

import com.msb.pojo.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book b =(Book) context.getBean("b");
        System.out.println(b.getName());
    }
}
