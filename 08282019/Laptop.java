package Ucionica;

public class Laptop {
	// Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja. Marka
	// moze samo da se dohvati. Laptop takdje moze da menja polaznika ili da ostane
	// bez polaznika. Moze da se ispise u obliku: MARKA{POLAZNIK}
	
	public String marka;
	private Polaznik polaznik;
	
	public Laptop (String marka, Polaznik polaznik) {
		this.marka=marka;
		this.polaznik=polaznik;
	}

	public String getMarka() {
		return marka;
	}

	public Polaznik getPolaznik() {
		return polaznik;
	}
	public void sePolaznik(Polaznik polaznik) {
		this.polaznik = polaznik;
	}
	public void resetPolaznik() {
		polaznik=null;
	}
	public String ispisi() {
		String s;
		if(polaznik==null) {
			s="NEMA POLAZNIKA";
		}else {
			s=polaznik.ispisi();
		}
		return marka+"{"+s+"}";
	}
}
