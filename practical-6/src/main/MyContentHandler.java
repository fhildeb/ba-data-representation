package main;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class MyContentHandler implements ContentHandler {

	Locator myLocator = null;
	
	public void setDocumentLocator(Locator locator)
	{
		this.myLocator = locator;
	}

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Dokument gestartet ab Zeile "+ myLocator.getLineNumber());
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("Dokument beendet auf Zeile "+ myLocator.getLineNumber());
		
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		System.out.println("Namespace-Beginn: "+ prefix + "URI: " + uri);
		
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		System.out.println("Namespace-Ende: "+ prefix);
		
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		System.out.println("Element <" + qName + "> gestartet ab Zeile "+ myLocator.getLineNumber());
		
		for(int i=0; i<atts.getLength(); i++)
		{
			System.out.println("Attribut-Name: "+atts.getQName(i));
		}
		
	}

	public void startElement()
	{
		System.out.println("Element gestartet ab Zeile "+ myLocator.getLineNumber());
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("Element <" + qName + "> beendet auf Zeile "+ myLocator.getLineNumber());
		
		
	}
	
	public void endElement()
	{
		System.out.println("Element beendet auf Zeile "+ myLocator.getLineNumber());
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String text = new String(ch, start, length);
		System.out.println("TextContent: {"+text+"}");
		
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		String text = new String(ch, start, length);
		System.out.println("IgnorableWhitespaceContent: {"+text+"}");
		
	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {
		System.out.println("PI-Target: "+target);
		
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		System.out.println("Entity erkannt");
		
	}
	
}
