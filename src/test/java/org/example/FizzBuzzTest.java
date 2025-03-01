package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_buzz_if_number_dividable_by_3(){
        assertEquals("Fizz", fizzBuzz.getResult(3));
    }

    @Test
    void should_return_buzz_if_number_dividable_by_5(){
        assertEquals("Buzz", fizzBuzz.getResult(5));
    }

    @Test
    void should_return_buzz_if_number_dividable_by_15(){
        assertEquals("FizzBuzz", fizzBuzz.getResult(15));
        assertEquals("FizzBuzz", fizzBuzz.getResult(30));
    }

    @Test
    void should_return_same_number_if_no_registrement(){
        assertEquals("14", fizzBuzz.getResult(14));
        assertEquals("1", fizzBuzz.getResult(1));
    }

}