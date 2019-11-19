package loggingpackage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogPack1 {

    Logger logger = LoggerFactory.getLogger(LogPack1.class);
    public void doSmth(){
        logger.warn("warn from LogPack1");
    }
}
