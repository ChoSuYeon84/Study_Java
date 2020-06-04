//1초후 출력 스레드를 중지 (stop 플래그 이용)
public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		printThread1.setStop(true);	//스레드를 종료하기 위해 stop 필드를 true로 변경
	}//main()
}//class
