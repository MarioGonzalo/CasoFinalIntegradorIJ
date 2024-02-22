package org.example;

import java.text.DateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Date myDate1 = new Date();

        String myString = DateFormat.getDateInstance().format(myDate1);

        System.out.println("Fecha1.0: " + myString);
        System.out.println("Fecha1.1: " + myDate1.toString());

        long msl = System.currentTimeMillis();
        Date myDate2 = new Date(msl);

        System.out.println("Fecha2: " + myDate2.toString());

        CronometroCosmico cc = new CronometroCosmico();
        System.out.println("cc: " + cc.toString());

        System.out.println("Max Entero: " + Integer.MAX_VALUE);

    }
}