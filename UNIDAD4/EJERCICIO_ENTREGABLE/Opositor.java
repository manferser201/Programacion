package u4.entregable.ejercicio;

import java.util.Objects;

public class Opositor {
    private String nombre;
    private String apellidos;
    private Integer anioNacimiento;
    private Boolean adaptacion;
    private String descAdaptacion;
    private static Integer OPOSITOR = 0;
    private static Integer OPOSITOR_ADAPTACION = 0;

    public Opositor(String nombre, String apellidos, Integer anioNacimiento, Boolean adaptacion, String descAdaptacion) {

        if (adaptacion){
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.anioNacimiento = anioNacimiento;
            this.adaptacion = adaptacion;
            this.descAdaptacion = descAdaptacion;

            OPOSITOR_ADAPTACION += 1;
        } else {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.anioNacimiento = anioNacimiento;
            this.adaptacion = adaptacion;

            OPOSITOR += 1;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(Integer anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public Boolean getAdaptacion() {
        return adaptacion;
    }

    public void setAdaptacion(Boolean adaptacion) {
        this.adaptacion = adaptacion;
    }

    public String getDescAdaptacion() {
        return descAdaptacion;
    }

    public void setDescAdaptacion(String descAdaptacion) {
        this.descAdaptacion = descAdaptacion;
    }

    public static Integer getOPOSITOR() {
        return OPOSITOR;
    }

    public static Integer getOpositorAdaptacion() {
        return OPOSITOR_ADAPTACION;
    }

    public void mostrar_informacion(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {

        if (adaptacion) {
            return "Nombre: " + nombre + "" + apellidos + "\n" +
                    "Año de Nacimiento: " + anioNacimiento + "\n" +
                    "Adaptacion: " + adaptacion + "\n" +
                    "Descripcion de la Adaptacion: " + descAdaptacion + "\n";
        } else {
            return  "Nombre: " + nombre + "" + apellidos + "\n" +
                    "Año de Nacimiento: " + anioNacimiento + "\n" +
                    "Adaptacion: " + adaptacion + "\n";

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opositor opositor = (Opositor) o;
        return nombre.equals(opositor.nombre) && apellidos.equals(opositor.apellidos) && anioNacimiento.equals(opositor.anioNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, anioNacimiento);
    }
}
