package org.rajesh.beancreation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanCreationApplication implements CommandLineRunner {

	@Autowired
	Apple app;

	@Autowired
	Car car;

	@Override
	public void run(String... args) throws Exception {
		app.getApple();
		System.out.println(car.hashCode());
	}

	public static void main(String[] args) {
		SpringApplication.run(BeanCreationApplication.class, args);
	}

}
