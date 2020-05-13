package springframeworkDI.springframework5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springframeworkDI.springframework5.Controllers.MyController;

@SpringBootApplication
public class SpringFramework5Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringFramework5Application.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

	}

}
