public class Study_Java24 {
	public static void main(String[] args) {
		/*
		 ★ while : 반복 횟수를 모를 경우 사용 (선조건→후처리) 
		 
		 초기값설정;			
		 while(조건식){
		 	실행문;
		 	증감값;
		 }
		 */
		//1부터 100까지의 누적합(forSum)을 구하시오: for
		int forSum =0;
		for(int i = 1; i <= 100; i++) {
			forSum += i ;
		}//for
		System.out.println("for 누적합 : "+forSum);
		
		//1부터 100까지의 누적합(forSum)을 구하시오: while
		forSum = 0;
		int i = 0;
		while(i <=100) {
			forSum += i;
			i++;
		}//while
		System.out.println("while 누적합: "+forSum);
	}//main()
}//class
