package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        TreeSet<Alumno> set_alumnos = new TreeSet<>();
        HashMap<String, Alumno> mapa_dni = new HashMap<>();
        Integer accion;

        cargar_alumnos(set_alumnos);

        do {
            System.out.println("INTRODUZCA LO QUE QUIERE HACER:");
            System.out.println("1. INSERTAR ALUMNO");
            System.out.println("2. BORRAR ALUMNO");
            System.out.println("3. MOSTRAR ALUMNO");
            System.out.println("4. MOSTRAR ALUMNO DE UN CURSO");
            System.out.println("5. MODIFICAR ALUMNO");
            System.out.println("6. SALIR");
            accion = teclado.nextInt();

            switch (accion){
                case 1: insertarAlumno(set_alumnos, mapa_dni);break;
                case 2: borrarAlumno(set_alumnos, mapa_dni);break;
                case 3: mostrarAlumno(set_alumnos);break;
                case 4: mostrarAlumnoCurso(set_alumnos, mapa_dni);break;
                case 5: modificarAlumno(set_alumnos, mapa_dni);break;
                case 6: salir(set_alumnos); ;break;
                default:
                    System.out.println("INTRODUZCA UN NÚMERO CORRECTO PARA REALIZAR UNA ACCIÓN");
                    System.out.println();break;
            }
        } while (accion !=6);

    }

    private static void cargar_alumnos(TreeSet<Alumno> set_alumnos){
        try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("alumnos.dat"))){
            set_alumnos = (TreeSet<Alumno>) fichero.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertarAlumno(TreeSet<Alumno> set_alumnos, HashMap<String, Alumno> mapa_dni){
        Scanner teclado = new Scanner(System.in);

        String nombre, apellidos, direccion, dni, email, curso, dual;

        System.out.println("INTRODUCE LOS DATOS DEL NUEVO ALUMNO");
        System.out.println("DNI");
        dni = teclado.nextLine();

        System.out.println("NOMBRE:");
        nombre = teclado.nextLine();

        System.out.println("APELLIDOS:");
        apellidos = teclado.nextLine();

        System.out.println("DIRECCION:");
        direccion = teclado.nextLine();

        System.out.println("EMAIL:");
        email = teclado.nextLine();

        System.out.println("CUROS:");
        curso = teclado.nextLine();

        System.out.println("¿ESTE ALUMNO PERTENECE A FORMACIÓN DUAL? [SI/NO]");
        dual = teclado.nextLine();

        System.out.println();

        if (!mapa_dni.containsKey(dni)){
            set_alumnos.add(new Alumno(nombre, apellidos, direccion, dni, email, curso, dual));
            mapa_dni.put(dni, new Alumno(nombre, apellidos, direccion, dni, email, curso, dual));

        } else {
            System.out.println("EL ALUMNO INTRODUCIDO YA EXISTE, REVISE LOS DATOS INTRODUCIDOS");
        }
    }

    public static void borrarAlumno(TreeSet<Alumno> set_alumnos, HashMap<String, Alumno> mapa_dni){
        Scanner teclado = new Scanner(System.in);

        Alumno alumno;
        String dni;

        System.out.println("INTRODUCE EL ALUMNO QUE QUIERE BORRAR");
        dni = teclado.nextLine();

        if (mapa_dni.containsKey(dni)){
            alumno = mapa_dni.get(dni);

            set_alumnos.remove(alumno);
            mapa_dni.remove(dni);

            System.out.println("EL ALUMNO HA SIDO BORRASO CON ÉXITO");
            System.out.println();
        } else{
            System.out.println("EL ALUMNO INTRODUCIDO NO EXISTE");
            System.out.println();
        }
    }

    public static void mostrarAlumno(TreeSet<Alumno> set_alumno){

        for (Alumno a:set_alumno) {
            System.out.println(a.toString());
        }

        System.out.println();
    }

    public static void mostrarAlumnoCurso(TreeSet<Alumno> set_alumno, HashMap<String, Alumno> mapa_dni) {
        Scanner teclado = new Scanner(System.in);

        Alumno alumnos;
        String curso;

        System.out.println("INTRODUCE EL CURSO DEL QUE QUIERA SABER LOS ALUMNOS");
        curso = teclado.nextLine();

        if (mapa_dni.containsKey(curso)){
            alumnos = mapa_dni.get(curso);

            if (alumnos.getCurso().equals(curso)){
                for (Alumno a:set_alumno) {
                    System.out.println(a.toString());
                }
            }
        } else {
            System.out.println("NO HAY ALUMNOS DENTRO DE ESE CURSO");
        }

    }

    public static void modificarAlumno(TreeSet<Alumno> set_alumnos, HashMap<String, Alumno> mapa_dni){
        Scanner teclado = new Scanner(System.in);
        String nombre, apellidos, direccion, dni, email, curso, dual;
        Alumno alumno;

        System.out.println("INTRODUCE EL ALUMNO QUE QUIERE CAMBIAR LOS DATOS");
        dni = teclado.nextLine();

        if (mapa_dni.containsKey(dni)) {
            alumno = mapa_dni.get(dni);

            set_alumnos.remove(alumno);
            mapa_dni.remove(dni);
        }

        System.out.println("INTRODUCE LOS NUEVOS DATOS DEL ALUMNO");
        System.out.println("NOMBRE:");
        nombre = teclado.nextLine();

        System.out.println("APELLIDOS:");
        apellidos = teclado.nextLine();

        System.out.println("DIRECCION:");
        direccion = teclado.nextLine();

        System.out.println("EMAIL:");
        email = teclado.nextLine();

        System.out.println("CUROS:");
        curso = teclado.nextLine();

        System.out.println("¿ESTE ALUMNO PERTENECE A FORMACIÓN DUAL? [SI/NO]");
        dual = teclado.nextLine();

        set_alumnos.add(new Alumno(nombre, apellidos, direccion, dni, email, curso, dual));
        mapa_dni.put(dni, new Alumno(nombre, apellidos, direccion, dni, email, curso, dual));

    }

    public static void salir (TreeSet<Alumno> set_alumnos){
        try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("alumnos.dat"))){
            fichero.writeObject(set_alumnos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("HASTA LA PRÓXIMA");
    }

}
