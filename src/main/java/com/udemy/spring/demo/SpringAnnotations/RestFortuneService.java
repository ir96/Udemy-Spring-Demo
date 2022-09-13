package com.udemy.spring.demo.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return null;
    }
}
