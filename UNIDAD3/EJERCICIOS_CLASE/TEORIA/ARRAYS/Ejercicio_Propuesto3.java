package com.company;
import java.util.Scanner;

/*
Crea un programa que prepare un array que contenga la cantidad de días que hay en cada mes del año.
A partir de entonces el usuario introducirá un número de mes (por ejemplo, 4 para abril) y el programa
le responderá cuántos días tiene ese mes. Se repetirá hasta que el usuario introduzca un mes menor que 1
o mayor que 12.
 */

public class Ejercicio_Propuesto3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31};
        int mes;

        do{
            System.out.println("INTRODUCE EL NÚMERO DE UN MES (EJ: ABRIL = 4)");
            mes = teclado.nextInt();

            if (mes >= 1 && mes <= 12){
                System.out.println("EL MES INTRODUCIDO TIENE " + diasMeses[mes-1] + " DIAS");
            }

        }while (mes < 13 && mes > 0);

    }
}
