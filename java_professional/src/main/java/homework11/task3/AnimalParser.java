package homeworkk11.task3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class AnimalParser {
    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\BVA\\IdeaProjects\\java_professional\\src\\main\\java\\homeworkk11\\task3\\Animal.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(file);

            Element root = doc.getDocumentElement();

            System.out.println("Root = " + root.getNodeName());

            NodeList nodes = root.getChildNodes();

            for (int i = 0; i < nodes.getLength(); i++){
                Node node = nodes.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;

                    System.out.println(" ");

                    System.out.println("Name " + element.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Age " + element.getElementsByTagName("age").item(0).getTextContent());
                    System.out.println("Name " + element.getElementsByTagName("breed").item(0).getTextContent());
                }
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
