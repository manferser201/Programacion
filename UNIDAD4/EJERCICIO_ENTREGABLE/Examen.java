package u4.entregable.ejercicio;
import java.util.Arrays;
import java.util.Calendar;

public class Examen {
    private Calendar fechaExamen;
    private String consejeria;
    private String url;
    private Preguntas[] preguntas;
    private Sedes[] sedes;
    private static final Integer MAX_PREGUNTAS = 100;


    public Examen(String consejeria, String url) {
        this.fechaExamen = Calendar.getInstance();
        this.consejeria = consejeria;
        this.url = url;
        this.preguntas = new Preguntas[0];
        this.sedes = new Sedes[0];
    }

    public Calendar getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(Calendar fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public String getConsejeria() {
        return consejeria;
    }

    public void setConsejeria(String consejeria) {
        this.consejeria = consejeria;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Preguntas[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas[] preguntas) {
        this.preguntas = preguntas;
    }

    public Sedes[] getSedes() {
        return sedes;
    }

    public void setSedes(Sedes[] sedes) {
        this.sedes = sedes;
    }


    public void addPreguntas(Preguntas pregunta){

        if (!estaPregunta(pregunta)) {
            Preguntas[] resultado = Arrays.copyOf(preguntas, preguntas.length + 1);
            resultado[resultado.length - 1] = pregunta;

            preguntas = resultado;
        }
    }

    public boolean deletePregunta(Preguntas pregunta){

        if (estaPregunta(pregunta)){

            Preguntas[] resultado = new Preguntas[0];

            for (int i = 0; i < preguntas.length; i++) {
                if (!preguntas[i].equals(pregunta)){
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = preguntas[i];
                }
            }

            preguntas = resultado;
            return true;
        }

        return false;
    }

    public boolean estaPregunta(Preguntas pregunta){

        for (int i = 0; i < preguntas.length; i++) {
            if (preguntas[i].equals(pregunta)){
                return true;            }
        }

        return false;
    }


    public void addSedes(Sedes sede){

        if (!estaPregunta(sede)) {
            Sedes[] resultado = Arrays.copyOf(sedes, sedes.length + 1);
            resultado[resultado.length - 1] = sede;

            sedes = resultado;
        }
    }

    public boolean deletePregunta(Sedes sede){

        if (estaPregunta(sede)){

            Sedes[] resultado = new Sedes[0];

            for (int i = 0; i < preguntas.length; i++) {
                if (!preguntas[i].equals(sede)){
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = sedes[i];
                }
            }

            sedes = resultado;
            return true;
        }

        return false;
    }

    public boolean estaPregunta(Sedes sede){

        for (int i = 0; i < preguntas.length; i++) {
            if (preguntas[i].equals(sede)){
                return true;            }
        }

        return false;
    }

    public void mostrar_informacion(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return  "Fecha de Examen: " + fechaExamen.getTime() + "\n" +
                "Consejeria: " + consejeria + "\n" +
                "URL: " + url + "\n" +
                "Preguntas: " + Arrays.toString(preguntas) + "\n" +
                "Sedes: " + Arrays.toString(sedes) + "\n" ;
    }
}
