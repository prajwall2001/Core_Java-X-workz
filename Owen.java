class Owen {
    static void heat(String itemName, int minutes, int capacity) {
		
        System.out.println("Item to heat: " + itemName);
        System.out.println("Heating time: " + minutes + " minutes");
        System.out.println("Capacity: " + capacity);
     if (itemName != null && !itemName.isEmpty()) {
            System.out.println("Item to heat: " + itemName);
			return;
        } else {
            System.err.println("Invalid item name");
        }
        
        if (minutes > 0) {
            System.out.println("Heating time: " + minutes + " minutes");
			return;
        } else {
            System.err.println("Invalid heating time");
        }
        
        if (capacity > 0) {
            System.out.println("Capacity: " + capacity);
			return;
        } else {
            System.err.println("Invalid capacity");
        }
	
}
}
