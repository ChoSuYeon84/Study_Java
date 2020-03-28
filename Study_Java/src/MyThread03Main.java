public class MyThread03Main {
	public static void main(String[] args) {
		//하나의 작업(Mythread03.java)을 동시에 실행되게 하자.
		//Thread Class는 하나만 만들고, 객체를 여러개 생성해서 실행하면 된다.
		MyThread03 thread0 = new MyThread03();
		MyThread03 thread1 = new MyThread03();
		MyThread03 thread2 = new MyThread03();
		
		//쓰레드의 실행은 start() 메소드를 호출
		thread0.start();
		thread1.start();
		thread2.start();
	}//main()
}//class
