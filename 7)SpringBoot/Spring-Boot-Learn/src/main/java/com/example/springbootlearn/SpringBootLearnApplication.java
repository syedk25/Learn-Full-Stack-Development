package com.example.springbootlearn;

import com.example.springbootlearn.di.NotificationManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

// @SpringBootApplication: this annotation contains;
/* 1)@SpringBootConfiguration: mark this class as configuration class and
                                starting point of the application.
  2)@EnableAutoConfiguration: Enable autoconfiguration feature dynamically
                               configure the environment based on the pom.xml
  3)@ComponentScane: Scan all annotated classes,throughout the current package.
                        like; @Service @Component @Repository.
 */

public class SpringBootLearnApplication implements CommandLineRunner
{
    private final NotificationManager notificationManager;
    SpringBootLearnApplication(NotificationManager notificationManager){
        this.notificationManager=notificationManager;
    }
    //*CommandLineRunner runs this block automatically right after Spring Boot starts up
    @Override
    public void run(String... args) throws Exception {
        notificationManager.sendAlert("Welcome to Spring Boot Constructor Injection!");

    }
    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootLearnApplication.class, args);
        /*
        springApplication : Utility Class From SpringBoot
        .run(...) : Launches/Start the entire application.
        SpringBootDemoApplication.class : use this class as starting point
        args : command line arguments passed from Java , allo SB to accept external
                  configuration.
        */
    }
}

