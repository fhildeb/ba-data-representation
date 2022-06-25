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

public class SimpleTransformer {

	public void transform() 
	{
		String inputFile = "./FirmenAdressen.xsl";
		String outputFile = "/Users/fhildebrandt/Documents/Eclipse/CreatedFiles/FirmenAdressen.html";
		String styleSheetFile = "./FirmenAdressen.xsl";
	
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
		XSimpleTransformer xform = new XSimpleTransformer();
		xform.transform();
	}
}
