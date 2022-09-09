package com.kuang.demo1;

/**
 * @author HC
 * @version 1.0
 */
public class Proxy implements Rent{

    private Host host;

    public Proxy(com.kuang.demo3.Host host) {
    }

    @Override
    public void rent() {

    }


    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }
    public void seeHouse()
    {
        System.out.println("中介带你看房");
    }
    public void hetong()
    {
        System.out.println("签租赁合同");
    }
    public void fare()
    {
        System.out.println("收中介费用");
    }
}
