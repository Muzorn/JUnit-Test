package com.ejercicios;

import java.util.Stack;

/**
 * The type Pila.
 */
public class Pila {
    /**
     * Gets pila.
     *
     * @return the pila
     */
    public Stack<Integer> getPila() {
        return pila;
    }

    /**
     * Sets pila.
     *
     * @param pila the pila
     */
    public void setPila(Stack<Integer> pila) {
        this.pila = pila;
    }

    private Stack<Integer> pila = new Stack<Integer>();

    /**
     * Push.
     * Añade el número solo su es mayor que 2 y menor que 20
     *
     * @param num the num
     */
    public void push(Integer num) {
        if (num > 2 && num < 20) {
            pila.push(num);
        }
    }

    /**
     * Pop integer.
     * <p>
     * Si la pila está vacía devolvemos null; si no se devuelve el último número
     * añadido a la pila sacándolo de la pila.
     *
     * @return the integer
     */
    public Integer pop() {
        if (pila.isEmpty()) {
            System.out.println("null");
            return null;
        } else {
            return pila.pop();
        }
    }

    /**
     * Is empty boolean.
     * Devuelve true si la pila está vacía, false caso contrario
     *
     * @return the boolean
     */
    public boolean isEmpty() {
        return pila.isEmpty();
    }

    /**
     * Top integer.
     * Si la pila está vacía devolvemos null; si no se devuelve el numero añadido
     * a la pila sin sacarlo
     *
     * @return the integer
     */
    public Integer top() {
        if (pila.isEmpty()) {
            return null;
        } else {
            return pila.peek();
        }
    }

    /**
     * Vacía la pila.
     */
    public void empty() {
        pila.removeAllElements();
    }

    /**
     *
     * @return
     */
    public Integer tamanyoPila() {
        return pila.size();
    }
}