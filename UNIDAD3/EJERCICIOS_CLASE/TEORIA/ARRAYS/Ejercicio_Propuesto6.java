package com.company;
import java.util.Scanner;

/*
Crea un programa que pida al usuario 10 números enteros largos, los guarde en un array y después pregunte qué
número quiere buscar y le contestará si ese número forma parte de los 10 iniciales o no.
Volverá a preguntar qué número desea buscar, hasta que el usuario introduzca "-1" para indicar que no quiere
seguir buscando.
 */

public class Ejercicio_Propuesto6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long[] numero = new long[10];
        long busqueda;
        boolean encontrado = false;

        for (int i = 1; i <= numero.length; i++) {
            System.out.println("INTRODUCE EL VALOR " + i + " DEL ARRAY");
            numero[i-1] = teclado.nextLong();
        }

        do {
            System.out.println("INTRODUCE EL NÚMERO QUE QUIERA BUSCAR");
            busqueda = teclado.nextLong();

            if (busqueda != -1){
                for (int i = 0; i < numero.length; i++) {
                    if (numero[i] == busqueda){
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado){
                    System.out.println(busqueda + " ESTÁ DENTRO DE LOS NÚMERO INTRODUCIDOS AL PIRNCIPIO");
                } else {
                    System.out.println(busqueda + " NO ESTÁ DENTRO DE LOS NÚMERO INTRODUCIDOS AL PIRNCIPIO");
                }
            }


        } while (busqueda != -1);




    }
}
