public class HomeWork_Calculator {
	/*
	 문제1) 계산기 클래스(Calculator)를 선언하고, 모든 메소드는 static 메소드로 구현하고 2개의 숫자를 파라미터(매개변수)로 받아서 결과를 리턴하도록 구현하시오.
	[기능]
	덧셈 : add(x, y)
	뺄셈 : sub(x, y)
	곱셈 : mul(x, y)
	나눗셈 : div(x, y) ▶ 나눗셈의 결과는 정수값만 출력

	문제2) 문제1에서 작성한 계산기 클래스를 실행하는 프로그램을 작성하되, 객체를 생성하지 않고 덧셈, 뺄셈, 곱셈, 나눗셈의 기능을 이용하여 다음의 출력 결과가 나오도록 작성하시오.
	[출력결과]
	덧셈 : 5 + 3 = 8
	뺄셈 : 9 – 7 = 2
	곱셈 : 8 * 4 = 32
	나눗셈 : 12 / 6 = 2
	*/
	
	public static void main(String[] args) {
		System.out.println("덧셈 : 5 + 3 = "+add (5 , 3));
		System.out.println("뺄셈 : 9 – 7 = "+sub (9 , 7));
		System.out.println("곱셈 : 8 * 4 = "+mul (8 , 4));
		System.out.println("나눗셈 : 12 / 6 = "+div (12 , 6));
		
	}//main()
	
	public static int add (int x , int y) {
		return (x + y);
	}//add()
	
	public static int sub (int x, int y) {
		return (x - y);
	}//sub()
	
	public static int mul (int x, int y) {
		return (x * y);
	}//mul()
	
	public static int div (int x, int y) {
		return (x / y);
	}//div()
}//class
