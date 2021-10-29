package com.company;
import java.util.Scanner;

/* Crea un programa que pida al usuario el número de un mes y escriba el nombre de ese mes.
 Por ejemplo, si el usuario introduce 9, deberá escribir "septiembre". */

public class PropuestoSwitch1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte mes;

        System.out.println("INTRODUZCA EL NÚMERO DEL MES");
        mes = teclado.nextByte();

        switch (mes) {
            case 1: System.out.println("EL MES INTRODUCIDO ES ENERO"); break;
            case 2: System.out.println("EL MES INTRODUCIDO ES FEBRERO"); break;
            case 3: System.out.println("EL MES INTRODUCIDO ES MARZO"); break;
            case 4: System.out.println("EL MES INTRODUCIDO ES ABRIL"); break;
            case 5: System.out.println("EL MES INTRODUCIDO ES MAYO"); break;
            case 6: System.out.println("EL MES INTRODUCIDO ES JUNIO"); break;
            case 7: System.out.println("EL MES INTRODUCIDO ES JULIO"); break;
            case 8: System.out.println("EL MES INTRODUCIDO ES AGOSTO"); break;
            case 9: System.out.println("EL MES INTRODUCIDO ES SEPTIEMBRE"); break;
            case 10: System.out.println("EL MES INTRODUCIDO ES OCTUBRE"); break;
            case 11: System.out.println("EL MES INTRODUCIDO ES NOVIEMBRE"); break;
            case 12: System.out.println("EL MES INTRODUCIDO ES DICIEMBRE"); break;
            default: System.out.println("POR FAVOR, INTRODUZCA UN NUMERO VÁLIDO"); break;
        }
    }
}
