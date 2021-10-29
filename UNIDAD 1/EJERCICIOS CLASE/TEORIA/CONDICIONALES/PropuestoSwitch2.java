package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

/* Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario.
Por ejemplo, si el usuario introduce 3, deberá escribir "tres". */

public class PropuestoSwitch2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte num;

        System.out.println("INTRODUZCA UN NÚMERO DEL 1 AL 10");
        num = teclado.nextByte();

        switch (num) {
            case 1: System.out.println("EL NÚMERO INTRODUCIDO ES UNO"); break;
            case 2: System.out.println("EL NÚMERO INTRODUCIDO ES DOS"); break;
            case 3: System.out.println("EL NÚMERO INTRODUCIDO ES TRES"); break;
            case 4: System.out.println("EL NÚMERO INTRODUCIDO ES CUATRO"); break;
            case 5: System.out.println("EL NÚMERO INTRODUCIDO ES CINCO"); break;
            case 6: System.out.println("EL NÚMERO INTRODUCIDO ES SEIS"); break;
            case 7: System.out.println("EL NÚMERO INTRODUCIDO ES SIETE"); break;
            case 8: System.out.println("EL NÚMERO INTRODUCIDO ES OCHO"); break;
            case 9: System.out.println("EL NÚMERO INTRODUCIDO ES NUEVE"); break;
            case 10: System.out.println("EL NÚMERO INTRODUCIDO ES DIEZ"); break;
            default: System.out.println("POR FAVOR, INTRODUZCA UN NUMERO ENTRE 1 Y 10"); break;
        }
    }
}
