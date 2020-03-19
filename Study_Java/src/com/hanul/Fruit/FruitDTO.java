package com.hanul.Fruit;

public class FruitDTO {
	//1.멤버변수 선언
	private String name;	//과일이름
	private int cost;		//원가
	private int su;			//수량
	private int price;		//가격

	//2. 기본생성자 메소드
	public FruitDTO() {}

	//3. 생성자 메소드 초기화
	public FruitDTO(String name, int cost, int su) {
		super();
		this.name = name;
		this.cost = cost;
		this.su = su;
	}

	//4. Getters & Setters 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
