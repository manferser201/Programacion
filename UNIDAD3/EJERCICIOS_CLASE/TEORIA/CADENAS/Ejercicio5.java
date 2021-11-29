package com.company;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, nombreSinVocales = "";

        System.out.println("INTRODUCE TU NOMBRE Y APELLIDOS");
        nombre = teclado.nextLine();

        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) != 'a' && nombre.charAt(i) != 'e' && nombre.charAt(i) != 'i' &&
                    nombre.charAt(i) != 'o' && nombre.charAt(i) != 'u' && nombre.charAt(i) != 'A' &&
                    nombre.charAt(i) != 'E' && nombre.charAt(i) != 'I' && nombre.charAt(i) != 'O' &&
                    nombre.charAt(i) != 'U' && nombre.charAt(i) != 'á' && nombre.charAt(i) != 'é' &&
                    nombre.charAt(i) != 'í' && nombre.charAt(i) != 'ó' && nombre.charAt(i) != 'ú' &&
                    nombre.charAt(i) != 'Á' && nombre.charAt(i) != 'É' && nombre.charAt(i) != 'Í' &&
                    nombre.charAt(i) != 'Ó' && nombre.charAt(i) != 'Ú'){

                nombreSinVocales += nombre.charAt(i);
            }
        }

        System.out.println(nombreSinVocales);
    }
}
