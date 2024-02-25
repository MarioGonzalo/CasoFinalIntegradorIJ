package org.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaAlerta {
    private List<Integer> nivelRadiacion;
    private List<Double> temp;
    private List<Double> presion;

    public SistemaAlerta() {
        this.nivelRadiacion = new ArrayList<>();
        this.temp = new ArrayList<>();
        this.presion = new ArrayList<>();
    }

    public void monitorearRadiacion(int nivel) {
        nivelRadiacion.add(nivel);
        if (esPrimo(nivel)) {
            System.out.println("Alerta: Nivel de radiación extrema: " + nivel);
        }
    }

    public void monitorearTemperatura(double temperatura) {
        temp.add(temperatura);
        if (temperatura > 40 || temperatura < 0) {
            System.out.println("Alerta: Temperatura extrema: " + temperatura);
        }
    }

    public void monitorearPresion(double presion) {
        this.presion.add(presion);
        if (presion < 800 || presion > 1200) {
            System.out.println("Alerta: Presión extrema " + presion);
        }
    }

    public List<Integer> identificarEventosRaros(int n) {
        List<Integer> eventosRaros = new ArrayList<>();
        int numero = 2;
        while (eventosRaros.size() < n) {
            if (esPrimo(numero)) {
                eventosRaros.add(numero);
            }
            numero++;
        }
        return eventosRaros;
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Niveles de radiación: " + nivelRadiacion +
                "\nTemperaturas: " + temp +
                "\nPresiones: " + presion;
    }
}
