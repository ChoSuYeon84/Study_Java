package com.hanul.poly02;

public class Dog extends Animal {	//추상클래스를 상속 ▶ 추상메소드의 재정의가 필수(오버라이딩을 반드시 해야함)

	@Override
	public void cry() {
		System.out.println("멍멍");
	}//cry()
}//class