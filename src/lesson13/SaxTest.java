package lesson13;

import java.io.IOException;
import java.util.jar.Attributes;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		final SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
		final MyHandler	handler = new MyHandler();
		
		saxParser.parse(SaxTest.class.getResourceAsStream("test.xml"), handler);
	}

	private static class MyHandler extends DefaultHandler {
		private StringBuilder text = new StringBuilder();

	    @Override
	    public void characters(char[] ch, int start, int length) throws SAXException {
			text.append(ch,start,length);
	    }

	    @Override
	    public void startDocument() throws SAXException {
	        System.err.println("Start doc...");
	    }

	    @Override
	    public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) throws SAXException {
	    	System.err.println("Start tag: "+qName+", attr="+attributes.getValue("age"));
	    	text.setLength(0);
	    }

	    @Override
	    public void endElement(String uri, String localName, String qName) throws SAXException {
	    	System.err.println("End tag: "+qName+", value="+text);
	    }
	    
	    @Override
	    public void endDocument() throws SAXException {
	        System.err.println("End doc...");
	    }
	}
}
