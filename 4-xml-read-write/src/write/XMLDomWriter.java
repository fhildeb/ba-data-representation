package write;

import org.apache.xerces.dom.DOMImplementationImpl;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.w3c.dom.ls.LSSerializer;

public class XMLDomWriter {

	public static void main(String[] args)
	{
		System.out.println("Demo DOM erzeugen und in eine XML-Datei schreiben");
		domWrite("file:./books.xml");
	}
	
	public static void writeXml(String XmlFile,Document doc)
	{
		DOMImplementationImpl domImpl= new DOMImplementationImpl();
		LSSerializer serializer = domImpl.createLSSerializer();
		DOMConfiguration config = serializer.getDomConfig();
		
		config.setParameter("format-pretty-print",true);
		
		serializer.setNewLine("\r\n");
		
		serializer.writeToURI(doc, XmlFile);
		System.out.println("fertig");
	}
	
	public static Document createDom()
	{
		Document doc= null;
		
		DOMImplementationImpl domImpl = new DOMImplementationImpl();
		
		doc = domImpl.createDocument(null, "buecher", null);
		
		DocumentType docType= domImpl.createDocumentType("buecher", null, "books.dtd");
		doc.appendChild(docType);
		
		Element elBuch = doc.createElement("buch");
		Attr attrIsbn = doc.createAttribute("isbn_nr");
		attrIsbn.setNodeValue("1234-1234-1234");
		elBuch.setAttributeNode(attrIsbn);
		elBuch.setAttribute("buch_id", "_0001");
		
		Element elAutor = doc.createElement("autor");
		Text tnAutor = doc.createTextNode("Mustermann, Max");
		elAutor.appendChild(tnAutor);
		
		Element elTitel = doc.createElement("titel");
		Text tnTitel = (Text) doc.createTextNode("XML in a Nutshell");
		elTitel.appendChild(tnTitel);
		
		Element elVerlag = doc.createElement("verlag");
		Text tnVerlag = doc.createTextNode("Springer");
		elVerlag.appendChild(tnVerlag);
		
		Comment comment = doc.createComment("Notiz");
		
		elBuch.appendChild(comment);
		elBuch.appendChild(elVerlag);
		elBuch.appendChild(elAutor);
		elBuch.appendChild(elTitel);
		
		doc.getDocumentElement().appendChild(elBuch);
		
		return doc;
	}
	
	public static void domWrite(String xmlFile)
	{
		writeXml(xmlFile, createDom());
	}
}
