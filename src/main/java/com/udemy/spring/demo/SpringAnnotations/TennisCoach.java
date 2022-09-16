package com.udemy.spring.demo.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")// without scope its default(Singleton) class
public class TennisCoach implements Coach{

    //Field Injection using java Reflection method
    @Autowired
    @Qualifier("randomFortuneService")
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
