public class Book {
	//멤버변수 선언 : 제목(title), 가격(price), 출판사(company), 저자(name)
	String title, company, name;
	int price;
	
	//멤버메소드 정의
	public void display() {
		System.out.println("제목 : "+title);
		System.out.println("가격 : "+price);
		System.out.println("출판사 : "+company);
		System.out.println("저자 : "+name);
		System.out.println("=================");
	}//display()
}//class
