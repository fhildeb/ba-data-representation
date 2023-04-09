package main;

import model.Rechnungsliste;

public class Main {

	public static void main(String[] ars)
	{
		String pfad = "./invoice-data.json";
		
		JsonTester test = new JsonTester(pfad);
		
		Rechnungsliste liste = test.leseJSONinRechnungsliste();
		test.zeigeRechnungslisteAn(liste);
		
		String datenPfad = "./invoice-structure.json";
		String schemaPfad = "./invoice-schema.json";
	
		SchemaValidierer validierer = new SchemaValidierer();
		boolean istGueltig = validierer.validiereJsonSchema(datenPfad, schemaPfad);
		
		if(istGueltig)
		{
			JsonTester test1 = new JsonTester(datenPfad);
			Rechnungsliste liste1 = test1.leseJSONinRechnungsliste();
			test1.zeigeRechnungslisteAn(liste1);
//			Auskommentiert lassen --> mehrmaliges ueberschreiben
//			liste.getRechnungen().add(test.erzeugeRechnung());
//			test.schreibeRechnungslisteInJSON(liste, datenPfad);
		}
		else
		{
			System.out.println("Fehler: Die Rechnungsliste wurde nicht eingelesen- da Schema ungueltig!");
		}
	}
}
