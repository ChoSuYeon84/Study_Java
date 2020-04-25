import java.util.Scanner;

//덧셈, 뺄셈, 곱셈, 나눗셈 중 하나를 선택하여 계산하는 프로그램을 if문을 사용하여 작성
public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
			System.out.print("첫번째 계산할 값을 입력하세요 ▶");
			int num1 = Integer.parseInt(scanner.nextLine());
			System.out.print("두번째 계산할 값을 입력하세요 ▶");
			int num2 = Integer.parseInt(scanner.nextLine());
		
		while(true) {
			System.out.println("아래 네가지 연산중 하나를 선택하여 숫자를 입력하세요.");
			System.out.print("1.덧셈  2.뺄셈  3.곱셈  4.나눗셈  ▶");
			int op = Integer.parseInt(scanner.nextLine());
			
			if(op == 1) {
				System.out.println(num1+" + "+num2+" = "+(num1+num2));
			} else if (op == 2) {
				System.out.println(num1+" - "+num2+" = "+(num1-num2));
			} else if (op == 3) {
				System.out.println(num1+" * "+num2+" = "+(num1*num2));
			} else if (op == 4) {
				System.out.println(num1+" / "+num2+" = "+((double)num1/num2));
			} else {
				System.out.println("연산자를 잘못 입력하셨습니다.");
				continue;
			}//if
			break;
		}//while
		scanner.close();
	}//main()
}//class
