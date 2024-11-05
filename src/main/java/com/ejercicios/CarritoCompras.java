package com.ejercicios;

import java.util.List;

/**
 * The type Carrito compras.
 */
public class CarritoCompras {
	private List<Producto> productos;


    /**
     * Sets productos.
     *
     * @param productos the productos
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    /**
     * Calcular total double.
     *
     * @return the double
     */
    public double calcularTotal() {
        double total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio() * (1 - producto.getDescuento());
        }

        return total;
    }
}
