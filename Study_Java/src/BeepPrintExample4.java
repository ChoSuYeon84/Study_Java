//메인 스레드와 작업 스레드가 동시에 실행
public class BeepPrintExample4 {
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(500); //0.5초간 일시정지
			} catch (Exception e) {	
				e.printStackTrace();
			}//try
		}//for
	}//main()
}//class
