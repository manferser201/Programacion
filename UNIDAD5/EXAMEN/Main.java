package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Coro coro = new Coro("Coro1", "Juan Diego", "Manuel", "Dani", "Estudiantes", 80,5 , 4);
        Coro coro2 = new Coro("Coro2", "Juan Diego", "Manuel", "Dani", "Estudiantes", 90,5 , 4);
        Comparsa comparsa = new Comparsa("La Chusma Selecta", "Martínez Ares", "Martínez Ares", "Martínez Ares", "Señores del siglo 18", 90, "Rapuncel");
        Chirigota chirigota = new Chirigota("Que bonito eres Manuel", "Selu", "Selu", "Selu", "Señorito sevillano", 90, 2);
        Cuarteto cuarteto = new Cuarteto("Lo que el vieto se llevo", "Julian", "Julian", "Jose", "Gente que va a la playa", 80, 4);
        Romancero romancero = new Romancero("El cantar del mío Cid", "Cervantes", "Alejandro Sanz", "Cervantes", "Español de la reconquista", "La reconquista");
        Integrante i = new Integrante(1, "Manuel", 20, "Gines");
        Integrante i2 = new Integrante(2, "Javier", 19, "Castilleja de la cuesta");
        Integrante i3 = new Integrante(3, "Juan", 38, "Castilleja de Guzmán");
        Integrante i4 = new Integrante(4, "Diego", 40, "Benacazón");
        Integrante i5 = new Integrante(5, "Dani", 22, "Umbrete");
        COAC c = new COAC();

        coro.cantar_la_presentacion();

        chirigota.hacer_tipo();

        romancero.amo_a_escucha();

        cuarteto.insertar_integrante(i);
        cuarteto.insertar_integrante(i2);
        cuarteto.insertar_integrante(i3);
        cuarteto.insertar_integrante(i4);
        cuarteto.insertar_integrante(i5);
        System.out.println(cuarteto);

        cuarteto.eliminar_integrante(i2);
        System.out.println(cuarteto);

        comparsa.caminito_del_falla();

        c.inscribir_agrupacion(coro);
        c.inscribir_agrupacion(comparsa);
        c.inscribir_agrupacion(chirigota);
        c.inscribir_agrupacion(cuarteto);
        System.out.println(c);

        c.eliminar_agrupacion(coro);
        c.eliminar_agrupacion(chirigota);
        System.out.println(c);

        Coro[] coros = {coro, coro2};
        Arrays.sort(coros);
        System.out.println(Arrays.toString(coros));
    }
}
