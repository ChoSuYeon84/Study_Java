//메인 스레드 이름 출력 및 UserThread 생성 및 시작
//디버깅할 때 어떤 스레드가 어떤 작업을 하는지 조사할 목적으로 가끔 사용됨.
public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();	//이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName() ); //스레드 이름 얻기
		
		Thread threadA = new ThreadA();	//ThreadA 생성
		System.out.println("작업 스레드 이름 : " + threadA.getName());	//스레드 이름 얻기
		threadA.start();//ThreadA시작
		
		Thread threadB = new ThreadB();	//ThreadA 생성
		System.out.println("작업 스레드 이름 : " + threadB.getName());	//스레드 이름 얻기
		threadB.start();//ThreadB시작
		
	}//main()
}//class
