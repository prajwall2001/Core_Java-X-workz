class Fabric
{
	static float getPrice(String fabName)
	{
		System.out.println("Invoking getPrice() in Fabric");
		if(fabName!=null)
		{
			System.out.println("Fabric Name is Valid");
			if("cotton"==fabName)
			{
				return 2590;
			}
			if("nylon"==fabName)
			{
				return 2100;
			}
			if("woolen"==fabName)
			{
				return 1800;
			}
			if("linen"==fabName)
			{
				return 1900;
			}
			if("polyster"==fabName)
			{
				return 2000;
			}
			if("silk"==fabName)
			{
				return 3000;
			}
		}
		else
			{
			System.err.println("Fabric is not valid");
		}
		return 100;
	}
}