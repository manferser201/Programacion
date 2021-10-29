package com.company;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.println("INTRODUCE LAS TRES NOTAS PARA HACER LA MEDIA");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        nota3 = teclado.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 5 && media <= 10){
            System.out.println("LA MEDIA DE ESTE ALUMNO ES DE " + media + ", EL ALUMNO ESTÁ APROBADO");
        } else if(media >= 0 && media <5){
            System.out.println("LA MEDIA DE ESTE ALUMNO ES DE " + media + ", EL ALUMNO ESTÁ SUSPENSO");
        }
    }
}
