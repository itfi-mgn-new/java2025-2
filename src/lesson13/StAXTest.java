package lesson13;

import javax.xml.namespace.QName;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StAXTest {

	public static void main(String[] args) throws XMLStreamException, FactoryConfigurationError {
		// TODO Auto-generated method stub
		final XMLEventReader 	reader = XMLInputFactory.newInstance().createXMLEventReader(StAXTest.class.getResourceAsStream("test.xml"));
		final StringBuilder		sb = new StringBuilder(); 

		while (reader.hasNext()) {
			final XMLEvent 	event = reader.nextEvent();
			
			switch (event.getEventType()) {
				case XMLStreamConstants.START_DOCUMENT :
					System.err.println("Start doc...");
					break;
				case XMLStreamConstants.START_ELEMENT :
					System.err.println("Start tag: "+((StartElement)event).getName()+", age="+((StartElement)event).getAttributeByName(QName.valueOf("age")));
					sb.setLength(0);
					break;
				case XMLStreamConstants.CHARACTERS :
					sb.append(((Characters)event).getData());
					break;
				case XMLStreamConstants.END_ELEMENT :
					System.err.println("End tag: "+((EndElement)event).getName()+", value="+sb);
					break;
				case XMLStreamConstants.END_DOCUMENT :
					System.err.println("End doc...");
					break;
			}
		}
		
		final XMLStreamWriter writer = XMLOutputFactory.newInstance().createXMLStreamWriter(System.err);

		writer.writeStartDocument();
		    writer.writeStartElement("persons");
			    writer.writeStartElement("person");	writer.writeAttribute("age", "21");
				    writer.writeStartElement("family");
				    	writer.writeCharacters("ivanoff");
				    writer.writeEndElement();
				    
				    writer.writeStartElement("name");
				    	writer.writeCharacters("ivan");
				    writer.writeEndElement();
			    writer.writeEndElement();
		    writer.writeEndElement();
		writer.writeEndDocument();
		writer.flush();
	}
}
