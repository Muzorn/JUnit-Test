package com.ejercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Calculadora test.
 */
class CalculadoraTest {
    private Calculadora calculadora;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    /**
     * Calculo factorial.
     *
     * @param n the n
     */
    @ParameterizedTest
    @ValueSource(ints = { 2, 3, 4, 5, 6, 7, 8, 9})
    void calculoFactorial(int n) {
        assertEquals(calculadora.factorial(n), 2);
    }

    /**
     * Calculo factorial csv.
     *
     * @param calcular the calcular
     * @param esperado the esperado
     */
    @ParameterizedTest
    @CsvSource({"0,1", "2,2", "3,7", "4,54"})
    void calculoFactorialCsv(int calcular, int esperado) {
        assertEquals(calculadora.factorial(calcular), esperado);
    }
}