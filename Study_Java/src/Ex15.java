import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		//문자열을 입력 받은 후 알파벳 o를 $로 변경하여 출력하는 프로그램 작성
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 ▶ ");
		String str = scanner.nextLine();
		scanner.close();
		
		System.out.print("출력 문자열 ▶ ");
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'o') {
				System.out.print('$');
			} else {
				System.out.print(str.charAt(i));
			}//if
		}//for
		System.out.println();
		
		//모든 문자를 알파벳의 다음 문자로 출력해보기
		System.out.print("모든 문자를 알파벳의 다음 문자로  출력 ▶");
		for (int i = 0; i < str.length(); i++) {
			System.out.print((char)(str.charAt(i)+1));
		}//for
		System.out.println();
	}//main()
}//class
