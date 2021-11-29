package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] premiado = new int[0];
        int[] comprado = new int[6];
        int aciertos = 0;

        do {
            int random = (int)(Math.random() * 50 + 1);

            if (noEsta(premiado, random)) {
                    premiado = Arrays.copyOf(premiado, premiado.length + 1);
                    premiado[premiado.length - 1] = random;
            }

        } while (premiado.length != 6);

        System.out.println("CUPÓN PREMIADO: " + Arrays.toString(premiado));

        for (int i = 0; i < comprado.length; i++) {
            System.out.println("INTRODUZCA EL " + (i+1) + "º NÚMERO DE TU CUPÓN");
            comprado[i] = teclado.nextInt();
        }

        System.out.println("MI CUPÓN: " + Arrays.toString(comprado));

        for (int i = 0; i < comprado.length; i++) {
            if (!noEsta(premiado, comprado[i])){
                aciertos++;
            }
        }

        System.out.println("HAS ACERTADO " + aciertos + " NÚMEROS");
    }

    public static boolean noEsta (int[] cupon, int numero){

        for (int i = 0; i < cupon.length; i++) {
            if (cupon[i] == numero){
                return false;
            }
        }

        return true;
    }
}
