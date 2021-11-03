package com.company;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, numReversa = 0, posiciones = 0;

        System.out.println("INTRODUCE EL NÚMERO QUE QUIERAS TRADUCIR");
        num = teclado.nextInt();

        while (num > 0){
            numReversa = numReversa * 10 + num % 10;
            num /= 10;
            posiciones++;
        }

        while (numReversa > 0){

            for (int i = 0; i < numReversa % 10; i++) {
                System.out.print("*");
            }
                if (posiciones > 1){
                    System.out.print("_");
                }

            numReversa /= 10;
            posiciones--;
        }

    }
}
