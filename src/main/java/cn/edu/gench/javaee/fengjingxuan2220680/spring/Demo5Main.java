package cn.edu.gench.javaee.fengjingxuan2220680.spring;

import cn.edu.gench.javaee.fengjingxuan2220680.spring.aware.GetBeanId;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.Cat;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.Dog;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.User;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.PrintStream;

public class Demo5Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        // 获取 UserService Bean
        UserService userService = (UserService) ctx.getBean("userService");

        // 测试方法
        User user = userService.getUserById(1L);
        System.out.println(user);

        Dog dog = (Dog) ctx.getBean("dog");
        System.out.println(dog);

        Cat cat = (Cat) ctx.getBean("cat");
        System.out.println(cat);


        PrintStream ps = (PrintStream) ctx.getBean("getField");
        ps.println("Hello World");

        GetBeanId gb = (GetBeanId) ctx.getBean("beanId");
        System.out.println(gb.getBeanId());


    }
}
