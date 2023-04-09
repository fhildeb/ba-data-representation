package model;

import java.util.List;

public class Invoice {

	public String id;
	public String datum;
	public List<Item> kaufliste;
	public Dealer haendler;
	
	public Rechnung() {}
	
	public String getId() {
		return id;
	}
	public String getDatum() {
		return datum;
	}
	public List<Item> getKaufliste() {
		return kaufliste;
	}
	public Dealer getHaendler() {
		return haendler;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public void setKaufliste(List<Item> kaufliste) {
		this.kaufliste = kaufliste;
	}
	public void setHaendler(Dealer heandler) {
		this.haendler = heandler;
	}
}
