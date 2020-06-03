public class ThreadB extends Thread {
	//스레드 이름을 따로 지정하지 않으면 자동적으로 'Thread-n'이라는 이름으로 설정된다. (n은 스레드의 번호를 의미)	
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}//for
	}//run()
}//class
