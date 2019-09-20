package Domaci;

import java.util.Scanner;

public class Zadatak_3_08162019 {

	public static void main(String[] args) {
		// Naci djelitelje unesenog broja.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int n=sc.nextInt();
		int br=0;
		System.out.println("Broj " + n + " je deljiv sa sledecim brojevima: " );
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				br += br;
				System.out.print(i+" ");
			}
			
		}

	}
}
