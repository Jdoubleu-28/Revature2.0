package game;

import fixtures.Room;

public class RoomManager {
	
	Room[] room = new Room[4];
	Room startingRoom;

	public void init() {
		Room foyer = new Room(
			
					"The Foyer",
					"A small foyer",
					"The small enertyway of a neo-colonial house. A livingroom is open to the south, where a large TV can be seen.");
		this.room[0] = foyer;


		
		Room livingroom = new Room(
				"The Livingroom",
				"The place of living",
				"A small open area with a sofa, love seat and TV. The foyer is to the north, where a large plant can be seen." + "\n"
				+ "There is a vegetable garden in the yard if you keep heading south.");
		this.room[1]= livingroom;

		
		Room garden= new Room(
					"The Garden",
					"There is a variety of vegetables",
					"Plenty tomatos, carrots, lettues and other vegetables. The livingroom is to the north, where a large TV can be seen." );
		this.room[2] = garden;

		Room office = new Room(
					 "The Office",
					 "Sometimes work gets done here other times....eh",
					 "Your basic office supplies can be found here, a computer setup, a shredder, and for some reason a couch." + "\n"
					 + "The sofa can been seen to the west.");
		this.room[3]= office;

		
		this.startingRoom = foyer;
		
		foyer.setExits(room[1]);
		livingroom.setExits(room[0]);
		livingroom.setExits(room[1]);
		livingroom.setExits(room[2]);
		garden.setExits(room[0]);
		office.setExits(room[3]);
		
}
	public Room getStartingRoom() {
	return this.startingRoom;
	}
	public void setStartingRoom(Room startingRoom) {
	this.startingRoom = startingRoom;
}
	public Room[] getRooms() {
		return this.room;
	}
	
	public void setRooms(Room[] room) {
		this.room=room;
	}
	}

