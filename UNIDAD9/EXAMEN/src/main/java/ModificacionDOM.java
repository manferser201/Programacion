import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificacionDOM {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/java/restaurante.xml"));

            Node root = doc.getDocumentElement();

            NodeList platos = doc.getElementsByTagName("plato");

            //Leemos todos los elementos platos para poder trabajar con ellos
            for (int i = 0; i < platos.getLength(); i++) {

                if(doc.hasChildNodes()){
                    NodeList platsosHijos = doc.getChildNodes();

                    Element disponible = doc.createElement("disponible");
                    disponible.setTextContent("Si");

                    Node primerHijo = platsosHijos.item(0);

                    doc.insertBefore(disponible, primerHijo);
                }
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            //Declaramos el origen
            DOMSource origen = new DOMSource(root);

            //Declaramos el destino
            File ejercicio1 = new File("examen2.xml");
            StreamResult destino = new StreamResult(ejercicio1);

            //Realizamos la transformación
            transformer.transform(origen, destino);

        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            throw new RuntimeException(e);
        }

    }
}
