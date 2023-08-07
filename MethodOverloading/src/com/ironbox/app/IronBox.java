package com.ironbox.app;

public class IronBox {
public void heat() {
	System.out.println("Invoking heat in IronBox");
	heat("Nylon");
	heat(89);
}
public void heat(String mode)
{
	System.out.println("Invoking String in heat");
	System.out.println("IronBox mode:"+mode);
}
public void heat(int temperature) {
	System.out.println("Inovking int in heat");
	System.out.println("Temperature in 'C:" +temperature);
	
}
public void heat(String Mode,int temperature) {
	System.out.println("Inovking String,int in heat");
	heat(Mode);
	heat(temperature);
	
}
}
