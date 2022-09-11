package com.udemy.spring.demo.SpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {
        //read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationsApplicationContext.xml");

        //get the bean from the spring container
        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();

    }
}
