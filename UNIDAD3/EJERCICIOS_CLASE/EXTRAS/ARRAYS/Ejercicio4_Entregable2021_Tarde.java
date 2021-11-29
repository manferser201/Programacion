package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_Entregable2021_Tarde {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimensiones, fila, columna;
        boolean bomba;

        System.out.println("INTRODUZCA LAS DIMENSIONES DEL TABLERO");
        dimensiones = teclado.nextInt();
        teclado.nextLine();

        String[][] tablero = new String[dimensiones][dimensiones];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                int valor = (int)(Math.random() * 5);

                if (valor >= 0 && valor <= 3){
                    tablero[i][j] = "- ";
                } else {
                    tablero[i][j] = "\uD83D\uDCA3";
                }
            }
        }

        for (String[] row:tablero) {
            System.out.println(Arrays.toString(row));
        }

        do{
            bomba = false;

            System.out.println("INTRODUCE LA FILA DEL TABLERO EN LA QUE TE ENCUENTRAS");
            fila = teclado.nextInt();

            System.out.println("INTRODUCE LA COLUMNA DEL TABLERO EN LA QUE TE ENCUENTRAS");
            columna = teclado.nextInt();

            if (tablero[fila][columna].equals("\uD83D\uDCA3")){
                System.out.println("ENHORABUENA, HAS ENOCNTRADO LA BOMBA");
                bomba = true;
            } else {
                System.out.println("HAY " + numBombas(fila, columna, tablero) + " CERCA DE TU POSICIÓN");
            }

        } while (!bomba);

    }

    public static int numBombas (int fila, int columna, String[][] tablero){

        int numBomba = 0, i, j;

        i = fila + 1;
        j = columna + 1;

        if (estaDentro(i, j, tablero) && tablero[i][j].equals("\uD83D\uDCA3")){
            numBomba++;
        }

        i = fila + 1;
        j = columna - 1;

        if (estaDentro(i, j, tablero) && tablero[i][j].equals("\uD83D\uDCA3")){
            numBomba++;
        }

        i = fila - 1;
        j = columna - 1;

        if (estaDentro(i, j, tablero) && tablero[i][j].equals("\uD83D\uDCA3")){
            numBomba++;
        }

        i = fila - 1;
        j = columna + 1;

        if (estaDentro(i, j, tablero) && tablero[i][j].equals("\uD83D\uDCA3")){
            numBomba++;
        }

        i = fila;
        j = columna - 1;

        if (estaDentro(i, j, tablero) && tablero[i][j].equals("\uD83D\uDCA3")){
            numBomba++;
        }

        i = fila;
        j = columna + 1;

        if (estaDentro(i, j, tablero) && tablero[i][j].equals("\uD83D\uDCA3")){
            numBomba++;
        }

        i = fila + 1;
        j = columna;

        if (estaDentro(i, j, tablero) && tablero[i][j].equals("\uD83D\uDCA3")){
            numBomba++;
        }

        i = fila - 1;
        j = columna;

        if (estaDentro(i, j, tablero) && tablero[i][j].equals("\uD83D\uDCA3")){
            numBomba++;
        }

        return numBomba;
    }

    public static boolean estaDentro (int i, int j, String[][] tablero){

        return (i >= 0 && i < tablero.length && j >= 0 && j < tablero.length);
    }
}
