package org.example;

import java.util.Scanner;

public class ComunicadorInterplanetario {

    // Función para contar vocales en un mensaje
    public static int contarVocales(String mensaje) {
        int contador = 0;
        mensaje = mensaje.toLowerCase(); // Convertir a minúsculas para simplificar la comparación
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }

    // Función para invertir un mensaje
    public static String invertirMensaje(String mensaje) {
        StringBuilder invertido = new StringBuilder();
        for (int i = mensaje.length() - 1; i >= 0; i--) {
            invertido.append(mensaje.charAt(i));
        }
        return invertido.toString();
    }

    // Función para verificar si un mensaje es palíndromo
    public static boolean esPalindromo(String mensaje) {
        mensaje = mensaje.toLowerCase().replaceAll("[^a-z]", ""); // Convertir a minúsculas y eliminar caracteres no alfabéticos
        String invertido = invertirMensaje(mensaje);
        return mensaje.equals(invertido);
    }

    @Override
    public String toString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un mensaje: ");
        String mensaje = sc.nextLine();
        return "El mensaje tiene " + contarVocales(mensaje) + " vocales\n" +
                "El mensaje invertido es: " + invertirMensaje(mensaje) + "\n" +
                "El mensaje es palíndromo? " + (esPalindromo(mensaje)? "Sí" : "No");
    }
}

