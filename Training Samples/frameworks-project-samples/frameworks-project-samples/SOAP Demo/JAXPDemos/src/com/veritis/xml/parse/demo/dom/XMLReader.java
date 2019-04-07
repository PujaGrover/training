package com.veritis.xml.parse.demo.dom;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReader {

    public static void main(String argv[]) {
        try {
            File file = new File("venkata.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Root element " + doc.getDocumentElement().getNodeName());
            NodeList empnodeLst = doc.getElementsByTagName("employee");
            System.out.println("Information of all employees"+empnodeLst);
            for (int s = 0; s < empnodeLst.getLength(); s++) {
                Node empNode = empnodeLst.item(s);
                if (empNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element empElement = (Element) empNode;
                    NodeList firstNameNodeList = empElement.getElementsByTagName("firstname");
                    Node firstNameNode=firstNameNodeList.item(0);
                    Element firstNameElement = (Element)firstNameNode;
                    NodeList firstNameValuesNode = firstNameElement.getChildNodes();
                    System.out.println("First Name : " + ((Node) firstNameValuesNode.item(0)).getNodeValue());
                    NodeList lstNmNodeLst = empElement.getElementsByTagName("lastname");
                    Element lstNmElmnt = (Element) lstNmNodeLst.item(0);
                    NodeList lstNmValueNodes = lstNmElmnt.getChildNodes();
                    System.out.println("Last Name : " + ((Node) lstNmValueNodes.item(0)).getNodeValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
