package CikaZubar;

public class GlavniProgram {

	public static void main(String[] args) {
		Covek c1 = new Pacijent("Petar", "156484");
		c1.dodajNovac(15);
		System.out.println(c1);
		c1.oduzmiNovac(12);
		System.out.println(c1);
		

	}

}
