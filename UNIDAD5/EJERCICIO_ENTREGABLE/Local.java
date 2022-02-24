package com.company;

abstract class Local extends Propiedad{
    private Persona propietaria;
    private Double precio;

    public Local(Integer year, String direccion, Integer mCuadrados, Persona propietaria, Double precio) {
        super(year, direccion, mCuadrados);
        this.propietaria = propietaria;
        this.precio = precio;
    }

    public Persona getPropietaria() {
        return propietaria;
    }

    public void setPropietaria(Persona propietaria) {
        this.propietaria = propietaria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "Persona propietaria: " + propietaria + "\n" +
                "Precio: " + precio + "\n" +
                super.toString();
    }
}
