package com.company;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, media;
        String recuperacion;

        System.out.println("INTRODUZCA LAS DOS NOTAS DEL ALUMNO");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        media = (nota1 + nota2) / 2;

        if (media > 10 || media < 0) {
            System.out.println("POR FAVOR INTRODUZCA DOS NOTAS VÁLIDAS");

        } else if (media >= 5) {
            System.out.println("EL ALUMNO ESTÁ APROBADO Y TIENE UNA MEDIA DE " + media);

        } else {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            teclado.nextLine();
            recuperacion = teclado.nextLine();

            if (recuperacion.equals("apto")) {
                System.out.println("EL ALUMNO ESTÁ APROBADO Y TIENE UN 5 DE MEDIA");

            } else {
                System.out.println("EL ALUMNO ESTÁ SUSPENSO CON UNA MEDIA DE " + media);
            }
        }
    }
}
