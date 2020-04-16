import java.util.Scanner;

import com.hanul.member2.MemberDAO;
import com.hanul.member2.MemberDTO;

public class JDBC_Ex15 {
	public static void main(String[] args) {
		// PreparedStatement(전송객체)와 MemberDTO 연동
		// main() : 회원정보를 입력받는다 → memberInsert() 호출 ▶ DB입력(저장)
		Scanner scanner = new Scanner(System.in);
		System.out.print("회원 번호를 입력하세요 : ");
		int num = Integer.parseInt(scanner.nextLine());
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = Integer.parseInt(scanner.nextLine());
		System.out.print("주소를 입력하세요 : ");
		String addr = scanner.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		String tel = scanner.nextLine();
		scanner.close();
		System.out.println(num + "\t" + name + "\t" + age + "\t" + addr + "\t" + tel);

		MemberDTO dto = new MemberDTO(num, name, age, addr, tel);
		MemberDAO dao = new MemberDAO();
		int succ = dao.memberInsert(dto);
		if (succ > 0) {
			System.out.println("삽입성공");
		} else {
			System.out.println("삽입실패");
		}

	}// main()
}//class
