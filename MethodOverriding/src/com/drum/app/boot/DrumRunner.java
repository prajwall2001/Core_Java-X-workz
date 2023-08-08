package com.drum.app.boot;

import com.drum.app.BigDrum;
import com.drum.app.Drum;

public class DrumRunner {

	public static void main(String[] args) {

		System.out.println("Invoking main in DrumRunner");

		Drum bigDrum = new BigDrum();
		bigDrum.playSound();
	}

}
