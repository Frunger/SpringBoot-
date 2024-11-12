package cn.edu.gench.javaee.fengjingxuan2220680.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.JFrame;

public class Demo3Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        JFrame jf = ctx.getBean("jf", JFrame.class);
        jf.setBounds(50, 50, 100, 60);
        jf.setVisible(true);
    }
}
