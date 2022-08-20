package com.udemy.spring.demo;

public class MyApp {
    public static void main(String[]args){

        BaseBallCoach coach = new BaseBallCoach();
        System.out.println("hello " + coach.getDailyWorkout());
    }
}