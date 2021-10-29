package com.company;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte dia;
        String mes;

        System.out.println("INTRODUZCA EL DÍA DE NACIMIENTO");
        dia = teclado.nextByte();
        teclado.nextLine();
        System.out.println("INTRODUZCA EL MES DE NACIMIENTO (LA PRIMERRA EN MAYÚSCULA)");
        mes = teclado.nextLine();

        if ((dia >= 21 && mes.equals("Marzo")) || ((dia <= 19 && mes.equals("Abril")))){
            System.out.println("TU SIGNO DEL ZODIACO ES ARIES");
        } else if ((dia >= 20 && mes.equals("Abril")) || ((dia <= 20 && mes.equals("Mayo")))) {
            System.out.println("TU SIGNO DEL ZODIACO ES TAURO");
        } else if ((dia >= 21 && mes.equals("Mayo")) || ((dia <= 20 && mes.equals("Junio")))) {
            System.out.println("TU SIGNO DEL ZODIACO ES GÉMINIS");
        } else if ((dia >= 21 && mes.equals("Junio")) || ((dia <= 22 && mes.equals("Julio")))) {
            System.out.println("TU SIGNO DEL ZODIACO ES CANCER");
        } else if ((dia >= 23 && mes.equals("Julio")) || ((dia <= 22 && mes.equals("Agosto")))) {
            System.out.println("TU SIGNO DEL ZODIACO ES LEO");
        } else if ((dia >= 23 && mes.equals("Agosto")) || ((dia <= 22 && mes.equals("Septiembre")))) {
            System.out.println("TU SIGNO DEL ZODIACO ES VIRGO");
        } else if ((dia >= 23 && mes.equals("Septiembre")) || ((dia <= 22 && mes.equals("Octubre")))) {
            System.out.println("TU SIGNO DEL ZODIACO ES LIBRA");
        } else if ((dia >= 23 && mes.equals("Octubre")) || ((dia <= 21 && mes.equals("Noviembre")))) {
            System.out.println("TU SIGNO DEL ZODIACO ES ESCORPIO");
        } else if ((dia >= 22 && mes.equals("Noviembre")) || ((dia <= 21 && mes.equals("Diciembre")))) {
            System.out.println("TU SIGNO DEL ZODIACO ES SAGITARIO");
        } else if ((dia >= 22 && mes.equals("Diciembre")) || ((dia <= 19 && mes.equals("Enero")))) {
            System.out.println("TU SIGNO DEL ZODIACO ES CAPRICORNIO");
        } else if ((dia >= 20 && mes.equals("Enero")) || ((dia <= 18 && mes.equals("Febrero")))) {
            System.out.println("TU SIGNO DEL ZODIACO ES ACUARIO");
        } else if ((dia >= 19 && mes.equals("Febrero")) || ((dia <= 20 && mes.equals("Marzo")))) {
            System.out.println("TU SIGNO DEL ZODIACO ES PISCIS");
        } else {
            System.out.println("LOS DATOS INTRODUCIDOS ESTÁN MAL");
        }
    }
}
