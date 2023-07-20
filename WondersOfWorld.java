class WondersOfWorld{
	public static void main(String[] args)
	{
	System.out.println("Running main in grocery items...");
        String chinaWall  ="Great wall of China";
		String tajMahal="Taj Mahal";
		String petra="Petra";
		String tableMountain="Table Mountain";
		String lightHouse="Bell Rock LightHouse";
		String macchuPicchu="Macchu Picchu lost city";
		String giza="Pyramids of giza";
		
		String wonders[]={chinaWall,tajMahal,petra,tableMountain,lightHouse,macchuPicchu,giza};
		for (int Wow=0;Wow<wonders.length;Wow++)
			System.out.println("One of the world wonder " +wonders[Wow]+ " is at location " +Wow);
		
		 wonders[5]="Hanging garden of babylon";
		 String updated=wonders[5];
		
		 System.out.println("\n");
		 
		for (int Wow=wonders.length-1;Wow>=0;Wow--)
			System.out.println("One of the world wonder " +wonders[Wow]+ " is at location" +Wow);
		}
	}