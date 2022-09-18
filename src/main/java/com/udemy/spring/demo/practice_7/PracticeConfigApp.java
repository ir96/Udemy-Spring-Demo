package com.udemy.spring.demo.practice_7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeConfigApp {
    public static void main(String[] args) {
        //read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PracticeSportConfig.class);

        //get the bean from the spring container
        Coach theCoach = context.getBean("wrestlingCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();

    }
}
