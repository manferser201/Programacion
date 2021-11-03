package com.company;
import java.util.Scanner;

public class Propuesto1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float num1;

        System.out.println("INTRODUCE UN NUMERO");
        num1 = teclado.nextFloat();

        if (num1 < 0){
            System.out.println("EL NUMERO ES NEGATIVO");
        }else{
            System.out.println("EL NUMERO ES POSITIVO");
        }
    }
}
