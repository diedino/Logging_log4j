package app;


import loggingpackage.LogPack1;
import loggingpackage.LogPack2;
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
        //for (int i=0; i<1000; i++) {
            student.doSomething();
            university.doSomething();
      //  }
        LogPack1 logPack1 = new LogPack1();
        LogPack2 logPack2 = new LogPack2();
        logPack1.doSmth();
        logPack2.doSmth();
        logger.warn("one = {}", 1);
    }
}
