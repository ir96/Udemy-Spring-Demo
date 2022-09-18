package com.udemy.spring.demo.practice_7;

import org.springframework.stereotype.Component;

@Component
public class WrestlingCoach implements Coach{

    private FortuneService fortuneService;

    public WrestlingCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your double leg takeDown";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
