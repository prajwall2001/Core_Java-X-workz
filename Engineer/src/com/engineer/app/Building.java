package com.engineer.app;

public class Building {
	public String buildName;
	public String location;
	public int noOfCross;
	
	Floor floor1=new Floor("Three",301);
	Floor floor2=new Floor("Ten",1001);
	public Floor[] floor={floor1,floor2};
	
	Lift lift1=new Lift("abd");
	Lift lift2=new Lift("abs");
	public Lift[] lift={lift1,lift2};
	
	
	public Building(String buildName,String location,int noOfCross)
	{
		System.out.println("Invoking constructor in Building");
		this.buildName=buildName;
		this.location=location;
		this.noOfCross=noOfCross;
	}


	public void printInfo() {
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Building name : "+this.buildName);
		System.out.println("Location: "+this.location);
		System.out.println("No of crosses: :"+this.noOfCross);
		for(int op=0;op<floor.length;op++)
		{
			Floor floors=floor[op];
			floors.printInfo();
		}
		
		for(int ip=0;ip<lift.length;ip++)
		{
			Lift lifts=lift[ip];
			lifts.printInfo();
		}
	}
	
	
	
}
