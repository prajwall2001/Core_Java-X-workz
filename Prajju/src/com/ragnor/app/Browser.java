package com.ragnor.app;

public class Browser {
	public Internet internet=new Internet();
	public void  retrieve()
	{
		System.out.println("Invoking  retrieve() in Browser");
		this.internet.download();
	}
	public void getText()
	{
		System.out.println("Invoking getText() in Browser");
		this.internet.search();
	}
}
