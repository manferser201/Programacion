package com.company;

public class Comparsa extends AgrupacionOficial{
    private String empresaAtrzzo;

    public Comparsa(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integer puntos, String empresaAtrzzo) {
        super(nombre, autor, autorMusica, autorLetras, tipo, puntos);
        this.empresaAtrzzo = empresaAtrzzo;
    }

    public String getEmpresaAtrzzo() {
        return empresaAtrzzo;
    }

    public void setEmpresaAtrzzo(String empresaAtrzzo) {
        this.empresaAtrzzo = empresaAtrzzo;
    }

    @Override
    public String toString() {
        return "Comparsa -> " +
                super.toString() + '\n' +
                "Empresa de Atrzzo: " + empresaAtrzzo;
    }

    @Override
    void caminito_del_falla() {
        System.out.println("La COMPARSA " + super.getNombre() + " va caminito del falla");
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la COMPARSA con nombre " + super.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("La COMPARSA " + super.getNombre() + "va de " + super.getTipo());
    }

}
