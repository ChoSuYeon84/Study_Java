import java.util.ArrayList;
import java.util.Scanner;

import com.hanul.member2.MemberDAO;
import com.hanul.member2.MemberDTO;

public class JDBC_Ex19_2 {
	public static void main(String[] args) {
		//검색할 이름을 입력 : 전체 회원수가 몇명인지 알수 없다 ▶ ArrayList<>
		//memberSerachName(list, serchName) 호출 : 검색결과를 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 : ");
		String searchName = scanner.nextLine();
		scanner.close();
		
		ArrayList<MemberDTO> list = new ArrayList<>();
		MemberDAO dao = new MemberDAO();
		dao.memberSearchName(list, searchName);
	}//main()
}//class
