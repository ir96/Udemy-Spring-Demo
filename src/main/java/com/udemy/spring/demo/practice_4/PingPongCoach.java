package com.udemy.spring.demo.practice_4;

import com.udemy.spring.demo.SpringAnnotations.Coach;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "\nPractice ping-pong game regularly\n";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
