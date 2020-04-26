import java.util.Scanner;

//정수형 숫자를 하나 입력받고 10진수, 16진수, 8진수로 출력하는 프로그램을 작성해보자
public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 ▶ ");
		int num = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		System.out.printf("10진수 : %d \n", num);
		System.out.printf("16진수 : %x \n", num);
		System.out.printf("8진수 : %o \n", num);
	}//main()
}//class
