import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IO_Ex07 {
	//키보드에서 한글 여러글자를 입력받아 출력 : 버퍼(Buffer)를 활용
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);	//문자 스트림
		BufferedReader br = new BufferedReader(isr);	//버퍼 활용 스트림
		
		//BufferedReader br = new BufferedReader(InputStreamReader(System.in));
		try {
			String msg = br.readLine();	//readLine() : Enter 앞까지의 모든 문자를 한번에 입력
			System.out.println("입력하신 글자는 "+ msg+"입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}//try
		
	}//main()
}//class
/*
○ 버퍼(Buffer)의 필요성
	- 일반적인 입출력은 여러 글자를 입력한다 하더라도, 실제 처리될 때에는 한 글자씩 입출력 된다.
	- 입력된 글자의 개수만큼 접근이 이루어진다 ▶ 속도 저하의 원인
	- 위와 같은 비효율성을 개선하고자 여러 글자를 입력하더라도,
	    버퍼(Buffer)를 이용하여 입력한 글자를 한번에 입출력할 수 있도록 지원해준다.
	- 버퍼의 기본크기 : 1024Byte
	- BufferedReader Class → readLine() Method
 */