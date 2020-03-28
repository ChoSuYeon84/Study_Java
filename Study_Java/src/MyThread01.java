//동시작업 : 쓰레드(Thread) ▶ Thread 클래스를 상속받아 run() 메소드에 구현
public class MyThread01 extends Thread{
	//동시작업 : 쓰레드(Thread) ▶ Thread 클래스를 상속받아 run() 메소드에 구현
	@Override
	public void run() {
		for(int i = 1; i <= 30; i++) {
			System.out.print(i+", ");
		}//for
		System.out.println();
	}//run()
}//class


class MyThread02 extends Thread{
	//a ~ z 출력하는 코드구현 : run() 메소드에서 재정의(override)
	@Override
	public void run() {
		for(int i = 97; i <= 122; i++) {		//for(char i='a'; i <= 'z'; i++)
			System.out.print((char)i +", ");	//System.out.print(i +", ");
		}//	for
		System.out.println();
	}//run()
}//class