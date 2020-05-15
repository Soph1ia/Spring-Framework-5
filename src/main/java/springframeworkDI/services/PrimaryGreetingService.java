package springframeworkDI.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService  implements GreetingService{
    // When we add @Primary, Spring will take precedence of this class to use when unsure of which one to use.
    @Override
    public String sayGreeting() {
        return "Hello World -- Primary Bean";
    }
}
