package org.example;

import java.util.Arrays;

public class PlanificadorTareas {
    public int[][] tareas; // Matriz de tareas: fila por miembro, columna por tarea
    public int[] cargaTrabajoOptima; // Carga de trabajo óptima para cada miembro

    public PlanificadorTareas(int nMiembros, int nTareas) {
        this.tareas = new int[nMiembros][nTareas];
        this.cargaTrabajoOptima = new int[nMiembros];
    }

    public void asignarTarea(int miembro, int tarea, int duracion) {
        tareas[miembro][tarea] = duracion;
    }

    public void calcularCargaTrabajoOptima() {
        for (int i = 0; i < tareas.length; i++) {
            int suma = 0;
            for (int j = 0; j < tareas[i].length; j++) {
                suma += tareas[i][j];
            }
            cargaTrabajoOptima[i] = suma;
        }
    }

    @Override
    public String toString() {
        int maximo = Arrays.stream(cargaTrabajoOptima).max().getAsInt();
        return "Tareas: " + Arrays.deepToString(tareas) +
                "\nLa carga de trabajo óptima es: " + maximo;
    }
}
