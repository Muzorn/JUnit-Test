package com.ejercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
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
    @Tag("High")
    @Test
    void numElementos() {
        assertEquals(TareaTest.tareas.size(), 2);
    }

    /**
     * Primera tarea.
     */
    @Tag("High")
    @Test
    void primeraTarea() {
        assertEquals(TareaTest.tareas.get(0).getNombre(), "Comprar pan");
    }

    /**
     * Primera tarea completada.
     */
    @Tag("Medium")
    @Test
    void primeraTareaCompletada() {
        assertFalse(TareaTest.tareas.get(0).isCompletada());
    }

    /**
     * Buscar tarea 3.
     */
    @Tag("Low")
    @Test
    void buscarTarea3() {
        assertThrows(IndexOutOfBoundsException.class, () -> TareaTest.tareas.get(3));
    }
}