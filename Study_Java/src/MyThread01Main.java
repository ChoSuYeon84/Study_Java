public class MyThread01Main {
	public static void main(String[] args) {
		MyThread01 thread01 = new MyThread01();
		MyThread02 thread02 = new MyThread02();		
		//thread01, thread02의 run() 메소드 호출
		//thread01.run();	//1~30 출력
		//thread02.run();	//a ~ z 출력
		
		//thread01, thread02의 run() 메소드가 동시에 실행될수 있도록 호출
		thread01.start();
		thread02.start();
	}//main()
}//class
