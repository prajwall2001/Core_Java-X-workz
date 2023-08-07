package com.ironbox.boot;

import com.ironbox.app.IronBox;

public class IronBoxRunner {
public static void main(String[] args) {
	System.out.println("Inovking main in IronBoxRunner");
	IronBox iron=new IronBox();
	iron.heat();
	iron.heat("Nylon",89);
}
}
