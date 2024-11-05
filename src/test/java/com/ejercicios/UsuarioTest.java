package com.ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Usuario test.
 */
class UsuarioTest {
    private static Usuario usuario;

    @BeforeAll
    static void setUsuario() {
        UsuarioTest.usuario = new Usuario("John Doe", "Coco");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Iniciando sesión...");
        usuario.login();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cerrando sesión...");
        usuario.logout();
    }

    @Test
    void testPerfil() {
        System.out.println("Perfil actualizado");
    }
}