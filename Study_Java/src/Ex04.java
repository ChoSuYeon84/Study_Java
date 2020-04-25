import java.io.IOException;
import java.util.Scanner;

//Ex03에서는 0으로 나누면 오류가 발생하는데 이러한 오류가 없도록 해보자. 그리고 연산자를 직접 기호(+,-,*,/)로 입력하고 나머지 값 연산자인 %도 계산되게 한다.
public class Ex04 {
	public static void main(String[] args) throws IOException { 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("첫번째 계산할 값을 입력하세요 ▶");
			int num1 = Integer.parseInt(scanner.nextLine());
			System.out.print("두번째 계산할 값을 입력하세요 ▶");
			int num2 = Integer.parseInt(scanner.nextLine());
		
			System.out.println("아래 연산 기호 중 하나를 선택하여 입력하세요.");
			System.out.print("+ - * / % ▶");
			String op = scanner.nextLine();
			
			if(op.equals("+")) {
				System.out.println(num1+" + "+num2+" = "+(num1+num2));
			} else if (op.equals("-")) {
				System.out.println(num1+" - "+num2+" = "+(num1-num2));
			} else if (op.equals("*")) {
				System.out.println(num1+" * "+num2+" = "+(num1*num2));
			} else if (op.equals("/")) {
				System.out.println(num1+" / "+num2+" = "+((double)num1/num2));
			} else if (op.equals("/") && num2 == 0) {
				System.out.println("나눗셈 연산은 0으로 나누면 안됩니다.");
				continue;
			} else if (op.equals("%")) {
				System.out.println(num1+" % "+num2+" = "+(num1%num2));
			} else if (op.equals("%") && num2 == 0) {
				System.out.println("0으로 나누면 나머지 값이 안됩니다.");
				continue;
			} else {
				System.out.println("연산자를 잘못 입력하셨습니다.");
				continue;
			}//if
			break;
		}//while
		scanner.close();
	}//main()
}//class
