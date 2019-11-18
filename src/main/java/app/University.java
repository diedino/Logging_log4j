package app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class University {

    static Logger logger = LogManager.getLogger(University.class);

    public void doSomething(){
        logger.info("qwert from university");
        logger.error("error from university");
    }
}
