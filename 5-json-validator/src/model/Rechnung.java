package model;

import java.util.List;

public class Rechnung {

	public String id;
	public String datum;
	public List<Gegenstand> kaufliste;
	public Haendler haendler;
	
	public Rechnung() {}
	
	public String getId() {
		return id;
	}
	public String getDatum() {
		return datum;
	}
	public List<Gegenstand> getKaufliste() {
		return kaufliste;
	}
	public Haendler getHaendler() {
		return haendler;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public void setKaufliste(List<Gegenstand> kaufliste) {
		this.kaufliste = kaufliste;
	}
	public void setHaendler(Haendler heandler) {
		this.haendler = heandler;
	}
}
