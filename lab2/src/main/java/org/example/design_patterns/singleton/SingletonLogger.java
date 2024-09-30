package org.example.design_patterns.singleton;

public class SingletonLogger {

    private static SingletonLogger _logger = new SingletonLogger();
    private SingletonLogger() {}
    public static SingletonLogger getInstance(){
        return _logger;
    }
    public void logError(String message) {
        System.out.println(message);
    }
    public void logWarning(String message) {
        System.out.println(message);
    }
    public void logInfo(String message) {
        System.out.println(message);
    }


}
