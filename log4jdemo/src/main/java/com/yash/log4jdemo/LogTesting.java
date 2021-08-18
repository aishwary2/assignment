package com.yash.log4jdemo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogTesting {
	static Logger log=Logger.getLogger(LogTesting.class);
	public static void add(int a,int b) {
		int c=a+b;
		log.info("addition of "+a+" and "+b+" = "+c);
	}
	public static void divide(int a,int b) {
		try {
			int c=a/b;
			log.info("division of "+a+" and "+b+" = "+c);
		}catch(Exception e) {
			log.error(e);
		}
	}
public static void main(String[] args) {
	//BasicConfigurator.configure();
   // PropertyConfigurator.configure("log.properties");
    add(1,2);
    divide(10,0);
    divide(10,5);
//	log.info(".info method used for log");
//	log.warn("Warrning");
//	log.error("Error incoming");
//	log.debug("log for debug");
//	log.trace("log for trace");
//	
}
}
