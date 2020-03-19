public class BookDAO {	//행위정보(기능, 동작)를 저장하는 Class ▶ 메소드의 집합
	//출력메소드
	public void display(BookDTO[] book) {
		for (int i = 0; i < book.length; i++) {
			System.out.println("제목 : "+book[i].getTitle());
			System.out.println("가격 : "+book[i].getPrice());
			System.out.println("출판사 : "+book[i].getCompany());
			System.out.println("저자 : "+book[i].getName());
			System.out.println("==========================");
		}//for
		
	}//display()

}//class
