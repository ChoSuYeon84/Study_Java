package com.hanul.finalanimal;

public class Final_Tiger extends Final_animal{
	@Override
	public void cry() {
		super.cry();
		System.out.println("어흥");
	}//cry()
	
	public void hunter() {
		System.out.println(name+"가 사냥을 한다.");
	}//hunter()
}//class
