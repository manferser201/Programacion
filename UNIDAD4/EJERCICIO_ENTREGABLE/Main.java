package u4.entregable.ejercicio;

public class Main {

    public static void main(String[] args) {
        Examen e1 = new Examen("Sevilla", "http://www.consejeriadesevilla.com");

        Sedes s1 = new Sedes("10325", Ciudad.SEVILLA);
        Sedes s2 = new Sedes("16953", Ciudad.SEVILLA);

        Opositor op1 = new Opositor("Manuel", "Fernández Serrano", 2001, false, "");
        Opositor op2 = new Opositor("Pepe", "Pérez Ríos", 2002, true, "Necesita una adpatacion");
        Opositor op3 = new Opositor("Rosa", "Jaén Cabello", 2002, true, "También necesita una adpatacion");
        Opositor op4 = new Opositor("Jaime", "Raḿirez Cuellar", 2001, false, "Necesita una adpatacion");

        Preguntas p1 = new Preguntas("Pluto es ... ");
        Preguntas p2 = new Preguntas("Thor es ... ");

        Opciones o1 = new Opciones("un raton", false);
        Opciones o2 = new Opciones("un gato", false);
        Opciones o3 = new Opciones("un perro", true);
        Opciones o4 = new Opciones("el dios del trueno", true);
        Opciones o5 = new Opciones("el hijo de Odín", true);
        Opciones o6 = new Opciones("el mejor amigo de Thanos", false);

        p1.addOpcion(o1);
        p1.addOpcion(o2);
        p1.addOpcion(o4);

        p2.addOpcion(o3);
        p2.addOpcion(o5);
        p2.addOpcion(o6);

        p1.deleteOpcion(o4);
        p1.addOpcion(o3);

        p2.deleteOpcion(o3);
        p2.addOpcion(o4);

        s1.addOpositor(op1);
        s1.addOpositor(op2);

        s2.addOpositor(op3);
        s2.addOpositor(op4);

        e1.addPreguntas(p1);
        e1.addPreguntas(p2);

        e1.addSedes(s1);
        e1.addSedes(s2);

        e1.mostrar_informacion();

    }
}
