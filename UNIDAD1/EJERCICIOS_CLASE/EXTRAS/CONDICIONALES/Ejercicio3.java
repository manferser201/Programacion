package com.company;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte dia;

        System.out.println("INTRODUCE UN DÍA DE LA SEMANA (1 = LUNES, 2 = MARTES, ... 5 = VIERNES)");
        dia = teclado.nextByte();

        switch (dia){
            case 1: System.out.println("EL DIA INTRODUCIDO ES LUNES"); break;
            case 2: System.out.println("EL DIA INTRODUCIDO ES MARTES"); break;
            case 3: System.out.println("EL DIA INTRODUCIDO ES MIÉRCOLES"); break;
            case 4: System.out.println("EL DIA INTRODUCIDO ES JUEVES"); break;
            case 5: System.out.println("EL DIA INTRODUCIDO ES VIERNES"); break;
            case 6: System.out.println("EL DIA INTRODUCIDO ES SÁBADO"); break;
            case 7: System.out.println("EL DIA INTRODUCIDO ES DOMINGO"); break;
            default: System.out.println("INTRODUCE UN DÍA DE LUNES A DOMINGO");
        }
    }
}
