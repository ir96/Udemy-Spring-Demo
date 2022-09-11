package com.udemy.spring.demo.springBasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {
    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //retrieve bean from the spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
