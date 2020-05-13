package springframeworkDI.springframework5.Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springframeworkDI.springframework5.services.GreetingServiceImpl;

class ConstructerInjectedControllerTest {

    ConstructerInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new ConstructerInjectedController(new GreetingServiceImpl());

    }

    @Test
    void sayGreeting() {
        System.out.println(controller.getGreeting());
    }
}