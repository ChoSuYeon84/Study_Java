import java.util.Scanner;
//윤년 계산 프로그램
//4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년이다.
//400으로 나누어 떨어지는 해도 윤년에 포함된다.
public class Ex10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println(year+ "년은 윤년입니다.");
		} else if (year % 400 == 0) {
			System.out.println(year+ "년은 윤년입니다.");
		} else {
			System.out.println(year+ "년은 윤년이 아닙니다.");
		}//if
	}//main()
}//class
