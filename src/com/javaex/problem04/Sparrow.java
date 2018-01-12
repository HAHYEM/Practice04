package com.javaex.problem04;

public class Sparrow extends Bird {

	String name;

	@Override
	public void showName() {
		System.out.println("참새의 이름은"+name+ " 입니다");
	}

	@Override
	public void sing() {
		System.out.println("참새("+name+")가 소리내어 웁니다");
	}

	@Override
	public void fly() {
		System.out.println("참새("+name+")가 날아다닙니다");
	}

	protected String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}


}