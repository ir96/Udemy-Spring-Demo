package com.udemy.spring.demo.practice_6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach{

    @Autowired
    private FortuneService fortuneService;

    //default constructor
    public PingPongCoach() {
        System.out.println(">> PingPongCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "practice you daily ping pong game";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
