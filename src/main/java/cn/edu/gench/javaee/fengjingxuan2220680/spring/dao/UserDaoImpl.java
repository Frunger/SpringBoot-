package cn.edu.gench.javaee.fengjingxuan2220680.spring.dao;

import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private List<User> users = new ArrayList<>();

    public UserDaoImpl() {
        // 模拟用户数据
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId((long) (i + 1));
            user.setName("Student" + (i + 1));
            user.setAge(20 + i);
            users.add(user);
        }
    }

    @Override
    public User selectUserById(Long id) {
        // 根据 ID 查找用户
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null; // 如果未找到，则返回 null
    }

    @Override
    public User selectUserByName(String name) {
        // 根据名称查找用户
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null; // 如果未找到，则返回 null
    }

    @Override
    public List<User> selectUsers() {
        // 返回所有用户
        return users;
    }
}
