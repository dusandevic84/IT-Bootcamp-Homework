package CikaZubar;

import java.util.ArrayList;
import java.util.List;

//Ordinacija poseduje naziv, listu stomatologa, listu pacijenata,
//cenu usluge kao i stanje racuna. Naziv i cena  se zadaju prilikom kreiranja i 
//mogu samo da se dohvate. Moze da se dohvati/ukloni doktor. Moze da se dohvati/ukloni pacijent. 
//Moze da se dohvati broj pacijenata/doktora. Moze da se naplati usluga pacijentima, 
//ali ukoliko neki pacijent ne poseduje dovoljno novca ispisuje se poruka: “PACIJENT ide u zatvor”.
//Ordinacija takodje moze da isplati platu stomatolozima u zadatom iznosu,
//a povratna vrednost je indikator da li je plata uspesno isplacena.
//Moze da se sastavi tekstualni opis:

public class Ordinacija {
	private String ime;
	private double cenaUsluge;
	private double stanjeRacuna;
	private List<Stomatolog> zubar = new ArrayList<>();
	private List<Pacijent> mucenik = new ArrayList<>();

	public Ordinacija(String ime, double cenaUsluge) {
		super();
		this.ime = ime;
		this.cenaUsluge = cenaUsluge;
	}

	public String getIme() {
		return ime;
	}

	public double getCenaUsluge() {
		return cenaUsluge;
	}

	public void dodajStomatologa(Stomatolog z) {
		zubar.add(z);
	}

	public void izbaciStomatologa(Stomatolog z) {
		zubar.remove(z);
	}

	public void dodajPacijenta(Pacijent p) {
		mucenik.add(p);
	}

	public void dodajStomatologa(Pacijent p) {
		mucenik.remove(p);
	}
	// Moze da se naplati usluga pacijentima,
	// ali ukoliko neki pacijent ne poseduje dovoljno novca ispisuje se poruka:
	// “PACIJENT ide u zatvor”.

	public void placanje(Pacijent p) {
		if (p.getNovac() >= cenaUsluge) {
			p.oduzmiNovac(cenaUsluge);
			stanjeRacuna+=cenaUsluge;
		} else
			System.out.println("Pacijent ide u zatvor");
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(ime).append(":").append(cenaUsluge).append("\nDOKTORI");
		for (Stomatolog z:zubar) {
			sb.append(z).append("\n");
		}
		sb.append("PACIJENTI\n");
		for(Pacijent p:mucenik) {
			sb.append(p).append("\n");
		}
		return sb.toString();
		
	}

}
