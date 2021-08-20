package game;

import java.util.Arrays;
import java.util.Scanner;
import fixtures.Room;


public class Main {
	
	public static void main(String[] args) {
		RoomManager room = new RoomManager();
		Player player = new Player();
		room.init();
		player.setCurrentRoom(room.startingRoom);
		System.out.println("Welcome");
		System.out.println("we are in the foyer");
		System.out.println("North, South, East, West");
		
		while(true) {
			String[] command = collectInput();
			parse(command, player);
			printRoom(player);
		}
			}
	
	private static void printRoom(Player player) {
		String print ="Current Room:" + "\n" +
					   player.getCurrentRoom().getName()+"\n"+
					   player.getCurrentRoom().getshortDescription()+"\n"+				
					   player.getCurrentRoom().getlongDescription();
		
		System.out.println(print);
	}
	
	private static String[]collectInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick a direction");
		String[] direction = scan.nextLine().split("");
		String south = direction[1];
		String north = direction[0];
		String east = direction[2];
		String west = direction[3];
		return direction;
		}
	


	private static void parse(String[] command, Player player) {
		
		if (command [0].equalsIgnoreCase("north")) {
			System.out.println(player.getCurrentRoom().getName()+"\n"+
					   player.getCurrentRoom().getshortDescription()+"\n"+				
					   player.getCurrentRoom().getlongDescription());
		}
		else if (command[1].equalsIgnoreCase("south")) {
			System.out.println(player.getCurrentRoom().getName()+"\n"+
					   player.getCurrentRoom().getshortDescription()+"\n"+				
					   player.getCurrentRoom().getlongDescription());
		}
		else if (command[2].equalsIgnoreCase("east")) {
			System.out.println(player.getCurrentRoom().getName()+"\n"+
				   player.getCurrentRoom().getshortDescription()+"\n"+				
				   player.getCurrentRoom().getlongDescription());
	}
		else if(command[3].equalsIgnoreCase("west")) {
			System.out.println(player.getCurrentRoom().getName()+"\n"+
					   player.getCurrentRoom().getshortDescription()+"\n"+				
					   player.getCurrentRoom().getlongDescription());
			
		}
}
}

