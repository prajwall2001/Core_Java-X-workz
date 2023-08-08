package com.Dinosaur.app.boot;

import com.Dinosaur.app.Dinosaur;
import com.Dinosaur.app.Tyrannosaurus;

public class DinosaurRunner {
public static void main(String[] args) {
	  System.out.println("Invoking main in DinosaurRunner");

      Dinosaur tRino = new Tyrannosaurus();
      tRino.roar(); 
}
}
