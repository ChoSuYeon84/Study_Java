import java.io.InputStreamReader;

public class IO_EX05 {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);	//연쇄(연결)
		System.out.print("한글 여러 글자를 입력하세요 : ");
		
		try {
			int data;
			while((data = isr.read()) != -1) {
				System.out.println("입력하신 글자는 "+(char)data+"입니다.");
			}//while
			System.out.println("종료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class
