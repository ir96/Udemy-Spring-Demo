package com.udemy.spring.demo.practice_4;

import com.udemy.spring.demo.SpringAnnotations.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationPracticeApp {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationsApplicationContext.xml");

        //get the bean from spring container
        Coach theCoach = context.getBean("pingPongCoach", Coach.class);

        //call the methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();

    }
}
