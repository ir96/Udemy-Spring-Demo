package com.udemy.spring.demo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach() {

    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }



    @Override
    public String getDailyWorkout() {
        return "run for 5 km";
    }

    @Override
    public String getDailyFortune() {
        return "Just do id: " + fortuneService.getFortune();
    }
}
