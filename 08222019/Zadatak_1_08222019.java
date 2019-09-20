package Domaci;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		// Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		// metode(u mainu). Prva metoda vraca proizvod unetih brojeva. Druga metoda
		// ispisuje najmanji od unesenih brojeva.
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj a: ");
		double a = sc.nextDouble();
		System.out.print("Unesite broj b: ");
		double b = sc.nextDouble();
		System.out.print("Unesite broj c: ");
		double c = sc.nextDouble();
		double proiz = proizvod(a, b, c);
		System.out.println("Proizvod brojeva " + a + ", " + b + " i " + c + " je: " + proiz);
		System.out.println("Najmanji broj je: " + minimum(a, b, c));

	}

	public static double proizvod(double a, double b, double c) {
		double proiz = a * b * c;
		return proiz;
	}

	public static double minimum(double a, double b, double c) {
		double min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		return min;
	}

}
