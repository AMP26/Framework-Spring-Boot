package com.springboot.componentscanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.springboot.constructorinjection", "com,.springboot.greet"} )
public class ComponentScanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentScanningApplication.class, args);
	}

}
