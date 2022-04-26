package com.company;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Oferta {
    private Integer codigo;
    private String descripcion;
    private Boolean cubierto = false;

    public Oferta(Integer codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getCubierto() {
        return cubierto;
    }

    public void setCubierto(Boolean cubierto) {
        this.cubierto = cubierto;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                ", codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cubierto=" + cubierto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oferta oferta = (Oferta) o;
        return codigo.equals(oferta.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
