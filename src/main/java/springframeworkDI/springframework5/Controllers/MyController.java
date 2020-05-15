package springframeworkDI.springframework5.Controllers;

import org.springframework.stereotype.Controller;
import springframeworkDI.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        // when we don't use Qualifier the @Primary service is used.0
        return greetingService.sayGreeting();
    }

}
