package loggingpackage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogPack2 {

    Logger logger = LoggerFactory.getLogger(LogPack2.class);
    public void doSmth(){
        logger.warn("warn from LogPack2");
    }
}