package com.hanul.finalanimal;

public class Final_Dog extends Final_animal{

	@Override
	public void cry() {	//cry() 메소드를 정의
		super.cry();	//상위클래스의 cry() 메소드를 동작시킨다.
		System.out.println("멍멍");
	}//cry()
	
	public void run() {
		System.out.println(name+"가 뛴다.");
	}//run()

}//class
