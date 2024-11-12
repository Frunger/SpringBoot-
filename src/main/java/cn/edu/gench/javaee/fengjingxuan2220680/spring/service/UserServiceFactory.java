package cn.edu.gench.javaee.fengjingxuan2220680.spring.service;

import cn.edu.gench.javaee.fengjingxuan2220680.spring.dao.UserDao;

public class UserServiceFactory {

    // 非静态方法
    public UserService getUserService(UserDao userDao) {
        return new UserServiceImpl(userDao);
    }
}
