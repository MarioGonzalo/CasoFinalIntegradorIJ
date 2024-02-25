package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConsumoRecursos {
    private List<Integer> consumoDiario;

    public ConsumoRecursos() {
        this.consumoDiario = new ArrayList<>();
    }

    public void agregarConsumo(int consumo) {
        consumoDiario.add(consumo);
    }

    public double calcularPromedio() {
        if (consumoDiario.isEmpty()) {
            return 0.0;
        }
        int suma = 0;
        for (int consumo : consumoDiario) {
            suma += consumo;
        }
        return (double) suma / consumoDiario.size();
    }

    public int calcularMinimo() {
        if (consumoDiario.isEmpty()) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int consumo : consumoDiario) {
            if (consumo < min) {
                min = consumo;
            }
        }
        return min;
    }

    public int calcularMaximo() {
        if (consumoDiario.isEmpty()) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int consumo : consumoDiario) {
            if (consumo > max) {
                max = consumo;
            }
        }
        return max;
    }


        @Override
        public String toString() {
            return "El consumo diario es :" + consumoDiario +
                    "\nEl promedio de consumo es: " + calcularPromedio() +
                    "\nEl consumo mínimo es: " + calcularMinimo() +
                    "\nEl consumo máximo es: " + calcularMaximo();
    }
}
