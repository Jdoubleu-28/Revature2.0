package fixtures;

import java.util.Scanner;

public interface Interact {
	
	public static void place (){
	Scanner scan = new Scanner(System.in);
	printOptions();
	int item = scan.nextInt();
	
	switch(item) {
	case 1:
		System.out.println("Picked up" + item);
		break;
	case 2:
		System.out.println("Looked at" + item);
		break;
	default:
		break;
	}
	}
public static void printOptions() {
	System.out.println("You found a");
	System.out.println("What would you like to do?");
}
}
