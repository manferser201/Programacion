package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] colores = {"verde", "rojo", "azul","amarillo","naranja","rosa","negro","blanco", "morado"};
        String[] palabras = new String[8];
        String[] resultado = new String[0];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("INTRODUCE UNA PALABRA");
            palabras[i] = teclado.nextLine();

            if (esta(colores, palabras[i])){
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = palabras[i];
            }
        }

        System.out.println("EL ORDEN EN EL QUE HAS INTRODUCIDO LAS PALABRAS ES: " + Arrays.toString(palabras));

        for (int i = 0; i < palabras.length; i++) {
            if (!esta(resultado, palabras[i])){
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = palabras[i];
            }
        }
        
        System.out.println("EL NUEVO ORDEN ES: " + Arrays.toString(resultado));
    }

    public static boolean esta (String[] palabras, String palabra){

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)){
                return true;
            }
        }

        return false;
    }
}
