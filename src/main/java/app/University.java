package app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.MarkerManager;

public class University {

    static Logger logger = LogManager.getLogger(University.class);

    public void doSomething(){
        logger.info("qwert from university");
        logger.error(MarkerManager.getMarker("FLOW"), "error with marker \"flow\" from university");
    }
}
