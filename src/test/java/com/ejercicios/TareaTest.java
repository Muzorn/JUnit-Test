package com.ejercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Tarea test.
 */
class TareaTest {
    private static List<Tarea> tareas;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        TareaTest.tareas = new ArrayList<>();
        tareas.add(new Tarea("Comprar pan", false));
        tareas.add(new Tarea("Pagar factura", true));
    }

    /**
     * Num elementos.
     */
    @Test
    void numElementos() {
        assertEquals(TareaTest.tareas.size(), 2);
    }
}