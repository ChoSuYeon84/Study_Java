public class MyThread04Main {
	public static void main(String[] args) {
		//객체 생성
		MyThread04 run1 = new MyThread04();
		MyThread05 run2 = new MyThread05();
		
		//Runnable Interface를 상속받아 구현한 Thread는 진짜 쓰레드가 아니다.
		//Thread 객체를 생성하고, Runnable을 매개변수로 전달한다. 
		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run2);
		//Thread thread = new Thread(new MyThread04());
		
		//Thread의 실행은 start() 메소드를 호출
		thread1.start();
		thread2.start();
	}//main()
}//class
