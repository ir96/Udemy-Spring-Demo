package com.udemy.spring.demo.springBasics;

public class BaseBallCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "workout for 30 min";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}