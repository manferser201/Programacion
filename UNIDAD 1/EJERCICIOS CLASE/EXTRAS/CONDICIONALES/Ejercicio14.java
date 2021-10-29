package com.company;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char x;
        String direccion;

        System.out.println("INTRODUCE UN SÍMBOLO");
        x = teclado.next().charAt(0);
        teclado.nextLine();
        System.out.println("INTRODUCE LA DIRECCIÓN DE LA PIRÁMIDE (Izquierda, Derecha, Arriba, Abajo)");
        direccion = teclado.nextLine();

        switch (direccion){
            case "Arriba":
                System.out.println("   " + x);
                System.out.println("  "+ x + "" + x + "" +x);
                System.out.println(" " + x + "" + x + "" + x + "" + x + "" + x);
                System.out.println("" + x + "" + x + "" + x + "" + x + "" + x + "" + x + "" + x); break;
            case "Abajo":
                System.out.println("" + x + "" + x + "" + x + "" + x + "" + x + "" + x + "" + x);
                System.out.println(" " + x + "" + x + "" + x + "" + x + "" + x);
                System.out.println("  "+ x + "" + x + "" +x);
                System.out.println("   " + x); break;
            case "Derecha":
                System.out.println("" + x);
                System.out.println(""+ x + " " + x);
                System.out.println(""+ x + " " + x + " " + x);
                System.out.println(""+ x + " " + x + " " + x + " " + x);
                System.out.println(""+ x + " " + x + " " + x);
                System.out.println(""+ x + " " + x);
                System.out.println("" + x); break;
            case "Izquierda":
                System.out.println("      " + x);
                System.out.println("    "+ x + " " + x);
                System.out.println("  "+ x + " " + x + " " + x);
                System.out.println(""+ x + " " + x + " " + x + " " + x);
                System.out.println("  "+ x + " " + x + " " + x);
                System.out.println("    "+ x + " " + x);
                System.out.println("      " + x); break;
            default: System.out.println("NO HAS INDICADO BIEN LA DIRECCIÓN DE LA PIRÁMIDE");
        }

    }
}
