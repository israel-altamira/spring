package org.hotwater.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Running examples from this baeldung page
 *  https://www.baeldung.com/log4j2-appenders-layouts-filters 
 * 
 * Running examples from this springboot page
 *  https://www.baeldung.com/spring-boot-logging
 * */
@SpringBootApplication
public class Application {

	// 1) what happen if there is no APPENDER references inside ROOT logger?
	// PRECONDITION: 	console appender is present but not referenced from root logger
	// RESULT: 			i didn't saw any log line from SPRING nor any log from main,
	// 					just from embedded server tomcat
	/*public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Logger logger = LogManager.getLogger(); // there weren't any appender in config xml
		Exception e = new RuntimeException("This is only a test!");
		logger.trace("This is a TRACE.");
		logger.debug("This is a DEBUG.");
		logger.info("This is a INFO.");
		logger.warn("This is a WARNING.");
		logger.error("This is a ERROR.", e);
		logger.fatal("This is a FATAL");
	}*/
		
	// 2) what happen if getLogger() doesn't receive a parameter (a logger name)?
	// PRECONDITION: 	root logger redirect output to ConsoleAppender
	// RESULT: 			there is a root logger with a ConsoleAppender
	// 					so this getLogger() prints through root 
	// 					the name of the logger in terminal screen is org.hotwater.main.Application
	/*public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Logger logger = LogManager.getLogger();
		Exception e = new RuntimeException("This is only a test!");
		logger.trace("This is a TRACE.");
		logger.debug("This is a DEBUG.");
		logger.info("This is a INFO.");
		logger.warn("This is a WARNING.");
		logger.error("This is a ERROR.", e);
		logger.fatal("This is a FATAL");
	}*/
	
	// 3) what happen if getLogger() receive a wrong argument (no existing logger name)?
	// PRECONDITION:	config file has: NON_EXIST_LOGGER_NAME and ASYNC_JSON_FILE_APPENDER
	// 					NON_EXIST_LOGGER_NAME logger: consoleAppender
	//					ASYNC_JSON_FILE_APPENDER logger: AsyncAppender -> JSONLogfileAppender
	// RESULT: 			NON_EXIST_LOGGER_NAME logger: appears in console
	//					ASYNC_JSON_FILE_APPENDER logger: appears in json file
	
	// 4)  what happen if there is 2 loggers with same name to diff Appenders?
	// org.hotwater.com logger is duplicated: one is sending data to consoleAppender, other to JSONLogfileAppender
	// PRECONDITION:	config file has: org.hotwater.com 2 times
	// 					org.hotwater.com logger: consoleAppender
	//					org.hotwater.com logger: AsyncAppender
	// RESULT: 			org.hotwater.com logger: appears in console not in the file
	//					(consoleAppender is in last place in config file)
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Logger logger = LogManager.getLogger("NON_EXIST_LOGGER_NAME");
		Exception e = new RuntimeException("This is only a test!");
		logger.trace("This is a TRACE.");
		logger.debug("This is a DEBUG.");
		logger.info("This is a INFO.");
		logger.warn("This is a WARNING.");
		logger.error("This is a ERROR.", e);
		logger.fatal("This is a FATAL");
		
		Logger logger2 = LogManager.getLogger("ASYNC_JSON_FILE_APPENDER");
		logger2.trace("This is a TRACE.");
		logger2.debug("This is a DEBUG.");
		logger2.info("This is a INFO.");
		logger2.warn("This is a WARNING.");
		logger2.error("This is a ERROR.", e);
		logger2.fatal("This is a FATAL");
	}
	
	// 6 que pasa si tengo 2 proyectos, cada uno tiene su logger, y el A depende del B. 
	//	Como identifico cada implementacion? cual es la implementacion ganadora?
	
}
