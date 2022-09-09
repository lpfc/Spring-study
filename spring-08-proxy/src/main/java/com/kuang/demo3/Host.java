package com.kuang.demo3;

import com.kuang.demo1.Proxy;

/**
 * @author HC
 * @version 1.0
 */
public class Host {
    public static void main(String[] args) {


        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
        System.out.println("我要出租房子");
    }
}
