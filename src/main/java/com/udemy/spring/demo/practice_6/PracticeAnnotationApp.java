package com.udemy.spring.demo.practice_6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationApp {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextPractice_6.xml");

        //get the bean from spring container
        Coach theCoach = context.getBean("pingPongCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
