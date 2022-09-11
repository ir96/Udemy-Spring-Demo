package com.udemy.spring.demo.springBasics;

public class MyApp {
    public static void main(String[]args){

        Coach coach = new TrackCoach();
        System.out.println("hello " + coach.getDailyWorkout());
    }
}