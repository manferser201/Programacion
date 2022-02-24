package com.company;

import java.util.Arrays;
import java.util.Calendar;

public class Vivienda extends Propiedad implements PrecioVenta{
    private Integer numBanios;
    private Integer numHabitaciones;
    private Integer capMaxima;
    private Double precio;
    private Persona[] personas;
    private Calendar fecha;

    public Vivienda(Integer year, String direccion, Integer mCuadrados, Integer numBanios, Integer numHabitaciones, Integer capMaxima, Double precio) {
        super(year, direccion, mCuadrados);
        this.numBanios = numBanios;
        this.numHabitaciones = numHabitaciones;
        this.capMaxima = capMaxima;
        this.precio = precio;
        this.personas = new Persona[0];
    }

    public Integer getNumBanios() {
        return numBanios;
    }

    public void setNumBanios(Integer numBanios) {
        this.numBanios = numBanios;
    }

    public Integer getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(Integer numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public Integer getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(Integer capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" +
                "Número de Baños: " + numBanios + "\n" +
                "Número de Habitaciones: " + numHabitaciones +  "\n" +
                "Capacidad máxima de personas: " + capMaxima + "\n" +
                "Precio: " + precio + "€" + "\n" +
                "Personas viviendo: " + Arrays.toString(personas) + "\n";
    }

    
    @Override
    String mostrarPropiedad() {
        fecha = Calendar.getInstance();
        return "Fecha llamada: " + fecha.getTime() + "\n" +
                "Clase donde se realiza la llamada: Vivienda" + "\n" +
                toString();
    }
    
    public boolean addPersona (Persona persona){
        
        if (personas.length + 1 <= capMaxima){
            personas = Arrays.copyOf(personas, personas.length + 1);
            personas[personas.length - 1] = persona;
            
            return true;
        }
        
        return false;
    }
    
    public boolean eliminarPersona (Persona persona){
        
        if (esta(persona)){
            Persona[] resultado = new Persona[0];

            for (int i = 0; i < personas.length; i++) {
                if (!personas[i].equals(persona)){
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = personas[i];
                }
            }

            personas = resultado;
            return true;
        }
        
        return false;
    }
    
    private boolean esta (Persona persona){

        for (Persona c: this.personas) {
            if (c.equals(persona)){
                return true;
            }
        }
        
        return false;
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una Vivienda con una capacidad máxima de " + capMaxima + " personas y valgo " + precio + "€");
    }
}
