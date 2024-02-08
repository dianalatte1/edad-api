package com.calculoedad.edadapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"controller"})
public class EdadApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdadApiApplication.class, args);
	}

}
