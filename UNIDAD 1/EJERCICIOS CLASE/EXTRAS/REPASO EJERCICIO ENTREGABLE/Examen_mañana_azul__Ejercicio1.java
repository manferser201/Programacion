package com.company;

import java.util.Scanner;

public class Examen_mañana_azul__Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String num_cuenta;
        String entidad = "";
        String sucursal = "";
        String control = "";
        String cc = "";

        System.out.println("INTRODUCE UN NÚMERO DE CUENTA");
        num_cuenta = teclado.nextLine();

        for (int i = 0; i < 4; i++) {
            entidad += num_cuenta.charAt(i);
        }

        for (int i = 5; i <= 8; i++) {
            sucursal += num_cuenta.charAt(i);
        }

        for (int i = 9; i <= 11; i++) {
            control += num_cuenta.charAt(i);
        }
        for (int i = 13; i < num_cuenta.length(); i++) {
            cc += num_cuenta.charAt(i);
        }

        boolean es_primo = true;
        int numero = Integer.parseInt(cc);

        for (int i = 0; i < numero; i++) {
            if (numero % i == 0){
                es_primo = false;
                break;
            }
        }

        if (num_cuenta.charAt(4)== '-' && num_cuenta.charAt(9)== '-' && num_cuenta.charAt(12)== '-'
        && num_cuenta.length()==23 && es_primo){
            System.out.println("Es correcto");
        }
        System.out.println(entidad + "-" + sucursal + "-" + control + "-" + cc);

    }

}
