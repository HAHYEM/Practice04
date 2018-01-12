package com.javaex.problem04;

public class Sparrow extends Bird {

	String name;

	@Override
	public void showName() {
		System.out.println("������ �̸���"+name+ " �Դϴ�");
	}

	@Override
	public void sing() {
		System.out.println("����("+name+")�� �Ҹ����� ��ϴ�");
	}

	@Override
	public void fly() {
		System.out.println("����("+name+")�� ���ƴٴմϴ�");
	}

	protected String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}


}