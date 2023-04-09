package model;

public class Gegenstand {

	public String bezeichnung;
	public int Menge;
	public Einzelpreis Einzelpreis;
	public String getBezeichnung() {
		return bezeichnung;
	}
	public int getMenge() {
		return Menge;
	}
	public Einzelpreis getEinzelpreis() {
		return Einzelpreis;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public void setMenge(int menge) {
		Menge = menge;
	}
	public void setEinzelpreis(Einzelpreis einzelpreis) {
		Einzelpreis = einzelpreis;
	}
}
