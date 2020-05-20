//프로그램 종료(exit())
//현재 실행하고 있는 프로세스를 강제 종료시키는 역할을 한다.
public class ExitExample {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				System.exit(0);	//프로그램 강제 종료
				//break;
			}
		}
		System.out.println("마무리 코드"); // 7라인에서  System.exit(0)을 실행하면 출력되지 않음 -> System.exit(0) 대신에 break 사용시 출력됨
	}
}
