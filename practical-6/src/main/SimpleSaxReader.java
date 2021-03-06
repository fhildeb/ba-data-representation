package main;

import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class SimpleSaxReader {

	XMLReader reader = null;
	
	String xmlFile = null;
	
	public SimpleSaxReader(String xmlFile)
	{
		String driverName = "org.apache.xerces.parsers.SAXParser";
		
		try
		{
			reader = XMLReaderFactory.createXMLReader(driverName);
			
		}
		catch(SAXException saxex)
		{
			System.out.println(saxex.getMessage());
		}
		this.xmlFile = xmlFile;
		setFeatures();
	}
	
	private void setFeatures()
	{
		try
		{
			reader.setFeature("http://xml.org/sax/featuresvalidation", true);
			reader.setFeature("http://apache.org/xml/features/validation/schema", true);
			
			String propertySchemaLanguage="http://java.sun.com/xml/jaxp/properties/schemaLanguage";
			String w3cSchema = "http://www.w3.org/2001/XMLSchema";
			reader.setProperty(propertySchemaLanguage, w3cSchema);
		}
		catch(Exception ex)
		{
			ex.getMessage();
		}
	}
	
	public void run()
	{
		try
		{
			reader.parse(xmlFile);
			
			System.out.println("SAX-Parsen erfolgreich");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void setContentHandler(ContentHandler specialContentHandler)
	{
		reader.setContentHandler(specialContentHandler);
	}
	
	public void setErrorHandler(ErrorHandler myErrorHandler)
	{
		reader.setErrorHandler(myErrorHandler);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Demo XML-SAX-Reader");
		
		String path ="./Biblio_mit_XSD.xml";
		
		SimpleSaxReader mySaxReader = new SimpleSaxReader(path);
		mySaxReader.setContentHandler(new MyContentHandler());
		mySaxReader.setErrorHandler(new MyErrorHandler());
		mySaxReader.run();	
	}
}
