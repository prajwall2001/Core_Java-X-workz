class FabricKing{
	public static void main(String[] values){
	System.out.prfloatln("Invoking main in FabricKing");
	
	float ref1=Fabric.getPrice("cotton");
	System.out.prfloatln("Ref 1 is:"+ref1);
	float ref2=Fabric.getPrice("nylon");
	System.out.prfloatln("Ref 2 is:"+ref2);
	float ref3=Fabric.getPrice("woolen");
	System.out.prfloatln("Ref 3 is:"+ref3);
	float ref4=Fabric.getPrice("linen");
	System.out.prfloatln("Ref 4 is:"+ref4);
	float ref5=Fabric.getPrice("polyster");
	System.out.prfloatln("Ref 5is:"+ref5);
	float ref6=Fabric.getPrice("silk");
	System.out.prfloatln("Ref 6is:"+ref6);
	}
}