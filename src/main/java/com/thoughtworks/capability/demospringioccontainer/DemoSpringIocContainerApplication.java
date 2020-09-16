package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSpringIocContainerApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoSpringIocContainerApplication.class);

		GreetingService greetingService = applicationContext.getBean(GreetingService.class);
		SpringApplication.run(DemoSpringIocContainerApplication.class, args);


	}

}
