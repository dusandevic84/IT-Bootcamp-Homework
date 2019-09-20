package Domaci;

import java.util.Scanner;

public class Zadatak_2_08122019 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite n:");
		int n=sc.nextInt();
		int br=0;
		int Zbirparnih=0;
		int Proizvodneparnih=1;
		while(br<=n){
			if (br%2==0) { 
				Zbirparnih+=br;
				}
				else {
				Proizvodneparnih*=br;
			   }
			 br+=1;
		}
				System.out.println("Zbir parnih brojeva od 0 do n je: " + Zbirparnih);
				System.out.println("Proizvod neparnih brojeva od 0 do n je: " + Proizvodneparnih);
		}

}
