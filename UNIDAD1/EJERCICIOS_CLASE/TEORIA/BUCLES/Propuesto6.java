package com.company;
import java.util.Scanner;

public class Propuesto6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int login, contraseña;

        System.out.println("INTRODUZCA SU LOGIN Y SU CONTRASEÑA");
        login = teclado.nextInt();
        contraseña = teclado.nextInt();

        while (login != 1809 && contraseña != 1234){
            System.out.println("INTRODUZCA DE NUEVO SU LOGIN Y SU CONTRASEÑA");
            login = teclado.nextInt();
            contraseña = teclado.nextInt();
        }
    }
}
