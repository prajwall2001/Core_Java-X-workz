package com.engineering.boot;

import com.engineering.app.Pg;
import com.engineering.div.GentsPg;

public class PgRunner {

	public static void main(String[] args) {
		Pg gentsPg = new GentsPg();

		gentsPg.checkAvailability(101);
		gentsPg.bookRoom(102);
		gentsPg.displayRoomDetails();
	}

}
