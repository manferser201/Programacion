package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1_Examen2021_Mañana_Azul {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[0];
        String datos;

        do {
            System.out.println("INTRODUCE LOS NÚMEROS ENTRE LOS QUE QUIRA ELEGIR. (PARA SALIR DEL CÓDIGO, PONGA *)");
            datos = teclado.nextLine();

            if (!datos.equals("*")){
                numeros = Arrays.copyOf(numeros, numeros.length + 1);
                numeros[numeros.length - 1] = Integer.parseInt(datos);
            }

        } while (!datos.equals("*"));

        System.out.println("ENTRE LOS NÚMEROS INTRODUCIDOS, EL ELEGIDO HA SIDO EL " + aleatorioDeArray(numeros));

    }

    public static int aleatorioDeArray(int[] a){

        int elegido, posicion_elegida;

        posicion_elegida = (int)(Math.random() * a.length);

        elegido = a[posicion_elegida];

        return elegido;
    }
}
