import java.io.FileOutputStream;

public class Ex23 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("D:\\Study_Java\\Git_project\\Study_Java\\src\\data3.txt");
		
		int ch;
		
		while((ch = System.in.read()) != 13) {	//Enter(아스키코드값 : 13)를 입력할 때까지 키보드에서 문자 하나를 read()로 읽어온다.
			fos.write((byte)ch);				//입력할 문자를 파일에 쓴다. ("File에 글자를 씁니다." 입력)
		}//while
		fos.close();							//파일의 모든 내용을 처리한 후 파일을 닫는다. (data3.txt 확인시, File에 글자를 씁니다. 확인가능)
	}//main()
}//class
