package com.spring.demo.springdemoannotations.coaches;

import com.spring.demo.springdemoannotations.services.FortuneService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SwimCoach implements Coach {

    private final FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
