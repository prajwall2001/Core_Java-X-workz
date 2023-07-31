package com.engineer.app;

public class Player {
	Building building=new Building("Metro rajajinagar","Rajajinagar",1);
	public String name;
	public String exp;
	
	Area area1=new Area("Rajaji Nagar");
	Area area2=new Area("BasaveshwarNagar");
	Area area3=new Area("magadi");
	Area area4=new Area("Vijaya Nagar");
	Area area5 =new Area("jaynagar");
	
	Area[] area={area1,area2,area3,area4,area5};
	HomeTown town=new HomeTown("Banglore",522478,area);
	
	public Player(String name,String exp)
	{
		System.out.println("Invoking const in Player");
		this.name=name;
		this.exp=exp;
	}
	
	public void printInfo()
	{
		System.out.println("Invoke PrintInfo");
		System.out.println("Name of the player: "+this.name);
		System.out.println("Exp:"+this.exp);
		for(int loop=0;loop<area.length;loop++)
		{
			
		Area areaNew=area[loop];
		areaNew.printInfo();
		}
	}
	
}
