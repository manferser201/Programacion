package com.company;
import java.util.Scanner;


public class Suma3 {
    public static void main(String[] args) {
        //CREA UN OBJETO SCANNER DE ENTRADA CON NOMOBRE TECLADO
        Scanner teclado = new Scanner(System.in);

        //PIDE EL PRIMER NUMERO AL USUARIO Y LO RECOGE EN LA VARIABLE num1
        System.out.println("INTRODUCE EL PRIMER NUMERO");
        int num1 = teclado.nextInt();

        //PIDE EL SEGUNDO NUMERO Y LO RECOGE EN LA VARIABLE num2
        System.out.println("INTRODUCE EL SEGUNDO NUMERO");
        int num2 = teclado.nextInt();

        System.out.print("LA SUMA DE LOS NUMEROS INTRODUCEIDOS ES: " + (num1 + num2));
    }
}
