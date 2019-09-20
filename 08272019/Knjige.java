package Biblioteka;

public class Knjige {
	// Napisati klasu Knjige koja ima sledeca polja: naziv knjige, autora, broj
	// strana, godinu izdanja. Sva polja mogu da se dohvate, a godina izdanja moze i
	// da se postavi.
	// Napisati glavni
	// program koji
	// kreira tri
	// knjige i
	// ispisuje sve
	// njihove podatke.

	private String nazivKnjige;
	private String autor;
	private int brStrana;
	private int godinaIzdanja;

	public Knjige(String nazivKnjige, String autor, int brStrana) {
		this.nazivKnjige = nazivKnjige;
		this.autor = autor;
		this.brStrana = brStrana;
	}

	public String getNaziv() {
		return nazivKnjige;
	}

	public String getAutor() {
		return autor;
	}

	public int getBrStrana() {
		return brStrana;
	}

	public int getGodIzdanja() {
		return godinaIzdanja;
	}

	public void setGodIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

}
