package springframeworkDI.springframework5.Controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springframeworkDI.services.GreetingService;

@Controller
public class ConstructerInjectedController {

    private final GreetingService greetingService;

    public ConstructerInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
