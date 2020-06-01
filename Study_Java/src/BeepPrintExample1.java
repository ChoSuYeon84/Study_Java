import java.awt.Toolkit;
//0.5초 주기로 비프(beep)음을 발생시키면서 동시에 출력하는 작업이 있다고 가정
//비프음 발생과 출력은 서로 다른 작업이므로 메인 스레드가 동시에 두 가지 작업을 처리할 수 없음
//만약 다음과 같이 작성했다면 메인스레드는 비프음을 모두 발생한 다음 출력을 시작함.
public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	//Toolkit 객체 얻기
		for (int i = 0; i < 5; i++) {
			toolkit.beep();	//비프음 발생
			try {
				Thread.sleep(500);	//0.5초간 일시정지
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//for
		
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
