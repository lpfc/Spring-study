package com.kuang.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author HC
 * @version 1.0
 */
//用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {


            //处理代理实例并返回结果


    private  Rent rent;

    public void setRent(Rent rent) {
        this.rent =  rent;
    }

    //生成得到代理类
    public Object getProxy(){
     return   Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);

    }
    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
        //动态代理的本质就是使用反射机制实现
        seeHouse();
        Object result = method.invoke(rent, args);
        fare();
        return  result;
    }

    public void seeHouse()
    {
        System.out.println("中介带你看房子");
    }

    public void fare()
    {
        System.out.println("收中介费");
    }

    public void setRent(Host host) {

    }
}
