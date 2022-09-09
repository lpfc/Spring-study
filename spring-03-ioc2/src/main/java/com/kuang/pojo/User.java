package com.kuang.pojo;

/**
 * @author HC
 * @version 1.0
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

//    public User() {
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show()
    {
        System.out.println("name="+getName());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
