package com.company;
import java.util.Scanner;

/*Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.
Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen).
Además, hemos de pasarle a la función el radio de la base y la altura.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, radio;
        int seleccion;

        System.out.print("INTRODUCE LA ALTURA DEL CILINDRO: ");
        altura = teclado.nextFloat();

        System.out.print("INTRODUZCA EL RADIO DEL CILINDRO: ");
        radio = teclado.nextFloat();

        do {
            System.out.print("INTRODUCE SI QUIERE SABER SU ÁREA TOTAL O SU VOLUMEN (ÁREA TOTAL = 1 / VOLUMEN = 2): ");
            seleccion = teclado.nextInt();

        } while (seleccion < 1 || seleccion > 2);

        if (seleccion == 1){
            System.out.println(area(altura,radio));
        } else {
            System.out.println(volumen(altura, radio));
        }
    }

    public static double area(double altura, double radio){

        double areaTotal = 2 * radio * Math.PI * (altura + radio);

        return areaTotal;
    }

    public static double volumen (double altura, double radio){

        double volumen_cilindro = radio * radio * altura * Math.PI;

        return volumen_cilindro;
    }
}
