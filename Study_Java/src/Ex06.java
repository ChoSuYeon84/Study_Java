import java.util.Scanner;

//10진수, 16진수, 8진수 중 어떤 진수의 값을 입력할지 결정하고, 
//해당 숫자를 입력한 다음 입력한 수를 선택한 진수로 출력하는 프로그램 작성
public class Ex06 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("입력진수 결정  : 1. 10진수, 2. 16진수, 3. 8진수  ▶ ");
		int num = Integer.parseInt(Scanner.nextLine());
		System.out.print("값 입력  ▶ ");
		int num2 = Integer.parseInt(Scanner.nextLine());
		Scanner.close();
		
		if (num == 1) {
			System.out.printf("10진수 : %d \n", num2);
		} else if (num == 2) {
			System.out.printf("16진수 : %x \n", num2);
		} else {
			System.out.printf("8진수 : %o \n", num2);
		}//if
		
		
	}//main()
}//class
