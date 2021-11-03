package com.company;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura, anchura;
        double precioEscudoBordado = 2.5, precioGastosEnvios = 3.25, precioCentimetroCuadrado = 0.01;
        double precioTotal = 0, totalCentimetrosCuadrados = 0, precioTotalCentimetrosCuadrados = 0;
        String escudoBordado;

        System.out.print("INTRODUZCA LA ALTURA DE LA BANDERA EN CENTÍMETROS: ");
        altura = teclado.nextInt();

        System.out.print("AHORA INTRODUZCA LA ANCHURA: ");
        anchura = teclado.nextInt();
        teclado.nextLine();

        System.out.println("¿QUIERE ESCUDO BORDADO? (s/n): ");
        escudoBordado = teclado.nextLine();

        totalCentimetrosCuadrados = altura * anchura;
        precioTotalCentimetrosCuadrados = totalCentimetrosCuadrados * precioCentimetroCuadrado;

        System.out.println("GRACIAS. AQUÍ TIENE EL DESGLOSE DE SU COMPRA");
        System.out.println("BANDERA DE " + totalCentimetrosCuadrados + " CM2: " + precioTotalCentimetrosCuadrados + "€");
        System.out.println("GASTOS DE ENVÍO: " + precioGastosEnvios + "€");

        if (escudoBordado.equals("s")){
            System.out.println("CON ESCUDO: " + precioEscudoBordado + "€");
            precioTotal = precioTotalCentimetrosCuadrados + precioGastosEnvios + precioEscudoBordado;
            System.out.println("TOTAL: " + precioTotal + "€");
        } else {
            System.out.println("SIN ESCUDO:  0.0€");
            precioTotal = precioTotalCentimetrosCuadrados + precioGastosEnvios;
            System.out.println("TOTAL: " + precioTotal + "€");
        }
    }
}
