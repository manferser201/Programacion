package com.company;

import java.util.Calendar;

public class LocalComercial extends Local implements PrecioVenta{
    private String descripcion;
    private Calendar fecha;

    public LocalComercial(Integer year, String direccion, Integer mCuadrados, Persona propietaria, Double precio, String descripcion) {
        super(year, direccion, mCuadrados, propietaria, precio);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  "Actividad a la que se dedica: " + descripcion + '\n' +
                super.toString();
    }

    @Override
    String mostrarPropiedad() {
        fecha = Calendar.getInstance();
        return "Fecha llamada: " + fecha.getTime() + "\n" +
                "Clase donde se realiza la llamada: Local Comercial" + "\n" +
                toString();
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un Local Comercial que me dedico a " + descripcion + " y valgo " + getPrecio() + "€");
    }
}
