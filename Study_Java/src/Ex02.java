import java.util.Scanner;

//숫자 4개를 입력받아 그 합을 구하는 프로그램 작성
public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 계산할 값을 입력하세요 ▶");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.print("두 번째 계산할 값을 입력하세요 ▶");
		int num2 = Integer.parseInt(scanner.nextLine());
		System.out.print("세 번째 계산할 값을 입력하세요 ▶");
		int num3 = Integer.parseInt(scanner.nextLine());
		System.out.print("네 번째 계산할 값을 입력하세요 ▶");
		int num4 = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		int sum = num1+num2+num3+num4;
		
		System.out.println(num1+"+"+num2+"+"+num3+"+"+num4+"="+sum);
	}
}//class
