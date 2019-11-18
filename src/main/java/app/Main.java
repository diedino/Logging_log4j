package app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.warn("main warn");
        logger.error("main error");
        logger.error("error from main");
        Student student = new Student();
        University university = new University();
        student.doSomething();
        university.doSomething();
    }
}
