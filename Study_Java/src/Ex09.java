import java.util.Scanner;
//입력된 액수만큼 500원, 100원, 50원, 10원짜리 동전으로 교환해주는 프로그램 작성
//동전의 총 개수는 최소화 한다.
//고액의 동전을 우선적으로 교환해준다.
public class Ex09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("교환할 돈을 입력하세요 : ");
		int money = scanner.nextInt();
		
		int c500, c100, c50, c10;
		
		c500 = money / 500;
		money = money % 500;
		
		c100 = money / 100;
		money = money % 100;
		
		c50 = money / 50;
		money = money % 50;
		
		c10 = money / 10;
		money = money % 10;
		
		System.out.println("오백원짜리 : "+c500+"개");
		System.out.println("백원짜리 : "+c100+"개");
		System.out.println("오십원짜리 : "+c50+"개");
		System.out.println("십원짜리 : "+c10+"개");
		System.out.println("바꾸지 못한 잔돈 : "+money+"원");
	
	}//main()
}//class
