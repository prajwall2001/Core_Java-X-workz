package com.theatre.app.boot;

import com.theatre.app.MovieTheatre;
import com.theatre.app.Theatre;

public class TheatreRunner {

	public static void main(String[] args) {
System.out.println("Invoking main in TheaterRunner");
        
        Theatre movieTheater = new MovieTheatre();
        movieTheater.playMovie();
	}

}
