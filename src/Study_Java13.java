public class Study_Java13 {
	public static void main(String[] args) {
		/*

		★ 다중if문: 여러개의 조건을 판단하여, 해당 조건을 만족할 경우 실행

		if(조건식1){
			조건식1이 참일때 실행되는 문장;
		}else if(조건식2){
			조건식2가 참일때 실행되는 문장;
		}else if(조건식N){
			조건식 N이 참일때 실행되는 문장;
		}else{
			거짓일때 실행되는 문장;
		}

		*/
			
		int score = 87;
			
		if(score>=90) {
			System.out.println("A학점");
		} else if(score>=80) {
			System.out.println("B학점");
		} else if(score>=70) {
			System.out.println("C학점");
		} else if(score>=60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}//if
	}//main()
}//class
