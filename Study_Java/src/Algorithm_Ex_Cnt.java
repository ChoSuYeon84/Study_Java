import java.util.Scanner;

public class Algorithm_Ex_Cnt {
	public static void main(String[] args) {
		//두개의 정수를 입력받아(num1, num2) 두 수 사이의 정수의 개수(cnt)를 출력
		
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		while(true) {
			System.out.print("첫 번째 정수를 입력하세요 : ");
			int num1 = Integer.parseInt(scanner.nextLine());
			System.out.print("두 번째 정수를 입력하세요 : ");
			int num2 = Integer.parseInt(scanner.nextLine());
			if(num1 > num2) {
				System.out.println("첫 번째 정수는 작은수, 두번째 정수는 큰 수를 입력하세요!");
				continue;
			}else {
				System.out.println("첫번째 정수 : "+num1);
				System.out.println("두번째 정수 : "+num2);
				for (int i = num1; i <= num2; i++) {
					cnt++;
				}//for
				System.out.println("두 수 사이의 정수의 개수 : "+cnt);
				break;
			}//if
		}//while
		scanner.close();
		
	}//main()
}//class
