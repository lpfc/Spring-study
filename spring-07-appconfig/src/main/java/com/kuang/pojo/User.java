package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @author HC
 * @version 1.0
 */
@Controller
public class User {
    private String name;



    public String getName() {
        return name;
    }

    @Value("QIANGJIAN")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
