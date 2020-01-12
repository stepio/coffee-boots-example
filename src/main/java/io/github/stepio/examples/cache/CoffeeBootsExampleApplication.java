package io.github.stepio.examples.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching
@EnableScheduling
@SpringBootApplication(scanBasePackages = {"io.github.stepio.examples.cache"})
public class CoffeeBootsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeBootsExampleApplication.class, args);
	}

}
