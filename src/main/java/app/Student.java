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
        mapMessage.put("key1", "value1");
        mapMessage.put("key2", "value2");
        mapMessage.put("key3", "value3");

        logger.warn(mapMessage);
    }

}
