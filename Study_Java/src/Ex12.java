import java.util.Scanner;
//입력한 문자열의 대문자와 소문자, 숫자가 각각 몇개인지 세는 프로그램 작성해보기
public class Ex12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 (영어, 숫자만 입력 가능) : " );
		String str = scanner.nextLine();
		scanner.close();
		
		int upperCnt = 0;
		int lowerCnt = 0;
		int numCnt= 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				upperCnt++;
			} else if(ch >= 'a' && ch <= 'z') {
				lowerCnt++;
			} else if(ch >= '0' && ch <= '9') {
				numCnt++;
			}//if
		}//for
		System.out.println("대문자 : "+upperCnt+"개, 소문자 : "+lowerCnt+"개, 숫자 : "+numCnt+"개");
	}//main()
}//class
