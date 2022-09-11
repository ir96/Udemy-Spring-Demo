package com.udemy.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from the spring container (Singleton Scope)
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //check if they are the same beans
        boolean result = (theCoach == alphaCoach);

        //print the result
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        //// ** Prototype scope - new object for each reference **
        //Pointing to the same object: false
        //Memory location for theCoach: com.udemy.spring.demo.TrackCoach@59505b48
        //Memory location for alphaCoach: com.udemy.spring.demo.TrackCoach@7db12bb6

        //close the context
        context.close();
    }
}
