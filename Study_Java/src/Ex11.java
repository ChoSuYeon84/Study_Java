import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("합계의 시작값을 입력하세요 : ");
		int start = scanner.nextInt();
		
		System.out.print("합계의 끝값을 입력하세요 : ");
		int end = scanner.nextInt();
		
		System.out.print("원하는 배수를  입력하세요 : ");
		int baesu = scanner.nextInt();
		scanner.close();
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if(i % baesu == 0) {
				sum += i;
			}//if
		}//for
		System.out.println(start+"부터 "+end+"까지의  "+baesu+"배수의 합계 : "+sum);
	}//main()
}//class
