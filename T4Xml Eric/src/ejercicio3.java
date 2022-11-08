import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;

    public class ejercicio3 {
        private static final String XATACA = "https://www.xataka.com/sitemap_index.xml";

        public static void main(String[] args) {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            try {

                dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

                DocumentBuilder db = dbf.newDocumentBuilder();

                Document doc = db.parse(XATACA);

                doc.getDocumentElement().normalize();

                System.out.println("Element:" + doc.getDocumentElement().getNodeName());
                System.out.println("-------------------------------------------------------------------------------------");

                NodeList list = doc.getElementsByTagName("sitemap");

                for (int temp = 0; temp < list.getLength(); temp++) {
                    Node node = list.item(temp);

                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) node;

                        String url_loc = element.getElementsByTagName("loc").item(0).getTextContent();
                        System.out.println(url_loc);

                        Document doc2 = db.parse(url_loc);

                        URL url = new URL(url_loc);
                        System.out.println("La ruta es: "+url.getPath());
                        String path = url.getPath();
                        File DIR = new File("C:/Usuaris/DAM.DESKTOP-GO77QJ7/IdeaProjects/T4Xml Eric/src/ejercicio3"+path);

                        if (!DIR.exists()){
                            DIR.mkdir();
                        }

                        Document DOCX = db.parse(url_loc);

                        System.out.println("La segona URL es: " + doc2.getDocumentElement().getNodeName());

                        NodeList list_node = doc2.getElementsByTagName("url");

                        for (int v2 = 0; v2 < list_node.getLength(); v2++) {
                            Node nude = list_node.item(v2);

                            if (node.getNodeType() == Node.ELEMENT_NODE) {
                                Element elemento2 = (Element) nude;

                                String url_loc2 = elemento2.getElementsByTagName("loc").item(0).getTextContent();

                                System.out.println("La segona URL = " + url_loc2);

                                URL url2 = new URL(url_loc);
                                System.out.println("La ruta es: " + url2.getPath());

                                try (PrintStream DOCX2 = new PrintStream("C:/Usuaris/DAM.DESKTOP-GO77QJ7/IdeaProjects/T4Xml Eric/src/ejercicio3"+path+".txt")) {
                                    DOCX2.println(url_loc2);
                                }
                            }
                        }
                    }
                }

            } catch (ParserConfigurationException | SAXException | IOException e) {
                e.printStackTrace();
            }
        }
    }

