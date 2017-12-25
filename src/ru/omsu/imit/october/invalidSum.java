package ru.omsu.imit.october;

public class invalidSum extends RuntimeException{

    public invalidSum() {
        super("Payment amount must be at least more than 0.01");
    }

    public invalidSum(String message) {
        super(message);
    }

    public invalidSum(String message, Throwable cause) {
        super(message, cause);
    }

    public invalidSum(Throwable cause) {
        super(cause);
    }
}