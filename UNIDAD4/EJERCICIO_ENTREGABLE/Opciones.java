package u4.entregable.ejercicio;

public class Opciones {

    private String texto;
    private Boolean respuesta;

    public Opciones(String texto, Boolean respuesta) {
        this.texto = texto;
        this.respuesta = respuesta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Boolean getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Boolean respuesta) {
        this.respuesta = respuesta;
    }

    public void mostrar_informacion(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return  texto + " " +
                "Respuesta: " +  respuesta + "\n";
    }
}
