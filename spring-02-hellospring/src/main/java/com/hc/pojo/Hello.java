package com.hc.pojo;

/**
 * @author HC
 * @version 1.0
 */
public class Hello {
    private String str;

    public Hello(String str) {

        this.str = str;
    }

    public Hello() {

    }

    public String getStr() {
        return str;
    }
//set方法是核心
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
