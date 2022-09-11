package com.udemy.spring.demo.practice_3;

import com.udemy.spring.demo.practice_2.SwimmingCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonMain {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container
        SwimmingCoach theCoach = context.getBean("singletonSwimmingCoach", SwimmingCoach.class);
        SwimmingCoach alphaCoach = context.getBean("singletonSwimmingCoach", SwimmingCoach.class);

        //call the method on the bean
        //check if they are the same beans
        boolean result = (theCoach == alphaCoach);

        //print the result
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("Memory location for theCoach: " + theCoach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach + "\n");

        //close the context
        context.close();

    }
}
