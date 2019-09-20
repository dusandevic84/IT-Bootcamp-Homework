package Domaci;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava niz od n celih brojeva i dve metode. Prva
		// metoda vraca proizvod elemenata na neparnim pozicijama, a druga vraca zbir
		// parnih elemenata niza.
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite n za duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		ucitajNiz(niz);
		System.out.println("Proizvod elemenata niza na neparnim pozicijama je: " + proizvod(niz));
		System.out.println("Zbir parnih elemenata niza je: " + zbir(niz));

	}

	public static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite " + (i + 1) + " element niza: ");
			niz[i] = sc.nextInt();
		}
	}

	public static int proizvod(int[] niz) {
		int proiz = 1;
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 == 0) {
				proiz *= niz[i];
			}
		}
		return proiz;
	}

	public static int zbir(int[] niz) {
		int sum = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				sum += niz[i];
			}
		}
		return sum;
	}
}