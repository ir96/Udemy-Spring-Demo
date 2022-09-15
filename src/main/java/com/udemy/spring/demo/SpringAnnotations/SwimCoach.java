package com.udemy.spring.demo.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Value("${foo.batch}")
    private String batch;

    public String getBatch() {
        return batch;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }



    @Override
    public String getDailyWorkout() {
        return "Swim 1000m as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
