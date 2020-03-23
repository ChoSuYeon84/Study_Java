public class Ex_static01 {
	public static void main(String[] args) {
		display1();
		//display2();	//non-static : 접근 불가능
		
		Ex_static01 ex01 = new Ex_static01();	//객체생성
		ex01.display2();
	}//main()
	
	public static void display1() {
		System.out.println("Display1");
	}//display1()
	
	public void display2() {
		System.out.println("Display2");
	}//display2()
	
	static {
		System.out.println("static 초기화 블럭");
	}//static
}//class

//static : 프로그램 시작전에 먼저 메모리에 할당, 프로그램 종료 시 소멸
//초기화 블럭 : static {~~~} ▶ 가장 먼저 실행되는 블럭