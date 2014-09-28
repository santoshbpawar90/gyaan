package com.jss.dao;

import org.apache.log4j.Logger;
public class Log4jUtil {
	
	private static Logger logger=null;
	
	
	static {
		try {
			logger=Logger.getRootLogger();
		} catch (Exception ex) {
			System.err.println("Failed to create Logger object." + ex);
			
		}

	}
	
	
	
	public static Logger getLoggerObj() {
		return logger;
	}

}
