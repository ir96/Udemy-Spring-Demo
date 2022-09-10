package com.udemy.spring.demo.practice_2;

import com.udemy.spring.demo.Coach;
import com.udemy.spring.demo.FortuneService;

public class SwimmingCoach implements Coach {

    private FortuneService fortuneService;

    public SwimmingCoach() {
        System.out.println("SwimmingCoach: inside setter method - default constructor");
    }

    public SwimmingCoach (FortuneService theFortuneService) {
        fortuneService = theFortuneService;
        System.out.println("SwimmingCoach: setFortuneService");
    }

    @Override
    public String getDailyWorkout() {
        return "Keep Practicing to improve the skills";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}