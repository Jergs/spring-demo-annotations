package com.spring.demo.springdemoannotations.config;

import com.spring.demo.springdemoannotations.coaches.Coach;
import com.spring.demo.springdemoannotations.coaches.SwimCoach;
import com.spring.demo.springdemoannotations.services.FortuneService;
import com.spring.demo.springdemoannotations.services.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
