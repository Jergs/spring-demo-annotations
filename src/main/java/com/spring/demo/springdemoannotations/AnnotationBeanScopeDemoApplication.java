package com.spring.demo.springdemoannotations;

import com.spring.demo.springdemoannotations.coaches.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnnotationBeanScopeDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDemoAnnotationsApplication.class, args);

        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach secondCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (coach == secondCoach);

        System.out.println("Pointing to the same object: " + result);
        System.out.println("Memory location of the coach: " + coach);
        System.out.println("Memory location of second coach: " + secondCoach);
    }
}
