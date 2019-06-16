package com.thoughtworks.tdd.game;

import com.thoughtworks.tdd.enums.Special;

/**
 * 游戏实现类
 */
public class FizzBuzz implements IFizzBuzz {

    @Override
    public String fizzBuzz(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("input is illegal,your input is:" + num);
        }
        StringBuilder result = new StringBuilder();
        if (num % 3 == 0) {
            result.append(Special.FIZZ.getMessage());
        }
        if (num % 5 == 0) {
            result.append(Special.BUZZ.getMessage());
        }
        if (num % 7 == 0) {
            result.append(Special.WHIZZ.getMessage());
        }
        if (result.toString().isEmpty()) {
            return String.valueOf(num);
        }
        return result.toString();
    }
}
