//자바는 다중상속이 불가능
//이미 다른 클래스를 상속받은 상태에서 Thread 구현 ▶ 문제가 발생
//이러한 문제점을 해결하기 위해 Runnable Interface 제공
public class MyThread04 implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 30; i++) {
			System.out.print(i+", ");
		}//for
		System.out.println();
	}//run()
}//class

class MyThread05 implements Runnable{
	@Override
	public void run() {
		for(char i='a'; i <= 'z'; i++) {
			System.out.print(i +", ");
		}//for
		System.out.println();
	}//run()
}//class
