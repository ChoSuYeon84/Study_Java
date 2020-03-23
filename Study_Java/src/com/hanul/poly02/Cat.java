package com.hanul.poly02;

public class Cat extends Animal {
	@Override
	public void cry() {
		System.out.println("야옹");
	}//cry()
	
	public void night() {	//Cat 클래스만 가지고 있는 고유한 메소드(알파상태)
		System.out.println("고양이는 야행성이다.");
	}//night()	
}//class
