package Fakultet_domaci;

public class Covek {
	// Covek ima ime, prezime i godinu rodjenja. Ime i prezime mogu da se i dohvate
	// i postave, dok godina rodjenja moze samo da se dohvati.
	// Coveka ispisati u formatu: Ime_Prezime[godina rodjenja].

	protected String ime;// get i set
	protected String prezime;//get i set
	public int godinaRodjenja;//get
	
	//konstruktor
	public Covek(String ime, String prezime, int godinaRodjenja) {
		this.ime=ime;
		this.prezime=prezime;
		this.godinaRodjenja=godinaRodjenja;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}
	public String ispisi() {
		return ime+"_"+prezime+"["+godinaRodjenja+"]";
	}
	
}
