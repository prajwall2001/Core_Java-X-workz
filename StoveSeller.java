class StoveSeller{
    public static void main(String[] args) {
	System.out.println("Invoking main in StoveSeller...");
	String dish="Pasta";
	int temperatute=150;
	boolean isGasStove=(true);
	
        Stove.cook(dish,temperatute, isGasStove);
    }
}
