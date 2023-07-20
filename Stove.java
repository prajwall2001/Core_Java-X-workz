class Stove {
    static void cook(String dish, int temperature, boolean isGasStove) {
        System.out.println("Dish: " + dish);
        System.out.println("Temperature: " + temperature);
        System.out.println("Is gas stove? " + isGasStove);
		if(dish!=null)
		{
			System.out.println("enter dish" +dish);
		}
		else{
			System.err.println("Invalid dish" +dish);
		}
        if (temperature > 0) {
            System.out.println("Temperature: " + temperature);
        } else {
            System.err.println("Invalid temperature value.");
        }
        
        if (isGasStove) {
            System.out.println("This is a gas stove.");
        } else {
            System.err.println("This is not a gas stove.");
        }
    }
}
