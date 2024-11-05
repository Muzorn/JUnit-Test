package com.springdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JUnitTestCaseTest {
    @Test
    void miPrueba() {
        int resultado = 2 + 2;
        assertEquals(resultado, 4);
    }
}