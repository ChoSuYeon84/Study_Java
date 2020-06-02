import java.awt.Toolkit;

//작업 스레드가 실행할 작업을 Runnable로 만들지 않고, Thread의 하위 클래스로 작업스레드 정의
//비프음을 들려주는 스레드
public class BeepThread extends Thread {
	@Override
	public void run() {
		//스레드 실행내용
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();	//비프음 발생
			try {
				Thread.sleep(500);	//0.5초간 일시정지
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//for
	}//run()
}//class
