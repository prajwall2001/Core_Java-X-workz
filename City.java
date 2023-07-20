class City{
	String name;
	String state;
	int pincode;
	City()
	{
		System.out.println("Invoking no args constructor");
		System.out.println("Inside constructor " +this.name);
		System.out.println("Inside constructor " +this.state);
		System.out.println("Inside constructor " +this.pincode);
	}
	City(String name,String state,int pincode)
	{
	System.out.println("Invoking constructor by passing parameters");
	this.name=name;
	this.state=state;
    this.pincode=pincode;
}
}