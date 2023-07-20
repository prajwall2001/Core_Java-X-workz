class CarpenterWorker{
public static void main(String[] args)
{
System.out.println("Invoking main in CarpenterWorker...");
        Carpenter.cutWood();
	    Carpenter.sharpenWood();
        Carpenter.shapeWood();
        Carpenter.sandWood();
        Carpenter.assembleFurniture();
        Carpenter.varnishWood();
		Carpenter.cutAndShapeWood();
		Carpenter.cutAndSandWood();
		Carpenter.shapeWood(12,"Sandle Wood");
		Carpenter.shapeWood("Oval",8);
        Carpenter.cutWood(5);
        Carpenter.sandWood(10);
        Carpenter.assembleFurniture("Chair");
        Carpenter.varnishWood(8);
}
}






