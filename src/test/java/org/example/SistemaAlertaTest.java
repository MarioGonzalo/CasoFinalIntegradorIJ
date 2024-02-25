package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaAlertaTest {

    @Test
    public void testMonitorearRadiacion() {
        SistemaAlerta sistemaAlerta = new SistemaAlerta();

        // Redirigir la salida estándar para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Monitorear un nivel de radiación normal
        sistemaAlerta.monitorearRadiacion(10);
        assertEquals("", outputStream.toString());

        // Monitorear un nivel de radiación extremo (primo)
        sistemaAlerta.monitorearRadiacion(7);
        assertEquals("Alerta: Nivel de radiación extrema: 7\n", outputStream.toString());
    }

    @Test
    public void testMonitorearTemperatura() {
        SistemaAlerta sistemaAlerta = new SistemaAlerta();

        // Redirigir la salida estándar para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Monitorear una temperatura normal
        sistemaAlerta.monitorearTemperatura(30.0);
        assertEquals("", outputStream.toString());

        // Monitorear una temperatura extrema (alta)
        sistemaAlerta.monitorearTemperatura(50.0);
        assertEquals("Alerta: Temperatura extrema: 50.0\n", outputStream.toString());

        // Monitorear una temperatura extrema (baja)
        sistemaAlerta.monitorearTemperatura(-10.0);
        assertEquals("Alerta: Temperatura extrema: -10.0\n", outputStream.toString());
    }

    @Test
    public void testMonitorearPresion() {
        SistemaAlerta sistemaAlerta = new SistemaAlerta();

        // Redirigir la salida estándar para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Monitorear una presión normal
        sistemaAlerta.monitorearPresion(1000.0);
        assertEquals("", outputStream.toString());

        // Monitorear una presión extrema (alta)
        sistemaAlerta.monitorearPresion(1300.0);
        assertEquals("Alerta: Presión extrema 1300.0\n", outputStream.toString());

        // Monitorear una presión extrema (baja)
        sistemaAlerta.monitorearPresion(700.0);
        assertEquals("Alerta: Presión extrema 700.0\n", outputStream.toString());
    }

    @Test
    public void testIdentificarEventosRaros() {
        SistemaAlerta sistemaAlerta = new SistemaAlerta();
        List<Integer> eventosRaros = sistemaAlerta.identificarEventosRaros(5);
        assertIterableEquals(List.of(2, 3, 5, 7, 11), eventosRaros);
    }
}
