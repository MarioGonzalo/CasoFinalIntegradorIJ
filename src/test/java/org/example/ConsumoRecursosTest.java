package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class ConsumoRecursosTest {

    @Test
    public void testCalcularPromedio() {
        // Caso de prueba con una lista vacía
        ConsumoRecursos consumoRecursos1 = new ConsumoRecursos();
        double promedio1 = consumoRecursos1.calcularPromedio();
        assertEquals(0.0, promedio1);

        // Caso de prueba con una lista que contiene un solo valor
        ConsumoRecursos consumoRecursos2 = new ConsumoRecursos();
        consumoRecursos2.agregarConsumo(10);
        double promedio2 = consumoRecursos2.calcularPromedio();
        assertEquals(10.0, promedio2);

        // Caso de prueba con una lista que contiene varios valores
        ConsumoRecursos consumoRecursos3 = new ConsumoRecursos();
        consumoRecursos3.agregarConsumo(5);
        consumoRecursos3.agregarConsumo(10);
        consumoRecursos3.agregarConsumo(15);
        double promedio3 = consumoRecursos3.calcularPromedio();
        assertEquals(10.0, promedio3);
    }

    @Test
    public void testCalcularMinimo() {
        // Caso de prueba con una lista vacía
        ConsumoRecursos consumoRecursos1 = new ConsumoRecursos();
        int minimo1 = consumoRecursos1.calcularMinimo();
        assertEquals(0, minimo1);

        // Caso de prueba con una lista que contiene un solo valor
        ConsumoRecursos consumoRecursos2 = new ConsumoRecursos();
        consumoRecursos2.agregarConsumo(10);
        int minimo2 = consumoRecursos2.calcularMinimo();
        assertEquals(10, minimo2);

        // Caso de prueba con una lista que contiene varios valores
        ConsumoRecursos consumoRecursos3 = new ConsumoRecursos();
        consumoRecursos3.agregarConsumo(15);
        consumoRecursos3.agregarConsumo(5);
        consumoRecursos3.agregarConsumo(10);
        int minimo3 = consumoRecursos3.calcularMinimo();
        assertEquals(5, minimo3);
    }

    @Test
    public void testCalcularMaximo() {
        // Caso de prueba con una lista vacía
        ConsumoRecursos consumoRecursos1 = new ConsumoRecursos();
        int maximo1 = consumoRecursos1.calcularMaximo();
        assertEquals(0, maximo1);

        // Caso de prueba con una lista que contiene un solo valor
        ConsumoRecursos consumoRecursos2 = new ConsumoRecursos();
        consumoRecursos2.agregarConsumo(10);
        int maximo2 = consumoRecursos2.calcularMaximo();
        assertEquals(10, maximo2);

        // Caso de prueba con una lista que contiene varios valores
        ConsumoRecursos consumoRecursos3 = new ConsumoRecursos();
        consumoRecursos3.agregarConsumo(5);
        consumoRecursos3.agregarConsumo(10);
        consumoRecursos3.agregarConsumo(15);
        int maximo3 = consumoRecursos3.calcularMaximo();
        assertEquals(15, maximo3);
    }
}

