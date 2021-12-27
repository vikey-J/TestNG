package com.Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log_Property {
	static Logger log=Logger.getLogger(Log_Property.class);
	
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.debug("debug");
		log.info("information");
		log.warn("warnig");
		log.error("error");
		log.fatal("Fatel");
		
	}

}
