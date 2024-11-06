package com.fizzbuzz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    private static FizzBuzz fizzBuzz;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        FizzBuzzTest.fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "3,Fizz", "5,Buzz", "6,Fizz", "10,Buzz", "15,FizzBuzz"})
    void testFizzBuzz(Integer entrada, String esperado) {
        String resultado = FizzBuzzTest.fizzBuzz.transformar(entrada);

        assertEquals(esperado, resultado);
    }
}