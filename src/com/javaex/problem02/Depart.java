package com.javaex.problem02;

public class Depart extends Employee {


	private String department;

	public Depart(String name, int salary, String department) {
		super(name,salary);
		this.department = department;
	}

	@Override
	public void getInformation() {
		System.out.println("�̸�: " + getName() + "  ����: " + getSalary() + "  �μ�: " + department);
	}

}