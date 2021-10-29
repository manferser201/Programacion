package com.company;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String iva, codigo;
        double precio, porc_iva, descuento;

        System.out.println("INTRODUZCA LA BASE IMPONIBLE");
        precio = teclado.nextFloat();

        System.out.println("INTRODUZCA EL TIPO DE IVA (general, reducido o superreducido)");
        teclado.nextLine();
        iva = teclado.nextLine();

        System.out.println("INTRODUZCA EL CÓDIGO PROMOCIONAL (nopro, mitad, meno5 o 5porc)");
        codigo = teclado.nextLine();

        if (iva.equals("general")){
            porc_iva = 0.21;

        } else if (iva.equals("reducido")){
            porc_iva = 0.10;

        } else {
            porc_iva = 0.04;

        }

        if (codigo.equals("nopro")){
            descuento = 0;
        } else if (codigo.equals("mitad")){
            descuento = (precio + precio * porc_iva) * 0.5;
        } else if (codigo.equals("meno5")){
            descuento = 5;
        } else {
            descuento = (precio + precio * porc_iva) * 0.05;
        }


        System.out.println("BASE IMPONIBLE: " + precio);
        System.out.println("IVA: " + (precio * porc_iva));
        System.out.println("PRECIO CON IVA: " + (precio + precio * porc_iva));
        System.out.println("CÓDIGO PROMOCIONAL: " + "-" + descuento);
        System.out.println("TOTAL: " + (precio + precio * porc_iva - descuento));
    }
}
