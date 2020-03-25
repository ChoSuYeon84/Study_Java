import java.util.ArrayList;

import com.hanul.array.Test;

public class ArrayListMain02 {
	public static void main(String[] args) {
		//ArrayList<>객체생성(list1) → *Object : 모든 객체(클래스)*-> 출력할때 타입변환을 반드시 생각해서 써주어야함(Casting)
		ArrayList<Object> list1 = new ArrayList<Object>();
		list1.add(new Integer(100));	//Element(요소)는 반드시 객체(클래스 타입)
		list1.add(new String("Apple"));
		list1.add(new Test());
		
		for (int i = 0; i < list1.size(); i++) {
			Object obj = list1.get(i);	//list1의 i번째 index 값을 가져온다 ▶ Object Type
			if(obj instanceof Integer) {			//obj의 타입이 Integer 타입
				System.out.println((Integer)obj);	//Integer 타입으로 Casting후 출력
			}else if(obj instanceof String) {		//obj의 타입이 String 타입
				System.out.println((String)obj);	//String 타입으로 Casting후 출력
			}else if(obj instanceof Test) {
				((Test)obj).display();				//Test 타입으로 Casting 후 출력
			}//if
		}//for
		
		System.out.println("=====================");
		//ArrayList<> 객체 생성(list2) : *특정 클래스(Test.java)만 저장*하기 위해 타입제한
		ArrayList<Test>list2 = new ArrayList<>();//생성자에서는 타입을 안넣어도 되지만, 받을때(등호 왼쪽)는 반드시 타입을 넣어줘야한다. 둘다 넣어주는게 FM이긴함.
		list2.add(new Test());
		//list2.add(new Integer(100));	//오류 
		
		list2.get(0).display();
	}//main()
}//class
