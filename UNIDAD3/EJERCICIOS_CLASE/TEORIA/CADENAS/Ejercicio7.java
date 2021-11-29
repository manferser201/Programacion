package com.company;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contraseña, intento;

        System.out.println("JUGUEMOS A ACIERTA LA CONTRASEÑA");
        System.out.println("INTRODUCE LA CONTRASEÑA");
        contraseña = teclado.nextLine();

        System.out.println("¿CREES QUE SABES LA CONTRASEÑA?");
        System.out.println("LA CONTRASEÑA TIENE " + contraseña.length() + " CARACTERES");
        System.out.println("LA PRIMERA LETRA DE LA CONTRASEÑA ES: " + contraseña.charAt(0));
        System.out.println("LA ÚLTIMA LETRA DE LA CONTRASÑA ES: " + contraseña.charAt(contraseña.length()-1));

        do {
            System.out.println("INTRODUCE UNA CONTRASEÑA");
            intento = teclado.nextLine();

            if (intento.compareTo(contraseña) > 0){
                System.out.println("LA CONTRASEÑA QUE ESTÁ PONINEDO ES MAYOR. INTENTELO DE NUEVO.");
            } else if (intento.compareTo(contraseña) < 0) {
                System.out.println("LA CONTRASEÑA QUE ESTÁ PONINEDO ES MENOR. INTENTELO DE NUEVO.");
            } else {
                System.out.println("¡¡¡ENHORABUENA, HAS ACERTADO!!!");
            }

        } while (!intento.equals(contraseña));
    }
}
