package cn.edu.gench.javaee.fengjingxuan2220680.spring;

import cn.edu.gench.javaee.fengjingxuan2220680.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        System.out.println(userService.getAllUsers());
    }
}
