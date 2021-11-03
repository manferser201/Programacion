package com.company;

public class Ej3 {
    public static void main(String[] args) {
        int numPalo, numCarta;
        String palo = "", carta = "";

        numPalo = (int)(Math.random() * 4);
        numCarta = (int)(Math.random() * 14);

        switch (numPalo){
            case 0: palo = "PICAS";break;
            case 1: palo = "CORAZONES";break;
            case 2: palo = "DIAMANTES";break;
            default: palo = "TRÉBOLES";
        }

        switch (numCarta){
            case 0: carta = "A";break;
            case 11: carta = "J";break;
            case 12: carta = "Q";break;
            case 13: carta = "K";break;
            default: carta = "" + numCarta;
        }

        System.out.println("PALO - " + palo);
        System.out.println("CARTA - " + carta);
    }
}
