package com.javaex.problem04;

public class Duck extends Bird {

	String name;
	
   
	public void sing() {
		System.out.println("����("+name+")�� �Ҹ����� ��ϴ�");

    }

    public void fly() {
    	System.out.println("����("+name+")�� ���� �ʽ��ϴ�");
    }
    
    public void showName() {
    	System.out.println("������ �̸���"+name+ " �Դϴ�");
    }

	protected String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}