package cn.edu.gench.javaee.fengjingxuan2220680.spring;

import cn.edu.gench.javaee.fengjingxuan2220680.spring.dao.UserDao;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.dao.UserDaoImpl;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.Dog;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.Driver;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.User;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.service.UserService;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

//public class DemoMain {
//    public static void main(String[] args) {
//        UserService us = new UserServiceImpl();
//        User user = us.getUserById(1L);
//        System.out.println(user);
//    }
//}

public class DemoMain {
    public static void main(String[] args) throws InterruptedException {
        // 1. 加载 Spring 配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        // 2. 获取 UserService Bean
        UserService us = ctx.getBean("userService", UserService.class);  // 确保这里的类型是 UserService
        // 获取 SimpleDateFormat Bean
        SimpleDateFormat date = ctx.getBean("sdf", SimpleDateFormat.class);

        Driver driver = ctx.getBean("personDriver", Driver.class);
        // 3. 调用方法
        User user = us.getUserById(1L);
        // 使用 SimpleDateFormat 格式化当前日期
        System.out.println(date.format(new Date()));

        // 打印结果
        System.out.println(user);

        System.out.println(driver);


        // 第一次获取 date Bean
        Date date1 = ctx.getBean("date", Date.class);
        System.out.println("第一次获取的 Date：" + date1);

        // 暂停 1 秒钟
        Thread.sleep(1000);

        // 第二次获取 date Bean
        Date date2 = ctx.getBean("date", Date.class);
        System.out.println("第二次获取的 Date：" + date2);

        // 检查两个实例是否相同
        System.out.println("date1 和 date2 是否相同：" + (date1 == date2));


        Dog dog = ctx.getBean("dog", Dog.class);
        System.out.println("名字: " + dog.getName());
        System.out.println("日期: " + dog.getCurrent());
    }
}
