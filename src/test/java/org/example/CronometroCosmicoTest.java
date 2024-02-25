package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class CronometroCosmicoTest {

    @Test
    public void testFechaConversion() {
        // Create a CronometroCosmico object
        CronometroCosmico cronometro = new CronometroCosmico();

        // Set a specific date for testing
        Date fechaTierra = new Date(); // Date representing January 12, 2022, 00:00:00 UTC

        // Set the Earth date
        cronometro.setFechaTierra(fechaTierra);

        // Set the conversion factor
        CronometroCosmico.setFC(2); // Setting conversion factor to 3

        // Calculate the expected date on the other planet
        Date expectedFechaOtroPlaneta = new Date(fechaTierra.getTime() * 2);

        // Assert that the calculated date matches the expected date
        assertEquals(expectedFechaOtroPlaneta, cronometro.getFechaOtroPlaneta());
    }

    @Test
    public void testToString() {
        // Create a CronometroCosmico object
        CronometroCosmico cronometro = new CronometroCosmico();

        // Set a specific date for testing
        Date fechaTierra = new Date(); // Date representing January 12, 2022, 00:00:00 UTC

        // Set the Earth date
        cronometro.setFechaTierra(fechaTierra);

        // Set the conversion factor
        CronometroCosmico.setFC(2); // Setting conversion factor to 2

        // Calculate the expected date on the other planet
        Date expectedFechaOtroPlaneta = new Date(fechaTierra.getTime() * 2);

        // Construct the expected string
        String expectedString = "La fecha actual de la tierra es: " + fechaTierra +
                "\n pero en el nuevo planeta es: " + expectedFechaOtroPlaneta;

        // Assert that the toString() method returns the expected string
        assertEquals(expectedString, cronometro.toString());
    }
}

