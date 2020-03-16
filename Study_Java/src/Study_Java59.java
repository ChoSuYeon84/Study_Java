import java.text.DecimalFormat;
import java.util.Scanner;

public class Study_Java59 {
	//임의의 정수 두개를 입력받아 (num1,num2)
	//사칙연산을 수행하는 메소드를 호출(add(), sub(), mul(), div())
	//결과값은 리턴하여 출력
	//단, 나눗셈의 결과는 소수 둘째자리까지 표시 ▶ DecimalFormat Class
		
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요: ");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.print("두 번째 정수를 입력하세요: ");
		int num2 = Integer.parseInt(scanner.nextLine());
		scanner.close();
			
		System.out.println("첫번째 정수 : "+num1);
		System.out.println("두번째 정수 : "+num2);
			
		System.out.println("덧셈의 결과 : "+getAdd(num1, num2));
		System.out.println("뺄셈의 결과 : "+getSub(num1, num2));
		System.out.println("곱셈의 결과 : "+getMul(num1, num2));
		System.out.println("나눗셈의 결과 : "+getDiv(num1, num2));
		System.out.println("나눗셈의 결과 : "+getDivresult(num1, num2));
			
	}//main()
	
	//메소드 구현
	public static int getAdd (int num1, int num2) {
		return num1 + num2;
	}//getAdd()	
		
	public static int getSub (int num1, int num2) {
		return num1 - num2;
	}//getSub()	
		
	public static int getMul (int num1, int num2) {
		return num1 * num2;
	}//getMul()	
		
	public static double getDiv (int num1, int num2) {
		return (double)num1 / num2 ;
	}//getDiv()		
		
		
	public static String getDivresult(int num1, int num2) {
		DecimalFormat df = new DecimalFormat("0.00"); 	// DecimalFormat 사용하면 결과는 String Type
		return df.format((double)num1 / num2);	//나눗셈의 결과는 실수형 자료가 나올수 있다.
	}//getDivresult
}//class
