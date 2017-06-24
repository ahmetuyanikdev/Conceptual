package com.auyanik;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.auyanik.*"})
public class BringItV3Application {

	public static void main(String[] args) {
		SpringApplication.run(BringItV3Application.class, args);
	}
}
