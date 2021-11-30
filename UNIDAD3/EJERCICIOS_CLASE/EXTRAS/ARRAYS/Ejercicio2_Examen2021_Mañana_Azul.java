package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2_Examen2021_Mañana_Azul {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, posicion;
        int[] numeros = new int[0];
        String datos;

        do {
            System.out.println("INTRODUCE LOS NÚMEROS DEL ARRAY. (PARA SALIR DEL CÓDIGO, PONGA *)");
            datos = teclado.nextLine();

            if (!datos.equals("*")){
                numeros = Arrays.copyOf(numeros, numeros.length + 1);
                numeros[numeros.length - 1] = Integer.parseInt(datos);
            }

        } while (!datos.equals("*"));

        System.out.println("INTRODUCE EL VALOR NUEVO QUE QUIERA INTRODUCEIR");
        valor = teclado.nextInt();

        System.out.println("INTRODUCE LA POSICIÓN EN LA QUE QUIERE INTRODUCIR EL VALOR ANTERIOR. (NO PUEDE PONER UNA POSICIÓN SUPERIOR A " + numeros.length + ")");
        posicion = teclado.nextInt();

        if (insertarValor(numeros, valor, posicion).length > 0){
            System.out.println("EL VECTOR NUEVO CON EL VALOR INTRODUCIDO QUEDARÍA:");
            System.out.print(Arrays.toString(insertarValor(numeros, valor, posicion)));
        } else {
            System.out.println();
            System.out.println("AL HABER INTRODUCIDO UN VALOR DE POSICIÓN ERRONEO, NO SE HA PODIDO COLOCAR EL VALOR EN NINGÚN LADO");
            System.out.print(Arrays.toString(insertarValor(numeros, valor, posicion)));
        }

    }

    public static int[] insertarValor (int[] array, int numero, int posicion){

        int[] resultado = new int[0];

        if (posicion < 0 || posicion > array.length){
            System.out.println("LO SENTIMOS, HA INTRODUCIDO UNA POSICIÓN ERRONEA");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == posicion){
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = numero;
                }

                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = array[i];
            }
        }

        return resultado;
    }
}
