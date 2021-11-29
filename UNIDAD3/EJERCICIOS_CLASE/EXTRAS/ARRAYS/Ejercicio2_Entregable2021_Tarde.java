package com.company;
import java.util.Scanner;

public class Ejercicio2_Entregable2021_Tarde {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros;

        System.out.println("INTRODUCE LOS NÚMEROS QUE QUIERE CONVERTIR A MORSE");
        numeros = teclado.nextInt();

        System.out.print(convierteEnMorse(numeros));
    }

    public static String convierteEnMorse(int n){

        String[] numeroMorse = {"_ _ _ _ _", ". _ _ _ _", ". . _ _ _",". . . _ _",". . . . _", ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .","_ _ _ _ ."};
        String morse = "";
        int numero, reversa = 0;

        while (n > 0){
            reversa = reversa * 10 + n % 10;
            n /= 10;
        }


        while (reversa > 0){
            numero = reversa % 10;

            if (reversa > 10){
                for (int i = 0; i < numeroMorse.length; i++) {
                    if (i == numero){
                        morse += numeroMorse[i] + " ";
                    }
                }
            } else {
                for (int i = 0; i < numeroMorse.length; i++) {
                    if (i == numero){
                        morse += numeroMorse[i];
                    }
                }
            }

            reversa /= 10;
        }

        return morse;
    }
}
