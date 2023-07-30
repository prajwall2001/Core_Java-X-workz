package com.ragnor.boot;

import com.ragnor.app.Shop;

public class ShopRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in ShopKiller");
		Shop shop=new Shop();
		shop.product();
		shop.paymentMode();

	}
}
