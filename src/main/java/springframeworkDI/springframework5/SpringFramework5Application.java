package springframeworkDI.springframework5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springframeworkDI.springframework5.Controllers.ConstructerInjectedController;
import springframeworkDI.springframework5.Controllers.MyController;
import springframeworkDI.springframework5.Controllers.PropertyInjectedController;
import springframeworkDI.springframework5.Controllers.SetterInjectedController;

@SpringBootApplication
public class SpringFramework5Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringFramework5Application.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("----- Primary Bean");

		System.out.println(myController.sayHello());

		System.out.println("----- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("------ Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------- Constructor");

		ConstructerInjectedController constructerInjectedController = (ConstructerInjectedController) ctx.getBean( "constructerInjectedController");

		System.out.println(constructerInjectedController.getGreeting());

	}

}
