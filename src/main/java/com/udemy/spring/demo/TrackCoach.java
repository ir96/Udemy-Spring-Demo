package com.udemy.spring.demo;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "run for 5 km";
    }
}
