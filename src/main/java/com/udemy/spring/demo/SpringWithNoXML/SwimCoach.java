package com.udemy.spring.demo.SpringWithNoXML;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    public SwimCoach (FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 m as warm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
