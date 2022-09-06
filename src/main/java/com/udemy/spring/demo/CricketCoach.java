package com.udemy.spring.demo;

public class   CricketCoach implements Coach{

    //define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection(no-org constructor)
    public CricketCoach() {
        System.out.println("CricketCoach: inside setter method - default");
    }

    public CricketCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
        System.out.println("CricketCoach: inside setter method");
    }

    @Override
    public String getDailyWorkout() {
        return "play for 50 overs";
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    //setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method- setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        //use my fortune service to get a fortune
        return fortuneService.getFortune();
    }
}
