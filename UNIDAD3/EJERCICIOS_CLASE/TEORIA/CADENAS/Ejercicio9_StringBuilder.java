package com.company;

public class Ejercicio9_StringBuilder {
    public static void main(String[] args) {
        StringBuilder cadena = new StringBuilder("Alabí Alixar");
        int num = 5000;
        String numero;

        System.out.println("El contenido del StringBuilder es: " + cadena);
        System.out.println("La capacidad inicial es de " + cadena.capacity());
        System.out.println("La longitud inicial es de " + cadena.length());

        cadena = new StringBuilder("Chicharrones de chiclana");
        System.out.println("El nuevo valor del StringBuilder es: " + cadena);

        numero = Integer.toString(num);
        String cadena2 = "Hay " + numero + " ";

        StringBuilder cadena_nueva = new StringBuilder(cadena.insert(0, cadena2));

        System.out.println(cadena_nueva.delete(cadena_nueva.length() - 12,cadena_nueva.length()));
        System.out.println(cadena_nueva.append(" en Chiclana"));

        String CaracteresFinales = cadena_nueva.substring(cadena_nueva.length() - 4,cadena_nueva.length());
        System.out.println("Los 4 últimos caractere del StringBuilder son: " + CaracteresFinales);

        System.out.println("La capacidad final del StringBuilder es: " + cadena_nueva.capacity());
        System.out.println("La longitud actual del StringBuilder es: " + cadena_nueva.length());
    }
}
