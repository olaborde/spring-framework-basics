package com.laborde;

import org.springframework.context.annotation.Bean;

public class IntroductionConfig {
    @Bean
    public Person getPerson(){
        return new Person("Rob Lowe");
    }
}
