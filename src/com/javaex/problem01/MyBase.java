package com.javaex.problem01;

public class MyBase extends Base{

    public void day() {
    	System.out.println("������ ������ ������");
    }
    public void night() {
    	System.out.println("night");
    }
    
	@Override
	public void service(String state) {
		 if (state.equals("��")) {
	            day();
	        } else if(state.equals("��")){
	            night();
	        }else {
	        	System.out.println("���ĵ� ���� ���������� ���ؾ� �մϴ�.");
	        }
	}
}