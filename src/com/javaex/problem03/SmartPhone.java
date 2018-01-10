package com.javaex.problem03;

public class SmartPhone extends MusicPhone {

	
	
	@Override
	public void execute(String str) {
		if(str.equals("앱")) {
			System.out.println("앱실행");
			playMusic();
			call();
		}
	}
    
    public void call() {
    	System.out.println("통화기능 시작");
    }
    public void playMusic() {
    	System.out.println("다운로드해서 음악재생");
    }
}
