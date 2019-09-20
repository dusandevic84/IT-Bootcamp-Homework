package Biblioteka;

public class GlavniProgram {

	public static void main(String[] args) {
		
		Knjige k1 = new Knjige("Na Drini cuprija", "Ivo Andric", 318);
		k1.setGodIzdanja(1945);
		System.out.println("Naziv romana: " + k1.getNaziv() + " - Pisac: " + k1.getAutor() + " - br. strana: "
				+ k1.getBrStrana() + " - godina izdanja: " + k1.getGodIzdanja());
		
		System.out.println();

		Knjige k2 = new Knjige("Seobe", "Milos Crnjanski", 274);
		k2.setGodIzdanja(1929);
		System.out.println("Naziv romana: " + k2.getNaziv() + " - Pisac: " + k2.getAutor() + " - br. strana: "
				+ k2.getBrStrana() + " - godina izdanja: " + k2.getGodIzdanja());
		
		System.out.println();

		Knjige k3 = new Knjige("Koreni", "Dobrica Cosic", 376);
		k1.setGodIzdanja(1954);
		System.out.println("Naziv romana: " + k3.getNaziv() + " - Pisac: " + k3.getAutor() + " - br. strana: "
				+ k3.getBrStrana() + " - godina izdanja: " + k3.getGodIzdanja());
	}

}
