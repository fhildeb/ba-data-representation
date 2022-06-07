package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import model.Einzelpreis;
import model.Gegenstand;
import model.Haendler;
import model.Rechnung;
import model.Rechnungsliste;

public class JsonTester {

	private String json_pfad;
	
	public JsonTester(String dateipfad)
	{
		this.json_pfad = dateipfad;
	}
	
	public Rechnungsliste leseJSONinRechnungsliste()
	{
		Rechnungsliste liste = null;
		
		try {
			ObjectMapper obm = new ObjectMapper();
			liste = obm.readValue(new File(json_pfad), Rechnungsliste.class);
	
			return liste;
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return liste;
	}
	
	public void zeigeRechnungslisteAn(Rechnungsliste liste) 
	{
		for(int i=0; i<liste.getRechnungen().size(); i++)
		{
			Rechnung r = liste.getRechnungen().get(i);
			
			String ausgabe = "**************Rechnung, ID: " + r.getId() + "**************/n";
			ausgabe+= "Datum: " + r.getDatum() + "\n";
			ausgabe+= "Kaufliste /n";
			
			for(int j=0; j<r.getKaufliste().size(); j++)
			{
				Gegenstand g = r.getKaufliste().get(j);
				ausgabe += "  ->"+
				g.getMenge() + "x "+
				g.getBezeichnung() + ", "+
				g.getEinzelpreis().getBetrag()+ " "+
				g.getEinzelpreis().getWaehrung()+ "\n";
			}
			
		System.out.println(ausgabe);
		}
		
	}
	
	public Rechnung erzeugeRechnung()
	{
		Rechnung r = new Rechnung();
		
		r.setId("004");
		r.setDatum("2018-08-31");
		
		List<Gegenstand> kaufliste = new ArrayList<Gegenstand>();
		
		Gegenstand g1 = new Gegenstand();
		g1.setBezeichnung("SUSA Mainboard M121");
		g1.setMenge(1);
		g1.setEinzelpreis(new Einzelpreis(99.99, "euro"));
		
		Gegenstand g2 = new Gegenstand();
		g2.setBezeichnung("MDA Prozessor K7 3,0 Ghz");
		g2.setMenge(1);
		g2.setEinzelpreis(new Einzelpreis(315.50, "euro"));
		
		Gegenstand g3= new Gegenstand();
		g3.setBezeichnung("CoolAir Gehäuselüfter AZ001");
		g3.setMenge(4);
		g3.setEinzelpreis(new Einzelpreis(15.99, "euro"));
		
		kaufliste.add(g1);
		kaufliste.add(g2);
		kaufliste.add(g3);
	
		r.setKaufliste(kaufliste);
		r.setHaendler(new Haendler("Elektroladen", "Mittweida", "09648", "Hauptstrasse", "45a"));
		
		return r;
	}
	
	public void schreibeRechnungslisteInJSON(Rechnungsliste r, String pfad)
	{
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
		try {
			writer.writeValue(new File(pfad), r);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
