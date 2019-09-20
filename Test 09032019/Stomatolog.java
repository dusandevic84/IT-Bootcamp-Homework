package CikaZubar;

public class Stomatolog extends Covek {
	//Stomatolog je covek kojeg je moguce ispisati u formatu: S_COVEK
	
	public Stomatolog(String ime, String jmbg) {
		super(ime, jmbg);

	}

	public String toString() {
		return "S_" + super.toString();
	}

}
