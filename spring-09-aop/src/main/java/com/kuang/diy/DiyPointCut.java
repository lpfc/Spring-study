package com.kuang.diy;

/**
 * @author HC
 * @version 1.0
 */
public class DiyPointCut {
    public void before(){
        System.out.println("-------方法执行前--------");
    }
    public void after(){
        System.out.println("--------方法执行后----------");
    }
}
