package Utilities.Capgemini.Dlg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class LoggerUtil {
	public Logger logger;
	public LoggerUtil(){
		 logger= LogManager.getLogger(LoggerUtil.class);
	}
	

}
