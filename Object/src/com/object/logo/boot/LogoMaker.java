package com.object.logo.boot;

import com.object.logo.app.Logo;

public class LogoMaker {
public static void main(String[] args) {
	System.out.println("Invoking main in Logo Maker");
	Logo logo=new Logo("Mercedes Benz","Silver",100,200,"https://www.Mercedes-Benz-logo.png");
	System.out.println(logo);
	
	Logo logo1=new Logo("BMW","White and Blue",200,100,"https://www.Bmw-logo.png");
	System.out.println(logo1);
	
	Logo logo2=new Logo("Nissan Gtr","Red,Black and Silver",250,210,"https://www.Nissan_gtr-logo.png");
	System.out.println(logo2);
}
}
