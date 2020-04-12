import java.util.Scanner;

public class HonGonJa3 {
	public static void main(String[] args) {
		//while 문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보시오
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("============================");
			System.out.print("선택> ");
			String choice = scanner.nextLine();
			
			if(choice.equals("1")) {
				System.out.print("예금액> ");
				int deposit = Integer.parseInt(scanner.nextLine());
				balance += deposit;
				continue;
			} else if(choice.equals("2")) {
				System.out.print("출금액> ");
				int withDrawal = Integer.parseInt(scanner.nextLine());
				balance -= withDrawal;
				continue;
			} else if(choice.equals("3")) {
				System.out.println("잔고> "+balance);
				continue;
			} else {
				System.out.print("프로그램 종료");
				break;
			}//if
		}//while
		scanner.close();
	}//main()
}//class
