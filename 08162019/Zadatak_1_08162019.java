package Domaci;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		// Generisati 2 cijela broja i ako je prvi veci od drugog izracunati im zbir i
		// razliku,
		// inace izracunati proizvod i kolicnik.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj a: ");
		int a = sc.nextInt();
		System.out.println("Unesite broj b: ");
		int b = sc.nextInt();
		double x = (double)a / (double)b;

		if (a > b) {
			System.out.println("Zbir brojeva " + a + " i " + b + " je: " + (a + b) + " Razlika brojava " + a + " i " + b
					+ " je: " + (a - b));
		} else {
			System.out.println("Proizvod brojeva " + a + " i " + b + " je: " + (a * b) + " Kolicnik brojeva " + a
					+ " i " + b + " je: " + x);
		}
	}

}
