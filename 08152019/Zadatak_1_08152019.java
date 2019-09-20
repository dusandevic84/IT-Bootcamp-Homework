package Vezbanje1;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int meni;
		do {
			System.out.println("Izaberite geometrijsko telo");
			System.out.println("1 - Kocka");
			System.out.println("2 - Kvadar");
			System.out.println("3 - Valjak");
			System.out.println("4 - Lopta");
			System.out.println("0 - Izlaz");
			meni = sc.nextInt();
			double a, b, c, r, H;
			switch (meni) {
			case 1:
				System.out.print("Unesite vrednost a= ");
				a = sc.nextDouble();
				if (a>0) {
				System.out.println("Povrsina kocke je: P= " + (6 * a * a));
				} else {
					System.out.println("Pogresan unos!!! Stranica mora biti veca od 0");
				}
				break;
			case 2:
				System.out.println("Za izracunavanje povrsine kvadra unesite stranice a,b i c");
				System.out.print("Unesite vrednost a= ");
				a = sc.nextDouble();
				System.out.print("Unesite vrednost b= ");
				b = sc.nextDouble();
				System.out.print("Unesite vrednost c= ");
				c = sc.nextDouble();
				if (a>0 & b>0 & c>0) {
				System.out.println("Povrsina kvadra je: P= " + (2 * (a * b + a * c + b * c)));
				} else {
					System.out.println("Pogresan unos!!! Vrednost stranica mora biti veca od 0");
				}
				break;
			case 3:
				System.out.println("Za izracunavanje povrsine valjka unesite poluprecnik r i visinu valjka H");
				System.out.print("Unesite poluprecnik baze r= ");
				r = sc.nextDouble();
				System.out.print("Unesite visinu valjka H= ");
				H = sc.nextDouble();
				if (r>0 & H>0) {
				System.out.println("Povrsina valjka je: P= " + ((2 * r * r * 3.14) + (2 * r * 3.14 * H)));
				} else {
					System.out.println("Pogresan unos!!! Vrednost poluprecnika i visine valjka mora biti veca od 0");	
				}
				break;
			case 4:
				System.out.println("Za izracunavanje povrsine lopte unesite poluprecnik lopte r");
				System.out.print("Unesite poluprecnik lopte r= ");
				r = sc.nextDouble();
				if (r>0) {
				System.out.println("Povrsina lopte je: P= " + (4 * r * r * 3.14));
				} else {
					System.out.println("Pogresan unos!!! Vrednost poluprecnika mora biti veca od 0");
				}
				break;
			case 0:
				System.out.println("Izlaz iz programa");
				break;
			default:
				System.out.println("Pogresan unos");
				break;
			}

		} while (meni != 0);

	}

}
