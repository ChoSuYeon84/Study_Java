import java.util.ArrayList;
import java.util.Scanner;

import com.hanul.member2.MemberDAO;
import com.hanul.member2.MemberDTO;

public class JDBC_Ex19_3 {
	public static void main(String[] args) {
		//검색할 이름을 입력 : 전체 회원수가 몇명인지 알수 없다 ▶ ArrayList<>
		//memberSerachName3(list, serchName) 호출 → 결과를 return 받아 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 : ");
		String searchName = scanner.nextLine();
		scanner.close();
		
		ArrayList<MemberDTO> list = new ArrayList<>();
		MemberDAO dao = new MemberDAO();
		dao.memberSearchName3(list, searchName);
		
		//list의 내용을 출력
		
		if(list.size() == 0) {
			System.out.println("검색된 결과가 없습니다.");
		} else {
			for (MemberDTO dto : list) {
				System.out.print(dto.getNum()+"\t");
				System.out.print(dto.getName()+"\t");
				System.out.print(dto.getAge()+"\t");
				System.out.print(dto.getAddr()+"\t");
				System.out.print(dto.getTel()+"\n");
			}//for
		}//if
		
	}//main()
}//class
