package model;

public class Item {

	public String bezeichnung;
	public int Menge;
	public SinglePrice Einzelpreis;
	public String getBezeichnung() {
		return bezeichnung;
	}
	public int getMenge() {
		return Menge;
	}
	public SinglePrice getEinzelpreis() {
		return Einzelpreis;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public void setMenge(int menge) {
		Menge = menge;
	}
	public void setEinzelpreis(SinglePrice einzelpreis) {
		Einzelpreis = einzelpreis;
	}
}
