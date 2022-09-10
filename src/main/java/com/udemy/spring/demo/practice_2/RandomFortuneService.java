package com.udemy.spring.demo.practice_2;

import com.udemy.spring.demo.FortuneService;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    //create an array of strings
    private String[] arr = {
            "Beware of the wolf in sheep's",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    //create a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {
        //pick a random string from the array
        int index = random.nextInt(arr.length);
        System.out.println("Array index : " + index);
        return arr[index];
    }
}
