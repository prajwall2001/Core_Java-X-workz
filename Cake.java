class Cake{
static void tasty(String cakeName,String cakeType,String bakeryName,double price,int noOfPieces,String ocassion)
{
System.out.println("Cake name: "+cakeName);
System.out.println("Cake type: "+cakeType);
System.out.println("Bakery name: "+bakeryName);
System.out.println("Having price: "+price);
System.out.println("Cake pieces: "+noOfPieces);
System.out.println("For celebration of: "+ocassion);
 if (cakeName != null) {
            System.out.println("Cake name provided:"+cakeName);
        } else {
            System.err.println("Cake name not provided");
			return;
        }

        if (cakeType != null) {
            System.out.println("Cake type provided:" +cakeType);
        } else {
            System.err.println("Cake type not provided.");
        }

        if (bakeryName != null) {
            System.out.println("Bakery name provided:" +bakeryName);
			return;
			
        } else {
            System.err.println("Bakery name not provided.");
        }

        if (price > 0) {
            System.out.println("Price provided: " + price);
        } else {
            System.err.println("Invalid price.");
			return;
        }

        if (noOfPieces > 0) {
            System.out.println("Number of cake pieces provided: " + noOfPieces);
        } else {
            System.err.println("Invalid number of cake pieces.");
			return;
        }

        if (ocassion != null) {
            System.out.println("Occasion provided: " + ocassion);
        } else {
            System.err.println("Occasion not provided.");
			return;
}
}
}