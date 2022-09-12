package com.udemy.spring.demo.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    //define a default constructor
    public TennisCoach() {
        System.out.println(">> inside default constructor");
    }

    /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
     */

    //define a setter method
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: inside setter method");
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "\nPractice your daily backend\n";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
