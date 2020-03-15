import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Study_Java53 {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("abc.txt");
	}//main()
}//class

//throws : 예외를 처리하는 방법 → 예외 회피(예외 미루기)▶ 메소드 선언부에서 사용
//예) public void xxx()	{~~body~~} ▶ public void xxx() throws XXXException {~~body~~} 여러 예외가 나올때는 , 로 구분하여 써준다
//좋은 방법은 아니니 사용지양. 가급적이면 try catch 사용할것  (프로그램 내에서 오류를 깔끔하게 마감하는 편이 낫다)

