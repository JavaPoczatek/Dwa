package pap;

import java.util.Scanner;
import java.util.Random;



public class papier {
	 public static void main(String[] args) 
	 {
		 int wyb�rKomputera = los();
		 int wyb�rGracza = wyb�r();
		 System.out.println("wyb�r komputera " + wyb�rKomputera);
		 if (wyb�rGracza == wyb�rKomputera)
			 System.out.println("remis"); 
		 else if (wyb�rGracza == 1  && wyb�rKomputera == 2)
		 	System.out.println("Wygrywa Komputer");
		 else if (wyb�rGracza == 1  && wyb�rKomputera == 3)
			 	System.out.println("Wygrywa Gracz");
		 else if (wyb�rGracza == 2  && wyb�rKomputera == 1)
			 	System.out.println("Wygrywa Gracz");
		 else if (wyb�rGracza == 2  && wyb�rKomputera == 3)
			 System.out.println("Wygrywa Komputer");
		 else if (wyb�rGracza == 3  && wyb�rKomputera == 1)
			 System.out.println("Wygrywa Komputer");
		 else if (wyb�rGracza == 3  && wyb�rKomputera == 2)
			 System.out.println("Wygrywa Gracz");
		 
	 }
	 
	 public static int wyb�r()
	 {
			
			Scanner in = new Scanner(System.in);
			 
			
			System.out.println("Wybierz: Kamie�-1, Papier-2, No�yce-3? ");
			int wyb�r = in.nextInt();
			
			int a = 0;
			
			switch (wyb�r)
			{
			case 1:
				a = 1;
				System.out.println("Kamie� " + a);

			break;
			
			case 2:
				a = 2;
				System.out.print("Papier " + a);

			break;
			
			case 3:
				a = 3;
				System.out.println("No�yce " + a);
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
