package com.spring.demo.springdemoannotations;

import com.spring.demo.springdemoannotations.coaches.Coach;
import com.spring.demo.springdemoannotations.coaches.SwimCoach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaConfigDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JavaConfigDemoApplication.class, args);

        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam() );
    }
}
