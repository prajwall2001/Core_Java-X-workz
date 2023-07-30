package com.ragnor.app;

public class Shop {
	public Salesman salesman=new Salesman();
	public void product()
	{
		System.out.println("Invoking product() in Shop");
		this.salesman.sale();
				
	}
	public void paymentMode()
	{
		System.out.println("Invoking paymentMode()in Shop");
		this.salesman.buy();
				
	}
}
