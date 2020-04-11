import java.util.Scanner;

public class HonGonJa2 {
	//키보드로 아이디와 패스워드를 입력받아 입력된 내용을 비교해서 아이디가 java이고 패스워드가 12345라면 로그인 성공을 출력, 그렇지 않으면 로그인 실패 출력
	//단, 이름은 문자열이고 패스워드는 정수(int타입으로 변환)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String userId = scanner.nextLine();
		
		System.out.print("패스워드를 입력하세요 : ");
		int pw = Integer.parseInt(scanner.nextLine());
		
		if(userId.equals("java")) {
			if(pw == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패 : 아이디가 존재하지 않음");
		}//if
	}//main()
}//class
