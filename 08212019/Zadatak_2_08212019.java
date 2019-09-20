package Domaci;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		// redosledom.
		// Primer niza: 3 54 123 18
		// Ispis: 18 123 54 32
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi vrednost n za duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite " + i + " clan niza: ");
			niz[i] = sc.nextInt();
		}
		System.out.println("Obrnuti niz je: ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print( niz[i]+" ");
		}
	
	}

}