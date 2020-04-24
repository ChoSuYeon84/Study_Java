import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int a, b;
		int result;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요 : ");
		a = Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 계산할 값을 입력하세요 : ");
		b = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		result = a + b;
		System.out.println("a + b = "+result);
		
		result = a - b;
		System.out.println("a - b = "+result);
		
		result = a * b;
		System.out.println("a * b = "+result);
		
		result = a / b;
		System.out.println("a / b = "+result);
		
	}//main()
}//class
