class VegetablesArray{
	public static void main(String[] args)
	{
	System.out.println("Running main in vegetables items...");
        float tomato =60;
		float potato =40;
		float chilli=100;
		float carrot=150;
		float onion=200;  
		float beans=65 ;
		float beetroot=90;
		
		float vegetables[]={tomato,potato,chilli,carrot,onion,beans,beetroot};
		for (int afford=0;afford<vegetables.length;afford++)
			System.out.println("Grocery " +vegetables[afford]+ " is at position " +afford);
		
		 vegetables[1]=70;
		 float temp=vegetables[1];
		
		 System.out.println("\n");
		 
		for (int afford=vegetables.length-1;afford>=0;afford--)
			System.out.println("Vegetable " +vegetables[afford]+ " is on market" +afford);
		}
	}