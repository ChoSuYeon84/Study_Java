public class Study_Java23 {
	public static void main(String[] args) {
		// 1부터 100까지의 정수 중에서 3의 배수의 누적합(sum)과 3의 배수의 개수(cnt)를 출력  
		// 출력예시 : 3의 배수의 누적합 :xxx, 3의 배수의 개수 : xx
		
		int sum = 0; int cnt = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
				cnt++;
			}//if
		}//for
		System.out.println("3의 배수의 누적합 : "+sum+", 3의 배수의 개수: "+cnt);
		
		// 1부터 100까지의 정수 중에서 3의 배수를 출력하시오.
		// 단, 한줄에 5개의 값을 출력하시오.
		
		int printCnt = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				if(i < 10) {
					System.out.print("0"+i+"\t");
				}else {
					System.out.print(i+"\t");
				}//if
				printCnt++;
					if(printCnt % 5 == 0) {
					System.out.println();
					}//if
			}//if
		}//for
	}//main()
}//class
