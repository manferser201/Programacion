package com.company;

import java.io.*;
import java.util.*;

public class SAE{
    private HashMap<Integer, Set<Trabajador>> trabajadores;

    public SAE() {
        this.trabajadores = new HashMap<>();
    }

    public boolean addOferta(Oferta o){

        if(!trabajadores.containsKey(o.getCodigo())){
            trabajadores.put(o.getCodigo(), new TreeSet<Trabajador>());
            return true;
        }

        return false;
    }

    public boolean addTrabajador(Integer codigo, Trabajador t){

        if(trabajadores.containsKey(codigo)){
            if(!trabajadores.get(codigo).contains(t)){
                trabajadores.get(codigo).add(t);
                return true;
            }
        }

        return false;
    }

    public boolean removeTrabajador(Integer codigo, Trabajador t){

        if(trabajadores.containsKey(codigo)){
            if(trabajadores.get(codigo).contains(t)){
                trabajadores.get(codigo).remove(t);
                return true;
            }
        }

        return false;
    }

    public void mostrarTrabajadores(Integer codigo){
        if (trabajadores.containsKey(codigo)){
            List<Trabajador> listaTrabajadores = new ArrayList<>(trabajadores.get(codigo));

            if(listaTrabajadores.size() > 0){
                System.out.println(listaTrabajadores);

            } else {
                System.out.println("NO HAY NINGÚN TRABAJADOR ASOCIADO A ESTE OFERTA");
            }

        } else {
            System.out.println("NO EXISTE NINGUNA OFERTA CON ESE CÓDIGO");

        }
    }

    public void mostrarTrabajdoresXEdad(Integer codigo){
        if (trabajadores.containsKey(codigo)){
            List<Trabajador> listaTrabajadores = new ArrayList<>(trabajadores.get(codigo));

            if(listaTrabajadores.size() > 0){
                Collections.sort(listaTrabajadores, new Comparator<Trabajador>() {
                    @Override
                    public int compare(Trabajador o1, Trabajador o2) {

                        return o1.getEdad() - o2.getEdad();
                    }
                });

                System.out.println(listaTrabajadores);

            } else {
                System.out.println("NO HAY NINGÚN TRABAJADOR ASOCIADO A ESTE OFERTA");
            }

        } else {
            System.out.println("NO EXISTE NINGUNA OFERTA CON ESE CÓDIGO");
        }
    }

    public int cantidadOfertas(String dni){
        Collection<Set<Trabajador>> conjunto = trabajadores.values();
        Integer cantidad = 0;

        Iterator it = conjunto.iterator();

        while(it.hasNext()){
            Set<Trabajador> trabajadores = (Set<Trabajador>) it.next();

            for (Trabajador t:trabajadores) {
                if(t.getDni().equals(dni)){
                    cantidad++;
                }
            }
        }

        return cantidad;
    }

//    public void mostrarOfertas(){
//        List<Oferta> listaOfertas = new ArrayList<>(trabajadores.get());
//
//        System.out.println(listaOfertas);
//
//    }

    public void guardarDatos(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sae.dat"));
            Collection<Set<Trabajador>> conjunto = trabajadores.values();

            Iterator it = conjunto.iterator();

            while(it.hasNext()){
                Set<Trabajador> trabajadores = (Set<Trabajador>) it.next();

                for (Trabajador t:trabajadores) {
                    oos.writeObject(t);
                }
            }

            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void cargarDatos(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sae.dat"));

            while(true){
            Trabajador t = (Trabajador) ois.readObject();
            Oferta o = (Oferta) ois.readObject();

            addTrabajador(o.getCodigo(), t);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
