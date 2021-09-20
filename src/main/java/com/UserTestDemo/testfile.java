package com.UserTestDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class testfile {
	
	
public static void main(String[] args) {
		
	Logger logger = LogManager.getLogger(testfile.class);
	
	logger.info("Logger info");
	logger.error("logger error");
	logger.warn("logger warn");
	logger.fatal("logger fatal");
	logger.trace("logger trace");
		
	}

}
