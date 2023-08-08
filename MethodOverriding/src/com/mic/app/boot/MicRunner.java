package com.mic.app.boot;

import com.mic.app.Mic;
import com.mic.app.TinyMic;

public class MicRunner {
	
	public static void main(String[] args) {
        System.out.println("Invoking main in MicRunner");
        
        Mic tinyMic = new TinyMic();
        tinyMic.speak();
}
}