public class Study_Java26 {
	public static void main(String[] args) {
		/*
		○ do~~ while : 선처리→후조건
			※ 조건이 처음부터 거짓이더라도 실행문은 최소 1번은 실행
			
			초기값;
			do{
				실행문;
				증감값;
			} while(조건식);
		*/
		//1부터 100까지의 정수 중에서 짝수의 합(evenSum)을 구하시오 : while,if
		int evenSum = 0;
		int i = 1;
		while (i <= 100) {
			if(i % 2 == 0) {
				evenSum += i;
			}//if
			i++;		
		}//while
		System.out.println("while 짝수의 합 : "+evenSum);
		
		//1부터 100까지의 정수 중에서 짝수의 합(evenSum)을 구하시오 : do_while,if
		evenSum = 0;
		i = 1;
		do {
			if(i % 2 == 0) {
				evenSum += i;
			}//if
			i++;
		}while(i<=100);		//반드시 ;를 써서 막아줘야함
		System.out.println("do_while 짝수의 합 : "+evenSum);
	}//main()
}//class
