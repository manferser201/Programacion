package com.company;
import java.util.Scanner;

public class Ejercicio1_1920 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Float nota1, nota2, nota3, media;
        String nota_recuperacion;

        System.out.println("INTRODUCE LAS TRES NOTAS DEL ALUMNO");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        nota3 = teclado.nextFloat();
        teclado.nextLine();

        media = (nota1 + nota2 + nota3) / 3;

        if (media < 5){
            System.out.println("¿CUÁL HA SIDO LA NOTA DE LA RECUPERACIÓN? (apto/no apto)");
            nota_recuperacion = teclado.nextLine();

            if (nota_recuperacion.equals("apto")){
                System.out.println("LA NOTA DEL ALUMNO ES UN 5 - SUFICIENTE");
            } else {
                System.out.println("LA NOTA DEL ALUMNO ES " + media + " - INSUFICIENTE");
            }

        } else {
            if (media >= 5 && media < 6){
                System.out.println("TU NOTA DE PROGRAMACIÓN ES " + media + " - SUFICIENTE");
            } else if (media >= 6 && media < 7){
                System.out.println("TU NOTA DE PROGRAMACIÓN ES " + media + " - BIEN");
            } else if (media >= 7 && media < 9){
                System.out.println("TU NOTA DE PROGRAMACIÓN ES " + media + " - NOTABLE");
            } else {
                System.out.println("TU NOTA DE PROGRAMACIÓN ES " + media + " - SOBRESALIENTE");
            }
        }
    }
}
