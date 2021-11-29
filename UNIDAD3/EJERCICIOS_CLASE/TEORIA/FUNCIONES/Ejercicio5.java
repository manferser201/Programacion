package com.company;
import java.util.Scanner;

/* Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números.
Piensa un poco, no hagas el algoritmo de comparación de los 3 números desde cero.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("INTRODUZCA TRES NUMEROS ENTEROS");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();

        System.out.println("EL NÚMERO MÁS GRANDE ES: " + mayor(num1, num2, num3));
    }

    public static int mayor (int a, int b){
        if (a > b){
            return a;
        }
        return b;
    }

    public static int mayor (int a, int b, int c){

        int num = mayor(a,b);

        return mayor(num,c);
    }

}
