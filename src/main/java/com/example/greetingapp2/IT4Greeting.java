package com.example.greetingapp2;

import org.springframework.stereotype.Component;

@Component
public class IT4Greeting {
    private final GreetingService greetingService;

    public IT4Greeting(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void showGreeting() {
        System.out.println(greetingService.getGreeting());
    }
}
