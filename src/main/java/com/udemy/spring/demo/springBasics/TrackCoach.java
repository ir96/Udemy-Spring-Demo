package com.udemy.spring.demo.springBasics;

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

    // add an init method
    public void doMyStartStuff() {
        System.out.println("TrackCoach: inside method doMyStartStuff");
    }

    // add a destroy method
    public void doMyCleanStuff() {
        System.out.println("\n**TrackCoach: inside method doMyCleanStuff");
    }

}
