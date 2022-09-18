package com.udemy.spring.demo.practice_7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeSportConfig {

    //define bean for our happy fortune service
    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    //define bean for our wrestling coach And DI
    @Bean
    public Coach wrestlingCoach() {
        WrestlingCoach myWrestlingCoach = new WrestlingCoach(happyFortuneService());
        return myWrestlingCoach;
    }

}
