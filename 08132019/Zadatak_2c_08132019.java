package Domaci;

import java.util.Scanner;

public class Zadatak_2c_08132019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj k: ");
		int k=sc.nextInt();
		System.out.println("Unesite broj n: ");
		int n=sc.nextInt();
		int zbir=0;
		while (k<=n) {
			zbir+=k;
			k++;
		}
		System.out.println("Zbir brojeva od k do n je: " + zbir );
	}

}