package com.company;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.println("INTRODUCE LAS TRES NOTAS PARA HACER LA MEDIA");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        nota3 = teclado.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if(media >= 0 && media < 5){
            System.out.println("LA NOTA DEL ALUMNO ES: " + media + " -> INSUFICIENTE");
        } else if(media >= 5 && media <6) {
            System.out.println("LA NOTA DEL ALUMNO ES: " + media + " -> SUFICIENTE");
        } else if(media >= 6 && media < 7) {
            System.out.println("LA NOTA DEL ALUMNO ES: " + media + " -> BIEN");
        } else if(media >= 7 && media < 9) {
            System.out.println("LA NOTA DEL ALUMNO ES: " + media + " -> NOTABLE");
        } else if (media >= 9 && media <= 10){
            System.out.println("LA NOTA DEL ALUMNO ES: " + media + " -> SOBRESALIENTE");
        } else {
            System.out.println("LAS NOTAS INTRODUCIDAS NO SON VÁLIDAS");
        }
    }
}
