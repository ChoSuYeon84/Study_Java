public class Study_Java14 {
	public static void main(String[] args) {
		/*
		 
		 ★ 중첩if문 : if문 안에 다른 if문이 있는 문장
		  
		if(조건식A){
			if(조건식1){
				조건식A를 만족한 상태에서 조건식1이 참일때 실행되는 문장;
			}else if(조건식2){
				조건식A를 만족한 상태에서 조건식2가 참일때 실행되는 문장;
			}//if
		}else if(조건식B){
			조건식 B가 참일때 실행되는 문장;
		}else{
			거짓일때 실행되는 문장;
		}//if
		  
		 */
		
		int score = 78;
		
		if(score >=0 && score<=100) {	//점수가 0부터 100사이이면
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
		}else {
			System.out.println("점수를 잘못 입력하셨습니다.");
		}//if		
	}//main()
}//class
