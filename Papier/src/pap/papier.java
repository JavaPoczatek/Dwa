package pap;

import java.util.Scanner;
import java.util.Random;

public class papier {
	
	private static Scanner in;

	public static void main(String[] args) 
	{
		int gracz = wyb�r();
		int komp = los();
		
		System.out.println("Komputer wybra�: " + komp + ".");
		
		if (gracz == komp)
		{
			System.out.println("Wynik: Remis.");
		} 
		else if ((gracz == 1 && komp == 3) || (gracz == 2 && komp == 1) || (gracz == 3 && komp == 2))
		{
			System.out.println("Wynik: Wygra�e�.");
		}
		else 
		{
			System.out.println("Wynik: Przegra�e�.");
		}
	}
	 
	public static int wyb�r()
	{
		in = new Scanner(System.in);
		System.out.println("Wybierz: Kamie�-1, Papier-2, No�yce-3? ");
		int wyb�r = in.nextInt();
		int a = 0;
		 
		switch (wyb�r)
		{
			case 1:
				a = 1;
				System.out.println("Wybra�e�: Kamie�");
				break;
			
			case 2:
				a = 2;
				System.out.println("Wybra�e�: Papier");
				break;
			
			case 3:
				a = 3;
				System.out.println("Wybra�e�: No�yce");
				break;
			
			default:
				System.out.println("Wybra�� chujow� opcje.");
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
