package com.company;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        double nota;
        boolean suspenso = false;

        for (i = 1; i <= 5; i++){
            System.out.println("INTRODUCE UNA NOTA");
            nota = teclado.nextDouble();

            if (nota < 5){
                suspenso = true;
            }
        }

        if (suspenso){
            System.out.println("EN LAS 5 NOTAS INTRODUCIDAS HAY ALGUIEN QUE HA SUSPENDIDO");
        } else {
            System.out.println("EN LAS 5 NOTAS INTRODUCIDAS NO HAY NINGÚN SUSPENSO");
        }

    }
}
