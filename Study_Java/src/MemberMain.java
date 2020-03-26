import java.util.ArrayList;

import com.hanul.member.MemberDAO;
import com.hanul.member.MemberDTO;

public class MemberMain {
	public static void main(String[] args) {
		//회원정보(MemberDTO)를 ArrayList<>에 저장하시오.
		ArrayList<MemberDTO> list = new ArrayList<>();
		list.add(new MemberDTO("홍길동", 27, "광주시 서구 농성동", "010-1111-1111"));
		list.add(new MemberDTO("김길동", 29, "광주시 서구 쌍촌동", "010-2222-2222"));
		list.add(new MemberDTO("나길동", 25, "광주시 남구 봉선동", "010-3333-3333"));
		
		//회원정보를 출력
		MemberDAO dao = new MemberDAO();
		dao.display(list);
		
		//나이의 오름차순 출력
		dao.ageAscSort(list);
		dao.display(list);
		
		//이름의 내림차순 출력
		dao.NameDescSort(list);
		dao.display(list);
	}//main()
}//class
