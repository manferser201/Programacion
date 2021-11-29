package com.company;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] sitios = new int[10];
        int comensales, capacidadMesas = 4;


        for (int i = 0; i < sitios.length; i++) {
            sitios[i] = (int)(Math.random() * 5);
        }

        do {
            System.out.println("¿CÚANTOS SOIS? (INTRODUZCA -1 PARA SALIR DEL PROGRAMA)");
            comensales = teclado.nextInt();

            if (comensales > 0){
                boolean haySitios = acomodar(sitios, comensales, capacidadMesas);

                if (comensales > 4){
                    System.out.println("LO SIENTO, NO ADMITIMOS GRUPOS DE " + comensales + ", HAGA GRUPO DE 4 PERSONAS COMO MÁXIMO E INTÉNTELO DE NUEVO");
                } else {
                    if (haySitios){
                        for (int i = 0; i < sitios.length; i++) {
                            if (sitios[i] == 0){
                                System.out.println("SIENTESE EN LA MESA " + (i + 1));
                                sitios[i] += comensales;
                                break;
                            } else {
                                if (sitios[i] + comensales <= capacidadMesas){
                                    System.out.println("TENDRÁ QUE COMPARTIR MESA. SIENTESE EN LA MESA " + (i + 1));
                                    sitios[i] += comensales;
                                    break;
                                }
                            }
                        }
                    } else {
                        System.out.println("LO SENTIMOS, EN ESTE MOMENTO NO NOS QUEDA SITIO");
                    }
                }

                System.out.print("Nº DE MESA: ");

                for (int i = 0; i < sitios.length; i++) {
                    System.out.print((i+1) + " ");
                }
                System.out.println();

                System.out.print("OCUPACIÓN: ");
                for (int i = 0; i < sitios.length; i++) {
                    System.out.print(sitios[i] + " ");
                }

                System.out.println();

            }

        } while (comensales > 0);
    }

    public static boolean acomodar (int[] huecos, int personas, int capacidadMesas){

        // VAMOS A LEER EL CONTENIDO DEL VECTOR CON FOREACH
        for (int m: huecos) {
            if (m + personas <= capacidadMesas){
                return true;
            }
        }

        return false;
    }
}
