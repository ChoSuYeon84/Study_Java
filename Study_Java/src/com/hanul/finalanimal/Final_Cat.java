package com.hanul.finalanimal;

public class Final_Cat extends Final_animal{
	@Override
	public void cry() {
		super.cry();
		System.out.println("야옹");
	}//cry()
	
	public void grooming() {
		System.out.println(name+"가 그루밍한다.");
	}//grooming()
}//class
