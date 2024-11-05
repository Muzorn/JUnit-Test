package com.ejercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class CarritoComprasTest {

    @Test
    void setProductos() {
        Producto p1 = new Producto("Producto 1", 22.4, 0.55);
        Producto p2 = new Producto("Producto 2", 333.4, 0.44);

        List<Producto> productos = new ArrayList<>();
        productos.add(p1);
        productos.add(p2);

        CarritoCompras compras = new CarritoCompras();
        compras.setProductos(productos);

        assertNotEquals(compras, null);
    }

    @Test
    void calcularTotal() {
        Producto p1 = new Producto("Producto 1", 22.4, 0.55);
        Producto p2 = new Producto("Producto 2", 333.4, 0.44);

        List<Producto> productos = new ArrayList<>();
        productos.add(p1);
        productos.add(p2);

        CarritoCompras compras = new CarritoCompras();
        compras.setProductos(productos);
        double total = compras.calcularTotal();

        assertEquals(total, 150);
    }
}