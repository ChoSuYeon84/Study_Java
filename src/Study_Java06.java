//Operator03
public class Study_Java06 {
	public static void main(String[] args) {
		//비트연산자: 개발자의 입장에서 비트를 직접 조작할 수 있다는 장점→하드웨어 제어
		//현재는 거의 사용하지 않는다.
		//① & (AND): 모두1일때 1출력
		//② | (OR): 하나라도 1일때 1출력
		//③ ^ (XOR): 서로 다를때 1출력
		int x=3; 	//2진법: 0011
		int y=2;	//2진법 : 0010
			
		System.out.println(x&y);	//출력값:2 (0010)
		System.out.println(x|y);	//출력값:3 (0011)
		System.out.println(x^y);	//출력값:1 (0001)
		
		//비교연산자▶ 조건문에 많이 사용
		//연산의 결과는 true,false반환
		//>,>=,<,<=:수학의 연산과 같은 관계연산자(비교연산)
		//a=b:수학에서는 같다라는 의미이지만, 프로그램에서는 할당(대입)을 의미
		//a==b:프로그램에서 같다라는 의미
		//a!=b:같지 않다라는 의미
		int a=10, b=5;
		System.out.println(a>b);	//true
		System.out.println(a>=b);	//true
		System.out.println(a<b);	//false
		System.out.println(a<=b);	//false
		System.out.println(a==b);	//false
		System.out.println(a!=b);	//true
		
		//논리연산자 : 여러개의 조건을 판단▶ 조건식에 많이 사용
		//연산의 결과는 true, false 반환
		//조건A&&조건B:조건A도 참이고 조건B도 참일 경우→참으로 출력
		//조건A||조건B:조건A또는 조건B중에서 하나라도 참일경우→참으로 출력
		//AND조건(모두 만족):&&		▶~~이면서,~~이고
		//OR조건(하나라도 만족):|| 	▶~~이거나,~~또는
		System.out.println(10>5 && 20>5);	//true&&true → true
		System.out.println(10>5 && 5>20);	//true&&false → false
		System.out.println(5>10 && 20>5);	//false&&true → false
		System.out.println(5>10 && 5>20);	//false&&false → false
		
		System.out.println(10>5 || 20>5);	//true||true → true
		System.out.println(10>5 || 5>20);	//true||false → true
		System.out.println(5>10 || 20>5);	//false||true → true
		System.out.println(5>10 || 5>20);	//false||false → false		
		
	}//main()
}//class
