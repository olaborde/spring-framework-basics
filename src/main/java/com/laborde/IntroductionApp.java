package com.laborde;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IntroductionApp {

    public static void main(String[] args){
        Person person = new Person("John Doe");
        System.out.println(person.getFullName());


        ApplicationContext context = new AnnotationConfigApplicationContext(IntroductionConfig.class);
        Person p = context.getBean(Person.class);
        System.out.println(p.getFullName());
    }
}
