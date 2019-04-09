package com.containerandbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {

    public static void main(String[] args){
        ApplicationContext contextWithXmlConfig = new ClassPathXmlApplicationContext("ioc/basic-config.xml");

        Person joe = (Person) contextWithXmlConfig.getBean("person");

        System.out.println(joe.getAddress());
        System.out.println(joe.getFullName());

    }
}
