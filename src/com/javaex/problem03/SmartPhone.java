package com.javaex.problem03;

public class SmartPhone extends MusicPhone {

	
	@Override
	public void execute(String str) {
		if(str.equals("��")) {
			System.out.println("�۽���");
			playMusic();
			call();
		}
	}
    
    public void call() {
    	System.out.println("��ȭ��� ����");
    }
    public void playMusic() {
    	System.out.println("�ٿ�ε��ؼ� �������");
    }
}