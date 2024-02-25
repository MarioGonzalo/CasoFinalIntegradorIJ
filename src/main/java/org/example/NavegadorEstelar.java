package org.example;

import java.util.Arrays;

public class NavegadorEstelar {
    private int[][] terreno; // Matriz para representar el terreno
    public int[][] construcciones; // Matriz para representar las construcciones

    public NavegadorEstelar(int filas, int columnas) {
        this.terreno = new int[filas][columnas];
        this.construcciones = new int[filas][columnas];
    }

    // Función para visualizar el terreno y las construcciones
    public void visualizar() {
        System.out.println("Terreno:");
        for (int i = 0; i < terreno.length; i++) {
            System.out.println(Arrays.toString(terreno[i]) + "\n");
        }
        System.out.println("Construcciones:");
        for (int i = 0; i < construcciones.length; i++) {
            System.out.println(Arrays.toString(construcciones[i]) + "\n");
        }
    }

    // Función para planificar una construcción en una posición específica
    public void planificarConstruccion(int fila, int columna, int tipoConstruccion) {
        if (fila < 0 || fila >= terreno.length || columna < 0 || columna >= terreno[0].length) {
            System.out.println("Posición fuera de los límites del terreno.");
            return;
        }
        if (construcciones[fila][columna] != 0) {
            System.out.println("Ya hay una construcción en esta posición.");
            return;
        }
        construcciones[fila][columna] = tipoConstruccion;
        System.out.println("Construcción planificada en la posición (" + fila + ", " + columna + ").");
    }

    // Función para calcular una ruta óptima
    public void calcularRutaOptima() {
        // Verificar si la matriz de terreno está vacía o no
        if (terreno.length == 0 || terreno[0].length == 0) {
            System.out.println("No se puede calcular la ruta óptima: terreno vacío.");
            return;
        }

        // Verificar si la matriz de terreno tiene el mismo número de filas y columnas
        if (terreno.length != terreno[0].length) {
            System.out.println("No se puede calcular la ruta óptima: el terreno no es cuadrado.");
            return;
        }

        int n = terreno.length; // Tamaño del terreno

        // Crear una matriz de distancias para almacenar las distancias mínimas entre cada par de nodos
        int[][] distancias = new int[n][n];

        // Inicializar la matriz de distancias con los valores del terreno
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distancias[i][j] = terreno[i][j];
            }
        }

        // Aplicar el algoritmo de multiplicación de matrices para calcular las distancias mínimas
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    distancias[i][j] = Math.min(distancias[i][j], distancias[i][k] + distancias[k][j]);
                }
            }
        }

        // Imprimir las distancias mínimas entre cada par de nodos
        System.out.println("Distancias mínimas entre cada par de nodos:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(distancias[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
