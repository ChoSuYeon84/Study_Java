import java.util.Scanner;
//문자열을 입력받고, 입력받은 문자열의 순서를 거꾸로 출력해보자
public class Ex08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요 ▶ ");
		String str = scanner.nextLine();
		
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}//for
		
	}//main()
}//class
