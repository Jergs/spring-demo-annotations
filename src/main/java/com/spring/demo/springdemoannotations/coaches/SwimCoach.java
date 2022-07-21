package com.spring.demo.springdemoannotations.coaches;

import com.spring.demo.springdemoannotations.services.FortuneService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public class SwimCoach implements Coach {

    private final FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
