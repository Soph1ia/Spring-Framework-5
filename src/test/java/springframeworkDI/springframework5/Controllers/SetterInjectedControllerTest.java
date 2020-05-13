package springframeworkDI.springframework5.Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springframeworkDI.springframework5.services.ConstructorGreetingService;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();

        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.getGreeting());
    }
}