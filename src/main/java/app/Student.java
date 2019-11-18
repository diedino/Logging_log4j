package app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Student {

    static Logger logger = LogManager.getLogger(Student.class);

    public void doSomething(){
        logger.info("qwert from app.Student");
        logger.error("error from Student");
    }
}
