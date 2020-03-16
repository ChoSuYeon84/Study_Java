import java.util.Scanner;

public class Study_Java58 {
	
	//임의의 실수 2개를 입력받아(num1,num2) ▶ Scanner
	//두 실수의 합을 구하여 리턴하는 메소드(getSum())를 호출
	//결과를 출력
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 실수를 입력하세요 : ");
		double num1 = Double.parseDouble(scanner.nextLine());	//스캐너에는 엔터가 존재하므로 래핑필요
		System.out.print("두번째 실수를 입력하세요 : ");
		double num2 = Double.parseDouble(scanner.nextLine());
		scanner.close();
		
		double sum = getSum(num1, num2);
		System.out.println("두 실수의 합 : "+sum);
		System.out.println("두 실수의 합 : "+getSum(num1, num2));
	}//main()
	
	//임의의 실수 2개를 전달받아, 두 실수의 합(sum)을 구하여 리턴하는 메소드 (getSum())를 정의
	public static double getSum(double num1, double num2) {
	//	double sum = num1+num2;
	//	return sum;
		return num1+num2;
	}//getSum()
}//class
