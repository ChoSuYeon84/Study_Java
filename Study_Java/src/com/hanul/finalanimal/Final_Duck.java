package com.hanul.finalanimal;

public class Final_Duck extends Final_animal{
	@Override
	public void cry() {
		super.cry();
		System.out.println("꽥꽥"); 
	}//cry()
	
	public void fly() {
		System.out.println(name+"가 난다.");
	}//fly()
}//class
