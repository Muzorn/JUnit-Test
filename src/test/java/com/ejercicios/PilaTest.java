package com.ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Pila test.
 */
class PilaTest {
    private static Pila pila;

    /**
     * Sets up.
     */
    @BeforeAll
    static void setUp() {
        pila = new Pila();
    }

    /**
     * No anyade mayor menor que.
     *
     * @param numeroEntrada the numero entrada
     * @param tamanyoPila   the tamanyo pila
     */
    @ParameterizedTest
    @CsvSource({"1,2", "15,3", "21,3"})
    void noAnyadeMayorMenorQue(int numeroEntrada, int tamanyoPila) {
        // Aseguramos pila con dos elementos
        pila.push(3);
        pila.push(4);

        pila.push(numeroEntrada);

        assertEquals(pila.getPila().size(), tamanyoPila);
    }

    /**
     * No anyade mayor menor que a una pila previamente vacía.
     *
     * @param numeroEntrada the numero entrada
     * @param tamanyoPila   the tamanyo pila
     */
    @ParameterizedTest
    @CsvSource({"1,0", "15,1", "21,0"})
    void noAnyadeMayorMenorQuePilaVacia(int numeroEntrada, int tamanyoPila) {
        pila.push(numeroEntrada);

        assertEquals(pila.getPila().size(), tamanyoPila);
    }

    /**
     * Menor que.
     *
     * @param numElementos the num elementos
     */
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void menorQue(int numElementos) {
        assertEquals(pila.getPila().size(), numElementos);
    }

    /**
     * Extrae ultimo pila vacia.
     */
    @Test
    void extraeUltimoPilaVacia() {
        assertNull(pila.pop());
    }

    /**
     * Extrae ultimo pila no vacia.
     */
    @Test
    void extraeUltimoPilaNoVacia() {
        pila.push(4);
        
        assertNotNull(pila.pop());
    }

    /**
     * Pila vacia.
     */
    @Test
    void pilaVacia() {
        assertEquals(pila.getPila().size(), 0);
    }

    /**
     * Pila no vacia.
     */
    @Test
    void pilaNoVacia() {
        assertNotEquals(pila.getPila().size(), 0);
    }

    /**
     * Tear down.
     */
    @AfterEach
    void tearDown() {
        pila.empty();
    }
}