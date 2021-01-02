package org.hotwater.main;

import org.anothercompany.sample.MainApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 
 * */
@SpringBootApplication
public class Application {

	// 1) Try to run my subpackage class, the which one throws 1 log event.
	// PRECONDITION ----importing org.anothercompany.sample.MainApplication;
	// (i did it!)
	// EXPECTED --------the app shows in console log lines from both Apps
	// RESULT ----------the app shows in console log lines from both Apps!!
	// and subpackage only needs to import log4j-core artifact for enable
	// compilation time
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Logger logger = LogManager.getLogger("org.metallica.com");
		logger.info("This is a father message.");

		MainApplication app = new MainApplication();
		app.run();
	}

}
