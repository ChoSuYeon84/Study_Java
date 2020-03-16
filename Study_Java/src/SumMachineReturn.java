import java.util.Scanner;

public class SumMachineReturn {
	//시작값(startNum)과 종료값(endNum)을 입력받은 후 
	//makeSum() 메소드를 호출하고 결과값(sum)을 return 받아 출력
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작값을 입력하세요 : ");
		int startNum = Integer.parseInt(scanner.nextLine());
		System.out.print("종료값을 입력하세요 : ");
		int endNum = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		System.out.println("시작값 : "+startNum);
		System.out.println("종료값 : "+endNum);
		//System.out.println("누적합 : "+makeSum(startNum,endNum));	//오류 : static 없다
		SumMachineReturn smr = new SumMachineReturn();	//객체를 생성
		System.out.println("누적합: "+smr.makeSum(startNum, endNum));
	}//main()
	
	//시작값과 종료값까지 누적합(sum)을 구하고 결과를 리턴하는 메소드(makeSum())를 정의
		private int makeSum(int startNum, int endNum) {	//static 제거, public → private
			int sum = 0;
			for(int i = startNum; i <= endNum; i++) {
				sum += i;
			}//for
			return sum;
		}//makeSum()
}//class	