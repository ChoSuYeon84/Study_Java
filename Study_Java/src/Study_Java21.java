public class Study_Java21 {
	public static void main(String[] args) {
		//1부터 100까지의 정수 중에서 홀수의 누적합(oddsum)을 구하여 출력 : for(반복)
		int oddSum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
			}//if
		oddSum = oddSum + i;	
		}//for
		System.out.println("홀수의 누적합 : "+oddSum);
	}//main()
}//class
