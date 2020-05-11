import java.io.BufferedReader;
import java.io.FileReader;

public class Ex21 {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("c:/Windows/win.ini"); //FileReader 로 c:/Windows/win.ini 파일을 연다.
		BufferedReader br = new BufferedReader(fr);			//행 단위로 읽기 위해 BufferedReader 클래스를 활용한다.
		
		String str = null;	//읽어올 문자열 변수 선언
		
		int i = 0;
		while((str = br.readLine()) != null) {
			i++;
			System.out.println(i+"행 : "+str);
		}
		
		br.close();
		fr.close();
	}//main()
}//class
