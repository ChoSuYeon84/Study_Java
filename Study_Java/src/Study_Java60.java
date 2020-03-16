import java.util.Scanner;

public class Study_Java60 {
	//임의의 정수 두개를 입력받아(su1, su2)
	//짝수의 합(evenSum)과 홀수의 합(oddSum)을 구하는 메소드 호출(evenSum(), oddSum())
	//결과값은 리턴하여 출력
	//단, 첫번째 정수는 작은수를 입력받고, 두번째 정수는 큰수를 입력받는다.	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫 번째 정수를 입력하세요 : ");
			int su1 = Integer.parseInt(scanner.nextLine());
			System.out.print("두 번째 정수를 입력하세요 : ");
			int su2 = Integer.parseInt(scanner.nextLine());
					
			if(su1>su2) {
				System.out.println("첫 번째 정수는 작은수, 두번째 정수는 큰 수를 입력하세요!");
				continue;
			}else {
				System.out.println("첫번째 정수 : "+su1);
				System.out.println("두번째 정수 : "+su2);
				System.out.println("짝수의 합 : "+ evenSum(su1, su2));
				System.out.println("홀수의 합 : "+ oddSum(su1, su2));
				break;
			}//if
		}//while
		scanner.close();
		
	}//main()
	
	//짝수의 합
	public static int evenSum(int su1, int su2) {
		int evenSum = 0;
		for (int i = su1; i <= su2; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}//if
		}//for
		return evenSum;
	}//evenSum()
	
	//홀수의 합
	public static int oddSum(int su1, int su2) {
		int oddSum = 0;
		for (int i = su1; i <= su2; i++ ) {
			oddSum += i;
		}//for
		return oddSum;
	}//oddSum()
}//class
