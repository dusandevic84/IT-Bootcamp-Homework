package Domaci;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		// rastuci.
		// Primer1 niza: 3 54 123 18
		// Ispis: Niz nije rastuci.
		// Primer2 niza: 71 422 1001 5050
		// Ispis: Niz je rastuci.
		System.out.print("Unesite n za duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];

		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite " + i + " clan niza: ");
			niz[i] = sc.nextInt();
		}
		boolean provera = true;
		for (int i = 0; i < niz.length - 1; i++) {
			if (niz[i] > niz[i + 1]) {
				provera = false;
				break;
			}
		}
				if (provera == true) {
				System.out.println("Niz je rastuci");
			} else {
				System.out.println("Niz nije rastuci");
			}

	}

}
