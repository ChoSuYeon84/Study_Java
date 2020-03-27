package com.hanul;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class JepumDAO {
	
	private ArrayList<JepumDTO> list;
	public JepumDAO(ArrayList<JepumDTO> list) {
		this.list = list;
	}
	
	//주문가격계산
	public void getPrice() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setPrice(list.get(i).getCost() * list.get(i).getSu());
		}//for
		System.out.println("=================================================");
	}//getPrice()
	
	//제품정보 출력
	public void display() {
		DecimalFormat df = new DecimalFormat("￦#,##0");
		for (JepumDTO dto : list) {
			System.out.print(dto.getName()+"\t");
			System.out.print(df.format(dto.getCost())+"\t");
			System.out.print(dto.getSu()+"\t");
			System.out.print(df.format(dto.getPrice())+"\n");
		}//for
		System.out.println("=================================================");
	}//display()

	//가격의 내림차순 정렬
	public void priceDescSort() {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if(list.get(i).getPrice() < list.get(j).getPrice()) {
					JepumDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}//if
			}//for j
		}//for i
		System.out.println("=================================================");
	}//priceDescSort()
	
	//제품명의 오름차순 정렬
	public void nameAscSort() {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if(list.get(i).getName().compareTo(list.get(j).getName()) > 0) {
					JepumDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}//if
			}//for j
		}//for i
		System.out.println("=================================================");
	}//nameAscSort()
	
}//class
