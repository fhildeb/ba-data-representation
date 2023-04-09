package model;

public class SinglePrice {

	public double betrag;
	public String waehrung;
	
	
	public Einzelpreis() {};
	public Einzelpreis(double betrag, String waehrung) {
	}
	
	public double getBetrag() {
		return betrag;
	}
	public String getWaehrung() {
		return waehrung;
	}
	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}
	public void setWaehrung(String waehrung) {
		this.waehrung = waehrung;
	}
}
