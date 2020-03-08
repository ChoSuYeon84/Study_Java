public class Study_Java22 {
	public static void main(String[] args) {
		//1부터 100까지의 정수 중에서 홀수의 합(oddSum)과 짝수의 합(evenSum)을 출력
		//홀수의 개수(oddCnt)와 짝수의 개수(evenCnt)를출력
		//for(반복),if(홀수와 짝수를 판단)
		
		int oddSum = 0; int evenSum = 0;
		int oddCnt = 0; int evenCnt = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				oddSum += i;
				oddCnt++;
			}else {
				evenSum += i;
				evenCnt++;
			}//if
		}//for
		
		System.out.println("홀수의 합 : "+oddSum+", 짝수의 합 : "+evenSum);
		System.out.println("홀수의 개수 : "+oddCnt+", 짝수의 개수 :"+evenCnt);
		
		
	}//main()
}//class
