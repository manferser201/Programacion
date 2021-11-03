package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String num;
        int i;

        System.out.println("INTRODUCE UN NÚMERO");
        num = teclado.nextLine();

        for (i = num.length() - 1; i >= 0 ; i--){
            System.out.print(num.charAt(i));
        }
    }
}
