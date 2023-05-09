package com.example.practice.services;

import com.example.practice.controllers.PropertyInjectedController;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting()
    {
        return "Hello world-property";
    }
}
