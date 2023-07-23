public class ConstructorChainingMethods {
    public static void main(String[] args)
	{
    System.out.println("Invoking main method in HelmetMaker");

    Helmet helmet = new Helmet("Street Rider", "Full Face");
    Helmet.printStatic();

    Helmet helmet1 = new Helmet(3, "Blue");
    helmet1.printInstance();
	
	System.out.println();
	
    System.out.println("Invoking main method in CandleMaker");

    Candle candle = new Candle("Lavender", "Taper");
    Candle.printStatic();

    Candle candle1 = new Candle(5, "Red");
    candle1.printInstance();
	
	System.out.println();
	
    System.out.println("Invoking main method in BrickMaker");

    Brick brick = new Brick("Cement Bricks", "Clay");
    Brick.printStatic();

    Brick brick1 = new Brick(100, "Grey");
    brick1.printInstance();
	
	System.out.println();

    System.out.println("Invoking main method in SoilTester");

    Soil soil = new Soil("Sandy", "Yellow");
    Soil.printStatic();

    Soil soil1 = new Soil(6.5, "Moderate");
    soil1.printInstance();
	
	System.out.println();

    System.out.println("Invoking main method in PowerMaker");

    Power power = new Power("AC Power", "Li-ion");
    Power.printStatic();

    Power power1 = new Power(5000, "Black");
    power1.printInstance();
	
	System.out.println();
	
    System.out.println("Invoking main method in ButterflyMaker");

    Butterfly butterfly = new Butterfly("Monarch", "Orange and Black");
    Butterfly.printStatic();

    Butterfly butterfly1 = new Butterfly(5, "Swirl");
    butterfly1.printInstance();
     
	System.out.println();
	
    System.out.println("Invoking main method in BureauMaker");

    Bureau bureau = new Bureau("Godrej Brand", "Large");
    Bureau.printStatic();

    Bureau bureau1 = new Bureau(2, "Brown");
    bureau1.printInstance();
    }
}

	
	
	
	
	
