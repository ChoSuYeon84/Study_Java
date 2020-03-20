package com.hanul.student;

public class StudentDTO {
	//1. 멤버변수 선언
	private String name;	//성명
	private String num;		//학번
	private String major;	//학과
	private float cpp;		//C++
	private float java;		//자바
	private float sum;		//총점		
	private float avg;		//평균
	
	//2. 디폴트 생성자 메소드
	public StudentDTO() {}

	//3. 생성자 메소드 초기화
	public StudentDTO(String name, String num, String major, float cpp, float java) {
		super();
		this.name = name;
		this.num = num;
		this.major = major;
		this.cpp = cpp;
		this.java = java;
	}
	
	//4. Getters and Setters 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public float getCpp() {
		return cpp;
	}

	public void setCpp(float cpp) {
		this.cpp = cpp;
	}

	public float getJava() {
		return java;
	}

	public void setJava(float java) {
		this.java = java;
	}

	public float getSum() {
		return sum;
	}

	public void setSum(float sum) {
		this.sum = sum;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	
}//Class

