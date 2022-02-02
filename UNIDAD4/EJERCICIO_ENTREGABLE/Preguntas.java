package u4.entregable.ejercicio;
import java.util.Arrays;
import java.util.Objects;

public class Preguntas {
    private String enunciado;
    private Opciones[] opciones;
    private static final Integer CAPACIDAD_MAX = 3;

    public Preguntas(String enunciado) {
        this.enunciado = enunciado;
        this.opciones = new Opciones[0];
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Opciones[] getOpciones() {
        return opciones;
    }

    public void setOpciones(Opciones[] opciones) {
        this.opciones = opciones;
    }


    public void addOpcion(Opciones opcion){

        if (!esta(opcion)) {
            Opciones[] resultado = Arrays.copyOf(opciones, opciones.length + 1);
            resultado[resultado.length - 1] = opcion;

            opciones = resultado;
        }
    }

    public boolean deleteOpcion(Opciones opcion){

        if (esta(opcion)){

            Opciones[] resultado = new Opciones[0];

            for (int i = 0; i < opciones.length; i++) {
                if (!opciones[i].equals(opcion)){
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = opciones[i];
                }
            }

            opciones = resultado;
            return true;
        }

        return false;
    }

    public boolean esta(Opciones opcion){

        for (int i = 0; i < opciones.length; i++) {
            if (opciones[i].equals(opcion)){
                return true;            }
        }

        return false;
    }

    public void mostrar_informacion(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return  enunciado + Arrays.toString(opciones) + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preguntas preguntas = (Preguntas) o;
        return enunciado.equals(preguntas.enunciado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enunciado);
    }
}
