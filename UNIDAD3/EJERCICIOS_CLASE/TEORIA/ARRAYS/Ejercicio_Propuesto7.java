package com.company;
import java.util.Scanner;

/*
Crea un programa que prepare un array de hasta 1000 números enteros. El usuario podrá elegir añadir un nuevo
dato (tendrás que llevar la cuenta la cantidad de datos que ya hay introducidos), buscar para comprobar si
aparece un cierto dato, o salir del programa.
 */

public class Ejercicio_Propuesto7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[1000];
        String accion;
        int ultimoAñadido = 0, datoNuevo, busqueda;

        do {
            System.out.println("¿QUÉ DESEA HACER: INSERTAR UN NUEVO DATO (INSERTAR), BUSCAR UNO YA EXISTENTE (BUSCAR) O SALIR DEL PROGRAMA (SALIR)?");
            accion = teclado.nextLine();
            teclado.nextLine();

            if (accion.equalsIgnoreCase("INSERTAR")){
                System.out.println("INTRODUCE EL DATO NUEVO");
                numeros[ultimoAñadido] = teclado.nextInt();
                ultimoAñadido++;

                System.out.println("YA SE HA INTRODUCIDO EL DATO NUEVO");
                teclado.nextLine();

            } else if (accion.equalsIgnoreCase("buscar")){
                System.out.println("INTRODUCE EL VALOR QUE QUIERA BUSCAR");
                busqueda = teclado.nextInt();

                for (int i = 0; i < ultimoAñadido; i++) {
                    if (numeros[i] == busqueda){
                        System.out.println(busqueda + " ESTÁ DENTRO DE LA CADENA");
                        teclado.nextLine();
                        break;
                    }
                }
            } else {
                System.out.println("NO HA ELEGIDO BIEN LA ACCIÓN A REALIZAR, LO QUE TIENE QUE PONER ES LO QUE ESTÁ ENTRE PARENTSIS");
                teclado.nextLine();
            }
        } while (!accion.equalsIgnoreCase("SALIR"));

    }
}
