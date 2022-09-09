package com.hc.service;

import com.hc.dao.UserDao;
import com.hc.dao.UserDaoImpl;
import com.hc.dao.UserDaoMysqlImpl;
import com.hc.dao.UserDaoOracleImpl;

/**
 * @author HC
 * @version 1.0
 */
public class UserServiceImpl implements UserService {

    //    private UserDao userDao=new UserDaoMysqlImpl();
    private UserDao userDao;

    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
