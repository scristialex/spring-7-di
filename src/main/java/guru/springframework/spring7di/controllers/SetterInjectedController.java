package guru.springframework.spring7di.controllers;

import guru.springframework.spring7di.services.GreetingService;

public class SetterInjectedController {

    GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
