package homeworkk11.task2;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Task2 {
    public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
        File file = new File("C:\\Users\\BVA\\IdeaProjects\\java_professional\\src\\main\\java\\homeworkk11\\task2\\XMLCity.xml");
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream(file));

        writer.writeStartDocument("1.0");

        writer.writeStartElement("city");
        writer.writeAttribute("size", "Medium");
        writer.writeCharacters("Donetsk");

        writer.writeStartElement("street");
        writer.writeCharacters("Shaposhnikova");

        writer.writeStartElement("House");
        writer.writeCharacters("18");

        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument();

        writer.flush();
        writer.close();

    }
}
