package com.hc.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author HC
 * @version 1.0
 */
//等价于     <bean id="user" class="com.hc.pojo.User"/>
@Component
@Scope("Singleton")
public class User {

    @Value("kuangshen")
    public String name;

    @Value("hc")
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
