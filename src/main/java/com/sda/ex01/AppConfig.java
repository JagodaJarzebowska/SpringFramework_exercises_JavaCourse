package com.sda.ex01;

import com.sda.ex02.TimeManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sda")
public class AppConfig {

    @Bean
    TimeManager getTime() {
        return new TimeManager();
    }

}
