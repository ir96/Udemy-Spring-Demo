package com.udemy.spring.demo.springBasics;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "today is your lucky day";
    }
}
