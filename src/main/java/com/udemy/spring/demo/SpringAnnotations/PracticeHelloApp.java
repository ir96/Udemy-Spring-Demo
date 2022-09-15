package com.udemy.spring.demo.SpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        //call a method on the bean
        System.out.println("\n" + theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //call new swim coach methods.....properties value injection
        System.out.println("Email: " + theCoach.getEmail());
        System.out.println("Team: " + theCoach.getTeam());
        System.out.println("Batch: " + theCoach.getBatch() + "\n");

        //close the context
        context.close();
    }
}
