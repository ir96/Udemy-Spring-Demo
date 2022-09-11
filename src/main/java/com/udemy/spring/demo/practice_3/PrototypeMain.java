package com.udemy.spring.demo.practice_3;

import com.udemy.spring.demo.springBasics.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeMain {
    public static void main(String[] args) {

        // load the bean configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("prototypeSwimmingCoach", Coach.class);
        Coach alphaCoach = context.getBean("prototypeSwimmingCoach", Coach.class);

        //check if they are the same beans
        boolean result = (theCoach == alphaCoach);

        //call the method on the bean
        //print the result
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("Memory location for theCoach: " + theCoach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach + "\n");

        //close the context
        context.close();

    }
}
