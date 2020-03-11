import java.util.Scanner;

public class Study_Java36 {
	public static void main(String[] args) {
		//두개의 정수를 입력(num1, num2)받은 후에, 사칙연산을 수행하고 결과를 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		System.out.println("첫번째 정수 : "+num1);
		System.out.println("두번째 정수 : "+num2);
		System.out.println("덧셈의 결과 : "+(num1+num2));
		System.out.println("뺄셈의 결과 : "+(num1-num2));
		System.out.println("곱셈의 결과 : "+(num1*num2));
		System.out.println("나눗셈의 결과 : "+(num1/num2));			// 나눗셈이 나올때는 실수로의 형변환을 생각할것. (int/int)=int 이므로 소수점 자리를 버리고 정수값만 취함
		System.out.println("나눗셈의 결과 : "+(float)(num1/num2));	//소수점 자리를 버리고 정수값을 취한뒤 float으로 변환했기 때문에 값이 X.0이됨
		System.out.println("나눗셈의 결과 : "+((float)num1/num2));	//정상적으로 소수점 이하 자리수까지 출력 ok.
	}//main()
}//class
