package com.kuang.Log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author HC
 * @version 1.0
 */
public class Log implements MethodBeforeAdvice {

    //method   要执行的目标的对象
    //args 对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
