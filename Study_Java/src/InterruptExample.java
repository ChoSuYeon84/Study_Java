//1초 후 출력 스레드를 중지 (interrupt() 메소드 이용)
public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}//try
		
		thread.interrupt();	//스레드를 종료하기 위해 InterruptedException을 발생시킴
	}//main()
}//class
