package com.hanul.member;

import java.util.ArrayList;

public class MemberDAO {

	//출력메소드
	public void display(ArrayList<MemberDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getName()+"\t");
			System.out.print(list.get(i).getAge()+"\t");
			System.out.print(list.get(i).getAddr()+"\t");
			System.out.print(list.get(i).getTel()+"\n");
		}//for
		System.out.println("===============================================");
	}//display()

	public void ageAscSort(ArrayList<MemberDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				if(list.get(i).getAge() > list.get(j).getAge()) {
					MemberDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}//if
			}//for j
		}//for i
		System.out.println("===============================================");
	}//ageAscSort()

	public void NameDescSort(ArrayList<MemberDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				if(list.get(i).getName().compareTo(list.get(j).getName()) < 0) {
					MemberDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}//if
			}//for j
		}//for i
		System.out.println("===============================================");	
	}//NameDescSort()
	

	

}//class
