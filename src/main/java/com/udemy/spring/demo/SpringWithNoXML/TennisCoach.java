package com.udemy.spring.demo.SpringWithNoXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    //Field Injection using java Reflection method
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    //define a default constructor
    public TennisCoach() {
        System.out.println(">> inside default constructor");
    }

    //define my init method
    @PostConstruct
    public void doMyStartStuff() {
        System.out.println(">>TennisCoach: inside of doMyStartStuff - @PostConstruct");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> Tennis Coach: inside cleanUpStuff - @PreDestroy");
    }

    /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
     */

    /*
    //define a setter method
    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff method");
        fortuneService = theFortuneService;
    }
     */

    @Override
    public String getDailyWorkout() {
        return "\nPractice your daily backend\n";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
