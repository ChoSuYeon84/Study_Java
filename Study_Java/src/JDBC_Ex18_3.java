import java.util.ArrayList;

import com.hanul.member2.MemberDAO;
import com.hanul.member2.MemberDTO;

public class JDBC_Ex18_3 {
	public static void main(String[] args) {
		//전체회원 목록을 검색 후 출력 : 전체 회원수가 몇명인지 알수 없다 ▶ ArrayList<>
		//memberSerchAll3(list) 호출 → 결과를 return 받아 출력
		ArrayList<MemberDTO> list = new ArrayList<>();
		MemberDAO dao = new MemberDAO();
		list = dao.memberSerchAll3(list);
		
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
