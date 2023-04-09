package main;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class MyErrorHandler implements ErrorHandler {

	public void warning(SAXParseException ex) throws SAXException
	{
		System.out.println("!!! Warning!!! - Eine Warnung ist aufgetreten bei Parsen von Datei '"+ ex.getSystemId()
		+ "' in Zeile "+ ex.getLineNumber() + ": " +  ex.getMessage());
	}

	@Override
	public void error(SAXParseException ex) throws SAXException 
	{
		System.out.println("!!! Error!!! - Ein Error ist aufgetreten bei Parsen von Datei '"+ ex.getSystemId()
		+ "' in Zeile "+ ex.getLineNumber() + ": " +  ex.getMessage());
	
		
	}

	@Override
	public void fatalError(SAXParseException ex) throws SAXException 
	{
		System.out.println("!!! Fatal Error!!! - Ein schwerwiegender Fehler ist aufgetreten bei Parsen von Datei '"+ ex.getSystemId()
		+ "' in Zeile "+ ex.getLineNumber() + ": " +  ex.getMessage());
	
		throw ex;
		
	}
}
