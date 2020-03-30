import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_BufferedReaderWhile {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			while(true) {
				System.out.print("여러 글자를 입력하세요 : ");
				String msg = br.readLine();
				if(msg.equalsIgnoreCase("bye")) {
					System.out.println("종료되었습니다.");
					break;
				}//if
				System.out.println("입력하신 문자열은 "+msg +"입니다.");
			}//while
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class
