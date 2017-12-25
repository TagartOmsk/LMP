package ru.omsu.imit.october;

public class invalidDataArgument extends RuntimeException{
    public invalidDataArgument() {
        super("date must be sent as a string dd.mm.yyyy");
    }

    public invalidDataArgument(String message) {
        super(message);
    }

    public invalidDataArgument(String message, Throwable cause) {
        super(message, cause);
    }

    public invalidDataArgument(Throwable cause) {
        super(cause);
    }
}
