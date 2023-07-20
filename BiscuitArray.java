class BiscuitArray{
	public static void main(String[] args)
	{
		System.out.println("Running main in Biscuits....");
		String oreo="Oreo";
		String marie="Vita marie";
		String jimjam="Jim Jam";
		String fab="Fab! jam-in";
		String monaco="Monaco";
		String bounce="Bounce";
		String happyHappy="happy Happy";
		
		String biscuits[]={oreo,marie,jimjam,fab,monaco,bounce,happyHappy};
		for (int yummy=0;yummy<biscuits.length;yummy++)
			System.out.println("My favorite biscuit " +biscuits[yummy]+ " is at store " +yummy);
		
		
		biscuits[4]="bourbon";
		String wow=biscuits[4];
		
		 System.out.println("\n");
		
		for (int yummy=biscuits.length-1;yummy>=0;yummy--)
			System.out.println("My favorite biscuit " +biscuits[yummy]+ " is at store " +yummy);
		
	}
	
}