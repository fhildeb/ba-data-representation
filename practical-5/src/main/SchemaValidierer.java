package main;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.core.report.ProcessingMessage;
import com.github.fge.jsonschema.core.report.ProcessingReport;

public class SchemaValidierer {

	public boolean validiereJsonSchema(String datenPfad, String schemaPfad)
	{
		JsonNode schemaNode = null;
		JsonNode datenNode = null;
		JsonSchema schema = null;
		
		try {
			ObjectMapper obm = new ObjectMapper();
			schemaNode = obm.readTree(new File(schemaPfad));
			datenNode = obm.readTree(new File(datenPfad));
			schema = JsonSchemaFactory.byDefault().getJsonSchema(schemaNode);
		}
		catch(Exception e){
			System.out.println("Fehler: " + e.getMessage());
		}
		
		try {
			ProcessingReport report = schema.validate(datenNode);
			if(!report.isSuccess())
			{
				System.out.println("Daten im Schema ungueltig!");
				for(ProcessingMessage message : report) {
					System.out.println(message);
				}
			}
			else
			{
				System.out.println("Daten im Schema gueltig!");
				return true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Fehler bei Schema-Verarbeitung: " + e.getMessage() );
		}
		
		return false;
	}
}
