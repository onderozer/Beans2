package com.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * Created by dedeHan on 31.1.2016.
 */
@ComponentScan({"com.abc.foo","com.beans"})
@SpringBootApplication
public class SpringBeans {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringBeans.class,args);

        String[] beanName = ctx.getBeanDefinitionNames();
        Arrays.sort(beanName);
        for (String name : beanName) {
            System.out.println(name);
        }

    }
}
