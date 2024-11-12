package cn.edu.gench.javaee.fengjingxuan2220680.spring.service;

import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.User;
import java.util.List;

public interface UserService {
    User getUserById(Long id);
    User getUserByName(String name);
    List<User> getAllUsers();
}
