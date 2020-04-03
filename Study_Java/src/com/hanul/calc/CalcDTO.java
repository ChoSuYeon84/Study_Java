package com.hanul.calc;

import java.io.Serializable;

public class CalcDTO implements Serializable{	//직렬화
	//멤버변수 선언
	private int num1;
	private int num2;
	private String opcode;
	private int result;
	
	//기본생성자 메소드
	public CalcDTO() {}

	//생성자 메소드 초기화
	public CalcDTO(int num1, int num2, String opcode) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.opcode = opcode;
	}

	//Getters & Setters
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getOpcode() {
		return opcode;
	}

	public void setOpcode(String opcode) {
		this.opcode = opcode;
	}

	public int getResult() {
		return result;
	}
	
}//class
