import java.util.Date;
//객체의 문자정보(toString() 메소드)
//Object클래스의 toString() 메소드는 객체의 문자 정보를 리턴 -> 기본적으로 '클래스이름@16진수해시코드'로 구성된 문자 정보를 리턴함
//Object클래스의 toString() 메소드의 리턴값은 자바 애플리케이션에서는 별 값어치가 없는 정보이므로 
//Object 하위클래스는 toStirng() 메소드를 재정의(오버라이딩) 하여 간결하고 유익한 정보를 리턴. 
public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());	//java.lang.Object@7852e922
		System.out.println(obj2.toString());	//Tue May 19 21:23:25 KST 2020
	}//main()
}//class
