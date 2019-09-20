package Domaci;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava ceo broj n. Taj broj n se prosledjuje metodi
		// koja formira i vraca ceo broj koji predstavlja inverzan broj. Glavni program
		// nakon toga ispisuje taj inverzan broj.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();
		System.out.println("Inverzan broj broja " + n + " je: " + inverzan(n));

	}

	public static int inverzan(int n) {
		int inv = 0;
		int pomocni = 0;
		while (n != 0) {
			pomocni = n % 10;
			n /= 10;
			inv *= 10;
			inv += pomocni;
		}
		return inv;
	}
}
