package Poljoprivreda;

public abstract class Parcela {
	// Parcela ima jedinstven automatski generisan celobrojan identifikator i zadatu
	// povrsinu(u kvadratnim metrima) prilikom kreiranja. Mogu da joj se dohvate
	// sadrzani podaci, kao i jednoslovna vrsta(char). Moze da joj se odredi prinos
	// u periodu zadatom brojem godina. Moze da se sastavi tekstualni opis u obliku
	// VRSTA-ID[POVRSINA].
	public static int genID = 0;
	protected double povrsina;
	protected int id;

	public Parcela(double povrsina) {
		super();
		this.povrsina = povrsina;
		this.id = ++genID;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public int getId() {
		return id;
	}

	public abstract char getVrsta();

	@Override
	public String toString() {
		return getVrsta() + " - " + id + " Povrsina parcele je [" + povrsina + " m2] ";
	}

}
