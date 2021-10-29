package com.company;
import java.util.Scanner;

/* Crear una función que, mediante un booleano, indique si el carácter que se
pasa como parámetro de entrada corresponde con una vocal.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char letra;

        System.out.println("INTRODUZCA UNA LETRA");
        letra = teclado.next().charAt(0);

        if (vocal(letra) == true){
            System.out.println("LA LETRA ES UNA VOCAL");
        } else {
            System.out.println("LA LETRA NO ES UNA VOCAL");
        }
    }

    public static boolean vocal (char letra){
        boolean vocal = false;

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O'
                || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i'
                || letra == 'o' || letra == 'u'){
            vocal = true;
        }

        return vocal;
    }
}
