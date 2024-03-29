package org.example;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while(seguir) {
            System.out.println("Qué quiere hacer?\n" +
                    "1. Calcular la fecha actual en otro planeta\n" +
                    "2. Observar los recursos y suministros\n" +
                    "3. Ver el sistema de alerta y monitoreo\n" +
                    "4. Ver el planificador de tareas\n" +
                    "5. Ver el navegador estelar\n" +
                    "6. Ver el sistema de comunicación interplanetario\n" +
                    "7. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    CronometroCosmico cc = new CronometroCosmico();
                    System.out.println(cc.toString());
                    break;
                case 2:
                    ConsumoRecursos cr = new ConsumoRecursos();
                    Random rand = new Random();
                    cr.agregarConsumo(rand.nextInt(50));
                    cr.agregarConsumo(rand.nextInt(50));
                    cr.agregarConsumo(rand.nextInt(50));
                    cr.agregarConsumo(rand.nextInt(50));
                    System.out.println(cr.toString());
                    break;
                case 3:
                    SistemaAlerta sa = new SistemaAlerta();
                    Random rand2 = new Random();
                    sa.monitorearRadiacion(rand2.nextInt(50));
                    sa.monitorearRadiacion(rand2.nextInt(50));
                    sa.monitorearRadiacion(rand2.nextInt(50));
                    sa.monitorearRadiacion(rand2.nextInt(50));
                    sa.monitorearTemperatura(rand2.nextInt(-20, 60));
                    sa.monitorearTemperatura(rand2.nextInt(-20, 60));
                    sa.monitorearTemperatura(rand2.nextInt(-20, 60));
                    sa.monitorearPresion(rand2.nextInt(600, 1200));
                    sa.monitorearPresion(rand2.nextInt(600, 1200) );
                    System.out.println(sa.toString());
                    break;
                case 4:
                    PlanificadorTareas pt = new PlanificadorTareas(3, 3);
                    Random rand3 = new Random();
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            pt.asignarTarea(i, j, rand3.nextInt(1,10));
                        }
                    }
                    pt.calcularCargaTrabajoOptima();
                    System.out.println(pt.toString());
                    break;
                case 5:
                    NavegadorEstelar ne = new NavegadorEstelar(5,5);
                    ne.planificarConstruccion(1,1,1);
                    ne.calcularRutaOptima();
                    ne.visualizar();
                    break;
                case 6:
                    ComunicadorInterplanetario ci = new ComunicadorInterplanetario();
                    System.out.println(ci.toString());
                    break;
                case 7:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            System.out.println("Desea terminar el programa? (false para terminar, true para continuar)");
            seguir = sc.nextBoolean();

        }

    }
}