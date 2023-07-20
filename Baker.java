class Baker {
    static void cooking(String foodItem, int noOfPeople, String workingFor, int experience, int duration, String assistance) {
        System.out.println("Food Item: " + foodItem);
        System.out.println("Number of People: " + noOfPeople);
        System.out.println("Working for: " + workingFor);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Assistance: "+assistance);
	
        if (foodItem == null) {
            System.out.println("Provide a valid food item:" +foodItem);
        } else {
           System.err.println("Invalid food item.");
        }

        if (noOfPeople <= 0) {
            System.out.println("Provide a valid number of people:" +noOfPeople);
        } else {
           System.err.println("Invalid number of people.");
        }

        if (workingFor == null) {
            System.out.println("Specify you are working for:" +workingFor);
        } else {
            System.err.println("Invalid");
        }

        if (experience < 0) {
            System.out.println(" experience value:"+experience);
			return;
        } else {
             System.err.println(" Invalid experience value.");
        }

        if (duration <= 0) {
            System.out.println("Provide a valid duration:" +duration);
        } else {
               System.err.println("Not able to do item at a time");
			   return;
        }

        if (assistance == null) {
            System.out.println("Please specify if you have assistance:" +assistance);
        } else {
         System.err.println("Invalid assistance");
        }
	
	}
}
