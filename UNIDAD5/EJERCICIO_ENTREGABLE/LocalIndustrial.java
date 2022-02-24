package com.company;

import java.util.Calendar;

public class LocalIndustrial extends Local implements PrecioVenta{
    private Integer consumo;
    private Calendar fecha;

    public LocalIndustrial(Integer year, String direccion, Integer mCuadrados, Persona propietaria, Double precio, Integer consumo) {
        super(year, direccion, mCuadrados, propietaria, precio);
        this.consumo = consumo;
    }

    public Integer getConsumo() {
        return consumo;
    }

    public void setConsumo(Integer consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return  "Consumo Máximo: " + consumo + "\n" +
                super.toString();
    }

    @Override
    String mostrarPropiedad() {
        fecha = Calendar.getInstance();
        return "Fecha llamada: " + fecha.getTime() + "\n" +
                "Clase donde se realiza la llamada: Local Industrial" + "\n" +
                toString();
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un Local Industrail con un consumo máximo de " + consumo + " y valgo " + getPrecio() + "€");
    }
}
