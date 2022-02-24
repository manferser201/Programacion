package com.company;

import java.util.Comparator;
import java.util.Objects;

abstract class Propiedad implements Comparable<Propiedad>{
    private Integer Year;
    private String direccion;
    private Integer mCuadrados;
    private static Integer NUMPROPIEDADES = 0;

    public Propiedad(Integer year, String direccion, Integer mCuadrados) {
        Year = year;
        this.direccion = direccion;
        this.mCuadrados = mCuadrados;
        NUMPROPIEDADES ++;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getmCuadrados() {
        return mCuadrados;
    }

    public void setmCuadrados(Integer mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public static Integer getNUMPROPIEDADES() {
        return NUMPROPIEDADES;
    }

    public static void setNUMPROPIEDADES(Integer NUMPROPIEDADES) {
        Propiedad.NUMPROPIEDADES = NUMPROPIEDADES;
    }

    @Override
    public String toString() {
        return  "Año fabricacion: " + Year + "\n" +
                "Direccion: " + direccion + "\n" +
                "Metros Cuadrados: " + mCuadrados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propiedad propiedad = (Propiedad) o;
        return direccion.equals(propiedad.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion);
    }

    abstract String mostrarPropiedad();

    @Override
    public int compareTo(Propiedad propiedad) {
        return this.mCuadrados - propiedad.getmCuadrados();
    }

}
