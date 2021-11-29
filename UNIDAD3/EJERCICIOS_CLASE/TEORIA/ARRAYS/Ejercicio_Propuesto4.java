package com.company;
import java.util.Scanner;

/*
Crea un programa que prepare un array que contenga el nombre de cada mes del año. El usuario introducirá
un número de mes (por ejemplo, 4 para abril) y el programa le dirá el nombre de ese mes.
 */

public class Ejercicio_Propuesto4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes;
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        do{
            System.out.println("INTRODUCE EL NÚMERO DE UN MES (EJ: ABRIL = 4)");
            mes = teclado.nextInt();

            if (mes >= 1 && mes <= 12){
                System.out.println("EL MES INTRODUCIDO ES " + meses[mes-1]);
            }

        }while (mes < 13 && mes > 0);

    }
}
