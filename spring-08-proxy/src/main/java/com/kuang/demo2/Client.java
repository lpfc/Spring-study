package com.kuang.demo2;

/**
 * @author HC
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.query();
    }
}
