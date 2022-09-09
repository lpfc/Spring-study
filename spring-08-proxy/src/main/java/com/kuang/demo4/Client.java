package com.kuang.demo4;

import com.kuang.demo2.UserService;
import com.kuang.demo2.UserServiceImpl;

/**
 * @author HC
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService=new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);

        UserService proxy = (UserService) pih.getProxy();

        proxy.hashCode();


    }
}
