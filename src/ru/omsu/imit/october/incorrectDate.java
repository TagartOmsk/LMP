package ru.omsu.imit.october;

public class incorrectDate extends RuntimeException{
    public incorrectDate(String message) {
        super(message);
    }

    public incorrectDate(String message, Throwable cause) {
        super(message, cause);
    }

    public incorrectDate(Throwable cause) {
        super(cause);
    }

    public incorrectDate(){

        super("Please, input the correct date");
    }
}