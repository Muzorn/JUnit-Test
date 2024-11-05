package com.ejercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Proceso aleatorio test.
 */
class ProcesoAleatorioTest {
    private ProcesoAleatorio procesoAleatorio;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        procesoAleatorio = new ProcesoAleatorio();
    }

    /**
     * Test aleatorio.
     */
    @RepeatedTest(value = 100000)
    void testAleatorio() {
        assertTrue(procesoAleatorio.ejecutar());
    }
}