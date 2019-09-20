package Domaci;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava tri cela broja i metodu koja ispisuje brojeve
		// od prvog do drugog (ukljucujuci i njih) koji su deljivi trecim
		Scanner sc = new Scanner(System.in);
		int[] niz = new int[3];
		ucitajNiz(niz);
		vratiDeljive(niz);
	}

	public static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite " + i + " element niza: ");
			niz[i] = sc.nextInt();
		}
	}

	public static void vratiDeljive(int[] niz) {
		for (int i = 0; i < niz.length-1; i++) {
			if ( niz[i] % niz[2] == 0) {
				System.out.print(niz[i]+" ");
				
			}

		}

	}

}
