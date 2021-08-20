package fixtures;

import java.util.Scanner;

public class Room extends Fixture{
	
	public Room[] exits = new Room[4];
	
	public Room() {
		super();
	}

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);

}

	public Room[] getExit(){
		return exits;
	}
	

	public Room getExit(String direction) {
		
		if (direction == "north")
			return exits[0];
		else if (direction == "south")
			return exits[1];
		else if (direction == "east")
			return exits[2];
		else if (direction == "west")
			return exits[3];
		return null;
	}
		
	
	public void setExits(Room exits) {
		this.exits[0] = exits;
		this.exits[1] = exits;
		this.exits[2] = exits;
		this.exits[3] = exits;
		
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
		
	}
}
//	public void setExit(Room roomZero, Room roomTwo, Room roomThree) {
//		roomZero = exits[0];
//		roomTwo = exits[1];
//		roomThree = exits[3];
//	}
//	
//	public void setExit2(Room roomOne) {
//			roomOne = exits[0];
//		}
//	
//	public void setExit3(Room roomOne) {
//		roomOne = exits[2];
//	}
//
//
//	}
		




	
		
