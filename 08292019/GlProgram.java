package Fakultet_domaci;

public class GlProgram {

	public static void main(String[] args) {
		Student s1 = new Student("Dusan", "Devic", 1984, 1, 8.45);
		Student s2 = new Student("Marko", "Markovic", 1985, 2, 8.54);
		Student s3 = new Student("Pera", "Peric", 1995, 3, 7.24);
		Profesor p1 = new Profesor("Uca", "Skolic", 1965, "Prof dr.");
		Profesor p2 = new Profesor("Zbirko", "Sveznalic", 1978, "asistent");
		p1.addPredmet("Srpski jezik");
		p1.addPredmet("Knjizevnost");
		p2.addPredmet("Matematika");
		p2.addPredmet("Fizika");

		System.out.println(p1.ispisi());
		System.out.println(p2.ispisi());
		System.out.println(s1.ispisi());
		System.out.println(s2.ispisi());
		System.out.println(s3.ispisi());

		p2.izbaciPredmet("Fizika");
		s2.setIme("Dragan");
		s3.setPrezime("Markovic");
		p1.setIme("Streberko");
		
		System.out.println(p1.ispisi());
		System.out.println(p2.ispisi());
		System.out.println(s1.ispisi());
		System.out.println(s2.ispisi());
		System.out.println(s3.ispisi());

	}

}
