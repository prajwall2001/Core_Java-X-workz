package com.engineer.app;

public class Sport {
	public String sportName;
	public  Player[] players;

	

	public Sport(String name, Player[] players) {
		System.out.println("Invoking const in Sport");
		this.sportName = name;
		this.players = players;

	}
	
	public void printInfo()
	{
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Invoking printInfo in Sport");
		System.out.println("Sport name is "+this.sportName);
		for(int start=0;start<players.length;start++)
		{
			Player player=players[start];
			player.printInfo();
			
		}
	}
}
