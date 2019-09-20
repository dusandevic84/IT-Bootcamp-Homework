package Poljoprivreda;

public class GlavniProgram {

	public static void main(String[] args) {
	

		Parcela p1 = new Suma(15.85, 10.45, 85.4, 3);
		Parcela p2 = new Suma(85.15, 75, 105, 2);
		Parcela p3 = new Njiva(19.25, 58.35);
		Parcela p4 = new Njiva(74.75, 15.24);

		System.out.println(p1 + "\n");
		System.out.println(p2 + "\n");
		System.out.println(p3 + "\n");
		System.out.println(p4+"\n");

		((Njiva) p3).setPrinos(25.34);
		
		System.out.println(p1 + "\n");
		System.out.println(p2 + "\n");
		System.out.println(p3 + "\n");
		System.out.println(p4+"\n");
		

	}
}