import java.util.ArrayList;

import com.hanul.member2.MemberDAO;
import com.hanul.member2.MemberDTO;

public class JDBC_Ex18_2 {
	public static void main(String[] args) {
		//전체회원 목록을 검색 후 출력 : 전체 회원수가 몇명인지 알수 없다 ▶ ArrayList<>
		//memberSerchAll(list) 호출
		ArrayList<MemberDTO> list = new ArrayList<>();
		MemberDAO dao = new MemberDAO();
		dao.memberSerchAll(list);
		
	}//main()
}//class
