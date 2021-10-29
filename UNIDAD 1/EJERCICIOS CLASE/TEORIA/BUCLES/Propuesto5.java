package com.company;
import java.util.Scanner;

public class Propuesto5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contraseña;

        System.out.println("INTRODUZCA UNA CONTRASEÑA DE 4 CIFRAS ENTERAS");
        contraseña = teclado.nextInt();

        while (contraseña != 1234){
            System.out.println("INTRODUZCA UNA CONTRASEÑA DE 4 CIFRAS ENTERAS");
            contraseña = teclado.nextInt();
        }
    }
}
