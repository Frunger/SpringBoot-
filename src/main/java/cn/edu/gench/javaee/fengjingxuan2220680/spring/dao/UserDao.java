package cn.edu.gench.javaee.fengjingxuan2220680.spring.dao;

import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.User;
import java.util.List;

public interface UserDao {
    User selectUserById(Long id);
    User selectUserByName(String name);
    List<User> selectUsers();
}
