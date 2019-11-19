package app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.MapMessage;

public class Student {

    static Logger logger = LogManager.getLogger(Student.class);
    MapMessage mapMessage = new MapMessage();

    public void doSomething(){
        logger.info("qwert from app.Student");
        logger.error("error from Student");
    }

    public void doMapMes() {
        mapMessage.put("key", "value");
        logger.warn(mapMessage);
    }

}
