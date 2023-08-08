package com.mic.app;
	public class TinyMic extends Mic {
	    @Override
	    public void speak() {
	        System.out.println("This is a tiny microphone!");
	        super.speak();
	    }
}
