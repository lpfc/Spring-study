package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author HC
 * @version 1.0
 */
@Configuration//配置类，相当于beans.xml
@ComponentScan("com.kuang.pojo")
@Import(hhhccc.class)
public class KuangConfig {

    @Bean
    public User getUser()
    {
        return new User();
    }
}
