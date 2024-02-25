package org.example;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class NavegadorEstelarTest {

    @Test
    public void testVisualizar() {
        // Redirigir la salida estándar a un ByteArrayOutputStream para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Crear un NavegadorEstelar con un terreno y construcciones predefinidos
        NavegadorEstelar navegadorEstelar = new NavegadorEstelar(3, 3);
        navegadorEstelar.visualizar();

        // Restaurar la salida estándar
        System.setOut(System.out);

        // Verificar si la salida coincide con lo esperado
        String expectedOutput = "Terreno:\n[0, 0, 0]\n[0, 0, 0]\n[0, 0, 0]\nConstrucciones:\n[0, 0, 0]\n[0, 0, 0]\n[0, 0, 0]\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testPlanificarConstruccion() {
        // Crear un NavegadorEstelar con un terreno y construcciones predefinidos
        NavegadorEstelar navegadorEstelar = new NavegadorEstelar(3, 3);

        // Planificar una construcción en una posición válida
        navegadorEstelar.planificarConstruccion(1, 1, 1);
        assertEquals(1, navegadorEstelar.construcciones[1][1]);

        // Intentar planificar una construcción en una posición fuera de los límites del terreno
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        navegadorEstelar.planificarConstruccion(3, 3, 1);
        System.setOut(System.out);
        assertEquals("Posición fuera de los límites del terreno.\n", outputStream.toString());

        // Intentar planificar una construcción en una posición donde ya hay una construcción
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        navegadorEstelar.planificarConstruccion(1, 1, 1);
        System.setOut(System.out);
        assertEquals("Ya hay una construcción en esta posición.\n", outputStream.toString());
    }

    @Test
    public void testCalcularRutaOptima() {
        // Prueba para terreno vacío
        NavegadorEstelar navegadorEstelar1 = new NavegadorEstelar(0, 0);
        ByteArrayOutputStream outputStream1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream1));
        navegadorEstelar1.calcularRutaOptima();
        System.setOut(System.out);
        assertEquals("No se puede calcular la ruta óptima: terreno vacío.\n", outputStream1.toString());

        // Prueba para terreno no cuadrado
        NavegadorEstelar navegadorEstelar2 = new NavegadorEstelar(2, 3);
        ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream2));
        navegadorEstelar2.calcularRutaOptima();
        System.setOut(System.out);
        assertEquals("No se puede calcular la ruta óptima: el terreno no es cuadrado.\n", outputStream2.toString());

        // Prueba para terreno cuadrado con valores predefinidos
        NavegadorEstelar navegadorEstelar3 = new NavegadorEstelar(3, 3);
        ByteArrayOutputStream outputStream3 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream3));
        navegadorEstelar3.calcularRutaOptima();
        System.setOut(System.out);
        assertEquals("Distancias mínimas entre cada par de nodos:\n0\t0\t0\t\n0\t0\t0\t\n0\t0\t0\t\n", outputStream3.toString());
    }
}
