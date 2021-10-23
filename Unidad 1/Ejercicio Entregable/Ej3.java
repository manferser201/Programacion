package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num_entradas, precio_base = 8, precio_pareja = 11, precio_espectador = 5, precio_total;
        double descuento_tarjeta = 0.1, descuento = 0, precio_pagar = 0;
        String dia_semana, tiene_tarjeta;

        System.out.println("VENTAS DE ENTRADAS CINECAMPA");
        System.out.print("NÚMERO DE ENTRADAS: ");
        num_entradas = teclado.nextInt();
        teclado.nextLine();

        System.out.print("DÍA DE LA SEMANA: (TODO EN MINUSCULAS)");
        dia_semana = teclado.nextLine();

        System.out.print("¿TIENE TARJETA CINECAMPA? (S/N): " );
        tiene_tarjeta = teclado.nextLine();


        if (dia_semana.equals("miercoles")){

            precio_total = precio_espectador * num_entradas;

        } else if (dia_semana.equals("jueves")){

            if (num_entradas % 2 == 1){
                precio_total = precio_pareja + precio_base;
            } else {
                precio_total = precio_pareja * (num_entradas / 2);
            }

        } else {
            precio_total = precio_base * num_entradas;
        }

        if (tiene_tarjeta.equals("S")){
            descuento = precio_total * descuento_tarjeta;
            precio_pagar = precio_total - descuento;

        } else {
            precio_pagar = precio_total;
        }

        if (dia_semana.equals("jueves")){
            if (num_entradas % 2 == 0){
                System.out.println();
                System.out.println("AQUÍ TIENE SUS ENTRADAS. GRACIAS POR SU COMPRA");
                System.out.println("ENTRADAS DE PAREJA: " + num_entradas / 2);
                System.out.println("PRECIO POR ENTRADA DE PAREJA: " + precio_pareja);
                System.out.println("TOTAL: " + precio_total);
                System.out.println("DESCUENTO: " + descuento);
                System.out.println("A PAGAR : " + precio_pagar);
            } else {
                System.out.println();
                System.out.println("AQUÍ TIENE SUS ENTRADAS. GRACIAS POR SU COMPRA");
                System.out.println("ENTRADAS DE PAREJA: " + num_entradas / 2);
                System.out.println("ENTRADAS INDIVIDUALES: " + num_entradas % 2);
                System.out.println("PRECIO POR ENTRADA DE PAREJA: " + precio_pareja);
                System.out.println("TOTAL: " + precio_total);
                System.out.println("DESCUENTO: " + descuento);
                System.out.println("A PAGAR : " + precio_pagar);
            }


        } else if (dia_semana.equals("miercoles")){
            System.out.println();
            System.out.println("AQUÍ TIENE SUS ENTRADAS. GRACIAS POR SU COMPRA");
            System.out.println("ENTRADAS INDIVIDUALES: " + num_entradas);
            System.out.println("PRECIO POR ENTRADA INDIVIDUAL: " + precio_espectador);
            System.out.println("TOTAL: " + precio_total);
            System.out.println("DESCUENTO: " + descuento);
            System.out.println("A PAGAR : " + precio_pagar);
        } else {
            System.out.println();
            System.out.println("AQUÍ TIENE SUS ENTRADAS. GRACIAS POR SU COMPRA");
            System.out.println("ENTRADAS INDIVIDUALES: " + num_entradas);
            System.out.println("PRECIO POR ENTRADA INDIVIDUAL: " + precio_base);
            System.out.println("TOTAL: " + precio_total);
            System.out.println("DESCUENTO: " + descuento);
            System.out.println("A PAGAR : " + precio_pagar);
        }
    }
}
