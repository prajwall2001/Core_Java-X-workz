package com.java.docs.app;

import java.time.LocalDateTime;

public class LocalDateTimeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LocalDateTime ref= LocalDateTime.MAX;
      System.out.println(ref);
      
      LocalDateTime ref1= LocalDateTime.now();
      System.out.println(ref1);
      
      LocalDateTime ref2= LocalDateTime.from(ref1);
      System.out.println(ref2);
      
      LocalDateTime ref3= LocalDateTime.of(2022, 8, 28, 15, 20);
      System.out.println(ref3);
      
      
      LocalDateTime ref4= LocalDateTime.of(2021, 8, 28, 12, 0, 0);
      System.out.println(ref4);
      
      
	}

}
