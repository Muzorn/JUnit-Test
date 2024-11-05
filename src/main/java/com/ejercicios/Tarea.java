package com.ejercicios;

/**
 * The type Tarea.
 */
public class Tarea {
    // ... implementación de la clase Tarea ...
    private String nombre;
    private boolean completada;

    /**
     * Instantiates a new Tarea.
     *
     * @param nombre     the nombre
     * @param completada the completada
     */
    public Tarea(String nombre, boolean completada) {
        this.nombre = nombre;
        this.completada = completada;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Is completada boolean.
     *
     * @return the boolean
     */
    public boolean isCompletada() {
        return completada;
    }
}
