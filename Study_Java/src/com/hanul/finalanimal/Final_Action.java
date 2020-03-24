package com.hanul.finalanimal;

public class Final_Action {
	public void action(Final_animal animal) {	//다형성 인수
		animal.cry();
		
		if(animal instanceof Final_Dog) {		//객체 타입 비교
			((Final_Dog)animal).run();			//다운캐스팅
		}else if(animal instanceof Final_Cat) {
			((Final_Cat)animal).grooming();
		}else if(animal instanceof Final_Tiger) {
			((Final_Tiger)animal).hunter();
		}else if(animal instanceof Final_Duck) {
			((Final_Duck)animal).fly();
		}//if
	}//action()
}//class
