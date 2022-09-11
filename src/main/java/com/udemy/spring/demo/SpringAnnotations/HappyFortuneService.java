package com.udemy.spring.demo.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is My lucky day\n";
    }
}
