package Ucionica;

public class GlProgram {

	public static void main(String[] args) {
		Polaznik p1=new Polaznik("Dusan Devic");
		Laptop l1=new Laptop("Toshiba Satelite",p1);
		System.out.println(l1.ispisi());
		
	}

}
