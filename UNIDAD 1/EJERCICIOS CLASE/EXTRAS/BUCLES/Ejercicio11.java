package com.company;

public class Ejercicio11 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 10; i++){
            System.out.println("LA TABLA DE MULTIPLICAR DEL " + i + " ES:");
            for (j = 0; j <= 10; j++){
                System.out.println(i * j);
            }
            System.out.println();
        }

    }
}
