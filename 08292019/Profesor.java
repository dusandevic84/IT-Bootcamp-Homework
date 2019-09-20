package Fakultet_domaci;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Covek {
	// Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu.
	// Predmeti mogu da se dodaju i oduzimaju iz liste.
	// Profesora ispisati u formatu: Ime_Prezime[godina rodjenja] je ___(titula)
	// koji drzi nastavu na: <lista predmeta>.
	public String titula;
	List<String> predmeti;

	public Profesor(String ime, String prezime, int godinaRodjenja, String titula) {
		super(ime, prezime, godinaRodjenja);
		this.titula=titula;
		predmeti=new ArrayList<String>();

	}
	public void addPredmet(String predmet) {
		predmeti.add(predmet);
	}

	public void izbaciPredmet(String predmet) {
		 predmeti.remove(predmet);
	}
	public String ispisi() {
		return ime + "_" + prezime + "[" + godinaRodjenja + "] je "+titula + " koji drzi nastavu na predmetu/ima: " + predmeti;
				}

}
