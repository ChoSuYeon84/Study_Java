public class PriorityMain {
	public static void main(String[] args) {
		//객체생성
		Priority priority1 = new Priority();
		Priority priority2 = new Priority();
		Priority priority3 = new Priority();
		
		//우선순위 설정
		priority1.setPriority(1);
		priority2.setPriority(5);
		priority3.setPriority(10);
		
		//쓰레드 실행
		priority1.start();
		priority2.start();
		priority3.start();
	}//main()
}//class
