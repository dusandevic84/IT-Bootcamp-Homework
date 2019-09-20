package Domaci;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		int a=3, b=6, c=9;
		
		//post inkrementa
		
		a = b++ + c++; /* zbirb i c se prvo upisuju u a, pa im se zatim povecavaju vrednosti za 1
		 				a=15; b=7; c=10
		 				*/
		b = a++ + c++; /* zbir a i c se prvo upisuje u b, a zatim se povecavaju vrednosti a i c za 1
						a=16; b=25; c=11
		 				*/
		//pre inkramenta
		
		c = ++b - ++a; /* vrednost b i a uvecava se za 1, pa se njihova razlika dodeljuju varijabli c
		                  a=17; b=26; c=9
		                  */
		a = ++b - ++c; /* vrednost b i c uvecava se za 1, pa se njihova razlika dodeljuju varijabli a
		 					a=17; b=27; c=10 */
		
		//post dekrament
		
		b = a-- - c--; /* razlika a i c se prvo upisuje u b, a zatim se umanjuju vrednosti a i c za 1
						a=16; b=7; c=9 */
		c= b-- + a--; /* zbir b i a se prvo upisuje u c, a zatim se umanjuju vrednosti b i a za 1
						a=15; b=6; c=23 */
		
		//pre dekrement
		
		c = --b + --a; /* vrednost b i a se umanjuje za 1, a zatim se njihov zbir dodeljuje promenljivoj c
							a=14; b=5; c=19 */
		a = --c - --b; /* vrednost c i b se umanjuje za 1, a zatim se njihova razlika dodeljuje promenljivoj a
							a=18; b=4; c=22 */
		
		System.out.println(" a: " + a + " b: " + b + " c: " + c);
		

	}

}
