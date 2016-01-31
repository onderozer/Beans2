package com.beans;

import com.abc.foo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * Created by dedeHan on 31.1.2016.
 */
@ComponentScan({"com.abc.foo","com.beans"})
@SpringBootApplication
public class SpringBeans {

    @Bean
    public User user()
    {
        return new User("onder","ozer");
    }

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringBeans.class,args);

        String[] beanName = ctx.getBeanDefinitionNames();
        Arrays.sort(beanName);
        for (String name : beanName) {
            System.out.println(name);
        }

        System.out.println(ctx.getBean("user").toString());

    }
}
