import java.util.Objects;

public class Empleado {
    private String NSS;
    private String nombre;
    private Integer edad;
    private String apellidos;
    private String direccion;
    private String email;

    public Empleado() {

    }

    public Empleado(String NSS, String nombre, Integer edad, String apellidos, String direccion, String email) {
        this.NSS = NSS;
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "NSS='" + NSS + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return NSS.equals(empleado.NSS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NSS);
    }
}
