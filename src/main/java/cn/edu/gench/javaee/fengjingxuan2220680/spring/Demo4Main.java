package cn.edu.gench.javaee.fengjingxuan2220680.spring;

import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.JFrame;

public class Demo4Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        // 通过不同别名获取 Dog Bean
        Dog dog1 = ctx.getBean("dog", Dog.class);
        Dog dog2 = ctx.getBean("wangcai", Dog.class);
        Dog dog3 = ctx.getBean("/dahuang", Dog.class);
        Dog dog4 = ctx.getBean("wangwang", Dog.class);

// 打印结果，确认是否是同一个实例
        System.out.println(dog1.getName());
        System.out.println(dog2.getName());
        System.out.println(dog3.getName());
        System.out.println(dog4.getName());
        System.out.println(dog1 == dog4);  // 应该输出 true
  }
}
