package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        while(seguir) {

            CronometroCosmico cc = new CronometroCosmico();
            System.out.println(cc.toString());
            System.out.println("Desea terminar el programa? (false para terminar, true para continuar)");
            seguir = sc.nextBoolean();

        }

    }
}