package cn.edu.gench.javaee.fengjingxuan2220680.spring.service;

import cn.edu.gench.javaee.fengjingxuan2220680.spring.dao.UserDao;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.dao.UserDaoImpl;
import cn.edu.gench.javaee.fengjingxuan2220680.spring.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();
    ;

    // 修改构造函数，使其接收 UserDao 参数
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {}

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUserById(Long id) {
        return userDao.selectUserById(id);
    }

    @Override
    public User getUserByName(String name) {
        return userDao.selectUserByName(name);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.selectUsers();
    }
    // 实现 UserService 中的方法

}
