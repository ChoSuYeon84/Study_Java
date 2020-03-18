public class BookMain {
	public static void main(String[] args) {
		//Book 객체를 생성하고 값을 할당
		Book b1 = new Book();
		b1.title ="자바";
		b1.price = 24000;
		b1.company = "한빛미디어";
		b1.name = "신용권";
		
		Book b2 = new Book();
		b2.title = "View";
		b2.price = 28000;
		b2.company = "삼양미디어";
		b2.name = "김은옥";
		
		Book b3 = new Book();
		b3.title = "Android";
		b3.price = 40000;
		b3.company = "이지스퍼블리싱";
		b3.name = "정재곤";
		
		//출력
		b1.display();
		b2.display();
		b3.display();
	}//main()
}//class
