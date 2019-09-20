package Domaci;

import java.util.Scanner;

public class Zadatak_3_08152019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vrednost n: ");
		int n = sc.nextInt();
		System.out.println("Unesite vrednost m: ");
		int m = sc.nextInt();
		for (int br = 1; br <= m; br++) {
			for (int i = 1; i <= n; i++) {
				System.out.print(" * ");
			}

			System.out.println();

		}

	}

}