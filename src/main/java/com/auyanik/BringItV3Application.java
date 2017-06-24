package com.auyanik;
import com.auyanik.config.DaoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.auyanik.*"})
public class BringItV3Application {

	public static void main(String[] args) {
		SpringApplication.run(BringItV3Application.class, args);
	}
}
