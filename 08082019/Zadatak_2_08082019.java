package pp;

import java.util.Scanner;

public class Zadatak_2_08082019 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi a: ");
		double a=ulaz.nextDouble();
		System.out.println("Unesi b: ");
		double b=ulaz.nextDouble();
		if(a>0 && b>0) {
			System.out.println("Obim je: " + (2*a+2*b));
			System.out.println("Povrsina je: " + a*b);
		}else {
			System.out.println("Stranice a i b moraju biti pozitivne vrednosti");
		}
		System.out.println("Kraj programa");
	
	}

}
