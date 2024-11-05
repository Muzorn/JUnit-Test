package com.ejercicios;

/**
 * The type Producto.
 */
public class Producto {
	private String nombre;
    private double precio;
    private double descuento;

    /**
     * Instantiates a new Producto.
     *
     * @param nombre    the nombre
     * @param precio    the precio
     * @param descuento the descuento
     */
    public Producto(String nombre, double precio, double descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    /**
     * Gets precio.
     *
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Gets descuento.
     *
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }
}
