package CikaZubar;

public class Pacijent extends Covek {
	//Pacijent je covek kojeg je moguce ispisati u formatu: P_COVEK
	

	public Pacijent(String ime, String jmbg) {
		super(ime, jmbg);
		
	}
	
	public String toString() {
		return "P_"+super.toString();
	}
	

}
