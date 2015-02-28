package pap;

import java.util.Scanner;
import java.util.Random;

public class papier {
	
	private static Scanner in;

	public static void main(String[] args) 
	{
		int gracz = wybór();
		int komp = los();
		
		System.out.println("Komputer wybra³: " + komp + ".");
		
		if (gracz == komp)
		{
			System.out.println("Wynik: Remis.");
		} 
		else if ((gracz == 1 && komp == 3) || (gracz == 2 && komp == 1) || (gracz == 3 && komp == 2))
		{
			System.out.println("Wynik: Wygra³eœ.");
		}
		else 
		{
			System.out.println("Wynik: Przegra³eœ.");
		}
	}
	 
	public static int wybór()
	{
		in = new Scanner(System.in);
		System.out.println("Wybierz: Kamieñ-1, Papier-2, No¿yce-3? ");
		int wybór = in.nextInt();
		int a = 0;
		 
		switch (wybór)
		{
			case 1:
				a = 1;
				System.out.println("Wybra³eœ: Kamieñ");
				break;
			
			case 2:
				a = 2;
				System.out.println("Wybra³eœ: Papier");
				break;
			
			case 3:
				a = 3;
				System.out.println("Wybra³eœ: No¿yce");
				break;
			
			default:
				System.out.println("Wybra³êœ chujow¹ opcje.");
				break;
		 }
		 
		 return a; 
	 }
	 
	 public static int los()
	 {
		 Random rn = new Random();
		 int loskom = rn.nextInt(3)+1;
		 
		 return loskom;
	 }
}
