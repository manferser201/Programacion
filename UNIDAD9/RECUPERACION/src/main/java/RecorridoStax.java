import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class RecorridoStax {
    public static void main(String[] args) {

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("empleados.xml"));

            String tagActual = "";
            Integer numEmpleados = 0, edades = 0;
            ArrayList<Empleado> empleados = new ArrayList<>();

            while(xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if(xmlEvent.isStartElement()){
                    StartElement se = xmlEvent.asStartElement();

                    switch (se.getName().getLocalPart()){
                        case "NSS":
                            tagActual = "NSS";
                            break;
                        case "empleado":
                            tagActual = "empleado";
                            numEmpleados++;
                            break;
                        case "apellidos":
                            tagActual = "apellidos";
                            break;
                        case "direccion":
                            tagActual = "direcion";
                            break;
                        case "email":
                            tagActual = "email";
                            break;
                        default: break;
                    }
                } else if(xmlEvent.isCharacters()){
                    Characters caracter = xmlEvent.asCharacters();


                    switch(tagActual){
                        case "empleado":

                            break;

                    }
                }

                System.out.println("LA MEDIA DE EDADES ES DE " + (edades / numEmpleados));

            }
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
