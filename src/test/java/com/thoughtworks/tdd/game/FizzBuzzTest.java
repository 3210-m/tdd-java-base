package com.thoughtworks.tdd.game;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i < 120; i++) {
            //given
            ExpectResult expectResult = new ExpectResult();
            String actual = expectResult.getResult().get(i);

            //when
            String result = fizzBuzz.fizzBuzz(i + 1);

            //then
            assertThat(result, is(actual));
        }
    }

    @Test
    public void givenMock() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.fizzBuzz(10);

        //then
        assertThat(actual, CoreMatchers.is("Buzz"));

    }
}