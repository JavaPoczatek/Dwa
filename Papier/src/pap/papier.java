package pap;

import java.util.Scanner;
import java.util.Random;

public class papier {
	 public static void main(String[] args) 
	 {
		 wybór();
		 System.out.print(los());
	 }
	 
	 public static int wybór()
	 {

			
			Scanner in = new Scanner(System.in);
			 
			
			System.out.print("Wybierz: Kamieñ-1, Papier-2, No¿yce-3? ");
			int wybór = in.nextInt();
			
			int a = 0;
			
			switch (wybór)
			{
			case 1:
				a = 1;
				System.out.println("Kamieñ " + a);

			break;
			
			case 2:
				a = 2;
				System.out.print("Papier " + a);

			break;
			
			case 3:
				a = 3;
				System.out.println("No¿yce " + a);
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
	 
	 public static int vs()
	 {
		 if (wyóbór+los==
	 }
	 
	 
	 
	 
	 
}
