import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

    public class ejercicio1 {
        private static final String XATACA = "https://www.xataka.com/sitemap_index.xml";

        public static void main(String[] args) {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            try {

                dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document doc = db.parse(XATACA);

                doc.getDocumentElement().normalize();

                System.out.println("Element:" + doc.getDocumentElement().getNodeName());
                System.out.println("-------------------------------------------");
                NodeList list = doc.getElementsByTagName("sitemap");

                for (int temp = 0; temp < list.getLength(); temp++) {
                    Node node = list.item(temp);

                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) node;
                        String url_loc = element.getElementsByTagName("loc").item(0).getTextContent();
                        System.out.println(url_loc);
                    }
                }

            } catch (ParserConfigurationException | SAXException | IOException e) {
                e.printStackTrace();
            }
        }
    }

