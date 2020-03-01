//Variable01
public class Study_Java02 {
	public static void main(String[] args) {
		//정수 2개를 저장할 변수를 선언하시오(변수명은  a,b)
		int a;		//정수형 변수 a를 선언
		int b;		//정수형 변수 b를 선언
		//int a,b;	//같은 자료형의 변수를 나열(comma(,)구분)
		
		//변수 a에 10, 변수 b에 20을 할당(대입)하시오.
		a=10;		//변수 a에 값(10)을 할당(대입)
		b=20;		//변수 b에 값(20)을 할당(대입)
		
		//정수형 변수 c와 d를 선언하고,  c에 30, d에 40을 할당하시오.
		int c=30;	//선언과 동시에 값을(리터럴, literal)을 할당 ▶초기화
		int d=40;	//선언과 동시에 값을(리터럴, literal)을 할당 ▶초기화
		//int c=30, d=40;	//같은 자료형의 변수를 초기화하고 나열

		//같은 자료형의 변수를 초기화하고 나열
		System.out.println("변수 a의 값 :"+a);
		System.out.println("변수 b의 값 :"+b);
		System.out.println("변수 c의 값 :"+c);
		System.out.println("변수 d의 값 :"+d);
		
		//a의 값을 50으로,b의 값을 60으로 변경하여 출력하시오▶재할당(값이 변경되는 현상)
		a=50;	//a의 값이 10에서 50으로 변경(재할당)
		b=60;	//b의 값이 20에서 60으로 변경(재할당)
		System.out.println("변수 a의 값 :"+a);
		System.out.println("변수 b의 값 :"+b);
	}//main()
}//class
