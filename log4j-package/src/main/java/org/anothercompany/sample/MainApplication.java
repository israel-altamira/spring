package org.anothercompany.sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainApplication {

	public void run() {
		Logger logger = LogManager.getLogger(); // there weren't any appender in config xml
		logger.info("This is log event from another company package");
	}

}
