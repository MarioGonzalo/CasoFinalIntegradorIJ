package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlanificadorTareasTest {

    @Test
    public void testAsignarTarea() {
        // Crear un PlanificadorTareas con un número de miembros y tareas predefinido
        PlanificadorTareas planificadorTareas = new PlanificadorTareas(3, 3);

        // Asignar una tarea a un miembro específico
        planificadorTareas.asignarTarea(0, 0, 2);
        assertEquals(2, planificadorTareas.tareas[0][0]);

        // Asignar una tarea a otro miembro y otra tarea
        planificadorTareas.asignarTarea(1, 1, 3);
        assertEquals(3, planificadorTareas.tareas[1][1]);
    }

    @Test
    public void testCalcularCargaTrabajoOptima() {
        // Crear un PlanificadorTareas con un número de miembros y tareas predefinido
        PlanificadorTareas planificadorTareas = new PlanificadorTareas(3, 3);

        // Asignar tareas a los miembros
        planificadorTareas.asignarTarea(0, 0, 2);
        planificadorTareas.asignarTarea(0, 1, 3);
        planificadorTareas.asignarTarea(0, 2, 4);
        planificadorTareas.asignarTarea(1, 0, 1);
        planificadorTareas.asignarTarea(1, 1, 2);
        planificadorTareas.asignarTarea(1, 2, 3);
        planificadorTareas.asignarTarea(2, 0, 3);
        planificadorTareas.asignarTarea(2, 1, 4);
        planificadorTareas.asignarTarea(2, 2, 5);

        // Calcular la carga de trabajo óptima para cada miembro
        planificadorTareas.calcularCargaTrabajoOptima();

        // Verificar la carga de trabajo óptima para cada miembro
        assertArrayEquals(new int[]{9, 6, 12}, planificadorTareas.cargaTrabajoOptima);
    }
}
