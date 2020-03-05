public class Study_Java12 {
	public static void main(String[] args) {
		/*
		★ 블럭if문 : 조건을 판단하여 참일때 또는 거짓일때의 명령을 실행

		if(조건식){
			참일때 실행문장;
		} else{
			거짓일때 실행문장;
		}

		*/
		int a=10;
		if(a%2==0) {
			System.out.println("짝수입니다.");	//조건식이 true
		} else {
			System.out.println("홀수입니다.");	//조건식이 false
		}//if
	}//main()
}//class
