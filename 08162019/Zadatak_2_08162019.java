package Domaci;

import java.util.Scanner;

public class Zadatak_2_08162019 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//	Prebrojati djeljive sa 3 u intervalu od 1 do n.
		System.out.println("Unesi n: ");
		int n=sc.nextInt();
		int br=0,i=1;
		while(i<=n) {
			if (i%3==0) {
				br+=1;
			}
			i++;
		}		
		System.out.println("Brojeva deljivih sa tri od 1 do n ukupno ima: " + br);
		
	}

}
