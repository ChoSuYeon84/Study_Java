package com.hanul.Fruit;

public class FruitDAO {
	private FruitDTO[] fruit;	//멤버변수 : 생성자 메소드와 현재 클래스 내부에서만 사용
	public FruitDAO(FruitDTO[] fruit) {	//디폴트 생성자 메소드(생략가능)
		this.fruit = fruit;		//객체배열(book[])을 매개변수로 전달받는 생성자 메소드를 초기화
	}
	
	//가격계산
	public void getPrice() {
		for (int i = 0; i < fruit.length; i++) {
			fruit[i].setPrice(fruit[i].getCost()*fruit[i].getSu());
		}//for
	}//getPrice()

	//가격의 내림차순 정렬
	public void priceDescSort() {
		for (int i = 0; i < fruit.length; i++) {
			for (int j = i+1; j < fruit.length; j++) {
				if(fruit[i].getPrice() < fruit[j].getPrice()) {
					FruitDTO temp = fruit[i];
					fruit[i] = fruit[j];
					fruit[j] = temp;
				}//if
			}//for j
		}//for i
	}//priceDescSort()
	
	//출력메소드
	public void display() {
		System.out.println("과일이름\t원가\t수량\t가격");
		System.out.println("====================================");
		for (int i = 0; i < fruit.length; i++) {
			System.out.print(fruit[i].getName()+"\t");
			System.out.print(fruit[i].getCost()+"\t");
			System.out.print(fruit[i].getSu()+"\t");
			System.out.print(fruit[i].getPrice()+"\n");
		}//for
	}//display()
	
}//class
