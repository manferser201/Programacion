package com.company;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte dia;

        System.out.println("INTRODUCE UN DÍA DE LA SEMANA (1 = LUNES, 2 = MARTES, ... 5 = VIERNES)");
        dia = teclado.nextByte();

        switch (dia) {
            case 1: System.out.println("TENEMOS A PRIMERA CLASE DE LENGUAJE DE MARCAS"); break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("TENEMOS A PRIMERA CLASE DE SISTEMAS INFORMÁTICOS");
                break;
            default: System.out.println("SOLO TENEMOS CLASES DE LUNES A VIERNES");
        }
    }
/* OTRA FORMA DE HACERLO (CON SWITCH)

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dia;

        System.out.println("INTRODUCE UN DÍA DE LA SEMANA (LA PRIMERA LETRA MAYÚSCULA)");
        dia = sc.nextLine();

        switch (dia) {
            case "Lunes": System.out.println("TENEMOS A PRIMERA CLASE DE LENGUAJE DE MARCAS"); break;
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                System.out.println("TENEMOS A PRIMERA CLASE DE SISTEMAS INFORMÁTICOS");
                break;
            default: System.out.println("SOLO TENEMOS CLASES DE LUNES A VIERNES");
        }
    }
 */

/* OTRA FORMA DE HACERLO (CON IF)

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dia;

        System.out.println("INTRODUCE UN DÍA DE LA SEMANA (LA PRIMERA LETRA MAYÚSCULA)");
        dia = sc.nextLine();

        if (dia.equals("Lunes")){
            System.out.println("TENEMOS A PRIMERA CLASE DE LENGUAJE DE MARCAS")
        } else if (dia.equals("Martes") {
            System.out.println("TENEMOS A PRIMERA CLASE DE SISTEMAS INFORMÁTICOS")
        } else if (dia.equals("Miércoles"){
            System.out.println("TENEMOS A PRIMERA CLASE DE SISTEMAS INFORMÁTICOS")
        } else if (dia.equals("Jueves"){
            System.out.println("TENEMOS A PRIMERA CLASE DE SISTEMAS INFORMÁTICOS")
        } else if (dia.equals("Viernes"){
            System.out.println("TENEMOS A PRIMERA CLASE DE SISTEMAS INFORMÁTICOS")
        }else {
            System.out.println("SOLO TENEMOS CLASES DE LUNES A VIERNES")
        }
    }
 */
}
