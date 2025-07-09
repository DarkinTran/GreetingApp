package com.example.greetingapp2;

import com.example.greetingapp2.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class K2GreetingService implements GreetingService {

    @Override
    public String getGreeting() {
        return "Xin chào từ K2!";
    }
}
