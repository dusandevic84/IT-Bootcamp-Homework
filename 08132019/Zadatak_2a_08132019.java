package Domaci;

import java.util.Scanner;

public class Zadatak_2a_08132019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int br=1;
		int zbir=0;
		while (br<5) {
			zbir+=br;
			br++;
		}
		System.out.println("Zbir brojeva od 1 do 5 je: " + zbir );
	}

}
