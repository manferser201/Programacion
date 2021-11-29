package com.company;
import java.util.Scanner;

/*
Crea un programa que pida al usuario 8 números enteros, los guarde en un array, halle y muestre el valor más
alto que contiene (su máximo) y el valor más bajo que contiene (su mínimo). 
Pista: puedes empezar suponiendo que el primer valor es el máximo provisional; 
a partir de ahí, recorre todos los demás con un "for"; si alguno de los datos es mayor que el máximo 
provisional, pasará a ser el nuevo máximo; el mínimo se calculará de forma similar.
 */

public class Ejercicio_Propuesto2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int [8];
        int maximo, minimo;

        for (int i = 1; i <= numero.length; i++) {
            System.out.println("INTRODUCE EL VALOR " + i + " DEL ARRAY");
            numero[i-1] = teclado.nextInt();
        }
        maximo = numero[0];
        minimo = numero[0];

        for (int i = 1; i < numero.length; i++) {
            if (numero[i] > maximo){
                maximo = numero[i];
            }

            if (numero[i] < minimo){
                minimo = numero[i];
            }
        }

        System.out.println("EL NÚMERO MÁS GRANDE INTRODUCIDO ES: " + maximo);
        System.out.println("EL NÚMERO MÁS PEQUEÑO INTRODUCIDO ES: " + minimo);

    }
}
