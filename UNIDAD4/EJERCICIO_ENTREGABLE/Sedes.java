package u4.entregable.ejercicio;

import java.util.Arrays;

public class Sedes {
    private String codigoSede;
    private Ciudad ciudad;
    private Opositor[] opositores;


    public Sedes(String codigoSede, Ciudad ciudad) {
        this.codigoSede = codigoSede;
        this.ciudad = ciudad;
        this.opositores = new Opositor[0];
    }

    public String getCodigoSede() {
        return codigoSede;
    }

    public void setCodigoSede(String codigoSede) {
        this.codigoSede = codigoSede;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }


    public void addOpositor(Opositor opositor){

        if (!esta(opositor)) {
            Opositor[] resultado = Arrays.copyOf(opositores, opositores.length + 1);
            resultado[resultado.length - 1] = opositor;

            opositores = resultado;
        }
    }

    public boolean deleteOpositor(Opositor opositor){

        if (esta(opositor)){

            Opositor[] resultado = new Opositor[0];

            for (int i = 0; i < opositores.length; i++) {
                if (!opositores[i].equals(opositor)){
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = opositores[i];
                }
            }

            opositores = resultado;
            return true;
        }

        return false;
    }

    public boolean esta(Opositor opositor){

        for (int i = 0; i < opositores.length; i++) {
            if (opositores[i].equals(opositor)){
                return true;            }
        }

        return false;
    }

    public void mostrar_informacion(){
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return  "Codigo Sede: " + codigoSede + '\n' +
                "Ciudad: " + ciudad + '\n' +
                "Opositores: " + Arrays.toString(opositores);
    }
}
