package com.ejercicios;

/**
 * The type Calculadora.
 */
public class Calculadora {
    // ... otros métodos ...

    /**
     * Factorial long.
     *
     * @param n the n
     * @return the long
     */
    public long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
