import java.util.Scanner;

import com.hanul.member2.MemberDAO;

public class JDBC_Ex16 {
	public static void main(String[] args) {
		// main() : 회원번호를 입력 → memberDelete() 호출 ▶ 해당번호의 레코드를 삭제
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 회원 번호를 입력하세요 : ");
		int num = Integer.parseInt(scanner.nextLine());
		scanner.close();

		MemberDAO dao = new MemberDAO();
		int succ = dao.memberDelete(num);
		if (succ > 0) {
			System.out.println(num + "번 회원의 정보가 삭제되었습니다.");
		} else {
			System.out.println(num + "번 회원의 정보가 없습니다.");
		}
	}// main()
}//class
