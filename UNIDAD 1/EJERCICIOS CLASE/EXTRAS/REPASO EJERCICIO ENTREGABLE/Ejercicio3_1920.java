package com.company;
import java.util.Scanner;

public class Ejercicio3_1920 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer num;

        System.out.println("INTRODUCE UN NÚMERO");
        num = teclado.nextInt();

        String binario = Integer.toBinaryString(num);

        System.out.println(num + " EN BINARIO ES -> " + binario);

        /* OTRA FORMA DE HACERLO SIN CADENAS

        int num, resto;
        String resultado = "":

        while (num >= 2) {
            resto = num % 2;
            resultado = resto + resultado;
            num = num / 2;          //TAMBIÉN PODEMOS PONERLO COMO    num /= 2

        }
        System.out.println(num + resultado);

         */
    }
}
