package com.company;

import java.util.Calendar;

public class EquipamientoServicio extends Propiedad{
    private TipoServicio tipo;
    private Calendar fecha;

    public EquipamientoServicio(Integer year, String direccion, Integer mCuadrados, TipoServicio tipo) {
        super(year, direccion, mCuadrados);
        this.tipo = tipo;
    }

    public TipoServicio getTipo() {
        return tipo;
    }

    public void setTipo(TipoServicio tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  "Tipo de Servicios: " + tipo + "\n" +
                super.toString();
    }

    @Override
    String mostrarPropiedad() {
        fecha = Calendar.getInstance();
        return "Fecha llamada: " + fecha + "\n" +
                "Clase donde se realiza la llamada: Equipamiento Servicios" + "\n" +
                toString();
    }
}
