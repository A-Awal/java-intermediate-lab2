package org.example.design_patterns.singleton;

public class Application {

    public static void main(String[] args) {
        //create first logger
        SingletonLogger logger = SingletonLogger.getInstance();

        //create second logger
        SingletonLogger logger2 = SingletonLogger.getInstance();

        //Compare logger 1 and 2 for identity
        assert logger == logger2;
        logger.logError("error message");
    }
}
