package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);{
		boolean keepGoing = true;
		while (keepGoing) {

		System.out.println("Please select number of option");
		System.out.println("1. Yards to Meters");
		System.out.println("2. Ounces to Pounds");
		System.out.println("3. Fahrenheit to Celsius");
		System.out.println("4. Mph to Kph");
		System.out.println("5. Megabyte to Gigabyte");
		System.out.println("6. Quit");
		int menuSelection = scan.nextInt();
		
		
		
		switch (menuSelection) {
		case 1:
			System.out.println("Enter Number of Yards:");
			int x = (int) (scan.nextInt()/1.094);
			System.out.println(x +" Meters");
			break;
		case 2:
			System.out.println("Enter Number of Pounds:");
			int y = (int) (scan.nextInt()/.0625);
			System.out.println(y + " Ounces");
			break;
		case 3:
			System.out.println("Enter Number in Fahrenheit");
			int z = (int) ((scan.nextInt() - 32)* 5/9);
			System.out.println( z + " Celsius");
			break;
		case 4:
			System.out.println("Enter Number in Mph:");
			int a = (int) (scan.nextInt() * 1.6094 );
			System.out.println(a + " Kph");
			break;
		case 5:
			System.out.println("Enter Number of Mgeabytes");
			int t = (int) (scan.nextInt()/ 1000);
			System.out.println(t + " Gigibytes");
			break;
		case 6:
			if ((int)menuSelection ==6) { keepGoing = false;
			break;
			}
		}
	}
}
	}
}

	



		
	

		
	

	
	
	



	
	

			
		

		

