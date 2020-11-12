package org.hotwater.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// what happen if getLogger doesn't have a name as parameter
		Logger logger = LogManager.getLogger();
		Exception e = new RuntimeException("This is only a test!");

		logger.info("This is a simple message at INFO level.");
		logger.error("This is a simple message at ERROR level. " + "This is the minimum visible level.", e);

	}

}
