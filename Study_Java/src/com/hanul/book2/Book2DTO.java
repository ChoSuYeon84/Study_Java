package com.hanul.book2;

public class Book2DTO {
	//1. 멤버변수 선언
	private String title;
	private String name;
	private String company;
	private int cost;
	private int su;
	private int price;
	
	//2. 기본 생성자 메소드 생성
	public Book2DTO(){}

	//3. 생성자 메소드 초기화
	public Book2DTO(String title, String name, String company, int cost, int su) {
		super();
		this.title = title;
		this.name = name;
		this.company = company;
		this.cost = cost;
		this.su = su;
	}

	//4. Getters and Setters 메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}//class
