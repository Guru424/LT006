package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogUtility {

	static Logger log=Logger.getLogger(LogUtility.class.getClass());
	
	public void logInfo(String message){
		log.info(message);
	}
	
	public void conf(){
		DOMConfigurator.configure("Log4j.xml");
	}
}
