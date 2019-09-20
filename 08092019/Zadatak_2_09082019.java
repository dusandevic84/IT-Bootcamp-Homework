package parnibrojevi;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi Pravougaonik, Krug ili Kvadrat:");
		String a;
		a = sc.nextLine();
		switch (a) {
		case "pravougaonik":
		case "Pravougaonik":
			System.out.println("Unesi stranicu a: ");
		double stra=sc.nextDouble();
		System.out.println("Unesi stranicu b: ");
		double strb=sc.nextDouble();
		System.out.println("Povrsina pravouganika je: " + stra*strb); break;
		case "krug": 
		case "Krug": 
			System.out.println("Unesi poluprecnik kruga: ");
		double r=sc.nextDouble();
		System.out.println("Povrsina kruga je: " + 2*r*3.14); break;
		case "kvadrat" :
		case "Kvadrat" :
			System.out.println("Unesi stranicu kvadrata: ");
		double x=sc.nextDouble();
		System.out.println("Povrsina kvadrata je: " + x*x); break;
		default: System.out.println("Pogresan unos!!!");break; 
		
		}
		 
		
	      }
	   }
	
