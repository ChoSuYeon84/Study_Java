import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//Hashtable
//Hashtable은 HashMap과 동일한 내부구조를 가지고 있음. 
//Hashtable은 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 Hashtable의 메소드들을 실행할 수 없고, 
//하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다. → 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있기 때문에 스레드에 안전함.

//아이디와 비밀번호 검사하기
public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		//아이디와 비밀번호를 미리 저장
		map.put("Spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		//키보드로부터 입력된 내용을 받기 위해 생성
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();	//키보드로 입력한 아이디를 읽음
			System.out.print("비밀번호 : ");
			String password = scanner.nextLine();	//키보드로 입력한 비밀번호를 읽음
						
			if(map.containsKey(id)) {	//아이디인 키가 존재하는지 확인
				if(map.get(id).equals(password)) {	//비밀번호를 비교
					System.out.println("로그인되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}//if
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}//if
		}//while
		scanner.close();
	}//main()
}//class
