package main;

import org.w3c.dom.*;
import org.apache.xerces.parsers.DOMParser;

public class XMLDomReader {
	
	public static void main(String[] args)
	{
		System.out.println("Demo XML-DOM auslesen");
		
		DemoXmlDomReader dom = new DemoXmlDomReader();
		
		String path = "./templates/";
		String xmlFile = "library-with-xml.xml";
		
		Document doc = dom.domRead(path + xmlFile, false);
		
		Node startNode = doc.getDocumentElement();
		dom.show(startNode, 1);
	}
	
	public Document domRead( String xmlFile, boolean isValidate)
	{
		DOMParser domParser = new DOMParser();
		try
		{
			domParser.setFeature("http://xml.org/sax/features/validation", isValidate);
			
			domParser.setFeature("http://apache.org/xml/features/dom/include-ignorable-whitespace", false);
			
			String propertySchemaLanguage="http://java.sun.com/xml/jaxp/properties/schemaLanguage";
			String w3cSchema = "http://www.w3.org/2001/XMLSchema";
			
			domParser.setFeature("http://apache.org/xml/features/validation/schema", isValidate);
			domParser.setProperty(propertySchemaLanguage, w3cSchema);
			
			domParser.parse(xmlFile);
			System.out.println("DOM-parsing erfolgreich");
			
			String rootElement = domParser.getDocument().getDocumentElement().getNodeName();
			System.out.println("Das Wurzelelement heisst: " + rootElement);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return domParser.getDocument();
	}
	
	void show(Node node, int level) 
	{
		NamedNodeMap al = node.getAttributes();
		if(al != null) 
		{
			for(int i=0; i < al.getLength(); i++)
			{
				Node attrNode=al.item(i);
				
				String attribInfo = "AttributName ["+ attrNode.getNodeName() + "] Wert [" + attrNode.getNodeValue() +"]";
				for(int l=0; l < level;l++)
					System.out.print("   ");
				System.out.println(attribInfo);
			}
		}
		
		NodeList nl = node.getChildNodes();
		for (int i=0; i < nl.getLength(); i++)
		{
			Node ndChild = nl.item(i);
			String nodeInfo = Integer.toString(level) +"." +Integer.toString(i+1)+". ElementName ["
			+ ndChild.getNodeName()+"] Wert ["+ ndChild.getNodeValue() + "]";
			
			for(int l=0; l < level; l++)
				System.out.print("   ");
			System.out.println(nodeInfo);
			
			if(ndChild.getNodeType() == 3)
			{
				for(int l=0; l<level;l++)
					System.out.print("  ");
				System.out.println("Inhalt: ["+ndChild.getTextContent()+"]");
			}
			show(ndChild, level+1);
		}
		
	}
}
