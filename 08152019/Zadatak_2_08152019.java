package Domaci;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n=sc.nextInt();
		int x=0, y=1;
		System.out.print(x);
		System.out.print(" " +y);
		for(int i=1,sum;i<=n-2;i++) {
			sum=x+y;
			x=y;
			y=sum;
			System.out.print(" " + sum);
		}
		
	}

}
