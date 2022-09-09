package com.hc.dao;

/**
 * @author HC
 * @version 1.0
 */
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("MySql获取用户的数据");
    }
}
