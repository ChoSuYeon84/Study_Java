package com.hanul.book2;

import java.text.DecimalFormat;

public class Book2DAO {
	private Book2DTO[] book2;
	public Book2DAO(Book2DTO[] book2) {
		this.book2 = book2;
	}

	//가격 계산
	public void getPrice() {
		for (int i = 0; i < book2.length; i++) {
			book2[i].setPrice(book2[i].getCost()*book2[i].getSu());
		}//for
	}//getPrice
	
	//출력메소드
	public void display() {
		System.out.println("도서명\t저자\t출판사\t단가\t수량\t가격");
		System.out.println("==================================================");
		DecimalFormat df = new DecimalFormat("￦#,##0");
		for (int i = 0; i < book2.length; i++) {
			System.out.print(book2[i].getTitle()+"\t");
			System.out.print(book2[i].getName()+"\t");
			System.out.print(book2[i].getCompany()+"\t");
			System.out.print(df.format(book2[i].getCost())+"\t");
			System.out.print(book2[i].getSu()+"\t");
			System.out.print(df.format(book2[i].getPrice())+"\n");
		}//for
	}//display()
}//class
