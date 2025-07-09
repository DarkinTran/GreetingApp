package com.example.greetingapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingApplication implements CommandLineRunner {

    private final IT4Greeting it4Greeting;

    @Autowired
    public GreetingApplication(IT4Greeting it4Greeting) {
        this.it4Greeting = it4Greeting;
    }

    public static void main(String[] args) {
        SpringApplication.run(GreetingApplication.class, args);
    }

    @Override
    public void run(String... args) {
        it4Greeting.showGreeting();
    }
}
