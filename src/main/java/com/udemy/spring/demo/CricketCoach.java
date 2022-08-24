package com.udemy.spring.demo;

public class CricketCoach implements Coach{

    //define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public CricketCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
    public String getDailyWorkout() {
        return "play for 50 overs";
    }

    @Override
    public String getDailyFortune() {
        //use my fortune service to get a fortune
        return fortuneService.getFortune();
    }
}
