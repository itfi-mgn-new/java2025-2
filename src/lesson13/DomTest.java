package lesson13;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerFactoryConfigurationError, TransformerException, XPathExpressionException {
		// TODO Auto-generated method stub
		final DocumentBuilder	builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		final Document 			doc = builder.parse(DomTest.class.getResourceAsStream("test.xml"));
		
		doc.getDocumentElement().normalize();
		
		final NodeList	list = doc.getElementsByTagName("person");
		
		for(int index = 0; index < list.getLength(); index++) {
			final Element	node = (Element)list.item(index);
			
			System.err.println("(1) Family: "+node.getElementsByTagName("family").item(0).getTextContent()
					+", age="+node.getAttribute("age"));
		}
		
		final XPath 	xPath = XPathFactory.newInstance().newXPath();
		final String 	expression = "/*/person[@age='21']";
		
		final NodeList 	list2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);		
		
		for(int index = 0; index < list2.getLength(); index++) {
			final Element	node = (Element)list2.item(index);
			
			System.err.println("(2) Family: "+node.getElementsByTagName("family").item(0).getTextContent()
					+", age="+node.getAttribute("age"));
		}
		
		final Element family = doc.createElement("family");
		final Element name = doc.createElement("name");
		
		family.setTextContent("abyrvalg");
		name.setTextContent("masha");
		
		final Element person = doc.createElement("person");
		person.appendChild(family);
		person.appendChild(name);
		person.setAttribute("age", "35");
		
		doc.getDocumentElement().appendChild(person);
		
		final DOMSource 	dom = new DOMSource(doc);
		final Transformer 	transformer = TransformerFactory.newInstance().newTransformer();

	    final StreamResult	result = new StreamResult(System.err);
	    
	    transformer.transform(dom, result);		
	}
}
