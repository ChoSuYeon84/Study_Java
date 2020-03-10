public class Study_Java31 {
	public static void main(String[] args) {
		//continue: 반복문에서 continue문 아래의 실행문은 실행하지 않고,
		//제어권을 반복문의 첫머리로 이동하는 명령
		
		//1부터 10까지의 정수 중에서 홀수의 누적합(oddSum)을 구하시오 :for(반복),if(홀수판단)
		int oddSum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				oddSum += i;
			}//if
		}//for
		System.out.println("홀수의 누적합 : "+oddSum);
		
		//1부터 10까지의 정수 중에서 홀수의 누적합(oddSum)을 구하시오 :for(반복),if, continue
		oddSum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {			//짝수이면
				continue;				//반복문의 처음으로 되돌림 (i++로 간다)
			}else {
				oddSum += i;
			}//for
		}//for
		System.out.println("홀수의 누적합 : "+oddSum);
	}//main
}//class
