public class Study_Java25 {
	public static void main(String[] args) {
		//1부터 100까지의 정수 중에서 짝수의 합(evenSum)을 구하시오 : for,if
		int evenSum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}//if
		}//for
		System.out.println("for 짝수의 합: "+evenSum);
		
		//1부터 100까지의 정수 중에서 짝수의 합(evenSum)을 구하시오 : while,if
		evenSum= 0;
		int i = 0;
		while(i <= 100) {
			if(i % 2 == 0) {
				evenSum += i;
			}//if
			i++;				//i++을 if문 안에 놓지 않게 유의!!(무한루프에빠짐)→실행문안에 넣으면 안됨!
		}//while
		System.out.println("while 짝수의 합: "+evenSum);
	}//main()
}//class
