package org.example.testing.intergration.big_bang.exceptionHandling;

public class ControllerException extends RuntimeException {
    public ControllerException(String message) {
        super(message);
    }
    public ControllerException(String message, Throwable cause) {
        super(message, cause);
    }
}
