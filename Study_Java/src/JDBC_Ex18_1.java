import com.hanul.member2.MemberDAO;

public class JDBC_Ex18_1 {
	public static void main(String[] args) {
		//전체회원 목록을 검색 후 출력 :memberSearchAll() 호출
		MemberDAO dao = new MemberDAO();
		dao.memberSerchAll();
	}//main()
}//class
