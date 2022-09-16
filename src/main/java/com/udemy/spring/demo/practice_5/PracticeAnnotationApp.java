package com.udemy.spring.demo.practice_5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationApp {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextPractice_5.xml");

        //get the bean from spring container
        PingPongCoach theCoach = context.getBean("pingPongCoach", PingPongCoach.class);

        //call the method on bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
