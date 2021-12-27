package com.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Loger{
	static Logger log=Logger.getLogger(Basic_Loger.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.debug("debug");
		log.info("information");
		log.warn("warnig");
		log.error("error");
		log.fatal("Fatel");
		
	}
}