package Fakultet_domaci;

public class Student extends Covek {
	// Student je covek koji se kreira sa brojem indeksa i ima trenutnu godinu
	// studija i trenutni prosek. Sva polja mogu samo da se dohvate.
	// Studenta ispisati u formatu: Ime_Prezime[godina rodjenja] je student ___ (god
	// studija) godine studija sa prosekom____ (trenutni prosek).

	private static int UnivBrIndeksa = 0;
	public int brIndeksa;
	public int godStudija;
	public double prosek;

	public Student(String ime, String prezime, int godinaRodjenja, int godStudija, double prosek) {
		super(ime, prezime, godinaRodjenja);
		this.godStudija = godStudija;
		this.prosek = prosek;
		brIndeksa = ++UnivBrIndeksa;
	}

	public int getBrIndeksa() {
		return brIndeksa;
	}

	public int getGodStudija() {
		return godStudija;
	}

	public double getProsek() {
		return prosek;
	}

	public String ispisi() {
		return ime + "_" + prezime + "[" + godinaRodjenja + "] broj indeksa "+brIndeksa + " je student" + " " + godStudija
				+ " godine studija sa prosekom " + prosek;
	}

}
