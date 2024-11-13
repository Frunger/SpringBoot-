package cn.edu.gench.javaee.fengjingxuan2220680.spring;

import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.Driver;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.Student;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.User;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2Main {
    public static void main(String[] args) {
        // 1. 加载 Spring 配置文件

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-bf.xml");

//        UserService us = ctx.getBean("userService", UserService.class);
//
//        User user = us.getUserById(1L);


        Student student = (Student) ctx.getBean("student");
        System.out.println(student);

    }
}