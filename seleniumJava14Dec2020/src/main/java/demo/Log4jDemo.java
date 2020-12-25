package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger= LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n....Hello World....\n");
		logger.trace("this is trace message");
		logger.info("this is info message");
		logger.error("this is error message");
		logger.fatal("this is info message");
		logger.warn("this is error message");
		
		System.out.println("\n....completed....\n");
	}

}
