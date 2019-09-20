package CikaZubar;

public abstract class Covek {
	// Covek poseduje naziv, jedinstveni automatski identifikator, JMBG i novac.
	// Naziv i JMBG se zadaju prilikom kreiranja. Svi sadrzani podaci mogu samo da
	// se dohvate. Novac moze da se doda i da se oduzme, gde je povratna vrednost
	// indikator uspesnosti oduzimanja/dodavanja novca. Moze da se sastavi
	// tekstualni zapis u obliku: NAZIV[ID:JMBG:NOVAC]

	public static int UID = 0;
	private String ime; // ime coveka
	private String jmbg;
	private int id;
	private double novac;

	public Covek(String ime, String jmbg) {
		super();
		this.ime = ime;
		this.jmbg = jmbg;
		id = ++UID;
	}

	public String getIme() {
		return ime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public int getId() {
		return id;
	}

	public double getNovac() {
		return novac;
	}

	public  void dodajNovac(double novac) {
		if (novac > 0) {
			this.novac += novac;
		}
	}

	public  void oduzmiNovac(double plati) {
		if (plati > 0 && plati < novac) {
			this.novac -= plati;
		}else {
			System.out.println("Nemate dovoljno para za ovu uslugu");
		}
	}

	public static int getUID() {
		return UID;
	}

	// tekstualni zapis u obliku: NAZIV[ID:JMBG:NOVAC]
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime).append("[").append(id).append(": ").append(jmbg).append(": ").append(getNovac()).append("]");
		return sb.toString();
	}

}
