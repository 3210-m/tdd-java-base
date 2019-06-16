package com.thoughtworks.tdd.enums;

/**
 * @author tangxuejun
 * @version 2019-06-14 21:30
 */
public enum Special {
    FIZZ("Fizz"),
    BUZZ("Buzz"),
    WHIZZ("Whizz"),
    ;

    private String message;

    Special(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
