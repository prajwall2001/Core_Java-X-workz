class GroceryItems{
	public static void main(String[] args)
	{
	System.out.println("Running main in grocery items...");
        String sugar  ="Sugar";
		String pepper ="Pepper";
		String rice   ="White rice";
		String butter ="Amul Butter";
		String milk   ="Milk";
		String honey  ="Honey";
		String popcorn="Popcorn";
		
		String groceries[]={sugar,pepper,rice,butter,milk,honey,popcorn};
		for (int List=0;List<groceries.length;List++)
			System.out.println("Grocery " +groceries[List]+ " is at position " +List);
		
		 groceries[5]="Jaggery";
		 String temp=groceries[5];
		
		 System.out.println("\n");
		 
		for (int List=groceries.length-1;List>=0;List--)
			System.out.println("Grocery " +groceries[List]+ " is at position" +List);
		}
	}