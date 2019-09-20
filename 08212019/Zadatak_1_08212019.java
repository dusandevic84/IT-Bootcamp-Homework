package Vezbanje1;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		// Korisnik ucitava niz od n elemenata niza, kao i neko broj br. Program
		// ispisuje elemente niza deljive brojem br.
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi vrednost n za duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		int j = 0;
		System.out.print("Unesi vrednost br: ");
		int br = sc.nextInt();
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite " + i + " clan niza: ");
			niz[i] = sc.nextInt();
		}
		System.out.print("Clanovi niza deljivi sa brojem "+br+" su: ");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0) {
				System.out.print(niz[i]+" ");
			}

		}

	}

}
