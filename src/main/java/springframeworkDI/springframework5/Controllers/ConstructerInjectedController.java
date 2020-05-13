package springframeworkDI.springframework5.Controllers;

import springframeworkDI.springframework5.services.GreetingService;

public class ConstructerInjectedController {

    private final GreetingService greetingService;

    public ConstructerInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
