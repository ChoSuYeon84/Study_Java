import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		//문자열의 처음 또는 끝이 특정 문자열인지 확인하는 startsWith(), endsWith()
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력 하세요 : ");
		String str = scanner.nextLine();
		scanner.close();
		
		System.out.print("출력 문자열 : ");
		
		if(!str.startsWith("(")) {
			System.out.print("(");
		}//if
		
		System.out.print(str);
		
		if(!str.endsWith(")")) {
			System.out.print(")");
		}//if
	}//main()
}//class
