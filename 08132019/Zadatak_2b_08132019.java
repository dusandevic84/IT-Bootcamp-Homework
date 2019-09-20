package Domaci;

import java.util.Scanner;

public class Zadatak_2b_08132019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n=sc.nextInt();
		int br=0;
		int zbir=0;
		while (br<=n) {
			zbir+=br;
			br++;
		}
		System.out.println("Zbir brojeva od 1 do n je: " + zbir );
	}

}
