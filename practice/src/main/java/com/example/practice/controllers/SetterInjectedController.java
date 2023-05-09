package com.example.practice.controllers;

import com.example.practice.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
