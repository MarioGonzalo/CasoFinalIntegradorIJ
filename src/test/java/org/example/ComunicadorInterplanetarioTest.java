package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class ComunicadorInterplanetarioTest {

        @Test
        public void testContarVocales() {
            // Caso de prueba con una cadena que contiene vocales
            String mensaje1 = "Vocales";
            int resultado1 = ComunicadorInterplanetario.contarVocales(mensaje1);
            assertEquals(3, resultado1);

            // Caso de prueba con una cadena que no contiene vocales
            String mensaje2 = "gsghjjtyx ffhrl";
            int resultado2 = ComunicadorInterplanetario.contarVocales(mensaje2);
            assertEquals(0, resultado2);

            // Caso de prueba con una cadena vacía
            String mensaje3 = "";
            int resultado3 = ComunicadorInterplanetario.contarVocales(mensaje3);
            assertEquals(0, resultado3);
        }

        @Test
        public void testInvertirMensaje() {
            // Caso de prueba con una cadena no vacía
            String mensaje1 = "Hola mundo";
            String invertido1 = ComunicadorInterplanetario.invertirMensaje(mensaje1);
            assertEquals("odnum aloH", invertido1);

            // Caso de prueba con una cadena vacía
            String mensaje2 = "";
            String invertido2 = ComunicadorInterplanetario.invertirMensaje(mensaje2);
            assertEquals("", invertido2);
        }

        @Test
        public void testEsPalindromo() {
            // Caso de prueba con un palíndromo
            String mensaje1 = "Ayaya";
            boolean resultado1 = ComunicadorInterplanetario.esPalindromo(mensaje1);
            assertTrue(resultado1);

            // Caso de prueba con una cadena que no es un palíndromo
            String mensaje2 = "hola mundo";
            boolean resultado2 = ComunicadorInterplanetario.esPalindromo(mensaje2);
            assertFalse(resultado2);

            // Caso de prueba con una cadena vacía
            String mensaje3 = "";
            boolean resultado3 = ComunicadorInterplanetario.esPalindromo(mensaje3);
            assertTrue(resultado3);
        }
    }


