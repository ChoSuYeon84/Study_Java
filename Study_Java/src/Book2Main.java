import com.hanul.book2.Book2DAO;
import com.hanul.book2.Book2DTO;

public class Book2Main {
	public static void main(String[] args) {
		//3권의 도서정보를 저장할 객체배열을 생성하고 값을 할당
		Book2DTO[] book2= new Book2DTO[3];
		book2[0] = new Book2DTO("JAVA", "신용권", "한빛", 24000, 16);
		book2[1] = new Book2DTO("View", "김은옥", "삼양", 28000, 18);
		book2[2] = new Book2DTO("Android", "정재곤", "이지", 40000, 11);
		
		Book2DAO dao = new Book2DAO(book2);
		dao.getPrice();
		dao.display();
	}//main()
}//class
