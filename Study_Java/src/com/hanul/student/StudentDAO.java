package com.hanul.student;

import java.text.DecimalFormat;

public class StudentDAO {
	private StudentDTO[] student;		//멤버변수
	public StudentDAO(StudentDTO[] student) {
		this.student = student;
	}
	
	//총점계산
	public void getSum() {
		for (int i = 0; i < student.length; i++) {
			student[i].setSum(student[i].getCpp()+student[i].getJava());	
		}//for
	}//getSum()

	
	//평균계산
	public void getAvg() {
		for (int i = 0; i < student.length; i++) {
			student[i].setAvg((student[i].getCpp()+student[i].getJava())/2); //student[i].setAvg(student[i].getSum()/2)
		}//for
	}//getAvg()
	
	//총점의 내림차순 정렬
	public void getDescSort() {
		for (int i = 0; i < student.length; i++) {
			for (int j = i+1; j < student.length; j++) {
				if(student[i].getSum() < student[j].getSum()) {
					StudentDTO temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}//if
			}//for j
		}//for i
	}//getDescSort()
	
	//이름의 오름차순 정렬
	public void nameAscSort() {
		for (int i = 0; i < student.length; i++) {
			for (int j = i+1; j < student.length; j++) {
				if(student[i].getName().compareTo(student[j].getName())>0);
					StudentDTO temp = student[i];
					student[i] = student[j];
					student[j] = temp;
			}//for j
		}//for i
	}//nameAscSort()
	
	
	
	
	//출력메소드
	public void display() {
		System.out.println("성명\t학번\t학과\tC++\tJAVA\t총점\t평균");
		System.out.println("======================================================");
		DecimalFormat df = new DecimalFormat("0.0");
		for (int i = 0; i < student.length; i++) {
			System.out.print(student[i].getName()+"\t");
			System.out.print(student[i].getNum()+"\t");
			System.out.print(student[i].getMajor()+"\t");
			System.out.print(df.format(student[i].getCpp())+"\t");
			System.out.print(df.format(student[i].getJava())+"\t");
			System.out.print(df.format(student[i].getSum())+"\t");
			System.out.print(df.format(student[i].getAvg())+"\n");
		}//for
		System.out.println("======================================================");
	}//display()
	
}//class
