package com.company;

public class Main {
    public static void main(String[] args) {
        Oferta o1 = new Oferta(123, "OFERTA PARA PROGRAMADOR SENIOR");
        Oferta o2 = new Oferta(234, "OFERTA PARA PROGRAMADOR JUNIOR");
        Oferta o3 = new Oferta(345, "OFERTA PARA PROGRAMADOR VETERANO");
        Oferta o4 = new Oferta(456, "OFERTA PARA RECEPCIONISTA");
        Oferta o5 = new Oferta(567, "OFERTA PARA CAMARERO");

        Trabajador t1 = new Trabajador("321321321", "ALEJANDRO", "PÉREZ", 18, "BACHILLERATO");
        Trabajador t2 = new Trabajador("134897465", "MANUEL", "FERNÁNDEZ", 21, "CICLO SUPERIOR");
        Trabajador t3 = new Trabajador("444444444", "ALBERTO", "REINA", 40, "GRADO");
        Trabajador t4 = new Trabajador("789798987", "JAVIER", "CORONEL", 20, "BACHILLERATO Y GRADO");
        Trabajador t5 = new Trabajador("466214556", "ARIADNA", "RODRIGUEZ", 19, "BACHILLERATO");
        Trabajador t6 = new Trabajador("789546542", "MARIA", "FERNÁNDEZ", 42, "CICLO SUPERIOR Y GRADO");
        Trabajador t7 = new Trabajador("781236545", "CARLOS", "CARRETERO", 30, "DOBLE GRADO");
        Trabajador t8 = new Trabajador("136548654", "PABLO", "PEÑALOSA", 27, "DOBLE GRADO");
        Trabajador t9 = new Trabajador("465210329", "MARTA", "IBAR", 35, "ESO");
        Trabajador t10 = new Trabajador("000115540", "CYNTHIA", "CHECA", 18, "BACHILLERATO");

        SAE sae = new SAE();

//        sae.cargarDatos();

        sae.addOferta(o1);
        sae.addOferta(o2);
        sae.addOferta(o3);
        sae.addOferta(o4);
        sae.addOferta(o5);

        sae.addTrabajador(123, t1);
        sae.addTrabajador(123, t2);
        sae.addTrabajador(234, t3);
        sae.addTrabajador(234, t4);
        sae.addTrabajador(345, t5);
        sae.addTrabajador(345, t6);
        sae.addTrabajador(456, t7);
        sae.addTrabajador(456, t8);
        sae.addTrabajador(456, t9);

//        sae.mostrarTrabajadores(123);
//        sae.mostrarTrabajadores(567);

//        sae.mostrarTrabajdoresXEdad(456);

//        sae.removeTrabajador(123, t2);
//        sae.mostrarTrabajadores(123);
        sae.cantidadOfertas("000115540");
//        sae.guardarDatos();

    }
}
