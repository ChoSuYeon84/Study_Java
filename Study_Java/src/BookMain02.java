public class BookMain02 {
	public static void main(String[] args) {
		//도서정보(BookDTO.java)를 저장할 객체배열(book[])을 선언
		BookDTO[] book;
		//3권의 도서정보가 저장될 객체배열(book[])을 생성
		book = new BookDTO[3];
		//BookDTO[] book = new BookDTO[3];	//객체배열을 선언 및 생성
		
		//BookDTO.java의 생성자 메소드를 이용하여 초기화 : 도서정보의 내용(값)을 입력
		book[0] = new BookDTO("JAVA", 20000, "한빛미디어", "신용권");
		book[1]	= new BookDTO("View", 28000, "삼양미디어", "김은옥");
		
		//디폴트 생성자 메소드를 이용하여 값을 할당
		BookDTO dto = new BookDTO();
		dto.setTitle("Android");
		dto.setPrice(40000);
		dto.setCompany("이지스퍼블리싱");
		dto.setName("정재곤");
		book[2]=dto;

		//도서정보(book[])의 내용을 출력 :BookDAO.java → display()메소드 호출
		BookDAO dao = new BookDAO();
		dao.display(book);
	}//main()
}//class
