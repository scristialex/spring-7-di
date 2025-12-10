package guru.springframework.spring7di.controllers;

import guru.springframework.spring7di.services.GreetingService;
import guru.springframework.spring7di.services.GreetingServiceImpl;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }


}
