package model;

public class Haendler {

	public String name;
	public String ort;
	public String plz;
	public String strasse;
	public String hausnummer;
	
	public Haendler(String name, String ort, String plz, String strasse, String hausnummer) {
	}
	
	public Haendler() {};
	
	public String getName() {
		return name;
	}
	public String getOrt() {
		return ort;
	}
	public String getPlz() {
		return plz;
	}
	public String getStrasse() {
		return strasse;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
}
