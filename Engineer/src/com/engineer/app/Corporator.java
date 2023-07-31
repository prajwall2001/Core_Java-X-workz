package com.engineer.app;

public class Corporator {
public String corpName;
	
	Building building=new Building("Metro rajajinagar","Rajajinagar",1);
	Building building2=new Building("Maravanthe bridge","Udupi",45);
	public Building[] buildings={building,building2};

	public Corporator(String corpName) {
		this.corpName = corpName;
	}

	public void printInfo() {
		System.out.println("Inovking printInfo");
		System.out.println("Corporator Name : "+this.corpName);
		for(int start=0;start<buildings.length;start++)
		{
			Building building=buildings[start];
			building.printInfo();
		}

	}
}
