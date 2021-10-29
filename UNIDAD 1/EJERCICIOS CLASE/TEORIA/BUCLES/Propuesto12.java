package com.company;
import java.util.Scanner;

public class Propuesto12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int login, contraseña;

        do {
            System.out.println("INTRODUZCA SU LOGIN");
            login = teclado.nextInt();

            System.out.println("INTRODUZCA SU CONTRASEÑA");
            contraseña = teclado.nextInt();


        } while (login != 1809 || contraseña != 1234);
    }
}
