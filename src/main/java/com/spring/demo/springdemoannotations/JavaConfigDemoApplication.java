package com.spring.demo.springdemoannotations;

import com.spring.demo.springdemoannotations.coaches.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaConfigDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JavaConfigDemoApplication.class, args);

        Coach coach = context.getBean("swimCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune() );
    }
}
