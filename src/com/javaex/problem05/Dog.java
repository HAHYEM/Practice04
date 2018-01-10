package com.javaex.problem05;

public class Dog implements Soundable {
	String sound;
	
	@Override
	public String sound() {
		return "멍멍";
	}
}
