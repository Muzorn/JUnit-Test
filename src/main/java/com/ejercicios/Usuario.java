package com.ejercicios;

/**
 * The type Usuario.
 */
public class Usuario {
    // ... implementación de la clase Usuario ...
    private String username;
    private String password;

    /**
     * Instantiates a new Usuario.
     *
     * @param username the username
     * @param password the password
     */
    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Login.
     */
    public void login() {
        // Lógica para iniciar sesión
        System.out.println("Usuario " + username + " ha iniciado sesión.");
    }

    /**
     * Logout.
     */
    public void logout() {
        // Lógica para cerrar sesión
        System.out.println("Usuario " + username + " ha cerrado sesión.");
    }
}
