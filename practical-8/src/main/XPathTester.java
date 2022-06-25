package main;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class XPathTester {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) throws Exception
	{
		System.out.println("Demo XPathTester");
		
		String expression ="";
				
		String xmlFile = "./Biblio_mit_XSD.xml";
		
		expression = "/biblio/buch[@buch_id='_00002']/*";
		
		SAXReader reader = new SAXReader();
		
		Document doc = reader.read(xmlFile);
		
		List nodes = doc.selectNodes(expression);
		
		Object a[] = nodes.toArray();
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] instanceof Node) 
			{
				Node n = (Node) a[i];
				String nodeInfo = Integer.toString(i+1) + ". " + getNodeTypeAsString(n)+ "<"
					+ n.getName() + "> Wert = [" + n.getStringValue() + "]";
				System.out.println(nodeInfo);
			}
			
			if (a[i] instanceof Number)
			{
				System.out.println("Number-Wert: " + a[i].toString());
			}
			
			if(a[i] instanceof String)
			{
				System.out.println("String-Wert: " + a[i].toString());
			}
			
			if (a[i] instanceof Boolean)
			{
				System.out.println("Boolean-Wert: " + a[i].toString());
			}
		}
	}
	
	static String getNodeTypeAsString(Node currentNode)
	{
		String typeString = "";
		
		switch (currentNode.getNodeType()) 
		{
		case Node.DOCUMENT_NODE:
			typeString = "Dokumentknoten";
			break;
		case Node.ELEMENT_NODE:
			typeString = "Elementknoten";
			break;
		case Node.ATTRIBUTE_NODE:
			typeString = "Attributknoten";
			break;
		case Node.TEXT_NODE:
			typeString = "Textknoten";
			break;
		case Node.PROCESSING_INSTRUCTION_NODE:
			typeString = "Namespace-Knoten";
			break;
		case Node.NAMESPACE_NODE:
			typeString = "Namespace-Knoten";
			break;
		case Node.COMMENT_NODE:
			typeString = "Kommentarknoten";
			break;
		default:
			typeString = "(unbekannt)";
		}
		return typeString;		
	}
}
