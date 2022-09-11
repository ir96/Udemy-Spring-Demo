package com.udemy.spring.demo.practice_2;

import com.udemy.spring.demo.springBasics.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloApp {

    public static void main(String[] args) {
        //load the spring configuration files
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        SwimmingCoach theCoach = context.getBean("mySwimmingCoach", SwimmingCoach.class);

        //call the methods on the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();

    }

}
