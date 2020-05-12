import java.io.File;
import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("D:\\Study_Java\\Git_project\\Study_Java\\src\\data2.txt"));		//File을 지정해서 Scanner 클래스의 변수를 선언한다.
		
		int sum = 0;	//합계 변수를 선언하고 초기화
		
		while (scanner.hasNextLine()) {	//파일의 마지막까지 무한 반복.
			sum += scanner.nextInt();	//파일 내용을 정수형으로 읽어 누적합계를 계산
		}//while
		System.out.println("합계 : "+sum);	//누적합 출력
		scanner.close();
		
	}//main()
}//class
