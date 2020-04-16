import java.util.Scanner;

import com.hanul.member2.MemberDAO;

public class JDBC_Ex19_1 {
	public static void main(String[] args) {
		//검색할 이름을 입력 → memberSerchName() 호출
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 : ");
		String searchName = scanner.nextLine();
		scanner.close();
		
		MemberDAO dao = new MemberDAO();
		dao.memberSerchName(searchName);
	}//main()
}//class
