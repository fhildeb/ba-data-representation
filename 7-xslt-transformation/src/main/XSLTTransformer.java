package main;

import java.io.File;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.xalan.processor.TransformerFactoryImpl;

public class XSLTTransformer {

	public void transform() 
	{
		String inputFile = "./addresses.xml";
		String outputFile = "./addresses.html";
		String styleSheetFile = "./addresses.xsl";
	
		try {
			TransformerFactory tFactory = new TransformerFactoryImpl();
			
			Source stylesheet = new StreamSource(new File(styleSheetFile));
			
			Transformer transformer = tFactory.newTransformer(stylesheet);
			
			transformer.setOutputProperty(OutputKeys.METHOD, "html");
			
			Source inputDoc = new StreamSource(new File(inputFile));
			
			Result outputDoc = new StreamResult(new File(outputFile));
			
			//Transformation durchfuehren
			
			transformer.transform(inputDoc, outputDoc);
			
			System.out.println("Erfolgreiche Transformation");
		}
		catch (TransformerException texi)
		{
			System.out.println(texi.getMessage());
		}
	}
	
	public static void main(String[] args)
	{
		XSLTTransformer xform = new XSLTTransformer();
		xform.transform();
	}
}
