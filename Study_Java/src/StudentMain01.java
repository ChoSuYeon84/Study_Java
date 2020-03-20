import com.hanul.student.StudentDAO;
import com.hanul.student.StudentDTO;

public class StudentMain01 {
	public static void main(String[] args) {
		//학생 3명의 성적을 처리할 객체(StudentDTO) 배열(student[])생성하고 값을 할당
		StudentDTO[] student = new StudentDTO[3];
		student[0] = new StudentDTO("홍길동", "2020001", "컴공과", 95.4F, 90.3F);
		student[1] = new StudentDTO("김길동", "2020002", "정통과", 80.7F, 85.6F);
		student[2] = new StudentDTO("나길동", "2020003", "전산과", 85F, 97.8F);
		
		//StudentDAO.java의 메소드를 호출
		//StudentDAO 객체 생성시 배열(student[])을 매개변수로 전달
		
		StudentDAO dao = new StudentDAO(student);
		dao.getSum();
		dao.getAvg();
		dao.getDescSort();
		dao.display();
		dao.nameAscSort();
		dao.display();
	}//main()
}//class